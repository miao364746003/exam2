package com.example.lenovo.exam2;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.xlistviewlib.view.XListView;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bean.ResultsBean> list = new ArrayList<>();
    private XListView xListView;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Bean bean = new Gson().fromJson((String) msg.obj, Bean.class);
            List<Bean.ResultsBean> results = bean.getResults();
            if (page == 1) {
                list.clear();
                xListView.stopRefresh(true);
            }
            list.addAll(results);
            Adapter adapter = new Adapter(MainActivity.this, results);
            xListView.setAdapter(adapter);
            xListView.stopLoadMore();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xListView = findViewById(R.id.main_xlistview);
        xListView.setPullLoadEnable(true);
        xListView.setPullRefreshEnable(true);
        xListView.setXListViewListener(new XListView.IXListViewListener() {
            @Override
            public void onRefresh() {
                page=1;
                getFromNetData();
            }

            @Override
            public void onLoadMore() {
                page++;
                getFromNetData();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        getFromNetData();
    }

    int page = 1;

    private void getFromNetData() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    URL url = new URL("http://gank.io/api/data/Android/10/" + page);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    if (connection.getResponseCode() == 200) {
                        InputStream inputStream =
                                connection.getInputStream();
                        StringBuffer buffer = new StringBuffer();
                        InputStreamReader reader = new InputStreamReader(inputStream);
                        BufferedReader br = new BufferedReader(reader);
                        String len = null;
                        while ((len = br.readLine()) != null) {
                            buffer.append(len);
                        }
                        String s = buffer.toString();
                        Message message = handler.obtainMessage();
                        message.obj = s;
                        handler.sendMessage(message);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }
}

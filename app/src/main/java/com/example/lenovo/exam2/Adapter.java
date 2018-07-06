package com.example.lenovo.exam2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by lenovo on 2018/7/6.
 */

public class Adapter extends BaseAdapter {
    private Context context;
    private List<Bean.ResultsBean> list;

    public Adapter(Context context, List<Bean.ResultsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();

    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        switch (type) {
            case 1:
                ViewHolderone holderone;
                if (convertView == null) {
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_one, null);
                    holderone = new ViewHolderone();
                    holderone.imageView = convertView.findViewById(R.id.one_image);
                    holderone.textView = convertView.findViewById(R.id.one_tv);
                    convertView.setTag(holderone);
                } else {
                    holderone = (ViewHolderone) convertView.getTag();
                }
                holderone.textView.setText(list.get(position).getDesc());
                //                holderone.imageView.
                List<String> images = list.get(position).getImages();

                try {
                    ImageLoader.getInstance().displayImage(images.get(0), holderone.imageView, MyApp.Options());
                } catch (Exception e) {

                }
                break;

            case 2:
                ViewHolderTwo holderTwo;
                if (convertView == null) {
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_two, null);
                    holderTwo = new ViewHolderTwo();
                    holderTwo.imageView1 = convertView.findViewById(R.id.two_image1);
                    holderTwo.imageView2 = convertView.findViewById(R.id.two_image2);
                    holderTwo.imageView3 = convertView.findViewById(R.id.two_image3);
                    convertView.setTag(holderTwo);
                } else {
                    holderTwo = (ViewHolderTwo) convertView.getTag();
                }
                List<String> images1 = list.get(position).getImages();
                try {
                    ImageLoader.getInstance().displayImage(images1.get(0), holderTwo.imageView1, MyApp.Options());
                    ImageLoader.getInstance().displayImage(images1.get(1), holderTwo.imageView2, MyApp.Options());
                    ImageLoader.getInstance().displayImage(images1.get(2), holderTwo.imageView3, MyApp.Options());

                } catch (Exception e) {

                }
                break;
        }
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        List<String> images = list.get(position).getImages();
        if (images != null && images.size() >= 3) {
            return 2;
        }

        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    class ViewHolderone {
        ImageView imageView;
        TextView textView;
    }

    class ViewHolderTwo {
        ImageView imageView1, imageView2, imageView3;
    }
}

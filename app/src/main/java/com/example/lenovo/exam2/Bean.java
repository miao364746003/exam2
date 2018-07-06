package com.example.lenovo.exam2;

import java.util.List;

/**
 * Created by lenovo on 2018/7/6.
 */

public class Bean {

    /**
     * error : false
     * results : [{"_id":"5b347789421aa955684c3e17","createdAt":"2018-06-28T13:52:09.425Z","desc":"CrashMonitor 监听程序崩溃日志,直接页面展示崩溃日志列表,调试方便,测试人员可以随时给程序猿查看日志详情,可以动态添加日志内容,手机直接查看日志内容可以分享,复制,生成长截图。","images":["http://img.gank.io/8d264f77-18c6-4713-8bc4-136036989f2d","http://img.gank.io/4dbd21a5-4408-43a6-b410-bdb4d4e38fda","http://img.gank.io/4d7b92d5-47ee-492b-a729-b515e663060f","http://img.gank.io/bdcf5ed3-254b-40c1-b4cd-5abfd2e00a75","http://img.gank.io/89aa6533-6177-4f3f-b352-b648091da70a"],"publishedAt":"2018-07-05T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/maning0303/MNCrashMonitor","used":true,"who":"maning0303"},{"_id":"5b34b777421aa95570db5487","createdAt":"2018-06-28T18:24:55.260Z","desc":"[Android开源]EasySharedPreferences：优雅的进行SharedPreferences数据存储操作","publishedAt":"2018-07-05T00:00:00.0Z","source":"web","type":"Android","url":"https://juejin.im/post/5b34a970f265da59567953a3","used":true,"who":"yjfnypeu"},{"_id":"5b371eb9421aa9556d2cc4c4","createdAt":"2018-06-30T14:10:01.480Z","desc":"AppUpdater版本更新、一键傻瓜式升级App","images":["http://img.gank.io/8353f372-403b-43e3-8bac-a9e930b0c9e1"],"publishedAt":"2018-07-05T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/jenly1314/AppUpdater","used":true,"who":"Jenly"},{"_id":"5b3d8b2c421aa906e7db02ab","createdAt":"2018-07-05T11:06:20.181Z","desc":"一个方便为Android View添加自然的阴影的库。","images":["http://img.gank.io/afb2a5ed-b4c8-45cf-a6bd-359e3c3e24e7"],"publishedAt":"2018-07-05T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/zhengcx/ShadowHelper","used":true,"who":"lijinshanmx"},{"_id":"5b39d2b4421aa906dfdf9f95","createdAt":"2018-07-02T15:22:28.882Z","desc":"陀螺仪滑动图片,实现VR看房","images":["http://img.gank.io/97cab7b8-5ab1-4eb7-ba8c-0dc1471eb656","http://img.gank.io/560da8fa-6225-4e6e-8d2f-1833da08326b"],"publishedAt":"2018-07-03T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/JY39/GyroscopeImageDemo","used":true,"who":"艾米"},{"_id":"5b39e3d5421aa906e5b3c6dc","createdAt":"2018-07-02T16:35:33.141Z","desc":"基于RxJava2+Retrofit2实现简单易用的网络请求框架","images":["http://img.gank.io/4c206ad4-cfad-40c7-8bc7-adf16f4d0d16","http://img.gank.io/cb843e40-d931-44ed-a211-7fe791b76491","http://img.gank.io/9d1c6154-51dc-4c52-a6f2-21365f6a22bc"],"publishedAt":"2018-07-03T00:00:00.0Z","source":"web","type":"Android","url":"https://github.com/zhou-you/RxEasyHttp","used":true,"who":"周游"},{"_id":"5b3a28be421aa906e5b3c6e2","createdAt":"2018-07-02T21:29:34.686Z","desc":"一行代码完成Android 8 FileProvider适配","publishedAt":"2018-07-03T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/steven2947/FitAndroid8","used":true,"who":"艾米"},{"_id":"5b399243421aa95570db5492","createdAt":"2018-07-02T10:47:31.359Z","desc":"Android下载库，支持断点续传，保存下载进度，UI回调与生命周期绑定等。","publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/yuwenque/JarvisDownloader","used":true,"who":"lijinshanmx"},{"_id":"5b3992a4421aa9556d2cc4c7","createdAt":"2018-07-02T10:49:08.993Z","desc":"Flutter实现的二维码扫描。","images":["http://img.gank.io/ed137e7f-8c85-46d4-984a-74c427f89950","http://img.gank.io/dbc2346b-7695-42d7-b786-1af5f794663f","http://img.gank.io/20dfdff2-15fe-4e5b-8fe1-784625978984","http://img.gank.io/d3ce29e6-6326-46a1-ae77-cdeaabfdb740"],"publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/edufolly/flutter_mobile_vision","used":true,"who":"lijinshanmx"},{"_id":"5b399427421aa955684c3e27","createdAt":"2018-07-02T10:55:35.214Z","desc":"绘制Ascii艺术。","images":["http://img.gank.io/11c0db65-9951-4e97-95ea-1af62501bf74"],"publishedAt":"2018-07-02T00:00:00.0Z","source":"chrome","type":"Android","url":"https://github.com/chuross/asciiartview","used":true,"who":"lijinshanmx"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 5b347789421aa955684c3e17
         * createdAt : 2018-06-28T13:52:09.425Z
         * desc : CrashMonitor 监听程序崩溃日志,直接页面展示崩溃日志列表,调试方便,测试人员可以随时给程序猿查看日志详情,可以动态添加日志内容,手机直接查看日志内容可以分享,复制,生成长截图。
         * images : ["http://img.gank.io/8d264f77-18c6-4713-8bc4-136036989f2d","http://img.gank.io/4dbd21a5-4408-43a6-b410-bdb4d4e38fda","http://img.gank.io/4d7b92d5-47ee-492b-a729-b515e663060f","http://img.gank.io/bdcf5ed3-254b-40c1-b4cd-5abfd2e00a75","http://img.gank.io/89aa6533-6177-4f3f-b352-b648091da70a"]
         * publishedAt : 2018-07-05T00:00:00.0Z
         * source : web
         * type : Android
         * url : https://github.com/maning0303/MNCrashMonitor
         * used : true
         * who : maning0303
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}

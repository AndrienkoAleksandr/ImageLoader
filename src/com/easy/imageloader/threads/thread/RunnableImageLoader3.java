package com.easy.imageloader.threads.thread;

import com.easy.imageloader.threads.Loader;

/**
 * Created by USER on 05.07.2014.
 */
public class RunnableImageLoader3 implements Runnable{
    String url;
    Thread thread;
    public RunnableImageLoader3(String url) {
        thread = new Thread(this);
        this.url = url;
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        Loader loader = new Loader();
        try {
            loader.setUrl(url);
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

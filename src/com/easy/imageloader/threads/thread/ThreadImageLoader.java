package com.easy.imageloader.threads.thread;

import com.easy.imageloader.threads.Loader;

/**
 * Created by USER on 05.07.2014.
 */
public class ThreadImageLoader extends Thread{
    String url;
    public ThreadImageLoader(String url) {
        super();
        this.url = url;
        start();
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

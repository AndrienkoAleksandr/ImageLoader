package com.easy.imageloader.threads.thread;

import com.easy.imageloader.threads.Loader;

/**
 * Created by USER on 05.07.2014.
 */
public class RunnableImageLoader2 implements Runnable{
    String url;

    public RunnableImageLoader2(String url){
        this.url = url;
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

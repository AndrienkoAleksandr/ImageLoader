package com.easy.imageloader.threads.thread;

import com.easy.imageloader.threads.Loader;

/**
 * Created by USER on 05.07.2014.
 */
public class RunnableImageLoader implements Runnable {
    String url;
    Thread thread;
    int i;
    public RunnableImageLoader(int i, String url) {
        thread = new Thread(this);
        this.url = url;
        thread.start();
        this.i = i;
    }

    @Override
    public void run() {
        Loader loader = new Loader();
        try {
            loader.setUrl(url);
            loader.load();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

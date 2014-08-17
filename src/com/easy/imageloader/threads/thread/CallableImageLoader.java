package com.easy.imageloader.threads.thread;

import com.easy.imageloader.threads.Loader;

import java.util.concurrent.Callable;

/**
 * Created by USER on 09.07.2014.
 */
public class CallableImageLoader implements Callable<String> {
    private String url;
    private int i;

    public CallableImageLoader(int i, String url) {
        this.url = url;
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        Loader loader = new Loader();
        loader.setUrl(url);
        loader.load();
        System.out.println(i);
        return "Loading image complete" + i;
    }
}

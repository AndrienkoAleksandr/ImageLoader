package com.easy.imageloader.threads.thread;

import com.easy.imageloader.threads.Loader;

import java.util.concurrent.RecursiveAction;

/**
 * Created by USER on 09.07.2014.
 */
public class ForkJoinTaskImageLoader extends RecursiveAction{
    private String url;
    private int i;

    public ForkJoinTaskImageLoader(int i, String url) {
        this.url = url;
        this.i = i;
    }

    @Override
    protected void compute() {
        Loader loader = new Loader();
        try {
            loader.setUrl(url);
            loader.load();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(i);
    }
}

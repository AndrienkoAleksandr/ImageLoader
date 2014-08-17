package com.easy.imageloader.threads.application;

import com.easy.imageloader.threads.thread.ForkJoinTaskImageLoader;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by USER on 09.07.2014.
 */
public class ApplicationForkJoin {
    public static AtomicInteger oxo = new AtomicInteger(10);
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        forkJoinPool.execute(new ForkJoinTaskImageLoader(1, "http://chudesa-mira.ru/uploads/images/00/00/21/2011/11/17/872999.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(2, "http://unnatural.ru/wp-content/uploads/2011/04/Bugatti-Veyron-16.4-Super-Sport-1.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(3, "http://bom.flenda.ru/images/gallery/97/327_1000x750.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(4, "http://bom.flenda.ru/images/gallery/97/322_1000x750.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(5, "http://img11.nnm.me/9/5/c/f/0/95cf0985d6a5b0233e01669da5fe77c9_full.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(6, "http://img.gazeta.ru/files3/717/3990717/bmw-pic452-452x452-36449.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(7, "http://telegraf.com.ua/files/2012/10/bmv_-x6_-sinyaya_avtomobili_mashiny_avto.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(8, "http://pro-rap.net/uploads/posts/2013-09/1380105844_331651.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(9, "http://original-news.ru/wp-content/uploads/2013/02/Bugatti-Veyron-Super-Sport-%D0%B4%D0%BE%D1%80%D0%BE%D0%B3%D0%BE%D0%B9-%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C.jpg"));
        forkJoinPool.execute(new ForkJoinTaskImageLoader(10, "http://neobychno.com/img/2011/11/1-bugatti-veyron1-revise1.jpg"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

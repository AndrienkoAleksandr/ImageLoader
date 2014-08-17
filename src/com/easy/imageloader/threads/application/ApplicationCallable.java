package com.easy.imageloader.threads.application;

import com.easy.imageloader.threads.thread.CallableImageLoader;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by USER on 09.07.2014.
 */
public class ApplicationCallable {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        List<Future> listFutures = new LinkedList<>();
        listFutures.add(es.submit(new CallableImageLoader(1, "http://chudesa-mira.ru/uploads/images/00/00/21/2011/11/17/872999.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(2, "http://unnatural.ru/wp-content/uploads/2011/04/Bugatti-Veyron-16.4-Super-Sport-1.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(3, "http://bom.flenda.ru/images/gallery/97/327_1000x750.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(4, "http://bom.flenda.ru/images/gallery/97/322_1000x750.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(5, "http://img11.nnm.me/9/5/c/f/0/95cf0985d6a5b0233e01669da5fe77c9_full.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(6, "http://img.gazeta.ru/files3/717/3990717/bmw-pic452-452x452-36449.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(7, "http://telegraf.com.ua/files/2012/10/bmv_-x6_-sinyaya_avtomobili_mashiny_avto.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(8, "http://pro-rap.net/uploads/posts/2013-09/1380105844_331651.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(9, "http://original-news.ru/wp-content/uploads/2013/02/Bugatti-Veyron-Super-Sport-%D0%B4%D0%BE%D1%80%D0%BE%D0%B3%D0%BE%D0%B9-%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C.jpg")));
        listFutures.add(es.submit(new CallableImageLoader(10, "http://neobychno.com/img/2011/11/1-bugatti-veyron1-revise1.jpg")));
        for (Future future: listFutures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        es.shutdown();
    }

}

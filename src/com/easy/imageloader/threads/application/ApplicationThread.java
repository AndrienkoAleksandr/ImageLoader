package com.easy.imageloader.threads.application;

import com.easy.imageloader.threads.thread.ThreadImageLoader;

/**
 * Created by USER on 05.07.2014.
 */
public class ApplicationThread {
    public static void main(String[] args) {
        ThreadImageLoader thread1 = new ThreadImageLoader("http://chudesa-mira.ru/uploads/images/00/00/21/2011/11/17/872999.jpg");
        ThreadImageLoader thread2 = new ThreadImageLoader("http://unnatural.ru/wp-content/uploads/2011/04/Bugatti-Veyron-16.4-Super-Sport-1.jpg");
        ThreadImageLoader thread3 = new ThreadImageLoader("http://bom.flenda.ru/images/gallery/97/327_1000x750.jpg");
        ThreadImageLoader thread4 = new ThreadImageLoader("http://bom.flenda.ru/images/gallery/97/322_1000x750.jpg");
        ThreadImageLoader thread5 = new ThreadImageLoader("http://img11.nnm.me/9/5/c/f/0/95cf0985d6a5b0233e01669da5fe77c9_full.jpg");
        ThreadImageLoader thread6 = new ThreadImageLoader("http://img.gazeta.ru/files3/717/3990717/bmw-pic452-452x452-36449.jpg");
        ThreadImageLoader thread7 = new ThreadImageLoader("http://telegraf.com.ua/files/2012/10/bmv_-x6_-sinyaya_avtomobili_mashiny_avto.jpg");
        ThreadImageLoader thread8 = new ThreadImageLoader("http://pro-rap.net/uploads/posts/2013-09/1380105844_331651.jpg");
        ThreadImageLoader thread9 = new ThreadImageLoader("http://original-news.ru/wp-content/uploads/2013/02/Bugatti-Veyron-Super-Sport-%D0%B4%D0%BE%D1%80%D0%BE%D0%B3%D0%BE%D0%B9-%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C.jpg");
        ThreadImageLoader thread10 = new ThreadImageLoader("http://neobychno.com/img/2011/11/1-bugatti-veyron1-revise1.jpg");
    }
}

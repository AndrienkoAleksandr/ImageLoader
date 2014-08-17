package com.easy.imageloader.threads.application;

import com.easy.imageloader.threads.thread.RunnableImageLoader2;

/**
 * Created by USER on 05.07.2014.
 */
public class ApplicationRunnable2 {
    public static void main(String[] args) {
        RunnableImageLoader2 thread1 = new RunnableImageLoader2("http://chudesa-mira.ru/uploads/images/00/00/21/2011/11/17/872999.jpg");
        Thread threadN1 = new Thread(thread1);
        threadN1.start();
        RunnableImageLoader2 thread2 = new RunnableImageLoader2("http://unnatural.ru/wp-content/uploads/2011/04/Bugatti-Veyron-16.4-Super-Sport-1.jpg");
        Thread threadN2 = new Thread(thread2);
        threadN2.start();
        RunnableImageLoader2 thread3 = new RunnableImageLoader2("http://bom.flenda.ru/images/gallery/97/327_1000x750.jpg");
        Thread threadN3 = new Thread(thread3);
        threadN3.start();
    }
}

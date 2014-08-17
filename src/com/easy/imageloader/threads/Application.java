package com.easy.imageloader.threads;

import com.easy.imageloader.Loader;
import com.easy.imageloader.NullURLException;

import java.io.IOException;

/**
 * Created by USER on 03.07.2014.
 */
public class Application {
    public static void main(String[] args) throws NullURLException, IOException {
        Loader loader = new Loader();
        loader.setUrl("http://upload.wikimedia.org/wikipedia/commons/9/9b/Black_Aston_Martin_DBS_fr.jpg");
        loader.load();
    }
}

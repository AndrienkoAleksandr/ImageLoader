package com.easy.imageloader.threads;


import com.easy.imageloader.NullURLException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by USER on 03.07.2014.
 */
public class Loader {
    private String url = "";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws com.easy.imageloader.NullURLException {
        if (url == null) {
            throw new NullURLException("Link of image is null");
        }
        this.url = url;
    }

    public void load() throws IOException {
        URL url2 = new URL(url);
        int begin = url.lastIndexOf("/");
        if (begin == -1) {
            System.out.println("index of url = -1");
            return;
        }
        String name = url.substring(begin + 1, url.length());
        Path path = Paths.get("images\\" + name);
        ReadableByteChannel rbc = Channels.newChannel(url2.openStream());
        FileOutputStream fos = new FileOutputStream(path.toFile());
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}

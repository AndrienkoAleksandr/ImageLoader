package com.easy.imageloader;


import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

/**
 * Created by USER on 03.07.2014.
 */
public class Loader {
    private String url = "";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws NullURLException {
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

//        InputStream in = new BufferedInputStream(url2.openConnection().getInputStream());
//        FileOutputStream out = new FileOutputStream(path.toFile());
//        byte[] bytes = new byte[1024];
//        int count = 0;
//        while ( (count = in.read(bytes)) != -1) {
//            if (count < 1024) System.out.print("warning");
//            System.out.println(count);
//            out.write(bytes, 0, count);
//        }
//        out.close();
//        in.close();


        ReadableByteChannel rbc = Channels.newChannel(url2.openStream());
        FileOutputStream fos = new FileOutputStream(path.toFile());
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);


//        URL link = new URL(url);
//        InputStream in = new BufferedInputStream(link.openStream());
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        byte[] buf = new byte[1024];
//        int n = 0;
//        while (-1!=(n=in.read(buf)))
//        {
//            out.write(buf, 0, n);
//        }
//        out.close();
//        in.close();
//        byte[] response = out.toByteArray();
//        FileOutputStream fos = new FileOutputStream(path.toFile());
//        fos.write(response);
//        fos.close();

//        InputStream in = new BufferedInputStream(url2.openStream());
//        int count = 0;
//        byte[] bytes = new byte[8];
//        try (FileChannel fileChannel = (FileChannel)Files.newByteChannel(path,
//                StandardOpenOption.READ,
//                StandardOpenOption.CREATE,
//                StandardOpenOption.WRITE)) {
//            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 8);
//            while ((count = in.read(bytes)) != -1) {
//                byte[] bytes2 = Arrays.copyOf(bytes, count);
//                System.out.println(bytes.length);
//                map.rewind();
//                map.put(bytes2);
//                System.out.println(count);
//            }
//        } catch (IOException e) {
//            System.out.println("IOException" + e);
//        }


//        InputStream in = new BufferedInputStream(url2.openStream());
//        int count = 0;
//        try (FileChannel fileChannel = (FileChannel)Files.newByteChannel(path,
//                StandardOpenOption.CREATE,
//                StandardOpenOption.WRITE)
//            ) {
//            ByteBuffer buff = ByteBuffer.allocate(2048);
//            while ((count = in.read(buff.array())) != -1) {
//                    buff.rewind();
//                //////////////////////
//    //            if (count < 1024) {
//    //                System.out.print("warning");
//    //            }
//    //            System.out.println(count);
//                /////////////////////
//                buff.limit(count);
//                if (fileChannel.write(buff) != count) {
//                    System.out.println("Error");
//                } else {
//                    System.out.println(buff.position() + " " + count);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("IOException" + e);
//        }
    }
}

package com.codegym;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{

    private String userAgent;

    @Override
    public void download(String url){
        try {
            URLConnection conn = new URL(url).openConnection();
            conn.connect();
            InputStream in = conn.getInputStream();
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}

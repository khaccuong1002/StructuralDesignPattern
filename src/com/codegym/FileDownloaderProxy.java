package com.codegym;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    public FileDownloaderProxy(){
        fileDownloader = new FileDownloader();
        fileDownloader.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:85.0) Gecko/20100101 Firefox/85.0");
    }

    @Override
    public void download(String url){
        fileDownloader.download(url);
    }
}

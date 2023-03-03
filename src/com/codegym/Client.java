package com.codegym;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download("https://github.com/pdf-association/pdf20examples.git");
    }
}

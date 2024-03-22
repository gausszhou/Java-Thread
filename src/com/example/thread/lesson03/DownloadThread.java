package com.example.thread.lesson03;

public class DownloadThread extends Thread {

    private String url;
    private String name;

    public DownloadThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downlaod(this.url, this.name);
        System.out.println("下载了文件" + this.name);
    }
}

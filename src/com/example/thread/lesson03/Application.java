package com.example.thread.lesson03;

/**
 * 多线程下载文件
 */
public class Application {

    public static void main(String[] args) {
        String url = "https://www.baidu.com/index.html";
        DownloadThread t1 = new DownloadThread(url, "./out/1.html");
        DownloadThread t2 = new DownloadThread(url, "./out/2.html");
        DownloadThread t3 = new DownloadThread(url, "./out/3.html");

        t1.start();
        t2.start();
        t3.start();
        // 下载了文件./out/1.html
        // 下载了文件./out/3.html
        // 下载了文件./out/2.html
    }

}

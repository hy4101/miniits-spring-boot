package com.ms.jpa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author: wq
 * @Date: 2017/10/16
 * @Time: 22:38
 * <p>
 * Description:
 * ***
 */
@SpringBootApplication
public class MiniitsJpaApp {
    private static URL url;
    private static HttpURLConnection con;
    private static int state = -1;

    public static void main(String[] args) throws IOException {
//        https://infinity-api.infinitynewtab.com/get-icons?type=popular&lang=zh-CN&page=0&keyword=
        String ur = "http://www.geekfan.net/tag/chrome/";
//        Document doc = Jsoup.connect(url).get();
//        Document commensc = Jsoup.connect(ur).ignoreContentType(true).get();
//        System.out.println(commensc);


        int counts = 0;
        while (counts < 5) {
            try {
                url = new URL(ur);
                con = (HttpURLConnection) url.openConnection();
                state = con.getResponseCode();
                System.out.println(counts + "= " + state);
                if (state == 200) {
                    System.out.println("URL可用！");
                }
                break;
            } catch (Exception ex) {
                counts++;
                System.out.println("URL不可用，连接第 " + counts + " 次");
                url = null;
                continue;
            }
        }

//        SpringApplication.run(MiniitsJpaApp.class, args);
    }


    public void isConnect(String urlStr) {
        int counts = 0;
        while (counts < 5) {
            try {
                url = new URL(urlStr);
                con = (HttpURLConnection) url.openConnection();
                state = con.getResponseCode();
                System.out.println(counts + "= " + state);
                if (state == 200) {
                    System.out.println("URL可用！");
                }
                break;
            } catch (Exception ex) {
                counts++;
                System.out.println("URL不可用，连接第 " + counts + " 次");
                urlStr = null;
                continue;
            }
        }
    }
}
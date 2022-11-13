package com.urlshortener.shortenurl.urlshortenerservice.UrlShortener;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlShortenerService {

    public Map<String, UrlShortener> shortUrlsList = new HashMap<>();
    private final String ipAddress = "https://ns-sb.herokuapp.com/ns/";
//    private final String ipAddress = "http://localhost:8080/ns/";

    public String randomChars(UrlShortener urlShortener)
    {
        String randomStr = "";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 5; i++)
        {
            randomStr += chars.charAt((int) Math.floor(Math.random() * chars.length()));
        }

        urlShortener.setShorten_url(ipAddress + randomStr);
        shortUrlsList.put(randomStr, urlShortener);
        return randomStr;
    }
}

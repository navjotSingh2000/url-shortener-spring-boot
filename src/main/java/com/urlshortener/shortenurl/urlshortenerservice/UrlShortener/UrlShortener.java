package com.urlshortener.shortenurl.urlshortenerservice.UrlShortener;

public class UrlShortener {
    private String full_url;
    private String shorten_url;

    public String getFull_url() {
        return full_url;
    }

    public void setFull_url(String full_url) {
        this.full_url = full_url;
    }

    public String getShorten_url() {
        return shorten_url;
    }

    public void setShorten_url(String shorten_url) {
        this.shorten_url = shorten_url;
    }
}

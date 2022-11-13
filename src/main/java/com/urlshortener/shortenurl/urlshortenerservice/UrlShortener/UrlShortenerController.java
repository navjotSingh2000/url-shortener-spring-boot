package com.urlshortener.shortenurl.urlshortenerservice.UrlShortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping(path = "/shorten")
    public String urlShortener(@RequestParam String url, @RequestBody String data)
    {
        return urlShortenerService.shortenUrl(data);
    }

}

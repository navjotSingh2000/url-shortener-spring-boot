package com.urlshortener.shortenurl.urlshortenerservice.UrlShortener;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class WebController {
    @RequestMapping(value = "/index")
    public String index()
    {
        return "index";
    }
}

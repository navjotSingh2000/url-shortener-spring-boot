package com.urlshortener.shortenurl.urlshortenerservice.UrlShortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping(value="/shorten")
    public ResponseEntity<Object> getShortenUrl(@RequestBody UrlShortener urlShortener)
    {
        urlShortenerService.randomChars(urlShortener);
        return new ResponseEntity<Object>(urlShortener, HttpStatus.OK);
    }

    @GetMapping(value="/s/{random}")
    public void getFullUrl(HttpServletResponse response, @PathVariable("random") String randomString)
    {
        try {
            response.sendRedirect(urlShortenerService.shortUrlsList.get(randomString).getFull_url());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

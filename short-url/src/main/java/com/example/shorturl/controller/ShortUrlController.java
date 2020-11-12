package com.example.shorturl.controller;

import com.example.shorturl.util.ShortUrlGenerator;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: WangD
 * @Description:
 * @Date: Created in 15:38 on 2018/11/13
 * @Modified By:
 */
@RestController
public class ShortUrlController {

    @RequestMapping("hello")
    public String HelloSpring (){
        return "hello spring boot";
    }

    @RequestMapping(value = "shortUrl",method = RequestMethod.POST)
    public String shortUrl(@RequestParam(value="longUrl",required = true) String longUrl){
        //TODO 域名待拼接
        return ShortUrlGenerator.getShortUrl(longUrl);
    }

    @RequestMapping("longUrl/{shortUrl}")
    public String longUrl(@PathVariable("shortUrl") String shortUrl){
        return ShortUrlGenerator.getLongUrl(shortUrl);
    }

    @RequestMapping("redirectUrl/{shortUrl}")
    public void redirectUrl(@PathVariable("shortUrl") String shortUrl, HttpServletResponse response) throws IOException{
        String longUrl = ShortUrlGenerator.getLongUrl(shortUrl);
        System.out.println(longUrl);
//        response.sendRedirect("http://www.189.cn/sh");
        response.sendRedirect("http://"+longUrl);
    }
}

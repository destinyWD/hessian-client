package com.example.shorturl.util;


import org.apache.commons.codec.digest.DigestUtils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author: WangD
 * @Description:
 * @Date: Created in 15:00 on 2018/11/13
 * @Modified By:
 */
public class ShortUrlGenerator {

    public static final ConcurrentMap<String,String> SHORTURLS = new ConcurrentHashMap<>();

    /**
     * 将长网址 md5 生成 32 位签名串,分为 4 段, 每段 8 个字节
     * 对这四段循环处理, 取 8 个字节, 将他看成 16 进制串与 0x3fffffff(30位1) 与操作, 即超过 30 位的忽略处理
     * 这 30 位分成 6 段, 每 5 位的数字作为字母表的索引取得特定字符, 依次进行获得 6 位字符串
     * 总的 md5 串可以获得 4 个 6 位串,取里面的任意一个就可作为这个长 url 的短 url 地址
     * @param url
     * @return
     */
    public static String[] shortUrl(String url){
        //自定义生成 MD5 加密字符传前的混合 KEY
        String key = "wangd";
        String[] chars = new String[]{"a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z","0","1","2","3","4","5",
                "6","7","8","9","A","B","C","D","E","F","G","H",
                "I","J","K","L","M","N","O","P","Q","R","S","T",
                "U","V","W","X","Y","Z"
        };
        //url进行md5加密
        String sMD5EncryptResult = DigestUtils.md5Hex(key + url);
        String hex = sMD5EncryptResult;
        String[] resUrl = new String[4];
        for (int i = 0; i < 4; i++) {
            // 把加密字符按照 8 位一组 16 进制与 0x3FFFFFFF 进行位与运算
            String sTempSubString = hex.substring(i * 8, i * 8 + 8);
            // 这里需要使用 long 型来转换，因为 Inteper .parseInt() 只能处理 31 位 , 首位为符号位 , 如果不用 long ，则会越界
            long lHexLong = 0x3FFFFFFF & Long.parseLong (sTempSubString, 16);
            String outChars = "" ;
            for ( int j = 0; j < 6; j++) {
                //把得到的值与0x0000003D进行位与运算，取得字符数组chars索引
                long index=0x0000003D&lHexLong;
                //把取得的字符相加
                outChars+=chars[(int)index];
                //每次循环按位右移5位
                lHexLong=lHexLong>>5;
            }
            // 把字符串存入对应索引的输出数组
            resUrl[i] = outChars;
        }
        return resUrl;
    }

    public static String getShortUrl(String sLongUrl){
        String[] aResult = shortUrl (sLongUrl);
        String shortUrl = "";
        //遍历生成的四个短链接非重复的保存到缓存
        for (int i = 0; i < aResult.length; i++) {
            if (!SHORTURLS.containsKey(aResult[1])){
                SHORTURLS.put(aResult[i],sLongUrl);
                shortUrl = aResult[i];
                break;
            }
        }
        return shortUrl;
    }

    public static String getLongUrl(String shortUrl){
        return SHORTURLS.get(shortUrl);
    }

    public static void main(String[] args) {
        String sLongUrl = "http:sh.189.com" ; //长链接
        String shortUrl = getShortUrl(sLongUrl);
        System.out.println(shortUrl);
        String longUrl = getLongUrl(shortUrl);
        System.out.println(longUrl);
    }
}


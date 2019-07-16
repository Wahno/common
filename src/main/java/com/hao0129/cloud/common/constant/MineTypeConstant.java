package com.hao0129.cloud.common.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


/**
 * MineType 常量map
 * @author WANGHAO 2019-07-16
 */
@Component
public class MineTypeConstant {

    public static final String DEFAULT_TYPE = "application/octet-stream";

    public static final Map<String,String> mineType = new HashMap<String, String>(){{
        put(".3gp",     "video/3gpp");
        put(".asf",     "video/x-ms-asf");
        put(".avi",     "video/x-msvideo");
        put(".m4u",     "video/vnd.mpegurl");
        put(".m4v",     "video/x-m4v");
        put(".mov",     "video/quicktime");
        put(".mp4",     "video/mp4");
        put(".mpg4",    "video/mp4");
        put(".mpe",     "video/x-mpeg");
        put(".mpeg",    "video/mpg");
        put(".mpg",     "video/mpg");
        put(".m3u",     "audio/x-mpegurl");
        put(".m4a",     "audio/mp4a-latm");
        put(".m4b",     "audio/mp4a-latm");
        put(".m4p",     "audio/mp4a-latm");
        put(".mp3",     "audio/x-mpeg");
        put(".mpga",    "audio/mpeg");
        put(".ogg",     "audio/ogg");
        put(".rmvb",    "audio/x-pn-realaudio");
        put(".wav",     "audio/x-wav");
        put(".wma",     "audio/x-ms-wma");
        put(".wmv",     "audio/x-ms-wmv");
        put(".c",       "text/plain");
        put(".h",       "text/plain");
        put(".py",      "text/plain");
        put(".cpp",     "text/plain");
        put(".java",    "text/plain");
        put(".conf",    "text/plain");
        put(".prop",    "text/plain");
        put(".rc",      "text/plain");
        put(".sh",      "text/plain");
        put(".log",     "text/plain");
        put(".txt",     "text/plain");
        put(".xml",     "text/plain");
        put(".html",    "text/html");
        put(".htm",     "text/html");
        put(".css",     "text/css");
        put(".jpg",     "image/jpeg");
        put(".jpeg",    "image/jpeg");
        put(".bmp",     "image/bmp");
        put(".gif",     "image/gif");
        put(".png",     "image/png");
        put(".bin",     "application/octet-stream");
        put(".class",   "application/octet-stream");
        put(".exe",     "application/octet-stream");
        put(".apk",     "application/vnd.android.package-archive");
        put(".doc",     "application/msword");
        put(".docx",    "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        put(".xls",     "application/vnd.ms-excel");
        put(".xlsx",    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        put(".gtar",    "application/x-gtar");
        put(".gz",      "application/x-gzip");
        put(".jar",     "application/java-archive");
        put(".js",      "application/x-javascript");
        put(".mpc",     "application/vnd.mpohun.certificate");
        put(".msg",     "application/vnd.ms-outlook");
        put(".pdf",     "application/pdf");
        put(".pps",     "application/vnd.ms-powerpoint");
        put(".ppt",     "application/vnd.ms-powerpoint");
        put(".pptx",    "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        put(".rtf",     "application/rtf");
        put(".tar",     "application/x-tar");
        put(".tgz",     "application/x-compressed");
        put(".wps",     "application/vnd.ms-works");
        put(".z",       "application/x-compress");
        put(".rar",     "application/x-rar-compressed");
        put(".zip",     "application/x-zip-compressed");
    }};
}

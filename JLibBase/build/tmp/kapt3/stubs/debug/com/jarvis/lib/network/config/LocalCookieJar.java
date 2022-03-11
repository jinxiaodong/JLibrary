package com.jarvis.lib.network.config;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jarvis/lib/network/config/LocalCookieJar;", "Lokhttp3/CookieJar;", "()V", "cache", "", "Lokhttp3/Cookie;", "loadForRequest", "", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "cookies", "JLibBase_debug"})
public final class LocalCookieJar implements okhttp3.CookieJar {
    private final java.util.List<okhttp3.Cookie> cache = null;
    
    public LocalCookieJar() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url) {
        return null;
    }
    
    @java.lang.Override()
    public void saveFromResponse(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url, @org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies) {
    }
}
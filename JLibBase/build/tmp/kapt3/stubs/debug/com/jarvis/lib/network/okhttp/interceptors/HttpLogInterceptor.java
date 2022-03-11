package com.jarvis.lib.network.okhttp.interceptors;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0003()*B\"\u0012\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001c\u0010\u001a\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u001c\u0010\u001c\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001c\u0010\u001d\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001c\u0010\u001e\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u001c\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u001a\u0010#\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/jarvis/lib/network/okhttp/interceptors/HttpLogInterceptor;", "Lokhttp3/Interceptor;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "colorLevel", "Lcom/jarvis/lib/network/okhttp/interceptors/HttpLogInterceptor$ColorLevel;", "logLevel", "Lcom/jarvis/lib/network/okhttp/interceptors/HttpLogInterceptor$LogLevel;", "logTag", "", "level", "decodeUrlString", "url", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logBasicReq", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "request", "Lokhttp3/Request;", "logBasicRsp", "response", "logBodyReq", "logHeadersReq", "logHeadersRsp", "logIt", "any", "", "tempLevel", "logRequest", "connection", "Lokhttp3/Connection;", "logResponse", "tag", "ColorLevel", "Companion", "LogLevel", "JLibBase_debug"})
public final class HttpLogInterceptor implements okhttp3.Interceptor {
    private com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.LogLevel logLevel = com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.LogLevel.NONE;
    private com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.ColorLevel colorLevel = com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.ColorLevel.DEBUG;
    private java.lang.String logTag = "<KtHttp>";
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.Companion Companion = null;
    private static final java.lang.String TAG = "<KtHttp>";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MILLIS_PATTERN = "yyyy-MM-dd HH:mm:ss.SSSXXX";
    
    public HttpLogInterceptor() {
        super();
    }
    
    public HttpLogInterceptor(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor, kotlin.Unit> block) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor logLevel(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.LogLevel level) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor colorLevel(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.ColorLevel level) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor logTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final void logRequest(okhttp3.Request request, okhttp3.Connection connection) {
    }
    
    private final void logBasicReq(java.lang.StringBuilder sb, okhttp3.Request request) {
    }
    
    private final void logHeadersReq(java.lang.StringBuilder sb, okhttp3.Request request) {
    }
    
    private final void logBodyReq(java.lang.StringBuilder sb, okhttp3.Request request) {
    }
    
    private final void logResponse(okhttp3.Response response) {
    }
    
    private final void logHeadersRsp(java.lang.StringBuilder sb, okhttp3.Response response) {
    }
    
    private final void logBasicRsp(java.lang.StringBuilder sb, okhttp3.Response response) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String decodeUrlString(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    private final void logIt(java.lang.Object any, com.jarvis.lib.network.okhttp.interceptors.HttpLogInterceptor.ColorLevel tempLevel) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jarvis/lib/network/okhttp/interceptors/HttpLogInterceptor$LogLevel;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "JLibBase_debug"})
    public static enum LogLevel {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ BASIC /* = new BASIC() */,
        /*public static final*/ HEADERS /* = new HEADERS() */,
        /*public static final*/ BODY /* = new BODY() */;
        
        LogLevel() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/jarvis/lib/network/okhttp/interceptors/HttpLogInterceptor$ColorLevel;", "", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "JLibBase_debug"})
    public static enum ColorLevel {
        /*public static final*/ VERBOSE /* = new VERBOSE() */,
        /*public static final*/ DEBUG /* = new DEBUG() */,
        /*public static final*/ INFO /* = new INFO() */,
        /*public static final*/ WARN /* = new WARN() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        ColorLevel() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/jarvis/lib/network/okhttp/interceptors/HttpLogInterceptor$Companion;", "", "()V", "MILLIS_PATTERN", "", "TAG", "toDateTimeStr", "millis", "", "pattern", "JLibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String toDateTimeStr(long millis, @org.jetbrains.annotations.NotNull()
        java.lang.String pattern) {
            return null;
        }
    }
}
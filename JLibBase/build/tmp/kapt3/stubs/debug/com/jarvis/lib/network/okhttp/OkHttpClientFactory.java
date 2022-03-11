package com.jarvis.lib.network.okhttp;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/jarvis/lib/network/okhttp/OkHttpClientFactory;", "", "()V", "Companion", "JLibBase_debug"})
public final class OkHttpClientFactory {
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.okhttp.OkHttpClientFactory.Companion Companion = null;
    private static int maxRetry = 0;
    
    public OkHttpClientFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/jarvis/lib/network/okhttp/OkHttpClientFactory$Companion;", "", "()V", "maxRetry", "", "getMaxRetry", "()I", "setMaxRetry", "(I)V", "getDefaultOkHttpClient", "Lokhttp3/OkHttpClient;", "JLibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getMaxRetry() {
            return 0;
        }
        
        public final void setMaxRetry(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.OkHttpClient getDefaultOkHttpClient() {
            return null;
        }
    }
}
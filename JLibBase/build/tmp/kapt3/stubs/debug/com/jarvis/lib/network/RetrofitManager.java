package com.jarvis.lib.network;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/jarvis/lib/network/RetrofitManager;", "", "()V", "mOkHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "kotlin.jvm.PlatformType", "getService", "T", "serviceClazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "initConfig", "baseUrl", "", "okClient", "JLibBase_debug"})
public final class RetrofitManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.RetrofitManager INSTANCE = null;
    private static final okhttp3.OkHttpClient mOkHttpClient = null;
    private static final retrofit2.Retrofit.Builder retrofitBuilder = null;
    private static retrofit2.Retrofit retrofit;
    
    private RetrofitManager() {
        super();
    }
    
    /**
     * 初始化配置
     * [baseUrl]项目接口的基类url，以/结尾
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.RetrofitManager initConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okClient) {
        return null;
    }
    
    /**
     * 获取retrofit的Service对象
     * [serviceClazz] 定义的retrofit的service 接口类
     */
    public final <T extends java.lang.Object>T getService(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> serviceClazz) {
        return null;
    }
}
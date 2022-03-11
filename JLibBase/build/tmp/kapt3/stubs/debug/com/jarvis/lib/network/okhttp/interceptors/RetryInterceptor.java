package com.jarvis.lib.network.okhttp.interceptors;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description： 重试请求拦截器
 * @date 2022/2/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/jarvis/lib/network/okhttp/interceptors/RetryInterceptor;", "Lokhttp3/Interceptor;", "maxRetry", "", "(I)V", "retryTimes", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "JLibBase_debug"})
public final class RetryInterceptor implements okhttp3.Interceptor {
    private final int maxRetry = 0;
    private int retryTimes = 0;
    
    public RetryInterceptor() {
        super();
    }
    
    public RetryInterceptor(int maxRetry) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}
package com.jarvis.lib.network.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u001aH\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\b\u000bH\u0086\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0001\"\b\b\u0000\u0010\r*\u00020\u000e*\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"onFailure", "Lcom/jarvis/lib/network/response/DataResult;", "R", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "exception", "", "onSuccess", "Lkotlin/ExtensionFunctionType;", "serverData", "T", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "JLibBase_debug"})
public final class RspKtxKt {
    
    /**
     * @author jinxiaodong
     * @description：
     * @date 2022/2/23
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object serverData(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> $this$serverData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jarvis.lib.network.response.DataResult<? extends T>> p1) {
        return null;
    }
    
    /**
     * 扩展用于处理网络返回数据结果 网络接口请求成功，但是业务成功与否，另一说
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {kotlin.contracts.ExperimentalContracts.class})
    public static final <R extends java.lang.Object>com.jarvis.lib.network.response.DataResult<R> onSuccess(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.network.response.DataResult<? extends R> $this$onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super R, kotlin.Unit> action) {
        return null;
    }
    
    /**
     * 这是网络请求出现错误的时候，的回调
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {kotlin.contracts.ExperimentalContracts.class})
    public static final <R extends java.lang.Object>com.jarvis.lib.network.response.DataResult<R> onFailure(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.network.response.DataResult<? extends R> $this$onFailure, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> action) {
        return null;
    }
}
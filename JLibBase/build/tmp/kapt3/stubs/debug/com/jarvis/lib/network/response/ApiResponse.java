package com.jarvis.lib.network.response;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/23
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000e\u0010\u0012\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/jarvis/lib/network/response/ApiResponse;", "T", "", "errorCode", "", "errorMsg", "", "data", "(ILjava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/jarvis/lib/network/response/ApiResponse;", "equals", "", "other", "hashCode", "toString", "Companion", "JLibBase_debug"})
public final class ApiResponse<T extends java.lang.Object> {
    private final int errorCode = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorMsg = null;
    private final T data = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.response.ApiResponse.Companion Companion = null;
    public static final int SERVER_CODE_FAILED = 1;
    public static final int SERVER_CODE_SUCCESS = 0;
    
    /**
     * @author jinxiaodong
     * @description：
     * @date 2022/2/23
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.response.ApiResponse<T> copy(int errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, T data) {
        return null;
    }
    
    /**
     * @author jinxiaodong
     * @description：
     * @date 2022/2/23
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @author jinxiaodong
     * @description：
     * @date 2022/2/23
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author jinxiaodong
     * @description：
     * @date 2022/2/23
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ApiResponse(int errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, T data) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getErrorCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    public final T component3() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/jarvis/lib/network/response/ApiResponse$Companion;", "", "()V", "SERVER_CODE_FAILED", "", "SERVER_CODE_SUCCESS", "JLibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
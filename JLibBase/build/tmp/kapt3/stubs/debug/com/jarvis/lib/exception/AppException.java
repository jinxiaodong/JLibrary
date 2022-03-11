package com.jarvis.lib.exception;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00060\u0001j\u0002`\u0002B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/jarvis/lib/exception/AppException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "errorMsg", "", "errorLog", "throwable", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "error", "Lcom/jarvis/lib/exception/Error;", "cause", "(Lcom/jarvis/lib/exception/Error;Ljava/lang/Throwable;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorLog", "()Ljava/lang/String;", "setErrorLog", "(Ljava/lang/String;)V", "getErrorMsg", "setErrorMsg", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "JLibBase_debug"})
public final class AppException extends java.lang.Exception {
    private int errorCode = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorMsg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorLog;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Throwable throwable;
    
    public final int getErrorCode() {
        return 0;
    }
    
    public final void setErrorCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    public final void setErrorMsg(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorLog() {
        return null;
    }
    
    public final void setErrorLog(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getThrowable() {
        return null;
    }
    
    public final void setThrowable(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable p0) {
    }
    
    public AppException(int errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, @org.jetbrains.annotations.Nullable()
    java.lang.String errorLog, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        super();
    }
    
    public AppException(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.exception.Error error, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super();
    }
}
package com.jarvis.lib.exception;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/jarvis/lib/exception/Error;", "", "errorCode", "", "errorMsg", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "getErrorMsg", "UNKNOWN", "PARSE_ERROR", "NETWORK_ERROR", "SSL_ERROR", "TIMEOUT_ERROR", "JLibBase_debug"})
public enum Error {
    /*public static final*/ UNKNOWN /* = new UNKNOWN(0, null) */,
    /*public static final*/ PARSE_ERROR /* = new PARSE_ERROR(0, null) */,
    /*public static final*/ NETWORK_ERROR /* = new NETWORK_ERROR(0, null) */,
    /*public static final*/ SSL_ERROR /* = new SSL_ERROR(0, null) */,
    /*public static final*/ TIMEOUT_ERROR /* = new TIMEOUT_ERROR(0, null) */;
    private final int errorCode = 0;
    private final java.lang.String errorMsg = null;
    
    Error(int errorCode, java.lang.String errorMsg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    public final int getErrorCode() {
        return 0;
    }
}
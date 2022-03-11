package com.jarvis.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\b"}, d2 = {"getCurrentNetWorkType", "Lcom/jarvis/lib/network/manager/NetType;", "context", "Landroid/content/Context;", "isMobileConnected", "", "isNetWorkAvailable", "isWifiConnected", "JLibBase_debug"})
public final class NetUtilKt {
    
    /**
     * @author jinxiaodong
     * @description：
     * @date 2022/2/10
     */
    public static final boolean isNetWorkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 是否Wifi 连接
     */
    public static final boolean isWifiConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 是否数据连接
     */
    public static final boolean isMobileConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 获取当前网络类型
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.manager.NetType getCurrentNetWorkType(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}
package com.jarvis.lib.network.manager;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/jarvis/lib/network/manager/NetWorkStateReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "isInit", "", "()Z", "setInit", "(Z)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "JLibBase_debug"})
public final class NetWorkStateReceiver extends android.content.BroadcastReceiver {
    private boolean isInit = true;
    
    public NetWorkStateReceiver() {
        super();
    }
    
    public final boolean isInit() {
        return false;
    }
    
    public final void setInit(boolean p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
}
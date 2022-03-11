package com.jarvis.lib.network.manager;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/jarvis/lib/network/manager/NetState;", "", "available", "", "(Z)V", "getAvailable", "()Z", "setAvailable", "netType", "Lcom/jarvis/lib/network/manager/NetType;", "getNetType", "()Lcom/jarvis/lib/network/manager/NetType;", "setNetType", "(Lcom/jarvis/lib/network/manager/NetType;)V", "JLibBase_debug"})
public final class NetState {
    private boolean available;
    @org.jetbrains.annotations.NotNull()
    private com.jarvis.lib.network.manager.NetType netType = com.jarvis.lib.network.manager.NetType.NETWORK_NO;
    
    public NetState() {
        super();
    }
    
    public NetState(boolean available) {
        super();
    }
    
    public final boolean getAvailable() {
        return false;
    }
    
    public final void setAvailable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.manager.NetType getNetType() {
        return null;
    }
    
    public final void setNetType(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.network.manager.NetType p0) {
    }
}
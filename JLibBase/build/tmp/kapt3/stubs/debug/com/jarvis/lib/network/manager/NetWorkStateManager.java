package com.jarvis.lib.network.manager;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/jarvis/lib/network/manager/NetWorkStateManager;", "", "()V", "netWorkStateCallback", "Lcom/jarvis/lib/liveData/event/EventLiveData;", "Lcom/jarvis/lib/network/manager/NetState;", "getNetWorkStateCallback", "()Lcom/jarvis/lib/liveData/event/EventLiveData;", "Companion", "JLibBase_debug"})
public final class NetWorkStateManager {
    @org.jetbrains.annotations.NotNull()
    private final com.jarvis.lib.liveData.event.EventLiveData<com.jarvis.lib.network.manager.NetState> netWorkStateCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.manager.NetWorkStateManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy instance$delegate = null;
    
    private NetWorkStateManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.liveData.event.EventLiveData<com.jarvis.lib.network.manager.NetState> getNetWorkStateCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/jarvis/lib/network/manager/NetWorkStateManager$Companion;", "", "()V", "instance", "Lcom/jarvis/lib/network/manager/NetWorkStateManager;", "getInstance", "()Lcom/jarvis/lib/network/manager/NetWorkStateManager;", "instance$delegate", "Lkotlin/Lazy;", "JLibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jarvis.lib.network.manager.NetWorkStateManager getInstance() {
            return null;
        }
    }
}
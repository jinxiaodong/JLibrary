package com.jarvis.lib.network.manager;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016\u00a8\u0006\u0015"}, d2 = {"Lcom/jarvis/lib/network/manager/JNetWorkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "()V", "onAvailable", "", "network", "Landroid/net/Network;", "onBlockedStatusChanged", "blocked", "", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLinkPropertiesChanged", "linkProperties", "Landroid/net/LinkProperties;", "onLosing", "maxMsToLive", "", "onLost", "onUnavailable", "JLibBase_debug"})
public final class JNetWorkCallback extends android.net.ConnectivityManager.NetworkCallback {
    
    public JNetWorkCallback() {
        super();
    }
    
    /**
     * 网络连接成功
     */
    @java.lang.Override()
    public void onAvailable(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    /**
     * 网络断开连接
     */
    @java.lang.Override()
    public void onLost(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    /**
     * 网络正在断开连接
     */
    @java.lang.Override()
    public void onLosing(@org.jetbrains.annotations.NotNull()
    android.net.Network network, int maxMsToLive) {
    }
    
    /**
     * 无网络
     */
    @java.lang.Override()
    public void onUnavailable() {
    }
    
    /**
     * 网络状态已修改（网络依然可用）
     */
    @java.lang.Override()
    public void onCapabilitiesChanged(@org.jetbrains.annotations.NotNull()
    android.net.Network network, @org.jetbrains.annotations.NotNull()
    android.net.NetworkCapabilities networkCapabilities) {
    }
    
    /**
     * 访问的网络阻塞状态变化
     */
    @java.lang.Override()
    public void onBlockedStatusChanged(@org.jetbrains.annotations.NotNull()
    android.net.Network network, boolean blocked) {
    }
    
    /**
     * 网络连接属性发生变化
     */
    @java.lang.Override()
    public void onLinkPropertiesChanged(@org.jetbrains.annotations.NotNull()
    android.net.Network network, @org.jetbrains.annotations.NotNull()
    android.net.LinkProperties linkProperties) {
    }
}
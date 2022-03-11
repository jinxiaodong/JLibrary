package com.jarvis.lib.base;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014JM\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017\u00a2\u0006\u0002\b\u001bH\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u0012*\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/jarvis/lib/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dismissLoading", "Lcom/jarvis/lib/liveData/event/EventLiveData;", "", "getDismissLoading", "()Lcom/jarvis/lib/liveData/event/EventLiveData;", "dismissLoading$delegate", "Lkotlin/Lazy;", "jobs", "", "Lkotlinx/coroutines/Job;", "showLoading", "", "getShowLoading", "showLoading$delegate", "onCleared", "", "serverAwait", "needShowLoading", "loadingMsg", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function2;)V", "addTo", "list", "JLibBase_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.List<kotlinx.coroutines.Job> jobs = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dismissLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy showLoading$delegate = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.liveData.event.EventLiveData<java.lang.Boolean> getDismissLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.liveData.event.EventLiveData<java.lang.String> getShowLoading() {
        return null;
    }
    
    /**
     * 协程 网络请求
     */
    protected final void serverAwait(boolean needShowLoading, @org.jetbrains.annotations.NotNull()
    java.lang.String loadingMsg, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void addTo(kotlinx.coroutines.Job $this$addTo, java.util.List<kotlinx.coroutines.Job> list) {
    }
}
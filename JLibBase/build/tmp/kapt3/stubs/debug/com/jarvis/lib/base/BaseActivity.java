package com.jarvis.lib.base;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/10
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0012H&J\b\u0010\u0016\u001a\u00020\u0012H&J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H&J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0004J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0012H\u0014J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J.\u0010$\u001a\u00020\u0012\"\u0004\b\u0001\u0010%*\b\u0012\u0004\u0012\u0002H%0&2\u0014\u0010\'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H%\u0012\u0004\u0012\u00020\u00120(H\u0004R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/jarvis/lib/base/BaseActivity;", "bindingType", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "loadingDialog", "Lcom/jarvis/lib/view/LoadingDialog;", "getLoadingDialog", "()Lcom/jarvis/lib/view/LoadingDialog;", "setLoadingDialog", "(Lcom/jarvis/lib/view/LoadingDialog;)V", "createObserver", "", "getContentLayout", "", "initConfig", "initData", "initImmersionBar", "initView", "observeLoadingUI", "viewModel", "Lcom/jarvis/lib/base/BaseViewModel;", "observerNetWorkState", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNetworkStateChanged", "netState", "Lcom/jarvis/lib/network/manager/NetState;", "observerKt", "T", "Landroidx/lifecycle/LiveData;", "block", "Lkotlin/Function1;", "JLibBase_debug"})
public abstract class BaseActivity<bindingType extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    public com.jarvis.lib.view.LoadingDialog loadingDialog;
    protected bindingType binding;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.view.LoadingDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.view.LoadingDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final bindingType getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    bindingType p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getContentLayout();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void initConfig();
    
    public abstract void initView();
    
    public abstract void initData();
    
    public void onNetworkStateChanged(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.network.manager.NetState netState) {
    }
    
    public void initImmersionBar() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void createObserver() {
    }
    
    private final void observerNetWorkState() {
    }
    
    /**
     * 如果网络需要关联 loadingUI，调用该方法注册
     */
    protected final void observeLoadingUI(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.base.BaseViewModel viewModel) {
    }
    
    /**
     * 扩展liveData的observe函数
     */
    protected final <T extends java.lang.Object>void observerKt(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observerKt, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
    }
}
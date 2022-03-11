package com.jarvis.lib.base;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/22
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0004H\'J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0004J&\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J.\u0010!\u001a\u00020\u0015\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0#2\u0014\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\"\u0012\u0004\u0012\u00020\u00150%H\u0004R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/jarvis/lib/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "layout", "", "(I)V", "binding", "Landroidx/databinding/ViewDataBinding;", "loadingDialog", "Lcom/jarvis/lib/view/LoadingDialog;", "getLoadingDialog", "()Lcom/jarvis/lib/view/LoadingDialog;", "setLoadingDialog", "(Lcom/jarvis/lib/view/LoadingDialog;)V", "bindView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutRes", "initConfig", "", "initData", "observeLoadingUI", "viewModel", "Lcom/jarvis/lib/base/BaseViewModel;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "observerKt", "T", "Landroidx/lifecycle/LiveData;", "block", "Lkotlin/Function1;", "JLibBase_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    public com.jarvis.lib.view.LoadingDialog loadingDialog;
    private androidx.databinding.ViewDataBinding binding;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.view.LoadingDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.view.LoadingDialog p0) {
    }
    
    /**
     * 无参构造函数
     */
    public BaseFragment() {
        super();
    }
    
    /**
     * 可以填入layout布局的构造函数，使用viewBinding的方便
     * [layout] layout布局文件的id
     */
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ViewDataBinding bindView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    /**
     * view初始化后的必要配置
     */
    public void initConfig() {
    }
    
    /**
     * view初始化后的必要数据
     */
    public void initData() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
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
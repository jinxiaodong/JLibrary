package com.jarvis.lib.ktx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000b\u001a#\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0011\u001a\u000e\u0010\u0012\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0011\u001a\u0018\u0010\u0013\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u001a!\u0010\u0016\u001a\u00020\u0010\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\b*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\b\u001a#\u0010\u0016\u001a\u00020\u0010\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\b*\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0086\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u001b"}, d2 = {"viewLifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/app/ComponentActivity;", "getViewLifeCycleOwner", "(Landroidx/core/app/ComponentActivity;)Landroidx/lifecycle/LifecycleOwner;", "bindView", "T", "Landroidx/databinding/ViewDataBinding;", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;)Landroidx/databinding/ViewDataBinding;", "layout", "", "(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;", "dismissLoading", "", "Lcom/jarvis/lib/base/BaseActivity;", "showError2", "showLoading", "message", "", "startActivity", "extras", "Landroid/os/Bundle;", "finishSelf", "", "JLibBase_debug"})
public final class ActivityExtKt {
    
    /**
     * Activity中使用DataBinding时setContentView的简化
     * [layout] 布局文件
     * @return 返回一个Binding的对象实例
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends androidx.databinding.ViewDataBinding>T bindView(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$bindView, @androidx.annotation.LayoutRes()
    int layout) {
        return null;
    }
    
    /**
     * Activity中使用DataBinding时setContentView的简化
     * [layout] 布局文件
     * @return 返回一个Binding的对象实例 T 类型的 可null的
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends androidx.databinding.ViewDataBinding>T bindView(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$bindView, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.lifecycle.LifecycleOwner getViewLifeCycleOwner(@org.jetbrains.annotations.NotNull()
    androidx.core.app.ComponentActivity $this$viewLifeCycleOwner) {
        return null;
    }
    
    public static final void showLoading(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.base.BaseActivity<?> $this$showLoading, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void showError2(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.base.BaseActivity<?> $this$showError2) {
    }
    
    public static final void dismissLoading(@org.jetbrains.annotations.NotNull()
    com.jarvis.lib.base.BaseActivity<?> $this$dismissLoading) {
    }
}
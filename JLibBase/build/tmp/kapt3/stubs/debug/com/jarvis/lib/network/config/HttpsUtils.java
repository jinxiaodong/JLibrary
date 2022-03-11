package com.jarvis.lib.network.config;

import java.lang.System;

/**
 * @author jinxiaodong
 * @description：
 * @date 2022/2/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ3\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0011\"\u00020\u0017\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u001f\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0011\"\u00020\u0017\u00a2\u0006\u0002\u0010\u001dJ?\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0011\"\u00020\u0017H\u0002\u00a2\u0006\u0002\u0010\u001fJ)\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\"J)\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0011\"\u00020\u0017H\u0002\u00a2\u0006\u0002\u0010$R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/jarvis/lib/network/config/HttpsUtils;", "", "()V", "UnSafeHostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getUnSafeHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "setUnSafeHostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)V", "unSafeTrustManager", "Ljavax/net/ssl/X509TrustManager;", "getUnSafeTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "setUnSafeTrustManager", "(Ljavax/net/ssl/X509TrustManager;)V", "chooseTrustManager", "trustManagers", "", "Ljavax/net/ssl/TrustManager;", "([Ljavax/net/ssl/TrustManager;)Ljavax/net/ssl/X509TrustManager;", "getSslSocketFactory", "Lcom/jarvis/lib/network/config/HttpsUtils$SSLParams;", "bksFile", "Ljava/io/InputStream;", "password", "", "trustManager", "certificates", "(Ljava/io/InputStream;Ljava/lang/String;[Ljava/io/InputStream;)Lcom/jarvis/lib/network/config/HttpsUtils$SSLParams;", "([Ljava/io/InputStream;)Lcom/jarvis/lib/network/config/HttpsUtils$SSLParams;", "getSslSocketFactoryBase", "(Ljavax/net/ssl/X509TrustManager;Ljava/io/InputStream;Ljava/lang/String;[Ljava/io/InputStream;)Lcom/jarvis/lib/network/config/HttpsUtils$SSLParams;", "prepareKeyManager", "Ljavax/net/ssl/KeyManager;", "(Ljava/io/InputStream;Ljava/lang/String;)[Ljavax/net/ssl/KeyManager;", "prepareTrustManager", "([Ljava/io/InputStream;)[Ljavax/net/ssl/TrustManager;", "SSLParams", "JLibBase_debug"})
public final class HttpsUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.jarvis.lib.network.config.HttpsUtils INSTANCE = null;
    
    /**
     * 为了解决客户端不信任服务器数字证书的问题，网络上大部分的解决方案都是让客户端不对证书做任何检查，
     * 这是一种有很大安全漏洞的办法
     */
    @org.jetbrains.annotations.NotNull()
    private static javax.net.ssl.X509TrustManager unSafeTrustManager;
    
    /**
     * 此类是用于主机名验证的基接口。 在握手期间，如果 URL 的主机名和服务器的标识主机名不匹配，
     * 则验证机制可以回调此接口的实现程序来确定是否应该允许此连接。策略可以是基于证书的或依赖于其他验证方案。
     * 当验证 URL 主机名使用的默认规则失败时使用这些回调。如果主机名是可接受的，则返回 true
     */
    @org.jetbrains.annotations.NotNull()
    private static javax.net.ssl.HostnameVerifier UnSafeHostnameVerifier;
    
    private HttpsUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.config.HttpsUtils.SSLParams getSslSocketFactory() {
        return null;
    }
    
    /**
     * https单向认证
     * 可以额外配置信任服务端的证书策略，否则默认是按CA证书去验证的，若不是CA可信任的证书，则无法通过验证
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.config.HttpsUtils.SSLParams getSslSocketFactory(@org.jetbrains.annotations.Nullable()
    javax.net.ssl.X509TrustManager trustManager) {
        return null;
    }
    
    /**
     * https单向认证
     * 用含有服务端公钥的证书校验服务端证书
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.config.HttpsUtils.SSLParams getSslSocketFactory(@org.jetbrains.annotations.NotNull()
    java.io.InputStream... certificates) {
        return null;
    }
    
    /**
     * https双向认证
     * bksFile 和 password -> 客户端使用bks证书校验服务端证书
     * certificates -> 用含有服务端公钥的证书校验服务端证书
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.config.HttpsUtils.SSLParams getSslSocketFactory(@org.jetbrains.annotations.Nullable()
    java.io.InputStream bksFile, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.io.InputStream... certificates) {
        return null;
    }
    
    /**
     * https双向认证
     * bksFile 和 password -> 客户端使用bks证书校验服务端证书
     * X509TrustManager -> 如果需要自己校验，那么可以自己实现相关校验，如果不需要自己校验，那么传null即可
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jarvis.lib.network.config.HttpsUtils.SSLParams getSslSocketFactory(@org.jetbrains.annotations.Nullable()
    java.io.InputStream bksFile, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.X509TrustManager trustManager) {
        return null;
    }
    
    private final com.jarvis.lib.network.config.HttpsUtils.SSLParams getSslSocketFactoryBase(javax.net.ssl.X509TrustManager trustManager, java.io.InputStream bksFile, java.lang.String password, java.io.InputStream... certificates) {
        return null;
    }
    
    private final javax.net.ssl.KeyManager[] prepareKeyManager(java.io.InputStream bksFile, java.lang.String password) {
        return null;
    }
    
    private final javax.net.ssl.TrustManager[] prepareTrustManager(java.io.InputStream... certificates) {
        return null;
    }
    
    private final javax.net.ssl.X509TrustManager chooseTrustManager(javax.net.ssl.TrustManager[] trustManagers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.X509TrustManager getUnSafeTrustManager() {
        return null;
    }
    
    public final void setUnSafeTrustManager(@org.jetbrains.annotations.NotNull()
    javax.net.ssl.X509TrustManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.HostnameVerifier getUnSafeHostnameVerifier() {
        return null;
    }
    
    public final void setUnSafeHostnameVerifier(@org.jetbrains.annotations.NotNull()
    javax.net.ssl.HostnameVerifier p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/jarvis/lib/network/config/HttpsUtils$SSLParams;", "", "()V", "sSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSSLSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "setSSLSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)V", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "getTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "setTrustManager", "(Ljavax/net/ssl/X509TrustManager;)V", "JLibBase_debug"})
    public static final class SSLParams {
        public javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        public javax.net.ssl.X509TrustManager trustManager;
        
        public SSLParams() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final javax.net.ssl.SSLSocketFactory getSSLSocketFactory() {
            return null;
        }
        
        public final void setSSLSocketFactory(@org.jetbrains.annotations.NotNull()
        javax.net.ssl.SSLSocketFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final javax.net.ssl.X509TrustManager getTrustManager() {
            return null;
        }
        
        public final void setTrustManager(@org.jetbrains.annotations.NotNull()
        javax.net.ssl.X509TrustManager p0) {
        }
    }
}
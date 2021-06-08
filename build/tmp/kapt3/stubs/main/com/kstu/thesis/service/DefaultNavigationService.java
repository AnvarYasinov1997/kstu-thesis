package com.kstu.thesis.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kstu/thesis/service/DefaultNavigationService;", "Lcom/kstu/thesis/service/NavigationService;", "Lcom/kstu/thesis/service/NavigationServiceConfigurer;", "fxWeaver", "Lnet/rgielen/fxweaver/core/FxWeaver;", "cacheService", "Lcom/kstu/thesis/components/CacheService;", "(Lnet/rgielen/fxweaver/core/FxWeaver;Lcom/kstu/thesis/components/CacheService;)V", "primaryStage", "Ljavafx/stage/Stage;", "navigateScreen", "", "screen", "Lcom/kstu/thesis/utils/Screen;", "data", "", "newScreen", "root", "Ljavafx/scene/Parent;", "setStage", "kstu-thesis"})
@org.springframework.stereotype.Service()
public class DefaultNavigationService implements com.kstu.thesis.service.NavigationService, com.kstu.thesis.service.NavigationServiceConfigurer {
    private javafx.stage.Stage primaryStage;
    private final net.rgielen.fxweaver.core.FxWeaver fxWeaver = null;
    private final com.kstu.thesis.components.CacheService cacheService = null;
    
    @java.lang.Override()
    public void navigateScreen(@org.jetbrains.annotations.NotNull()
    com.kstu.thesis.utils.Screen screen, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    private final void newScreen(javafx.scene.Parent root) {
    }
    
    @java.lang.Override()
    public void setStage(@org.jetbrains.annotations.NotNull()
    javafx.stage.Stage primaryStage) {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public DefaultNavigationService(@org.jetbrains.annotations.NotNull()
    net.rgielen.fxweaver.core.FxWeaver fxWeaver, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.components.CacheService cacheService) {
        super();
    }
}
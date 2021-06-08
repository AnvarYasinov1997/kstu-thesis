package com.kstu.thesis.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kstu/thesis/controller/ChooseController;", "", "cacheService", "Lcom/kstu/thesis/components/CacheService;", "(Lcom/kstu/thesis/components/CacheService;)V", "questionTitle", "Ljavafx/scene/control/Label;", "init", "", "kstu-thesis"})
@org.springframework.context.annotation.Scope(value = "prototype")
@net.rgielen.fxweaver.core.FxmlView(value = "/choose.fxml")
@org.springframework.stereotype.Component()
public final class ChooseController {
    @javafx.fxml.FXML()
    private javafx.scene.control.Label questionTitle;
    private final com.kstu.thesis.components.CacheService cacheService = null;
    
    @javax.annotation.PostConstruct()
    public final void init() {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public ChooseController(@org.jetbrains.annotations.NotNull()
    com.kstu.thesis.components.CacheService cacheService) {
        super();
    }
}
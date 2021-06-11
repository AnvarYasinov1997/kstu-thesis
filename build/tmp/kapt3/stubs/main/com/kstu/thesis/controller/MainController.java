package com.kstu.thesis.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kstu/thesis/controller/MainController;", "", "navigationService", "Lcom/kstu/thesis/service/NavigationService;", "(Lcom/kstu/thesis/service/NavigationService;)V", "searchButton", "Ljavafx/scene/control/Button;", "searchInput", "Ljavafx/scene/control/TextField;", "e", "", "init", "kstu-thesis"})
@org.springframework.context.annotation.Scope(value = "prototype")
@net.rgielen.fxweaver.core.FxmlView(value = "/main.fxml")
@org.springframework.stereotype.Component()
public class MainController {
    @javafx.fxml.FXML()
    private javafx.scene.control.Button searchButton;
    @javafx.fxml.FXML()
    private javafx.scene.control.TextField searchInput;
    private final com.kstu.thesis.service.NavigationService navigationService = null;
    
    @javax.annotation.PostConstruct()
    public void init() {
    }
    
    private final void e() {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public MainController(@org.jetbrains.annotations.NotNull()
    com.kstu.thesis.service.NavigationService navigationService) {
        super();
    }
}
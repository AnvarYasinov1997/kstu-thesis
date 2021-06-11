package com.kstu.thesis.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kstu/thesis/controller/MainController;", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "dataRepository", "Lcom/kstu/thesis/repository/DataRepository;", "navigationService", "Lcom/kstu/thesis/service/NavigationService;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/kstu/thesis/repository/DataRepository;Lcom/kstu/thesis/service/NavigationService;)V", "searchButton", "Ljavafx/scene/control/Button;", "searchInput", "Ljavafx/scene/control/TextField;", "e", "", "init", "kstu-thesis"})
@org.springframework.context.annotation.Scope(value = "prototype")
@net.rgielen.fxweaver.core.FxmlView(value = "/main.fxml")
@org.springframework.stereotype.Component()
public class MainController {
    @javafx.fxml.FXML()
    private javafx.scene.control.Button searchButton;
    @javafx.fxml.FXML()
    private javafx.scene.control.TextField searchInput;
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    private final com.kstu.thesis.repository.DataRepository dataRepository = null;
    private final com.kstu.thesis.service.NavigationService navigationService = null;
    
    @javax.annotation.PostConstruct()
    public void init() {
    }
    
    private final void e() {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public MainController(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.repository.DataRepository dataRepository, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.service.NavigationService navigationService) {
        super();
    }
}
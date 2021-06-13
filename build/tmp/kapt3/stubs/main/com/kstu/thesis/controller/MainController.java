package com.kstu.thesis.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kstu/thesis/controller/MainController;", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "questionsRepository", "Lcom/kstu/thesis/repository/QuestionsRepository;", "navigationService", "Lcom/kstu/thesis/service/NavigationService;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/kstu/thesis/repository/QuestionsRepository;Lcom/kstu/thesis/service/NavigationService;)V", "searchButton", "Ljavafx/scene/control/Button;", "searchInput", "Ljavafx/scene/control/TextField;", "typeRef", "Lcom/fasterxml/jackson/core/type/TypeReference;", "", "", "init", "", "serializeData", "data", "viewCreated", "kstu-thesis"})
@org.springframework.context.annotation.Scope(value = "prototype")
@net.rgielen.fxweaver.core.FxmlView(value = "/main.fxml")
@org.springframework.stereotype.Component()
public class MainController {
    @javafx.fxml.FXML()
    private javafx.scene.control.Button searchButton;
    @javafx.fxml.FXML()
    private javafx.scene.control.TextField searchInput;
    private final com.fasterxml.jackson.core.type.TypeReference<java.util.Map<java.lang.String, java.lang.String>> typeRef = null;
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    private final com.kstu.thesis.repository.QuestionsRepository questionsRepository = null;
    private final com.kstu.thesis.service.NavigationService navigationService = null;
    
    @javax.annotation.PostConstruct()
    public void init() {
    }
    
    private final void viewCreated() {
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> serializeData(java.lang.String data) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public MainController(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.repository.QuestionsRepository questionsRepository, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.service.NavigationService navigationService) {
        super();
    }
}
package com.kstu.thesis.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0018\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/kstu/thesis/controller/ChooseController;", "", "cacheService", "Lcom/kstu/thesis/components/CacheService;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "navigationService", "Lcom/kstu/thesis/service/NavigationService;", "questionsRepository", "Lcom/kstu/thesis/repository/QuestionsRepository;", "(Lcom/kstu/thesis/components/CacheService;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/kstu/thesis/service/NavigationService;Lcom/kstu/thesis/repository/QuestionsRepository;)V", "noButton", "Ljavafx/scene/control/Button;", "questionTitle", "Ljavafx/scene/control/Label;", "returnButton", "typeRef", "Lcom/fasterxml/jackson/core/type/TypeReference;", "", "", "yesButton", "init", "", "serializeData", "data", "ChooseTransitionData", "kstu-thesis"})
@org.springframework.context.annotation.Scope(value = "prototype")
@net.rgielen.fxweaver.core.FxmlView(value = "/choose.fxml")
@org.springframework.stereotype.Component()
public final class ChooseController {
    @javafx.fxml.FXML()
    private javafx.scene.control.Button noButton;
    @javafx.fxml.FXML()
    private javafx.scene.control.Button yesButton;
    @javafx.fxml.FXML()
    private javafx.scene.control.Button returnButton;
    @javafx.fxml.FXML()
    private javafx.scene.control.Label questionTitle;
    private final com.fasterxml.jackson.core.type.TypeReference<java.util.Map<java.lang.String, java.lang.String>> typeRef = null;
    private final com.kstu.thesis.components.CacheService cacheService = null;
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    private final com.kstu.thesis.service.NavigationService navigationService = null;
    private final com.kstu.thesis.repository.QuestionsRepository questionsRepository = null;
    
    @javax.annotation.PostConstruct()
    public final void init() {
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> serializeData(java.lang.String data) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public ChooseController(@org.jetbrains.annotations.NotNull()
    com.kstu.thesis.components.CacheService cacheService, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.service.NavigationService navigationService, @org.jetbrains.annotations.NotNull()
    com.kstu.thesis.repository.QuestionsRepository questionsRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/kstu/thesis/controller/ChooseController$ChooseTransitionData;", "", "currentQuestionNumber", "", "questions", "", "", "answersCheckSum", "(ILjava/util/Map;Ljava/lang/String;)V", "getAnswersCheckSum", "()Ljava/lang/String;", "getCurrentQuestionNumber", "()I", "getQuestions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "kstu-thesis"})
    public static final class ChooseTransitionData {
        private final int currentQuestionNumber = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> questions = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String answersCheckSum = null;
        
        public final int getCurrentQuestionNumber() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getQuestions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAnswersCheckSum() {
            return null;
        }
        
        public ChooseTransitionData(int currentQuestionNumber, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> questions, @org.jetbrains.annotations.NotNull()
        java.lang.String answersCheckSum) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kstu.thesis.controller.ChooseController.ChooseTransitionData copy(int currentQuestionNumber, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> questions, @org.jetbrains.annotations.NotNull()
        java.lang.String answersCheckSum) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}
package com.kstu.thesis.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kstu/thesis/service/NavigationService;", "", "navigateScreen", "", "screen", "Lcom/kstu/thesis/utils/Screen;", "data", "kstu-thesis"})
public abstract interface NavigationService {
    
    public abstract void navigateScreen(@org.jetbrains.annotations.NotNull()
    com.kstu.thesis.utils.Screen screen, @org.jetbrains.annotations.Nullable()
    java.lang.Object data);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
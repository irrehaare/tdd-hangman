package com.irrehaare;

import java.util.List;

public class Engine {
    private static final String password = "amogus";

    public static List<String> createRenderInput(GameState gameState) {
        return List.of("Hey Wok", "who are we hanging today? HP Left: " + gameState.getAttemptsLeft());
    }

    public static GameState stateUpdate(GameState oldState, String input) {
        boolean isEnded = oldState.getPassword().equals(input);
        int newHealth = oldState.getPassword().contains(input) ? oldState.getAttemptsLeft() : oldState.getAttemptsLeft() - 1;

        return new GameState(isEnded, newHealth);
    }

}

package com.irrehaare;

import java.util.List;

public class Engine {
    private static final String password = "amogus";

    public static List<String> createRenderInput() {
        if (password.isEmpty()) {
            return List.of("Hey Wok", "who are we hanging today?");
        } else {
            return List.of("Guessed letters: " + "HP left");
        }
    }

    public static GameState stateUpdate(GameState oldState, String input) {
        boolean isEnded = oldState.getPassword().equals(input);
        return new GameState(isEnded);
    }
}

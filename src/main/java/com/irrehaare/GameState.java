package com.irrehaare;

public class GameState {
    public GameState(boolean isEnded) {
        this.isEnded = isEnded;
    }

    private final boolean isEnded;

    public boolean isEnded() {
        return isEnded;
    }
}

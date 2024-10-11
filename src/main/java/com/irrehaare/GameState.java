package com.irrehaare;

import java.util.Objects;

public class GameState {
    private final boolean isEnded;
    private final String password = "amogus";


    public GameState(boolean isEnded) {
        this.isEnded = isEnded;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameState gameState = (GameState) o;
        return isEnded == gameState.isEnded && Objects.equals(password, gameState.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnded, password);
    }
}

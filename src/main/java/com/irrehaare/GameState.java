package com.irrehaare;

import java.util.Objects;

public class GameState {
    private final boolean isEnded;
    private final String password = "amogus";
    private final int attemptsLeft;
//    private final String guessedPassword;


    public GameState(boolean isEnded, int attemptsLeft) {
        this.isEnded = isEnded;
        this.attemptsLeft = attemptsLeft;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public String getPassword() {
        return password;
    }

//    public String getGuessedPassword() {
//        return guessedPassword;
//    }
    public int getAttemptsLeft() {
        return attemptsLeft;
    }

//    public void updateGuessedPassword() {
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameState gameState = (GameState) o;
        return isEnded == gameState.isEnded && attemptsLeft == gameState.attemptsLeft && Objects.equals(password, gameState.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnded, password, attemptsLeft);
    }
}

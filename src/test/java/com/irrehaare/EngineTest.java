package com.irrehaare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void givenGameIsEndedShouldReturnEndGameScreen() {
        List<String> renderInput = Engine.createRenderInput(new GameState(true));
        List<String> expected = List.of("///", "game over", "///");
        Assertions.assertIterableEquals(expected, renderInput);
    }

    @Test
    void givenThePasswordIsGuessedShouldReturnWinScreen(){

    }
}
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
    void givenTheInputIsThePasswordEndTheGame(){
        GameState intitialGameState = new GameState(false);
        GameState gameState = Engine.stateUpdate(intitialGameState, intitialGameState.getPassword());
        GameState expectedGameState = new GameState(true);
        Assertions.assertEquals(expectedGameState, gameState);

    }

    @Test
    void givenTheInputIsNotThePasswordEndTheGame(){
        GameState intitialGameState = new GameState(false);
        GameState gameState = Engine.stateUpdate(intitialGameState, "notpass"+intitialGameState.getPassword());
        GameState expectedGameState = new GameState(false);
        Assertions.assertEquals(expectedGameState, gameState);

    }
}
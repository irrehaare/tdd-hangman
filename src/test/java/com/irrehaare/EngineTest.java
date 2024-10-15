package com.irrehaare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EngineTest {

 //   @Test
//    void givenGameIsEndedShouldReturnEndGameScreen() {
//        List<String> renderInput = Engine.createRenderInput(gameState);
//        List<String> expected = List.of("///", "game over", "///");
//        Assertions.assertIterableEquals(expected, renderInput);
//    }

    @Test
    void givenTheInputIsThePasswordEndTheGame(){
        GameState intitialGameState = new GameState(false,5);
        GameState gameState = Engine.stateUpdate(intitialGameState, intitialGameState.getPassword());
        GameState expectedGameState = new GameState(true,5);
        Assertions.assertEquals(expectedGameState, gameState);

    }

    @Test
    void givenTheInputIsNotThePasswordEndTheGame(){
        GameState intitialGameState = new GameState(false,5);
        GameState gameState = Engine.stateUpdate(intitialGameState, "notpass"+intitialGameState.getPassword());
        GameState expectedGameState = new GameState(false,5);
        Assertions.assertEquals(expectedGameState, gameState);

    }
//    @Test
//    void givenTheWordHasBeenCreatedShouldReturnTheSecondListInCreateRenderInput() {
//        List<String> renderInput = Engine.createRenderInput();
//        List<String> expectedInput = List.of("Hey Wok", "who are we hanging today?");
//        Assertions.assertEquals(expectedInput, renderInput);
//    }
//
//    @Test
//    void givenTheWordHasNotYetBeenCreatedShouldReturnTheFirstListInCreateRenderInput() {
//        List<String> renderInput = Engine.createRenderInput();
//        List<String> expectedInput = List.of("Hey Wok", "who are we hanging today?");
//        Assertions.assertNotEquals(expectedInput, renderInput);
//    }
    @Test
    void givenIncorrectInputShouldReduceHP() {
        GameState initialGameState = new GameState(false, 5);
        int initialHP = initialGameState.getAttemptsLeft();
        GameState updatedGameState = Engine.stateUpdate(initialGameState, "c");
        int finalHP = updatedGameState.getAttemptsLeft();
        Assertions.assertEquals(initialHP - 1, finalHP);
    }
    @Test
    void givenCorrectInputShouldNotReduceHP() {
        GameState initialGameState = new GameState(false, 5);
        int initialHP = initialGameState.getAttemptsLeft();
        GameState updatedGameState = Engine.stateUpdate(initialGameState, "a");
        int finalHP = updatedGameState.getAttemptsLeft();
        Assertions.assertEquals(initialHP, finalHP);
    }

    @Test
    void givenHPDropsZeroEndTheGame() {
        GameState initialGameState = new GameState(false, 1);
        GameState updatedGameState = Engine.stateUpdate(initialGameState, "a");
        Assertions.assertEquals(true,updatedGameState.isEnded());
    }

}

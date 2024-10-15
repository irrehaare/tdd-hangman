package com.irrehaare;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main( String[] args ) throws IOException {

        GameState gameState = new GameState(false,5);

        while (!gameState.isEnded()) {
            String input = InputReader.getInput();
            System.out.println(Engine.createRenderInput(gameState)); // Pass gameState here
            gameState = Engine.stateUpdate(gameState, input);
        }
    }
}

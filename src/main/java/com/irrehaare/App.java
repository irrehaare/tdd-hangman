package com.irrehaare;

import java.io.IOException;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException {

        GameState gameState = new GameState(false);



        while (!gameState.isEnded()) {
            String input = InputReader.getInput();
            System.out.println(Engine.createRenderInput());
            gameState = Engine.stateUpdate(gameState, input);
        }
    }
}

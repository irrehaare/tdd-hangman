package com.irrehaare;

import java.io.IOException;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException {
//        ConsoleRenderer.render(List.of("Hello", "Wojciech", "Who will we hang?"));
//        String input = InputReader.getInput();
//        ConsoleRenderer.render(List.of("C'mon", "Take your pick", "Mate!", input));

        GameState gameState = new GameState(false);

        while (!gameState.isEnded()) {
            ConsoleRenderer.render(List.of("Hello", "Wojciech", "Who will we hang?"));// to wymienić za pomocą createRenderInput
            String input = InputReader.getInput();
            gameState = Engine.stateUpdate(gameState, input);
        }
    }
}

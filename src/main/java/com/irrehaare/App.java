package com.irrehaare;

import java.io.IOException;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException {
//        ConsoleRenderer.render(List.of("Hello", "Wojciech", "Who will we hang?"));
        String input = InputReader.getInput();
//        ConsoleRenderer.render(List.of("C'mon", "Take your pick", "Mate!", input));

        GameState gameState1 = new GameState(input.equals("amogus"));
        GameState gameState2 = new GameState(input.equals("wokarian"));
        GameState gameState3 = new GameState(input.equals("wilku"));
        if (gameState1.isEnded()){

        }
    }
}

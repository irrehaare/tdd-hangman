package com.irrehaare;

import java.util.List;

public class Engine {

    public static List<String> createRenderInput(GameState state){

        return List.of("");
    }

    public static GameState abcd(GameState oldState, String input){

        return new GameState(true);
    }

}

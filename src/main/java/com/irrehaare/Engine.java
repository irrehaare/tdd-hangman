package com.irrehaare;

import java.util.List;

public class Engine {

    public static List<String> createRenderInput(GameState state){

        return List.of("");
    }

    public static GameState stateUpdate(GameState oldState, String input){
        boolean isEnded = oldState.getPassword().equals(input);
        return new GameState(isEnded);
    }

}

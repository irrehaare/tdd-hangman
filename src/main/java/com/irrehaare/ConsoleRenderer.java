package com.irrehaare;

import java.util.List;

public class ConsoleRenderer {
    private ConsoleRenderer() {
        // hiding default public constructor, as this class is only supposed to have static methods
    }

    public static void render(List<String> screen){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        screen.forEach(System.out::println);
    }
}

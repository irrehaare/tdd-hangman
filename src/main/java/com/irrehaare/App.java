package com.irrehaare;

import java.util.List;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        ConsoleRenderer.render(List.of("Hello", "Wojciech", "Who will we hang?"));
        Thread.sleep(1000);
        ConsoleRenderer.render(List.of("C'mon", "Take your pick", "Mate!"));
    }
}

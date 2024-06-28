package com.irrehaare;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleRendererTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    static void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void shouldRenderGivenString() {
        ConsoleRenderer.render(List.of("Test", "Message"));
        ConsoleRenderer.render(List.of("Test2", "Message2"));
        assertEquals("\u001B[H\u001B[2JTest\r\nMessage\r\n\u001B[H\u001B[2JTest2\r\nMessage2\r\n", outContent.toString());
    }


}
package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererTest {
    private ShapeRenderer renderer;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        renderer = new ShapeRenderer();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testRenderCircle() {
        renderer.renderShape("circle");
        assertEquals("Drawing a Circle", outContent.toString().trim());
    }

    @Test
    void testRenderRectangle() {
        renderer.renderShape("rectangle");
        assertEquals("Drawing a Rectangle", outContent.toString().trim());
    }

    @Test
    void testRenderTriangle() {
        renderer.renderShape("triangle");
        assertEquals("Drawing a Triangle", outContent.toString().trim());
    }

    @Test
    void testRenderUnknownShape() {
        renderer.renderShape("hexagon");
        assertEquals("Unknown shape type: hexagon", outContent.toString().trim());
    }

    @Test
    void testShapeFactorySingleton() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "ShapeFactory should be a singleton");
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }
}
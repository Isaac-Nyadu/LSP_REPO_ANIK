/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question3;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ShapeRendererTest {

    @Test
    public void testRenderCircle() {
        ShapeRenderer renderer = new ShapeRenderer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        renderer.renderShape("circle");
        assertTrue(outContent.toString().trim().contains("Drawing a Circle"));
    }

    @Test
    public void testRenderRectangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        renderer.renderShape("rectangle");
        assertTrue(outContent.toString().trim().contains("Drawing a Rectangle"));
    }
    
    @Test
    public void testRenderHexagon() {
    	ShapeRenderer renderer = new ShapeRenderer();
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(outContent));
    	
    	renderer.renderShape("triangle");
    	assertTrue(outContent.toString().trim().contains("Drawing a Triangle"));
    }

    @Test
    public void testRenderUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        renderer.renderShape("hexagon");
        assertTrue(outContent.toString().trim().contains("Unknown shape type: hexagon"));
    }

    @Test
    public void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2);
    }
}

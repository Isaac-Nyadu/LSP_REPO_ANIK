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
    public void testRenderTriangle() {
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

    /**
     * New direct tests to verify instantiation of each shape type
     * without relying solely on console output.
     */
    @Test
    public void testShapeInstantiations() {
        ShapeFactory factory = ShapeFactory.getInstance();

        Shape circle = factory.getShape("circle");
        assertNotNull("Expected a Circle instance, but got null", circle);
        assertTrue("Expected instance of Circle", circle instanceof Circle);

        Shape rectangle = factory.getShape("rectangle");
        assertNotNull("Expected a Rectangle instance, but got null", rectangle);
        assertTrue("Expected instance of Rectangle", rectangle instanceof Rectangle);

        Shape triangle = factory.getShape("triangle");
        assertNotNull("Expected a Triangle instance, but got null", triangle);
        assertTrue("Expected instance of Triangle", triangle instanceof Triangle);

        // Test an unknown shape type
        Shape unknown = factory.getShape("hexagon");
        assertNull("Expected null for unknown shape type 'hexagon'", unknown);
    }
}

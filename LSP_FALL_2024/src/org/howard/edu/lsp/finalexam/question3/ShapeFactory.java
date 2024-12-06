/**
*  Name: Isaac Nyadu Adjei
*/

package org.howard.edu.lsp.finalexam.question3;

public class ShapeFactory {
    // Singleton instance
    private static ShapeFactory instance;

    // Private constructor prevents direct instantiation
    private ShapeFactory() {}

    // Global point of access
    public static ShapeFactory getInstance() {
        if (instance == null) {
            synchronized (ShapeFactory.class) {
                if (instance == null) {
                    instance = new ShapeFactory();
                }
            }
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        shapeType = shapeType.trim().toLowerCase();
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

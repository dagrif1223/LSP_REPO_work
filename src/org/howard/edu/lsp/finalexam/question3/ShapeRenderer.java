package org.howard.edu.lsp.finalexam.question3;



// Source: https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
// Shape interface
interface Shape {
    void draw();
}

// Concrete shape classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Singleton ShapeFactory
class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}

// Refactored ShapeRenderer
public class ShapeRenderer {
    private ShapeFactory shapeFactory;

    public ShapeRenderer() {
        this.shapeFactory = ShapeFactory.getInstance();
    }

    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }
}

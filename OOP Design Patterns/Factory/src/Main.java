// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory =  new ShapeFactory();

        Shape circleShape =  shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();

    }
}
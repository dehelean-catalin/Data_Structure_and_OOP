// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AbstractFactory roundedShapeFactory =  FactoryBuilder.createFactory(true);
        AbstractFactory shapeFactory = FactoryBuilder.createFactory(false);

        Shape circleShape = roundedShapeFactory.getShape("CIRCLE");
        circleShape.draw();

        Shape shape = shapeFactory.getShape("SQUARE");
        shape.draw();

    }
}
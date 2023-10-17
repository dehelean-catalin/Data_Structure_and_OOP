public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }

        if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        return null;
    }
}

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shape.equalsIgnoreCase("OVAL")){
            return new Oval();
        }

        return null;
    }
}

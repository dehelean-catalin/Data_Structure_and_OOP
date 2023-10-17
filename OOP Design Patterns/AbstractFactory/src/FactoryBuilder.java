public class FactoryBuilder {

    public static AbstractFactory createFactory(Boolean isRounded){
        if(isRounded){
            return new RoundedShapeFactory();
        }else {
            return new ShapeFactory();
        }
    }
}

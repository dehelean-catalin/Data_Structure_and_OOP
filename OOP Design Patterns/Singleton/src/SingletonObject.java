public class SingletonObject {
    private static final SingletonObject instanceOfSingletonObject = new SingletonObject();
    private SingletonObject() {}

    public static SingletonObject getInstance(){
        return instanceOfSingletonObject;
    }

    public void getMessage(){
        System.out.println("message form singleton obj");
    }
}

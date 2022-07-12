class Car{
    String color;
    int door;
    void drive(){
        System.out.println("drive\n");
    }
}
class Firecar extends Car{
    void water(){
        System.out.println("water\n");
    }
}
public class instanceof_example {
    public static void main(String[] args) {
        Firecar fe = new Firecar();
        System.out.println(fe instanceof Object);
        System.out.println(fe instanceof Car);
        System.out.println(fe instanceof Firecar);
    }
}

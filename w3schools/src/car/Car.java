package car;

public class Car {
    String name;
    Car(String name) {
        this.name = name;
    }
    public void honk(){
        Honker honker = new Honker();
        honker.play("/Users/ij/Downloads/mixkit-clown-horn-at-circus-715.wav",  this.name);
    }
    public static void main(String[] args) {
        Car myCar = new Car("isac's car");
        myCar.honk();
    }
}

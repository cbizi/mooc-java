public class Dog extends Animal implements NoiseCapable {


    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

//    public void eat() {
//        System.out.println(getName() + " eats");
//    }
//
//    public void sleep() {
//        System.out.println(getName() + " sleeps");
//    }


    @Override
    public void makeNoise() {
        System.out.println(getName() + " barks");
    }
}

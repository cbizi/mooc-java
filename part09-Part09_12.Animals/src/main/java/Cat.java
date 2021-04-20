public class Cat extends Animal implements NoiseCapable{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(getName() + " purrs");
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
        System.out.println(getName() + " purrs");
    }
}

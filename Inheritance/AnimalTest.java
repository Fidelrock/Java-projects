public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();
    }
}
class Dog extends Animal {
    // constructor
    public Dog(String name, String species) {
        super(name, species);
    }

    void bark() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", "Golden Retriever");
        System.out.println(myDog.name);
        System.out.println(myDog.species);
        myDog.bark();
    }
}

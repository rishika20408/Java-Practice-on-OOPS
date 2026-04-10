class AnimalMulti {

    void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {

        Puppy obj = new Puppy();

        obj.eat();
        obj.bark();
        obj.weep();
    }
}

class Dog extends AnimalMulti {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy is weeping");
    }
}
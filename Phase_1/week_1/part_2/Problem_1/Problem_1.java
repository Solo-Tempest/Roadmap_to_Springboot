package Phase_1.week_1.part_2.Problem_1;

public class Problem_1 {
    public static void main(String[] args) {
        Animal[] animal = {new Dog() , new Cat() , new Cow() , new Parrot()};
        for(Animal a : animal){
            a.speak();
            a.eat();
            a.sleep();
        }
    }
}

class Animal {
    String name;

    void speak() {
        System.out.println("Animal speaks.");
    }

    void eat() {
        System.out.println("Animal eats.");
    }

    void sleep() {
        System.out.println("Animal sleeps.");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    void speak() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("meow");
    }

    @Override
    void sleep() {
        System.out.println("cat is sleeping.");
    }

    @Override
    void eat() {
        System.out.println("cat is eating.");
    }
}

class Cow extends Animal {
    @Override
    void eat() {
        System.out.println("cow is eating");
    }

    @Override
    void sleep() {
        System.out.println("cow is sleeping.");
    }

    @Override
    void speak() {
        System.out.println("moo");
    }
}

class Parrot extends Animal {
    @Override
    void speak() {
        System.out.println("mimic");
    }

    @Override
    void sleep() {
        System.out.println("parrot is sleeping.");
    }

    @Override
    void eat() {
        System.out.println("parrot is eating.");
    }
}


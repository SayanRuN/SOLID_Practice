package LSP;

import java.util.ArrayList;

public class TestDrive {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        allEat(animals);
    }

    public static void allEat(ArrayList<Animal> a) {
        for(Animal animal : a){
            animal.eat();
        }
    }
}
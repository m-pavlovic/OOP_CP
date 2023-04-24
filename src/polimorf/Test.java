package polimorf;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Device smart = new SmartTv();
        smart.powerOnDevice(20);
        smart.powerOnDevice(13, "Petra");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new RubberAnimal());
        animals.add(new Tiger());
        producingAnimalSounds(animals);
        Tiger tiger = new Tiger();
        tiger.huntPrey();
    }

    private static void producingAnimalSounds(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.produceSomeSound();
        }
    }
}
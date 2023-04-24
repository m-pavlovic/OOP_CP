package polimorf;

public class RubberAnimal extends Animal {

    @Override
    public void produceSomeSound() {
        super.produceSomeSound();
        System.out.println(getClass().getSimpleName() + " can produce any sound");
    }
}
package polimorf;

public class Tiger extends Animal {

    @Override
    public void produceSomeSound() {
        System.out.println(getClass().getSimpleName() + " roars");
    }


    public void huntPrey() {
        System.out.println(getClass().getSimpleName() + " is hunting");
    }
}
package homework6.tamrin3;

import java.util.Random;

public class Dice implements Turner {

    public Dice() {

    }

    @Override
    public void turn() {
        Random random = new Random();
        System.out.println("Dice is " + (random.nextInt(6) + 1));
    }
}

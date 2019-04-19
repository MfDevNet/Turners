package homework6.tamrin3;

public class DemoTurners2 {
    public static void main(String[] args) {
        Turner[] turners = instanceCreation();
        for (Turner turner : turners)
            turner.turn();
    }

    private static Turner[] instanceCreation() {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        Dice dice = new Dice();
        Light light = new Light();
        return new Turner[]{leaf, page, pancake, light, dice};
    }
}

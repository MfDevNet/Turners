package homework6.tamrin3;

public class Light implements Turner {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    @Override
    public void turn() {
        if (isOn) {
            isOn = false;
            System.out.println("Light is Off");
        } else {
            isOn = true;
            System.out.println("Light is On");
        }
    }
}

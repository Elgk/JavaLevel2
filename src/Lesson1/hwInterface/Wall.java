package Lesson1.hwInterface;

public class Wall implements Leap{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean takeLeap(double value) {
        if (value > height) {
            return true;
        }
        else {
            return false;
        }
    }
}

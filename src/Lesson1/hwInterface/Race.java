package Lesson1.hwInterface;

public class Race implements Leap{
    private int lenght;

    public Race(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public boolean takeLeap(double value) {
        if (value >= lenght) {
            return true;
        }
        else {
            return false;
        }
    }
}

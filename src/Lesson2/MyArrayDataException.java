package Lesson2;

public class MyArrayDataException extends NumberFormatException{
    private int num;

    public MyArrayDataException(String s, int num) {
        super(s);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

package Lesson2;

public class MyArraySizeException extends IllegalArgumentException{
    private  int num;

    public MyArraySizeException(String s, int num) {
        super(s);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

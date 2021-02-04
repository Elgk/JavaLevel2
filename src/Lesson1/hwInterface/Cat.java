package Lesson1.hwInterface;

public class Cat implements RuJumpable{
    public final double jumpSize = 2;
    public final int runDistance = 100;

    @Override
    public boolean run(Race r) {
        if (r.takeLeap(runDistance)) {
            System.out.println("Кот пробежал " + r.getLenght() + " метров");
            return true;
        }else {
            System.out.println("Кот не пробежал " + r.getLenght() + " метров");
            return false;
        }
    }

    @Override
    public boolean jump(Wall w) {
        if (w.takeLeap(jumpSize)) {
            System.out.println("Кот прыгнул на " + w.getHeight()+ " метров");
            return true;
        }else {
            System.out.println("Кот не прыгнул на " + w.getHeight()+ " метров");
            return false;
        }
    }
}

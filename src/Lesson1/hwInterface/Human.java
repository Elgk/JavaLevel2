package Lesson1.hwInterface;

public class Human implements RuJumpable{
    private String name;
    public final double jumpSize = 1.5;
    public final int runDistance = 2000;

    public Human(String name){
        this.name = name;
    }

    @Override
    public boolean run(Race r) {
        if (r.takeLeap(runDistance)){
            System.out.println(name + " пробежал " + r.getLenght() + " метров");
            return true;
        }else {
            System.out.println(name + " не смог пробежать " + r.getLenght() + " метров");
            return false;
        }

    }

    @Override
    public boolean jump(Wall w) {
        if (w.takeLeap(jumpSize)) {
            System.out.println(name + " перепрыгнул высоту " + w.getHeight());
            return true;
        }else {
            System.out.println(name + " не смог перепрыгнуть высоту " + w.getHeight());
            return false;
        }
    }
}

package Lesson1.hwInterface;

public class Robot implements RuJumpable{
    public final double jumpSize = 0.5;
    public final int runDistance = 400;

    @Override
    public boolean run(Race r) {
        if (r.takeLeap(runDistance)) {
            System.out.printf("Робот преодолел дистанцию в %d метров", r.getLenght());
            return true;
        }else {
            System.out.printf("Робот не рассчитан преодолевать дистанцию в %d метров", r.getLenght());
            return false;
        }
    }

    @Override
    public boolean jump(Wall w) {
        if (w.takeLeap(jumpSize)) {
            System.out.println("Робот  преодолел высоту: "+ w.getHeight()+ " метров" );
            System.out.println();
            return true;
        }else {
            System.out.println("Робот не рассчитан преодолевать высоту: " + w.getHeight()+ " метров" );
            System.out.println();
            return false;
        }

    }
}

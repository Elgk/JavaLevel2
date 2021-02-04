package Lesson1.hwInterface;

public class InterfaceMain {
    public static void main(String[] args) {
        RuJumpable[] runJumpers = {
                new Human("Ваня"),
                new Cat(),
                new Robot()
        };
        Leap[] leaps = {
                new Wall(1.7),
                new Race(1000)
        };

        for (RuJumpable at : runJumpers) {
            for (Leap lp : leaps) {
                if (lp instanceof Wall) {
                    if (!at.jump((Wall) lp)) {
                        break;
                    }
                }
                if (lp instanceof Race) {
                    at.run((Race) lp);
                }
            }
        }

    }
}

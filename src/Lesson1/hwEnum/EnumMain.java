package Lesson1.hwEnum;

public class EnumMain {
    public static void main(String[] args) {
        getWorkingHours(DaysOfWeek.THURSDAY);
    }

    public static void getWorkingHours (DaysOfWeek d){
        int workHours = 0;
        for (DaysOfWeek day : DaysOfWeek.values()) {
            if (day.ordinal() >= d.ordinal()) {
                workHours += day.getWorkHours();
            }
        }
        if (workHours != 0) {
            System.out.printf("Осталось %d рабочих часов", workHours);
        } else {
            System.out.println("Сегодня выходной");
        }
    }

}

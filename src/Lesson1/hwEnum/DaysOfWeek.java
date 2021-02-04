package Lesson1.hwEnum;

public enum DaysOfWeek {
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(7),
    SATURDAY(0),
    SUNDAY(0);

    private int workHours;

    DaysOfWeek(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

}

package Lesson5;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        for (Float arrF: arr ) {
            arrF = 1f;
        }
        method1(arr);
        method2(arr);
    }

    public static void method1(float[] arr){
        long ml = System.currentTimeMillis();
        calcArray(arr,SIZE);
        System.out.println("Method1 time " + (System.currentTimeMillis() - ml));
    }

    public static void method2(float[] arr){
        // float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[SIZE];

        long ml = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread t1 = new Thread(() -> calcArray(arr1, HALF));
        Thread t2 = new Thread(() -> calcArray(arr2, HALF));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1,0, arr, 0, HALF);
        System.arraycopy(arr2,0, arr, HALF, HALF);
        System.out.println("Method2 time " + (System.currentTimeMillis()-ml));
    }

    private static void calcArray(float[] arr, int value){
        for (int i = 0; i < value; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f +i/5) * Math.cos(0.4f + i/2));
        }
    }

}

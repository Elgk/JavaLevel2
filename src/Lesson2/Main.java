package Lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] stArr = {
                {"11","22","33","44"},
                {"1","2","3","8"},
                {"12","23","34","45"},
                {"32","21","43","54"}
        };

        try {
            System.out.println("Сумма всех чисел: " + getElementSumm(stArr));
        }catch (MyArraySizeException e){
            e.getStackTrace();
            System.out.println("ExceptionNumber is " + e.getNum() );
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            e.getStackTrace();
            System.out.println("ExceptionNumber is " + e.getNum());
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programme is finished");
        }
    }

    public static int getElementSumm(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int total = 0;
        if (arr.length !=4){
            throw new MyArraySizeException("Неверная размерность массива: колиество строк массива должно быть 4",4);
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length != 4){
                throw new MyArraySizeException("Неверная размерность массива: колиество элементов в строке должно быть 4",4);
            }
            for (int j = 0; j < arr[i].length; j++){
                try {
                    total += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Неверное число arr["+i+"]["+j+"]: "+ arr[i][j], 1);
                }
            }
        }
        return total;
    }
}

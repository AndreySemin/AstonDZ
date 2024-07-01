import leasson8.MyArrayDataException;
import leasson8.MyArraySizeException;

public class Main {
    public static void main(String[] args){
        String[][] arr =new String[][]{{"5","3","4","1"},{"]","5","6","7"},{"8","9","1","1"},{"1","2","2","2","3"}};
        try {
            try {
                int result = mathod(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер превышен");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке:"+ e.i+"x"+e.j);
        }


    }
    public static int mathod(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
        if(arr.length !=4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i<arr.length; i++){
            if(arr[i].length !=4){
                throw new MyArraySizeException();
            }
            for (int j =0; j<arr.length; j++){
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return count;
    }

}

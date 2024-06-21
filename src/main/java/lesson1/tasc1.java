package lesson1;

public class tasc1 {
    public static void main(String[] args) {

        printThreeWords();
        System.out.println("the sum is" + (checkSumSign(10, -5) ? " positive" : " negative"));
        printColor();
        compareNumbers();
        twoNumber();
        positiveornegative();
        trueOrfalse();
        stringLine("привет", 5);
        System.out.println(leapYear(1988));

        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Замена 0 на 1, 1 на 0 ");
        massive(replaceValues);

        System.out.println("\nМассив = 100 ");
        massive100(100);

        int[] multiTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n Меньше 6, *2");
        massive3(multiTwo);

        System.out.println("\n Двумерный массив: ");
        massive4();

        System.out.println("\n возвращает одномерный массив: ");
        massive5(4, 6);






    }

    //1  Создайте метод printThreeWords(),
    // который при вызове должен отпечатать в столбец три слова:
    // Orange, Banana, Apple.
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //2 Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите.
    // Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static boolean checkSumSign(int a, int b) {

        return a + b >= 0;
    }

    //3 Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
    // ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести
    // сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
    // то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //4  Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
    // то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = 11;
        int b = 11;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    //5 Напишите метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static void twoNumber() {
        int a = 20;
        int b = 8;
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            System.out.println("true");
        } else System.out.println("False");
    }

    //6  Напишите метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void positiveornegative() {
        int a = 0;
        System.out.println(a >= 0 ? "positive" : "negative");
    }
    //7   Напишите метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    //Замечание: ноль считаем положительным числом.

    public static void trueOrfalse() {
        int a = 2;
        System.out.println(a > 0 ? "trгe" : "false");
    }



    //8  Напишите метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    static void stringLine(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }
    //9  Напишите метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    static boolean leapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;

    }

    //10 Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
    // и условия заменить 0 на 1, 1 на 0;

    public static void massive(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }


    //11 Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;

    public static void massive100(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }

    //12 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void massive3(int[]multiTwo) {
        for (int i = 0; i < multiTwo.length; i++) {
            if (multiTwo[i] < 6) {
                multiTwo[i] = multiTwo[i] * 2;
            }
            System.out.print(multiTwo[i] + " ");
        }
    }

    //13 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
    // диагоналей, если обе сложно). Определить элементы одной из диагоналей можно
    // по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
    public static void massive4() {
        int[][] arr = new int[2][1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    //14  Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue.

    public static void massive5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }



}

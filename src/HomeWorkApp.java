public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        System.out.println("3 задание:");
        checkSumSign();

        System.out.println("4 задание:");
        printColor();

        System.out.println("5 задание:");
        compareNumbers();
    }


    public static void printThreeWords() { //2 задание
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static boolean checkSumSign() { //3 задание
        int a = 10;
        int b = -4;

        if (a * b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        return (a * b) >= 0;

    }


    public static void printColor() { //4 задание
        int Value1 = -5; //Красный
        int Value2 = 100; //Желтый
        int Value3 = 155;//Зеленый

        if (Value1 <= 0) {
            System.out.println("Red");
        }
        if (Value1 >= 100 || Value1 > 0) {
            System.out.println("Yellow");
            {
                if (Value1 > 100) {
                    System.out.println("Green");
                }
            }
        }
        if (Value2 <= 0) {
            System.out.println("Red");
        }
        if (Value2 >= 100 || Value1 > 0) {
            System.out.println("Yellow");
            {
                if (Value2 > 100) {
                    System.out.println("Green");
                }
            }
        }
        if (Value3 <= 0) {
            System.out.println("Red");
        }
        if (Value3 >= 100 || Value1 > 0) {
            System.out.println("Yellow");
            {
                if (Value3 > 100) {
                    System.out.println("Green");
                }
            }
        }
    }

    public static void compareNumbers() {
        int a1 = 80;
        int b2 = -5;
        if (a1 >= b2) {
            System.out.println("a1 >= b2");
            {
            }
            if (a1 < b2) {
                System.out.println("a1 >= b2");
            }
        }
    }
}











public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] intMasiv = new int[3];
        intMasiv[0]=1;
        intMasiv[1]=2;
        intMasiv[2]=3;
        for (int i = 0; i < intMasiv.length; i++) {
            System.out.println(intMasiv[i]);
        }
        double[] doublesMasiv = {1.57, 7.654, 9.986};
        for (int i = 0; i < doublesMasiv.length; i++) {
            System.out.println("Элемент массива " + i + " значение элемента " + doublesMasiv[i]);
        }
        int[] proizvMasiv = {3, 45, 67, 89, 43, 46, 79};
        System.out.println(" " + proizvMasiv[0]);
        System.out.println(" " + proizvMasiv[4]);
        System.out.println(" " + proizvMasiv[5]);
        System.out.println(" " + proizvMasiv[6]);
        System.out.println("элементов массива " + proizvMasiv.length);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] intMasiv = new int[3];
        intMasiv[0] = 1;
        intMasiv[1] = 2;
        intMasiv[2] = 3;
        for (int i = 0; i < intMasiv.length; i++) {
            if (i < intMasiv.length-1) {
                System.out.print(intMasiv[i] + ", ");
            } else {
                System.out.println(intMasiv[i]);
            }
        }
        double[] doublesMasiv = {1.57, 7.654, 9.986};
        for (int i = 0; i < doublesMasiv.length; i++) {
            if (i < doublesMasiv.length-1) {
                System.out.print(doublesMasiv[i] + ", ");
            } else {
                System.out.println(doublesMasiv[i]);
            }
        }
        int[] proizvMasiv = {3, 45, 67, 89, 43, 46, 79};
        for (int i = 0; i < proizvMasiv.length; i++) {
            if (i < proizvMasiv.length - 1) {
                System.out.print(proizvMasiv[i]+", ");
            } else {
                System.out.print(proizvMasiv[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        //напечатать элементы массива в обратном порядке
        System.out.println("Задача 3");
        int[] proizvMasiv = {3, 45, 67, 89, 43, 46, 79};
        for (int i = proizvMasiv.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(proizvMasiv[i]+", ");
            } else
                System.out.print(proizvMasiv[i]);
        }
        System.out.println();
    }
    public static void task4(){
        System.out.println("Задача 4");
        int[] proizvMasiv = {3, 45, 67, 89, 43, 46, 79};
        for (int i = 0; i < proizvMasiv.length; i++) {
            System.out.print(proizvMasiv[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < proizvMasiv.length; i++) {
            if(proizvMasiv[i]%2 ==1){
                System.out.print((proizvMasiv[i] = proizvMasiv[i] + 1) +" ");
            }else {
                System.out.print(proizvMasiv[i]+" ");
            }
        }
    }

}




public class DivisionDemo {
    public static void main(String[] args) {
        int iresult, iremain; // Для деления целых чисел
        double dresult, dremain; // Для деления вещественных чисел

     // Деление целых чисел
     iresult = 10 / 3;
     iremain = 10 % 3;

      System.out.print ("Частное от деления 10 / 3 равно");
     System.out.println(iresult + ", остаток равен " + iremain);


     // Деление вещественных чисел
     dresult = 10.0 / 3.0;
     dremain = 10.0 % 3.0;

     System.out.print ("частное от деление 10.0 / 3.0 равно ");
     System.out.println(dresult + ", остаток равен " + dremain);

    } // main(String[]) method
} // DivisionDemo



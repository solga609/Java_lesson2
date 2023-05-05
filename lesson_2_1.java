
import java.lang.ClassNotFoundException;
import java.sql.Struct;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


 public class lesson_2_1 {
    

    public static void main(String [] args){
         lesson_2_1(null);
      }
    
      private static void lesson_2_1(int[]  intArray) {
   

    
    try {
        int d = 0;
      double catchedRes1  = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch(NullPointerException e){
        System.out.println("Передан пустой объект массива " + e);
     } 
     catch (ArithmeticException e) {
        System.out.println("Деление на ноль " + e);
      
     } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Выход за пределы массива " + e);
     } 
    
    
 }}
 
   
 
     
  
     
    // public static void main(String[] args)  {
    //       Lesson_2_2();}
    //       private static void Lesson_2_2() {
        
    //     // public static void Lesson_2_2() {
    //     // throws Exception
    //     try {
    //         int a = 90;
    //         int b = 3;
    //         System.out.println(a / b);
    //         printSum(23, 234);
    //         int[] abc = { 1, 2 };
    //         abc[3] = 9;
    //     } catch (NullPointerException ex) {
    //       System.out.println("Указатель не может указывать на null!");
    //  } catch (IndexOutOfBoundsException ex) {
    //      System.out.println("Массив выходит за пределы своего размера!");
    //     }  catch ( ArithmeticException ex){
    //         System.out.println("Деление на ноль" + ex);
          
    //       }
        
    //     catch (Throwable ex) {
    //         System.out.println("Что-то пошло не так...");
    //   }
    
    // }
      
    // public static void printSum(Integer a, Integer b) throws NullPointerException {
    //     System.out.println(a + b);
    
    
     
//  }


// public static void main(String[] args){
//     float num = 0;
//     boolean run = true;
//     while(run){
//         run = false;
//         System.out.println("Введите дробное число: ");
//         Scanner in = new Scanner(System.in);
//         try{
//             num = in.nextFloat();
//         } catch (InputMismatchException e) {
//             System.out.println("Вы ввели не число ");
//             run = true;
//         } catch (NoSuchElementException e){
//             System.out.println("Ошибка сканера ");
//         }
//     finally{

//     }
//     System.out.println("Введенное число " + num);
//     }
// }

 
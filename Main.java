import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
   public static DecimalFormat td = new DecimalFormat("0.00");   //void means to not return anything 
   public static Scanner scan= new Scanner(System.in); //Anytime scan is used its from the keyboard
   public static void main (String args[])throws FileNotFoundException {//File not found exception is so the program wont crash

      System.out.println("-Welcome to the Roman Numeral Calculator-");
      System.out.println("Follow the Instructions Below");  
      System.out.println("Choose if you want to do a Calculation or a Conversion"); 
      System.out.println("     |     ");
      System.out.println("     v     "); 
      int num,num1,ver;
      System.out.println("Main Menu");
      System.out.println("---------");
      System.out.println("1.Calulator");
      System.out.println("2.Convertor");
         ver=scan.nextInt();

   while(ver<3) {

   do { //Main Menu Do-While
      
      switch(ver) {

         case 1:do { // Calcultor
   
            System.out.println( ">Choose a Number You'd Like To Do<");
            System.out.println("1.Addition");
            System.out.println("2.Subtration");
            System.out.println("3.Multiplication");            
            System.out.println("4.Division");
            System.out.println("5.Back to Main Menu");
               num=scan.nextInt();
            System.out.println();
 
      switch(num) {

         case 1:
            System.out.println("Addition");
            System.out.println("Enter the 2 Roman Numerals that you want to add");
               int sum = 0;
               int sum1 = 0;
            String RoNum,RoNum1;
               RoNum=scan.next();
               RoNum1=scan.next(); 
            System.out.println("The 2 Roman Numerals You're Adding are --> "+ RoNum +" and "+ RoNum1);
            System.out.println(RoNum +"+"+ RoNum1 +"\n=");

            int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            int[] decimal1 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman1 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            for (int i=0; i<decimal.length; i++) {

               while (RoNum.indexOf(roman[i]) == 0) {     //index of returns the string
                  sum += decimal[i];
                  RoNum = RoNum.substring(roman[i].length());        //substrings create smaller strings out of a bigger one 
               }
            }

            for (int i=0; i<decimal.length; i++) {
               while (RoNum1.indexOf(roman[i]) == 0) {
                  sum1 += decimal1[i];
                  RoNum1 = RoNum1.substring(roman1[i].length());        
               }
            }
               System.out.println(sum+sum1);
               
         break;
      
         case 2:
            System.out.println("Subtraction");
            System.out.println("Enter the 2 Roman Numerals that you want to Subtract");
               int sum2 = 0;
               int sum3 = 0;
            String RoNum2,RoNum3;
               RoNum2=scan.next();
               RoNum3=scan.next(); 
            System.out.println("The 2 Roman Numerals You're Subtracting are --> "+RoNum2+" and "+RoNum3);
            System.out.println(RoNum2+"-"+ RoNum3 +"\n=");

            int[] decimal2 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman2 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            int[] decimal3 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman3 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            
            for (int i=0; i<decimal2.length; i++) {
               while (RoNum2.indexOf(roman2[i]) == 0) {
                  sum2 += decimal2[i];
                  RoNum2 = RoNum2.substring(roman2[i].length());         
               }
            }

            for (int i=0; i<decimal3.length; i++) {
               while (RoNum3.indexOf(roman3[i]) == 0) {
                  sum3 += decimal3[i];
                  RoNum3 = RoNum3.substring(roman3[i].length());        
               }
            }
               System.out.println(sum2-sum3);
                  
         break;
      
         case 3:
            System.out.println("Multiplication");
            System.out.println("Enter the 2 Roman Numerals that you want to Multiply");
            int sum4 = 0;
            int sum5 =0;
            String RoNum4,RoNum5;
               RoNum4=scan.next();
               RoNum5=scan.next(); 
            System.out.println("The 2 Roman Numerals You're Multiplying are --> "+RoNum4+" and "+RoNum5);
            System.out.println(RoNum4+"x"+ RoNum5 +"\n=");

            int[] decimal4 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman4 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            int[] decimal5 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman5 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            
            for (int i=0; i<decimal4.length; i++){
               while (RoNum4.indexOf(roman4[i]) == 0) {
                  sum4 += decimal4[i];
                  RoNum4 = RoNum4.substring(roman4[i].length());         
               }
            }

            for (int i=0; i<decimal5.length; i++) {
               while (RoNum5.indexOf(roman5[i]) == 0) {
                  sum5 += decimal5[i];
                  RoNum5 = RoNum5.substring(roman5[i].length());        
               }
            }
               System.out.println(sum4*sum5);
         break;
      
         case 4:
         System.out.println("Division");
         System.out.println("Enter the 2 Roman Numerals that you want to Divide");
         int sum6 = 0;
         int sum7 = 0;
         String RoNum6,RoNum7;
            RoNum6=scan.next();
            RoNum7=scan.next(); 
         System.out.println("The 2 Roman Numerals You're Dividing are --> "+RoNum6+" and "+RoNum7);
         System.out.println(RoNum6+"/"+ RoNum7 +"\n=");

         int[] decimal6 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         String[] roman6 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
         int[] decimal7 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         String[] roman7 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                 
         for (int i=0; i<decimal6.length; i++) {
            while (RoNum6.indexOf(roman6[i]) == 0) {
            sum6 += decimal6[i];
            RoNum6 = RoNum6.substring(roman6[i].length());         
            }
         }

      for (int i=0; i<decimal7.length; i++) {
         while (RoNum7.indexOf(roman7[i]) == 0) {
            sum7 += decimal7[i];
            RoNum7 = RoNum7.substring(roman7[i].length());        
         }
      }
         System.out.println(sum6/sum7);
           
      }
      break;
    
   }while(num>6);
   
 break;//Breaks the Menus in Half
 
      case 2:do {//Convertor 
   
      System.out.println(">Choose a Number You'd Like To Do<");
      System.out.println("1.To Roman Numeral");
      System.out.println("2.From Roman Numeral");
      System.out.println("3.Back to the Main Menu");
         num1=scan.nextInt();
      System.out.println();
   
      switch(num1)
      {
         case 1:
            System.out.println("Number To Roman Numeral");
            System.out.println("Enter a Number and It'll be Converted to a Roman Numeral");
            int num2 = scan.nextInt();
            String RoNum8 =" ";
            System.out.println("The Number You Entered Is "+num2);
   
            while(num2>0) {
               if(num2>=1000) {       //swap the things that you input in the if else statements?
                  RoNum8+='M';        //keep the bottom the same and swap the top for entering RoNum's
                  num2-=1000;
               }
               else if(num2>=500) {
                     RoNum8+='D';
                     num2-=500;  
               }
               else if(num2>=100) {
                     RoNum8+='C';
                     num2-=100;        //this takes out the number
               }
               else if(num2>=50) {
                     RoNum8+='L';
                     num2-=50;
               }
               else if(num2>=10) {
                     RoNum8+='X';
                     num2-=10;
               }
               else if(num2>=5) {
                     RoNum8+='V';
                     num2-=5;
               }
               else if(num2>=1) {
                     RoNum8+='I';
                     num2-=1;
               }
            }
            System.out.println("Your Number as Roman Numeral Is --> "+RoNum8);

         break;
   
         case 2:
            System.out.println("Roman Numeral To Number"); //****make in a class****  //Print Statements
            System.out.println("Enter the Roman Numeral That You Want Converted Into A Number"); 
            System.out.println("---Remember to Capitalize---");
            FromRoman z = new FromRoman();   
            System.out.println("You're Roman Numeral as a Number Is --> "+z.result);      
         break;
      }
      break;
   } while(num1>3);
         
      }      

   System.out.println();
   System.out.println("Anything Else?");
   System.out.println("---------");
   System.out.println("1.Calulator");
   System.out.println("2.Convertor");
   System.out.println("3.END");
      ver=scan.nextInt(); 

   }while(ver>3);     
   }
   }

}
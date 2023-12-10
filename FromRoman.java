import java.util.*;
import java.io.*;
import java.text.*;

public class FromRoman
{
   public static Scanner scan=new Scanner(System.in);
   int result = 0;
   int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
   String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

   FromRoman() 
{
   String RoNum=scan.next();        

      for(int i=0; i<decimal.length; i++)
{
         while (RoNum.indexOf(roman[i]) == 0)      //index of returns the string
   {
            result += decimal[i];
            RoNum = RoNum.substring(roman[i].length());        //substrings create smaller strings out of a bigger one 
   }
}
}
}
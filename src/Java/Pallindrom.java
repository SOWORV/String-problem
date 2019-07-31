package Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pallindrom {


    public static void main(String[] args) {
        Pallindrom pallindrom = new Pallindrom();


        String name ="Dad";

         char [] arrays = name.toLowerCase().toCharArray();

         String reverse ="";
         for (int a =arrays.length-1; a>=0; a--){
             reverse = reverse+arrays[a];

         }
         if(reverse.equalsIgnoreCase(name)){
             System.out.println(name + " this word is a palindrom");

         }else{
             System.out.println(name + " this word is not palindrom");
         }

         pallindrom.intpalindrom();



        }

        public  void intpalindrom(){
        int num = 121;

        int a;
        int b=0;
        int c;



        c=num;
        while (num>0){
        a= num%10;
        b= (b*10)+a;
        num =num/10;
        }
        if(c==b){
            System.out.println("palindrom number ");
        }else
            System.out.println("not palindrom numbner");




        }


    }




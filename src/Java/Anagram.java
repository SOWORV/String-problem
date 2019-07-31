package Java;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        Anagram anagram = new Anagram();

        String firstword = "army";
        String secondword = "mary";
        String thiredword = "cat";
        String forthword = "act";

        char [] tochararray1 = firstword.toCharArray();
        char [] tochararray2 = secondword.toCharArray();
        char [] tochararray3 = thiredword.toCharArray();
        char [] tochararray4 = forthword.toCharArray();
        Arrays.sort(tochararray1);
        Arrays.sort(tochararray2);
        Arrays.sort(tochararray3);
        Arrays.sort(tochararray4);

        if(Arrays.equals(tochararray1,tochararray2)){
            System.out.println("the words are anagram");
        }else
            System.out.println("the words are not anagram");

        if(Arrays.equals(tochararray1,tochararray4)){
            System.out.println("the words are Anagram");
        }else
            System.out.println("the words are not Anagram");

        if(Arrays.equals(tochararray3,tochararray4)){
            System.out.println("Anagram");

        }else
            System.out.println("not Anagram");

        if(Arrays.equals(tochararray2,tochararray4)){
            System.out.println("anagram");
        }else
            System.out.println("not anagram");




    }
}

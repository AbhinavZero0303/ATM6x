package Assignment;

import java.util.Scanner;

public class Vowel_cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c =' ';
        int v=0;
        int p=0;
        System.out.println("Enter the string");
        String a = sc.next();
        for(int i = 0;i<a.length();i++)
        {
            c = a.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                v++;
            }
            else
            {
                p++;
            }
        }
        System.out.println("Vowel= "+v);
        System.out.println("Consonants= "+p);
    }
}

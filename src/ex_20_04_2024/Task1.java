package ex_20_04_2024;

public class Task1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int max = (a>b) ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println(max);
}}

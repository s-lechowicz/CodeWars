package javaKata;

public class FindTheGCFofTwoNumbers {
    public static int findGCF(int num1, int num2) {
        int num3;
        while (num2 != 0) {
            num3 = num1 % num2;
            num1 = num2;
            num2 = num3;
        }
        return num1;
    }
}

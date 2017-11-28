package javaKata;

public class MultiplesOf3or5 {

    public int solution(int number) {
        int sum3 = 0;
        int sum5 = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) {
                sum3 += i;
            } else if (i % 5 == 0) {
                sum5 += i;
            }
        }
        return sum3 + sum5;
    }
}

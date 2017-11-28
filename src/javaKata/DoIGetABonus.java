package javaKata;

public class DoIGetABonus {
    public static String bonusTime(int salary, final boolean bonus) {
        if (bonus) {
            salary *= 10;
        }
        return "\u00A3" + salary;
    }
}

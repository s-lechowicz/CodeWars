package javaKata;

//Original name: Determine offspring sex based on genes XX and XY chromosomes

public class ChromosomeChecker {
    public static String chromosomeCheck(String sperm) {
        return sperm.equals("XX") ? "Congratulations! You're going to have a daughter." : "Congratulations! You're going to have a son.";
    }
}

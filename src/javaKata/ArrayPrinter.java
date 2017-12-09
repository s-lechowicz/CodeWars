package javaKata;

public class ArrayPrinter {
    public static String printArray(Integer[] array) {
        String output = "";

        for (Integer element : array) {
            output += element + ",";
        }

        output = output.substring(0, (output.length() - 1));

        return output;
    }

    public static String printArray(String[] array) {
        String output = "";

        for (String element : array) {
            output += element + ",";
        }

        output = output.substring(0, (output.length() - 1));

        return output;
    }

}

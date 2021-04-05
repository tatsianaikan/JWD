package by.epamtc.task1;


import by.epamtc.scanner.ConsoleScanner;

public class Main {

    public static void main(String[] args) {

        int number = ConsoleScanner.entryIntValidation();
        int result = Logic.squareLastDigit(number);

        System.out.printf("Result: %d", result);
    }
}

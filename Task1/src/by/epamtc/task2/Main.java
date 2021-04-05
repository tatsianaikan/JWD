package by.epamtc.task2;


import by.epamtc.scanner.ConsoleScanner;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date enteredDate = ConsoleScanner.entryDateValidation();
        String result= Logic.dateParsing(enteredDate);

        System.out.println(result);
    }
}

package by.epamtc.task2;

import java.util.Date;

public class Logic {
    public static final int DIVIDER_4 = 4;
    public static final int DIVIDER_100 = 100;
    public static final int DIVIDER_400 = 400;

    public static String dateParsing (Date date) {
        int month = date.getMonth()+1;
        int year = date.getYear();
        int numDays = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays = 31;
                break;
            case 2:
                numDays = (isLeapYear(year)) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
        }

        String result = (isLeapYear(year) ? "leap" : "not leap");
        return "The " + year + " is " + result + ". month contains: " +  numDays + " days\n";
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (((year % DIVIDER_4 == 0) && !(year % DIVIDER_100 == 0)) || (year % DIVIDER_400 == 0)) {
            isLeap = true;
        }
        return isLeap;
    }
  }

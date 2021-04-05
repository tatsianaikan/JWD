package by.epamtc.task1;

public class Logic {
    public static int squareLastDigit (int number) {
        int lastDigit = defineLastDigit(number);
        int squareDigit = (int)Math.pow(lastDigit, 2);
        int lastSquareDigit = defineLastDigit(squareDigit);
        return lastSquareDigit;
    }

    private static int defineLastDigit (int number){
        return number % 10;
    }

  }

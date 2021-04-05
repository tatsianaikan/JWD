package by.epamtc.scanner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleScanner {

    public static int entryIntValidation(){
        boolean flag = true;
        System.out.println("Enter number");
        do{
            try{
                Scanner in = new Scanner(System.in);
                int enteredNumber = in.nextInt();
                return enteredNumber;
            }catch (InputMismatchException e) {
                System.out.println("ERROR: " + e + ". Enter correct number, please try again");
                flag = false;
            }
        }while(!flag);
        return 0;
    }
//заданным году и номеру месяца определяет количество дней в этом месяце и корректно определялись все високосные года.
    public static Date entryDateValidation(){
        final  String DATE_FORMAT = "MM-yyyy";
        boolean flag = true;
        Date date = null;
        System.out.println("Enter number of month");
        do{
            try {
                DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                dateFormat.setLenient(false);

                Scanner in = new Scanner(System.in);
                date = dateFormat.parse(in.nextLine());
                flag = true;
            } catch (ParseException | InputMismatchException e) {
                System.out.println("Enter correct date according to " + DATE_FORMAT + " format, please try again");
                flag =  false;
            }
        }while(!flag);

        return date;
    }
}

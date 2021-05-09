package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import exeptions.MenuSelecrionException;

public class ViewProcessor {
	
	@SuppressWarnings("resource")
	public int selectMenuData(){
        boolean flag = true;
        do{
           try {
                int numb = new Scanner(System.in).nextInt();
                if((numb == 1) || (numb == 2)){
                     return numb;
               }else {
            	   throw new MenuSelecrionException();
               } 
            } catch (MenuSelecrionException e) {
                flag = false;
            }catch (InputMismatchException e) {
                 System.out.println("ERROR: " + e + ". Enter correct number, please ");
                flag = false;
            }
        }while(!flag);			
        return 0;
	}
}

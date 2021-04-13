package by.epamtc.arrayshell.dataprovider;

import java.util.ArrayList;
import java.util.List;

public class NumberGeneration extends AbstractDataSourceInt {

	 public List<Integer> entryIntValidation(){
		 List<Integer> listInt = new ArrayList();
		 do {
			 int enteredNumber =  (int) ( Math.random() * 100 );
			 listInt.add(enteredNumber);
		 } while(listInt.size() <=5);
		 return  listInt;
	 }

}

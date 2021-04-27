package lab1.by.epamtc.arrayshell.dataprovider;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDataSourceInt {

	 protected AbstractDataSourceInt() {}
	
	 public List<Integer> entryIntValidation(){
		 List<Integer> listInt = new ArrayList<Integer>();
		 listInt.add(null);
		 return  listInt;
	 }

}

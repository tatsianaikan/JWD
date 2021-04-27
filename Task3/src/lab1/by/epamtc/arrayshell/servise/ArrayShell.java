package lab1.by.epamtc.arrayshell.servise;

import java.util.List;
import lab1.by.epamtc.arrayshell.pojos.Array;

public class ArrayShell {
	 protected Array castomAarray;

	 
	public ArrayShell(Array cArray) {
		this.castomAarray = cArray;
	}
	
	public ArrayShell(int[] array) {
		this.castomAarray = new Array(array);
	}
	
	public ArrayShell(List<Integer> listEntities) {
		this.castomAarray = new Array(listEntities);
	}
	

	/**
	 * Get values(int) which are contain in array 
	 * @return String, all numbers are in array
	 */
	public String values() {
	    return this.castomAarray.toString();
	}
	
	/**
	 * Get size of array
	 * @return int, size of array
	 */
	public int size() {
	    return castomAarray.getSize();
	}

	/**
	 * Check is array contains some elements
	 * @return boolean, false if array contains at least one element
	 */	
    public boolean isEmpty() {
        return castomAarray.getSize() == 0;
    }
    
    /**
	 * Get element with max value in array
	 * @return int, value
	 */	
    public int maxValue() {
    	int max = castomAarray.get(0);
    	 for(int i=1; i<size(); i++){ 
    		 if(castomAarray.get(i) > max){ 
             max = castomAarray.get(i); 
          } 
        } 
        return max; 
    }

    /**
	 * Get element with min value in array
	 * @return int, value
	 */	
    public int minValue() {
		int min = castomAarray.get(0);
		 for(int i=1; i<size(); i++){ 
			 if(castomAarray.get(i) < min){ 
		        min = castomAarray.get(i); 
		     } 
		   } 
	    return min; 
    }
    
    public int searchElement(int index) {
    	return castomAarray.get(index);
    }
 
    
    /**
     * Select minimal element in array and move it to start. Each next iteration will be started form next element;  
     * @return String, values in sorted array
     */
    public static void sortBySelection(Array cArray){
		for (int i = 0; i < cArray.getSize(); i++) {
		    int min = cArray.get(i);  //first element will be as minimal
		    int min_i = i; 
		    for (int j = i+1; j < cArray.getSize(); j++) {  //try to find less of minimal element, and if is remember it
			    if (cArray.get(j) < min) {
			        min = cArray.get(j);
			        min_i = j;
			    }
		    }		
			if (i != min_i) {       //move places for minimal elements
				swap(cArray, i, min_i);				
			}
		}
    }
    
    
    /**
     * Compare the elements in pairs, if they are in the wrong order, then swap them;  
     */
    public static void sortByBubble(Array cArray){        
		for(int i = cArray.getSize()-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if(cArray.get(j) > cArray.get(j+1)){
					swap(cArray, j, j+1);	
				}
			}
		}
    }
    
    /**
     * Select minimal element in array, but each iteration we have a different gap between the compared elements;  
     */
    public static void sortByShella(Array cArray) {
    	int gap = cArray.getSize() / 2;
    	while (gap >= 1) {  		//while diff between elements is
    	    for (int right = 0; right < cArray.getSize(); right++) {
    	       for (int i = right - gap; i >= 0; i -= gap) {
    	           if (cArray.get(i) > cArray.get(i + gap)) {
    	               swap(cArray, i, i + gap);
    	           }
    	        }
    	    }
    	    gap = gap / 2;   //recalculate way
    	}
    }
    
    
    private static void swap(Array castomAarray, int ind1, int ind2) {
        int tmp = castomAarray.get(ind1);
        castomAarray.set(ind1, castomAarray.get(ind2));
        castomAarray.set(ind2, tmp);
    }
    
}

package by.epamtc.arrayshell.servise;

import java.util.List;

import by.epamtc.arrayshell.pojos.Array;

public class ArrayShell {
	 protected Array arrShell;
	 int[] sortedArr;


	public ArrayShell(Array array) {
		this.arrShell = array;
	}
	
	public ArrayShell(List<Integer> listEntities) {
		this.arrShell = new Array(listEntities);
	}
	
	
	public int[] getArrayShell() {
		return arrShell.getArray();
	}

	public void setArr(Array arr) {
		this.arrShell = arr;
	}

	/**
	 * Get values(int) which are contain in array 
	 * @return String, all numbers are in array
	 */
	public String values() {
	    return this.arrShell.toString();
	}
	
	/**
	 * Get size of array
	 * @return int, size of array
	 */
	public int size() {
	    return arrShell.getSize();
	}

	/**
	 * Check is array contains some elements
	 * @return boolean, false if array contains at least one element
	 */	
    public boolean isEmpty() {
        return arrShell.getSize() == 0;
    }
    
    /**
	 * Get element with max value in array
	 * @return int, value
	 */	
    public int maxValue() {
    	int max = getArrayShell()[0];
    	 for(int i=1; i<size(); i++){ 
    		 if(getArrayShell()[i] > max){ 
             max = getArrayShell()[i]; 
          } 
        } 
        return max; 
    }

    /**
	 * Get element with min value in array
	 * @return int, value
	 */	
    public int minValue() {
		int min = getArrayShell()[0];
		 for(int i=1; i<size(); i++){ 
			 if(getArrayShell()[i] < min){ 
		        min = getArrayShell()[i]; 
		     } 
		   } 
	    return min; 
    }
    
    public int searchElement(int index) {
    	return getArrayShell()[index];
    }
 
    
    public String printSortedBySelection(){    
    	sortBySelection();
    	return arrShell.toString();    	
    }
    
    /**
     * Select minimal element in array and move it to start. Each next iteration will be started form next element;  
     * @return String, values in sorted array
     */
    public int[] sortBySelection(){
    	sortedArr = getArrayShell();
		for (int i = 0; i < size(); i++) {
		    int min = sortedArr[i];  //first element will be as minimal
		    int min_i = i; 
		    for (int j = i+1; j < size(); j++) {  //try to find less of minimal element, and if is remember it
			    if (sortedArr[j] < min) {
			        min = sortedArr[j];
			        min_i = j;
			    }
		    }		
			if (i != min_i) {       //move places for minimal elements
				swap(sortedArr, i, min_i);				
			}
		}
	return sortedArr;
    }
    
    
    /**
     * Compare the elements in pairs, if they are in the wrong order, then swap them;  
     * @return String, values in sorted array
     */
    public String sortByBubble(){        
    	sortedArr = getArrayShell();
		for(int i = size()-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if(sortedArr[j] > sortedArr[j+1] ){
					swap(sortedArr, j, j+1);	
				}
			}
		}
    return arrShell.toString();
    }
    
    /**
     * Select minimal element in array, but each iteration we have a different gap between the compared elements;  
     * @return String, values in sorted array
     */
    public String sortByShella() {
    	sortedArr = getArrayShell();
    	
    	int gap = size() / 2;
    	while (gap >= 1) {  		//while diff between elements is
    	    for (int right = 0; right < size(); right++) {
    	       for (int i = right - gap; i >= 0; i -= gap) {
    	           if (sortedArr[i] > sortedArr[i + gap]) {
    	               swap(sortedArr, i, i + gap);
    	           }
    	        }
    	    }
    	    gap = gap / 2;   //recalculate way
    	}
    	return arrShell.toString();
    }
    
    
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    
}

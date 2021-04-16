package by.epamtc.arrayshell.pojos;

import java.util.Arrays;
import java.util.List;

public class Array {
	private int[] array;

	public Array() {}
	
	public Array(int[] arrayInt) {
		this.array =  arrayInt;
	}
	
	public Array(List<Integer> listEntities) {
		int size = listEntities.size();
		this.array = new int[size];
		for(int i=0; i<array.length; i++) {
			array[i]=listEntities.get(i);
		}
	}

	private int[] getArray() {
		return this.array;
	}

	public int get(int index) {
		return this.array[index];
	}
	
	public void set(int index, int value) {
		this.array[index] = value;
	}

	public int getSize() {
		int size = getArray().length;
		return size;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (array == null) 
			return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
        	return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(array[i]);
            b.append(' ');
            if (i == iMax)
                return b.append(']').toString();
        }
	}
	

}

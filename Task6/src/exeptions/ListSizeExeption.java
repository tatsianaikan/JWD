
package exeptions;

public class ListSizeExeption extends NullPointerException {
	
	private static final long serialVersionUID = 6706927317449791806L;

	public ListSizeExeption(){
        System.out.println("ERROR: ListSizeExeption(). List is empty. Can not display correct data");
    }
}

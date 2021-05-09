package exeptions;

    
public class FileException extends Exception{ 
	
	private static final long serialVersionUID = -3539771423053580485L;

	public FileException() {
        System.out.println("ERROR: FileException(). File isn't found");
    }
}
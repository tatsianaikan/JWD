
package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import pojos.Aviations;

public abstract class AbstractDataSourse {
    //read the data of Airlines
    public abstract List<Aviations> getStockAviations();
   
    //Write the data of Airline in file
    public static final void writeInFile(List<Aviations> listAviation) throws IOException {
      File airlineFile = new File("resources/data/Airline.txt");
      BufferedWriter br = new BufferedWriter(new FileWriter(airlineFile));
      System.out.println("The results will added to file " + airlineFile.getName() + "\n");   
      if(!airlineFile.exists()){
    	  airlineFile.createNewFile();
      }            
      for(Aviations machine : listAviation){
         br.write(machine.toString() + ";\r\n");
      }
      br.close();
    }
}

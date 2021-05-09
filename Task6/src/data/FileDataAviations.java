package data;

import exeptions.FileException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Aviations;


public class FileDataAviations extends AbstractDataSourse{
       //Read file with data
       @Override
        public List<Aviations> getStockAviations() {
         File aviationsInStock = new File("resources/data/Stock.txt");
         List<Aviations> machines = new ArrayList<Aviations>();
         if((aviationsInStock.exists()) && (aviationsInStock.canRead())){
             try {
                 BufferedReader br = null;
                 System.out.println("File " + aviationsInStock.getName());               
                 br = new BufferedReader(new FileReader(aviationsInStock));
                 String line;

                while((line = br.readLine()) != null){
                      String[] str = line.split(",");
                      Aviations machine = new Aviations();
                      machine.setAircraftName(str[0]);
                      machine.setNumberOfPassengers(Integer.parseInt(str[1]));
                      machine.setRanging(Integer.parseInt(str[2]));
                      machine.setType(str[3]);
                      machine.setCost(Integer.parseInt(str[4]));
                      machines.add(machine);
                }
                 br.close();
             } catch (FileNotFoundException ex) {
            	 System.out.println("File isn't found or was deleted " + ex);
                 Logger.getLogger(FileDataAviations.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(FileDataAviations.class.getName()).log(Level.SEVERE, null, ex);
             }      
         }else {
             try{
                 throw new FileException();
             } catch (FileException e){ }
         }    
         return machines;
    }      
}


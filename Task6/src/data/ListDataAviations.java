package data;

import java.util.ArrayList;
import java.util.List;

import enums.HelicopterType;
import enums.PlaneType;
import pojos.*;

public class ListDataAviations extends AbstractDataSourse{    
    
	@Override
	public List<Aviations> getStockAviations(){ 
        List<Aviations> aviations = new ArrayList<Aviations>();	

        aviations.add(new Plane("Boeing-747", 467, 14800, PlaneType.WIDEBODY, 73000000));
        aviations.add(new Plane("Airbus-A380", 700, 15000, PlaneType.WIDEBODY, 65000000));	    
        aviations.add(new Plane("Boeing-737", 230, 5950, PlaneType.NARROW_BODIED, 35000000));
        aviations.add(new Plane("ERJ-145", 50, 2000, PlaneType.REGIONAL, 45000000));    
        aviations.add(new Plane("ATR-72", 74, 1650, PlaneType.LOCAL, 22000000));
        
        aviations.add(new Helicopter("PBR44", 1, 100, HelicopterType.ULTRALIGHT, 1200000));
        aviations.add(new Helicopter("EC120", 2, 100, HelicopterType.ULTRALIGHT, 100000));	    
        aviations.add(new Helicopter("AS355", 2, 250, HelicopterType.SMALL, 5000000));
        aviations.add(new Helicopter("EC155", 4, 400, HelicopterType.MEDIUM, 15000000));    
        aviations.add(new Helicopter("S76C++", 5, 650, HelicopterType.HEAVY, 32000000));
    
	    return aviations;
	}
}

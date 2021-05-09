package pojos;

import java.util.List;

public class Airline {
	private String nameAirline = "AIRLINE";
	private List<Aviations> listAviations;
	
	public Airline(){}
	
	public Airline(String name){
		this.nameAirline = name;
	}
	
	public Airline(List<Aviations> aviationsForAirline){
		this.listAviations = aviationsForAirline;
	}
	
	public void setNameAirline(String name){
		this.nameAirline = name;
	}
    
    public String getNameAirline(){
    	return nameAirline;
    }
	
	public void setListAviations(List<Aviations> list){
		this.listAviations = list;
	}
	
	public List<Aviations> getListAviations(){
    	return listAviations;
    }	
}

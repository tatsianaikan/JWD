package pojos;

public class Aviations{
	protected String aircraftName;
	protected int numberOfPassengers;
	protected int ranging; //дальность полета	
	protected String type;
	protected int cost; //aircraft cost
		
	public Aviations(){}
        
    public Aviations(String aircraftName){
        this.aircraftName = aircraftName;
    }
	
	public Aviations(String aircraftName, int numberOfPassengers, int ranging, int cost){
		this.aircraftName = aircraftName;
		this.numberOfPassengers = numberOfPassengers;
		this.ranging = ranging;
		this.cost = cost;
	}
	
	public void setAircraftName(String aircraftName){
		this.aircraftName = aircraftName;
	}
	public String getAircraftName(){
		return aircraftName;
	}
	
	public void setNumberOfPassengers(int numberOfPassengers){
		this.numberOfPassengers = numberOfPassengers;
	}	
	public int getNumberOfPassengers(){
		return numberOfPassengers;
	}
	
	public void setRanging(int ranging){
		this.ranging = ranging;
	}	
	public int getRanging(){
		return ranging;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftName == null) ? 0 : aircraftName.hashCode());
		result = prime * result + cost;
		result = prime * result + numberOfPassengers;
		result = prime * result + ranging;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Aviations other = (Aviations) obj;
		if (aircraftName == null) {
			if (other.aircraftName != null)
				return false;
		} else if (!aircraftName.equals(other.aircraftName))
			return false;
		if (cost != other.cost)
			return false;
		if (numberOfPassengers != other.numberOfPassengers)
			return false;
		if (ranging != other.ranging)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return aircraftName + "," + numberOfPassengers + ","
				+ ranging + "," + type + "," + cost;
	}
	
	
	
}

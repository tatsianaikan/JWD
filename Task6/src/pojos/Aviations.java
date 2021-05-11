package pojos;

public class Aviations{
	protected String aircraftName;
	protected int numberOfPassengers;
	protected int carrying; //ãğóçîïîäúåìíîñòü	
	protected String type;
	protected int cost; //aircraft cost
		
	public Aviations(){}
        
    public Aviations(String aircraftName){
        this.aircraftName = aircraftName;
    }
	
	public Aviations(String aircraftName, int numberOfPassengers, int carrying, int cost){
		this.aircraftName = aircraftName;
		this.numberOfPassengers = numberOfPassengers;
		this.carrying = carrying;
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
	
	public void setÑarrying(int carrying){
		this.carrying = carrying;
	}	
	public int getÑarrying(){
		return carrying;
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
		result = prime * result + carrying;
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
		if (carrying != other.carrying)
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
				+ carrying + "," + type + "," + cost;
	}
	
	
	
}

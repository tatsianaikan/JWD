package pojos;

import enums.HelicopterType;

public class Helicopter extends Aviations {
	protected  HelicopterType groupType;
	
	public Helicopter(){
		super();
	}

	public Helicopter(String aircraftName, int numberOfPassengers, int carrying, int cost){
		super(aircraftName, numberOfPassengers, carrying, cost);
	}
	
	public Helicopter(String aircraftName, int numberOfPassengers, int carrying, HelicopterType groupType, int cost){
		super(aircraftName, numberOfPassengers, carrying, cost);
		this.groupType = groupType;
	}
	
	public HelicopterType getGroupType() {
		return groupType;
	}

	public void setGroupType(HelicopterType groupType) {
		this.groupType = groupType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((groupType == null) ? 0 : groupType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		if (groupType != other.groupType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return aircraftName + " " + numberOfPassengers + " " + carrying + " " +  groupType + " " +  cost; 
	}
	
	
}

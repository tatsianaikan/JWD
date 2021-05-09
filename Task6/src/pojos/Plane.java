package pojos;

import enums.PlaneType;

public class Plane extends Aviations{
	protected PlaneType groupType;
	
	public Plane(){
		super();
	}

	public Plane(String aircraftName, int numberOfPassengers, int ranging, int cost){
		super(aircraftName, numberOfPassengers, ranging, cost);
	}
	
	public Plane(String aircraftName, int numberOfPassengers, int ranging, PlaneType groupType, int cost){
		super(aircraftName, numberOfPassengers, ranging, cost);
		this.groupType = groupType;
	}
	
	public PlaneType getGroupType() {
		return groupType;
	}

	public void setGroupType(PlaneType groupType) {
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
		Plane other = (Plane) obj;
		if (groupType != other.groupType)
			return false;
		return true;
	}

	@Override
	public String toString(){
		return aircraftName + " " + numberOfPassengers + " " + ranging + " " +  groupType + " " +  cost; 
	}

}
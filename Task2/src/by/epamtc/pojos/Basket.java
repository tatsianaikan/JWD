package by.epamtc.pojos;
import java.util.List;


public class Basket {
	private List <Ball> listBalls;

	public Basket(){}
	
	public Basket(List <Ball> listBalls){
		this.listBalls = listBalls;
	}

	public List<Ball> getListBalls() {
		return listBalls;
	}

	public void setListBolls(List<Ball> listBalls) {
		this.listBalls = listBalls;
	}

	public boolean isBasketEmpty() {
		boolean isEmpty = true; 
		if(this.getListBalls() != null)
			isEmpty = false;
		return isEmpty;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listBalls == null) ? 0 : listBalls.hashCode());
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
		Basket other = (Basket) obj;
		if (listBalls == null) {
			if (other.listBalls != null)
				return false;
		} else if (!listBalls.equals(other.listBalls))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Basket " + listBalls;
	}

}

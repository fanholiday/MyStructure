package Path;

public class City {
	int cityNum;
	String cityName;
	String postNum;
	boolean isBus;
	boolean isTrane;
	boolean isPlane;
	DistanceByCity distanceByCity;
	
	public City() {
		// TODO Auto-generated constructor stub
		this(0,null,null);
	}
	
	public City(int num,String name, String post) {
		// TODO Auto-generated constructor stub
		cityName = name;
		cityNum = num;
		postNum = post;
		isBus = false;
		isPlane = false;
		isTrane = false;
		distanceByCity = null;
	}
	
	public void setIsBus(boolean x) {
		isBus = x;
	}
	
	public void setIsTrane(Boolean x) {
		isTrane = x;
	}
	
	public void setIsPlane(Boolean x) {
		isPlane = x;
	}
	
	
	public void addDistance(int cityNum, float distance) {
		distanceByCity.add(cityNum, distance);
	}
	
}

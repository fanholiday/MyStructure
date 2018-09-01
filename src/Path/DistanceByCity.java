package Path;

import net.sf.json.JSONObject;

public class DistanceByCity {
	 JSONObject json  ;
	 
	 public DistanceByCity() {
		// TODO Auto-generated constructor stub
		 json = null;
	}
	 
	 public void add(int cityNum, float distance) {
		json.put(cityNum, distance);
	}
	 
	 public void remove(int cityNum) {
		if(json.equals(null))
			return;
		json.remove(cityNum);
	}
	 
	 //批量加入
	 public void addCities() {
		
	}
	 
	 public float getDistance(int cityNum) {
		return (float) json.get(cityNum);
	}
}

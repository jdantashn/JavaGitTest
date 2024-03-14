package com.train;

public interface Train {
	 void accelerate(int increment);
	 
	 void deaccelerate(int decrement);
	 
	 void setStation(String newStation);
	 
	 void toggleLights();
}

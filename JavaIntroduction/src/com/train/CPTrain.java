package com.train;


class CPTrain implements Train{
 int speed;
 boolean lights;
 String station;
 
 
 public void accelerate(int increment) {
	 System.out.println("Boolean: " + lights);
	 System.out.println("Speed: " + speed);
	 System.out.println("Station: " + station);
     speed += increment;
}
 
 public void deaccelerate(int decrement) {
     speed -= decrement;
}
 
 public void setStation(String newStation) {
	 station = newStation;
 }
 public void toggleLights() {
	 lights = !lights;
 }

}

package com.jvmasondesign.cecs451assign3;

public class Rocket {
	public double xPos;
	public double yPos;
	public int politicalClimate;
	public int rocketType;
	public int rocketMods;
	public int hostileGroup;
	public int city;

	public Rocket(double xPos, double yPos, int politicalClimate, int rocketType, int rocketMods, int hostileGroup) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.politicalClimate = politicalClimate;
		this.rocketType = rocketType;
		this.rocketMods = rocketMods;
		this.hostileGroup = rocketMods;		
		this.city = calculateClosestCity(xPos, yPos);
	}
	
	public Rocket(double xPos, double yPos, int politicalClimate, int rocketType, int rocketMods) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.politicalClimate = politicalClimate;
		this.rocketType = rocketType;
		this.rocketMods = rocketMods;
		this.hostileGroup = -1;
		this.city = calculateClosestCity(xPos, yPos);
	}

	public static int calculateClosestCity(double x, double y){
		double distance0 = getDistance(x, y, 10, 10);
		double distance1 = getDistance(x, y, 14, 14);
		double distance2 = getDistance(x, y, 10, 18);
		int smallest = 0;
		
		// Calculate the closest city (0, 1 or 2)
		if (distance1 < distance0)
			if (distance1 < distance2)
				smallest = 1;
			else
				smallest = 2;
		else if (distance2 < distance0)
			smallest = 2;
		else
			smallest = 0;
		return smallest;
	}

	// Uses distance formula to distance between (x1, y1) and (x2, y2)
	public static double getDistance(double coordX1, double coordY1, double coordX2, double coordY2) {
		double deltaX = coordX2 - coordX1;
		double deltaY = coordY2 - coordY1;
		return (Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}
}


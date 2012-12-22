package com.jvmasondesign.cecs451assign3;
import java.util.HashSet;
import java.util.Set;


public class RocketTree {
	Set<Rocket> rockets;
	
	public RocketTree(){
		rockets = new HashSet<Rocket>();
	}
	
	public void add(Rocket rocket) {
		rockets.add(rocket);
	}
	
	public Set<Rocket> getMatchingRockets(Rocket rocket) {
		Set<Rocket> matchingRockets = new HashSet<Rocket>();
		for (Rocket r : rockets)
			if ((r.rocketMods == rocket.rocketMods) && (r.rocketType == rocket.rocketType) && (r.city == rocket.city) && (r.politicalClimate == rocket.politicalClimate))
				matchingRockets.add(r);
		
		return matchingRockets;
	}
	
	public int getProbableHostileGroup(Rocket rocket){
		int group0Count = 0, group1Count = 0, group2Count = 0, group3Count = 0, group4Count = 0;

		// Get all rockets that match the properties of the argument
		Set<Rocket> matchingRockets = getMatchingRockets(rocket);
		
		// Total the number of rockets for each hostile group
		for (Rocket matchingRocket : matchingRockets)
			switch (matchingRocket.hostileGroup) {
			case 0:
				group0Count++;
				break;
			case 1:
				group1Count++;
				break;
			case 2:
				group2Count++;
				break;
			case 3:
				group3Count++;
				break;
			case 4:
				group4Count++;
				break;
			}
		
		// Calculate max
		int max = Math.max(Math.max(group0Count, group1Count), Math.max(Math.max(group2Count, group3Count), group4Count));
		
		// Return the group who's count was determined to be the max		
		if (group0Count == max)
			return 0;
		else if (group1Count == max)
			return 1;
		else if (group2Count == max)
			return 2;
		else if (group3Count == max)
			return 3;
		else if (group4Count == max)
			return 4;
		else
			return -1;
	}
}

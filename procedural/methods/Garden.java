package procedural.methods;

import java.util.Date;

public class Garden {

	public static String harvest(String plantsToHarvest) {
		System.out.println("I'm harvesting my " + plantsToHarvest);
		String edibles = plantsToHarvest.replace(" plants", "");
		return edibles;
	}

	public static void careForPlants(String liquids, String solids) {
		System.out.printf("I'm irrigating with %s and adding %s to my plants.\n",
				liquids, solids);
	}

	public static String sow(String seeds) {
		System.out.println("I'm sowing seeds of " + seeds);
		return seeds + " plants";
	}

	public static String orderSeedsFrom(String company, String seedOrder) {
		System.out.printf("I bought %s seeds from %s on %tD\n", 
				seedOrder, company, new Date());
		return seedOrder;
	}

	public static void getSoilReadyWith(String soilAmendments) {
		System.out.println("I'm tilling the soil.");
		System.out.println("I'm adding " + soilAmendments + " to the soil.");
	}	

	public static void main(String[] args) {
		getSoilReadyWith("compost and mulch");
		String seeds = orderSeedsFrom("Burpee", "garlic, beets, and kale");
		String plants = sow(seeds);
		careForPlants("water", "compost");
		String crop = harvest(plants);
		System.out.println("I have a crop of " + crop);
		
		String neighborPlants = "peas plants, beans plants, and squash plants.";
		System.out.println("I \"borrowed\" a crop from my neighbor of " 
				+ harvest(neighborPlants));
	}


}

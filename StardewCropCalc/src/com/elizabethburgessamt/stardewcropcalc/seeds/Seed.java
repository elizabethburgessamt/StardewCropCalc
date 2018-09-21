package com.elizabethburgessamt.stardewcropcalc.seeds;

public class Seed {

	private String crop;
	private int growth;
	private int regrowth;
	private int cost;
	private int sell;
	private boolean trellis;
	
	public Seed(String crop, int growth, int regrowth, int cost, int sell, boolean trellis){
		this.crop = crop;
		this.growth = growth;
		this.regrowth = regrowth;
		this.cost = cost;
		this.sell = sell;
		this.trellis = false;
		if (trellis) {
			this.trellis = true;
		}
	}
	
	public String getCrop() {
		return crop;
	}

	public int getGrowth() {
		return growth;
	}

	public int getRegrowth() {
		return regrowth;
	}

	public int getCost() {
		return cost;
	}

	public int getSell() {
		return sell;
	}

	public boolean isTrellis() {
		return trellis;
	}

}

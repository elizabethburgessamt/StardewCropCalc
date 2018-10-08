package com.elizabethburgessamt.stardewcropcalc.fields;

public abstract class Field {
	
	int cropCapacity;
	int trellisCapacity;
	
	public int getCropCapacity() {
		return cropCapacity;
	}
	public void setCropCapacity(int cropCapacity) {
		this.cropCapacity = cropCapacity;
	}
	public int getTrellisCapacity() {
		return trellisCapacity;
	}
	public void setTrellisCapacity(int trellisCapacity) {
		this.trellisCapacity = trellisCapacity;
	}

}

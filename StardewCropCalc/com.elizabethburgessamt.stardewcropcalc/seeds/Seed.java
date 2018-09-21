package seeds;

public class Seed {
	//TODO: Create proper data object
	private string crop;
	private int growth;
	private int regrowth;
	private int cost;
	private int sell;
	private boolean trellis;
	
	public Seed(string crop, int growth, int regrowth, int cost, int sell, string trellis){
		this.crop = crop;
		this.growth = growth;
		this.regrowth = regrowth;
		this.cost = cost;
		this.sell = sell;
		if (trellis == "TRUE"){
			this.trellis = true;
		}
		else { this.trellis = false; }
	}
}

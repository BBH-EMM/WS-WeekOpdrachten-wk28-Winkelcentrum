package nl.kadaster.oca1.wk28.shopingmall;

public interface UnitInterface{
	static final int OPPERVLAKTE_MINIMAAL =   500;
	static final int OPPERVLAKTE_MAXIMAAL = 5_000;
	
	default String connectElectricity() {
		return "interface UnitInterface: de standaard electriciteitsleverancier is NUON.";
	}
	default String connectElectricity(String electricitySupplier) {
		return "interface UnitInterface: de gekozen electriciteitsleverancier is " + electricitySupplier + ".";
	}

	static String connectWater() {
		return "interface UnitInterface: het water van alle units (wanneer afgenomen) wordt afgenomen van onze standaard leverancier.";
	}
	
	abstract String getName();
	
	public abstract String getSecurityInfo(String indentationString);
}

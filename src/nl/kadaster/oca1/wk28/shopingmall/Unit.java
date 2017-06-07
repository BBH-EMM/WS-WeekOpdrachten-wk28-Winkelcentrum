package nl.kadaster.oca1.wk28.shopingmall;

import nl.kadaster.oca1.wk28.Municipality.Utils;

public abstract class Unit implements UnitInterface{
	private int unitSurfaceRented = 0;
	private String name = "";
	
	Unit(){}
	Unit(String name) {
		this.name = name;
		Utils.debugPrintln("Unit: Winkelcentrum-unit van het type [" + this.getClass().getSimpleName() + "] is verhuurd aan \"" + getName() + "\"");
	}
	
	protected void rentUnitSurface() {
		this.unitSurfaceRented = (int) (Math.random() * ( ( (OPPERVLAKTE_MAXIMAAL/OPPERVLAKTE_MINIMAAL) +1 ) -1 ) + 1 ) * OPPERVLAKTE_MINIMAAL;
		//return (int) (Math.random() * ((max+1)-min)+min);
		Utils.debugPrintln("   - de gehuurde oppervlakte is " + getUnitSurface() + " vierkante meter.");
	}
	protected int getUnitSurface() {
		return unitSurfaceRented;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Winkel-unit \"" + getName() + "\" is van het type [" + this.getClass().getSimpleName() + "]" + System.getProperty("line.separator") + 
			   "   - de gehuurde oppervlakte is " + getUnitSurface() + " vierkante meter." + System.getProperty("line.separator") +
			   "   - de electriciteit wordt betrokken van " + this.connectElectricity() + " (default method interface: [UnitInterface]." + System.getProperty("line.separator") +
			   "   - het water wordt betrokken van " + UnitInterface.connectWater() + " static method interface: [UnitInterface]." + System.getProperty("line.separator") +
			   "   - de beveiliging is op orde, " + Security.checkSecurity();
	}
}

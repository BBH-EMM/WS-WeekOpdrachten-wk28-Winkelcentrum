
package nl.kadaster.oca1.wk28.shopingmall;

import nl.kadaster.oca1.wk28.Municipality.Utils;

abstract class Office extends Unit {

//	@Override
//	public int getUnitSurface() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public String getName() {
//		return super.getName();
//	}
//

	Office(){}
	Office(String name) {
		super(name);
		Utils.debugPrintln("Office: Kantoor \"" + getName() + "\" is aangemaakt en is van het type [" + this.getClass().getSimpleName() + "]");
		this.rentUnitSurface();
		Utils.debugPrintln("   - de electriciteit wordt betrokken van " + this.connectElectricity() + " (default method interface: [UnitInterface].");
		Utils.debugPrintln("   - het water wordt betrokken van " + UnitInterface.connectWater() + " static method interface: [UnitInterface].");
		Utils.debugPrintln("   - de beveiliging is op orde, " + Security.checkSecurity());
		//Utils.debugPrintln("   - deze winkel krijgt nu een standaard kassa, \n      - " + this.offerCheckOut());
	}
	@Override
	public String getSecurityInfo(String indentationString) {
		return indentationString + Security.checkSecurity() + "\n" + 
	           indentationString + "[" + this.getClass().getSimpleName() + "] Security niveau is van het type kantoor.";
	}
}

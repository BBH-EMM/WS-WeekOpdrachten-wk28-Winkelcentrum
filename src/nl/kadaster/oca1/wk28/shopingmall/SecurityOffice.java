package nl.kadaster.oca1.wk28.shopingmall;

import java.util.ArrayList;

public final class SecurityOffice extends Office {
	SecurityOffice(){}
	public SecurityOffice(String name) {
		super(name);
		connectElectricity();
		UnitInterface.connectWater(); // call to static methode
	}
	
	public String checkUnitsForSecurity(UnitInterface... units) {
		StringBuilder sb = new StringBuilder();
		if (units.length==0) 
			sb.append("This Security Office \"" + getName() + "\" does not need to check any unit." + 
	                  "The control class of this ShoppingMall \"" + super.getName() + "\" requested " + units.length + " to check." );
		else {
			int i = 0;
			do {
				sb.append("   we gaan de unit \"" + units[i].getName() + "\" nu betreden.\n");
				sb.append(units[i].getSecurityInfo("      ") + "\n");
				sb.append("   de beveiliging is in orde.\n");
			} while (++i < units.length); // ohw wat slechte code!! maar de do-while moest geïmplementeerd worden. ;-)
		} 
		return sb.toString();
	}
}

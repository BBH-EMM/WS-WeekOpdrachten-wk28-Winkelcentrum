package nl.kadaster.oca1.wk28.shopingmall;

import java.util.ArrayList;

import nl.kadaster.oca1.wk28.Municipality.Utils;
import nl.kadaster.oca1.wk28.shopingmall.ShoppingMallExceptions.*;

public class ShoppingMall {
	private String name = ""; 
	private ArrayList<Unit> units = new ArrayList<Unit>();
	private SecurityOffice securityOffice; // = new SecurityOffice();
	
	ShoppingMall() {};
	public ShoppingMall(String name) {
		setName(name);
		Utils.debugPrintln("Winkelcentrum \"" + getName() + "\" is aangemaakt en van het type [" + this.getClass().getSimpleName() + "]");
	}
	
	private void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void addUnit(Unit unit) {
		units.add(unit);
		if (unit instanceof SecurityOffice && securityOffice == null) 
			this.securityOffice = (SecurityOffice) unit;  
	}
	public UnitInterface getUnit(int index) {
		return this.units.get(index);
	}
//	public Unit getUnit(String name, Unit unitType) {
	public UnitInterface getUnit(String name, Class<?> cls) {
		for (int i = 0 ; i<units.size() ; i++) {
			if (units.get(i).getClass() == cls && units.get(i).getName().equals(name)) 
				return units.get(i);
		}
		return null;
	}
	
	public SecurityOffice getSecurityOffice() {
		if (securityOffice == null) {
			units.add(new SecurityOffice("This Security Office has just started, is does not have a name yet."));
			//securityOffice = (SecurityOffice) this.units.get(units.size()-1);
			return securityOffice;
		}
		return (SecurityOffice) this.securityOffice;
	}
	
	public ArrayList<Unit> getAllRentedUnits() {
		return (ArrayList<Unit>) units.clone();
	}
	public int getNumberOfRentedUnits() {
		return units.size();
	}
	public String RentedUnitsSecurityCheck() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		
		sb.append("Het beveiligingskantoor \"" + this.getSecurityOffice().getName() + "\" gaat de beveiligingsronde lopen;\n");
		while (i<getNumberOfRentedUnits()) {
			Unit u = (Unit) getUnit(i++);
			sb.append(this.getSecurityOffice().checkUnitsForSecurity(u));
		}
		sb.append("Het beveiligingskantoor \"" + this.getSecurityOffice().getName() + "\" is gereed met de beveiligingsronde, alles is in orde.\n");
		return sb.toString();
	}
	public String RentedUnitsToString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Winkelcentrum \"" + getName() + "\" is van het type [" + this.getClass().getSimpleName() + "]" + System.getProperty("line.separator"));
		sb.append("   - haar " + (getNumberOfRentedUnits()==1?"enige winkel is;": getNumberOfRentedUnits() + " winkels zijn;") + System.getProperty("line.separator"));
//		for (int i=0 ; i< units.size() ; i++) {
		for (Unit u:getAllRentedUnits()) {
//			sb.append(units.get(i).toString() + System.getProperty("line.separator"));
			sb.append(u.toString() + System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	public void throwException() {
		try {
			throw new smNotYetImplementedException("throwException");
//			shoppingMall.throwException();
		} catch (smNotYetImplementedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("catch block:  smNotYetImplementedException in methode: " + this.getClass() + ".throwException");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("Exception");
		} finally {
			System.out.println("finally block in methode: " + this.getClass() + ".throwException");
		}

	}
}

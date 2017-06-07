package nl.kadaster.oca1.wk28.Municipality;

import javax.swing.text.StyleContext.SmallAttributeSet;
import nl.kadaster.oca1.wk28.shopingmall.ShoppingMallExceptions.*;
import nl.kadaster.oca1.wk28.shopingmall.*;

public class Apeldoorn {
//class 1
	public static void main(String[] args) {
		// control class weekopdracht wk 28: WinkelCentrum 
		
		ShoppingMall shoppingMall = new ShoppingMall("Oranjerie (Apeldoorn)");
		shoppingMall.addUnit(new BookShop("AKO"));
		shoppingMall.addUnit(new ClothesShop("Witteveen"));
		shoppingMall.addUnit(new ClothesShop("JEANS CENTER"));
		shoppingMall.addUnit(new SecurityOffice("Flair Security"));
		
		//System.out.println(shoppingMall.getUnit(0).getName());
		//System.out.println(shoppingMall.getUnit("AKO", BookShop.getClass()).getName());
		//System.out.println(shoppingMall.getUnit("AKO", new BookShop("")).getName());
//		System.out.println(shoppingMall.getUnit("AKO", BookShop.class).getName());
		
		//SecurityOffice securityOffice = new SecurityOffice();
		//System.out.println(securityOffice.toString());
		
		System.out.println(shoppingMall.RentedUnitsToString());
		System.out.println(shoppingMall.RentedUnitsSecurityCheck());
		
		System.out.println();
		System.out.println();
		System.out.println("Het programma is voorbij.");

		System.out.println("Throw exception test:");
		shoppingMall.throwException();
	}

}

////Weekopdracht
//
//De criteria voor de opdracht is dat je alle onderstaande onderdelen toepast in je applicatie.
//10 klassen 																						(checked)
//2 interfaces																						(checked)
//2 Exceptions (Zelfgemaakt & getry-ed en gecatched)                                                (checked)
//4 Has-a relaties (Geen primitive relatie)															(checked) ShoppingMall heeft een SecurityOffice.
//4 Is-a relaties																					(checked)
//1 switch, 
//	while,                                                                                          (checked) gekunstel in ShoppingMall.RentedUnitsSecurityCheck()
//	do-while,                                                                                       (checked) gekunstel in Security.checkSecurity()
//	for-loop																						(checked) 
//	EN enhanced for-loop																			(checked)
//1 Array																							(checked) Varargs parameter van SecurityOffice.checkUnitsForSecurity()
//1 ArrayList																						(checked)
//1 String-object																					(checked)
//1 StringBuilder-object																			(checked)
//1 van elke primitive-soort, dus 8																	---byte, short, int (checked), long, float, double (checked), boolean (checked), char 
//2 static variabelen																				(checked)
//4 overloadings van methodes																		(checked)
//4 overridings van methodes																		(checked)
//
//In te leveren op donderdag 8 juni uiterlijk 9:30. Code weer via Github, zorg weer voor meerdere commits!

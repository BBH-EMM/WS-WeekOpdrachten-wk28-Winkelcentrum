package nl.kadaster.oca1.wk28.shopingmall;

public final class BookShop extends Shop {
	public void biedSamenvattingBoek() {
		System.out.println("BookShop: deze boekenwinkel biedt de lezer de kaft te lezen.");
	}

	@Override
	public void offerStaffRoom() {
		System.out.println("BookShop: Overridden methode ShopInterface: Deze ruimte is bedoeld voor personeelsleden.");
	}
	
	
	BookShop() {super();}
	public BookShop(String name) {
		super(name);
		connectElectricity();
		UnitInterface.connectWater(); // call to static methode
	}
}

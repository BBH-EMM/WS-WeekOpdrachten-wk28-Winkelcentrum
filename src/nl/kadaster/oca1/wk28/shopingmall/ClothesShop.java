package nl.kadaster.oca1.wk28.shopingmall;

public class ClothesShop extends Shop {
	public  void biedPaskamer(int aantalKledingStukken) {
		System.out.println("ClothesStore: U heeft " + aantalKledingStukken + " meegenomen in de paskamer.");
	}

	@Override
	public void offerStaffRoom() {
		System.out.println("ClothesStore: Overridden methode ShopInterface: Deze ruimte is bedoeld voor personeelsleden.");
	}

	ClothesShop() {super();}
	public ClothesShop(String name) {
		super(name);
		connectElectricity();
		UnitInterface.connectWater(); // call to static methode
	}
}

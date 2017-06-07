package nl.kadaster.oca1.wk28.shopingmall;

interface CateringFacilityInterface {
	public abstract void biedZitGelegenheid(int aantalPersonen);

	default String getSecurityInfo() {
		return Security.checkSecurity();
	}
}

package nl.kadaster.oca1.wk28.shopingmall;

public interface ShopInterface {
	
	default String offerCheckOut() {
		return "WinkelInterface: iedere winkel krijgt standaard een kassa, iedere winkel kan zijn eigen kassa definieren. [" + this.getClass().getSimpleName() + "]";
	}
	

	public abstract void offerStaffRoom(); // De personeelsruimte ziet er per winkel anders uit.
}

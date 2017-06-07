package nl.kadaster.oca1.wk28.shopingmall;

import nl.kadaster.oca1.wk28.Municipality.Utils;

public class ShoppingMallExceptions extends java.lang.Exception {
	public ShoppingMallExceptions(String message) throws java.lang.Exception {
		super(message);
	}
}

/////////////////////////////////////////////////////////////////
class smCheckedException extends ShoppingMallExceptions {
	//implement
//	public smCheckedException() {
//	}
	public smCheckedException(String message) throws Exception {
		super(message);
		Utils.debugPrintln("ShoppingMallExceptions:smCheckedException");
	}
}
final class smNotYetImplementedException extends smCheckedException {
	//implement
	public smNotYetImplementedException(String methode) throws Exception {
		super("Methode: " + methode + " is not yet implemented.");
		Utils.debugPrintln("ShoppingMallExceptions:smCheckedException:smRuntimeException");
		//throw new smCheckedException("This is not implemented yet.");
	}
}

/////////////////////////////////////////////////////////////////
abstract class smErrors extends java.lang.Error {
	//implement
}

/////////////////////////////////////////////////////////////////
abstract class smUnCheckedException extends java.lang.RuntimeException{
}
final class smRuntimeException extends smUnCheckedException {
		//implement
}

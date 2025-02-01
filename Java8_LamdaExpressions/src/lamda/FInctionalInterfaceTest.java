package lamda;

@FunctionalInterface
public interface FInctionalInterfaceTest {
	
	public abstract void mone();
	
	//public abstract void mfour();
	
	public default void mtwo() {}
	
	public static void  mthree() {}

}

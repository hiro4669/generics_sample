
public class ConcConsumer<T extends Number> implements Consumer<T> {
	public void apply(T v) {
		System.out.println("v = " + v.intValue());
	}
	
}

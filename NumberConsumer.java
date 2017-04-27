
public class NumberConsumer implements Consumer<Number> {
	public void apply(Number n) {
		System.out.println("apply number = " + n.doubleValue());
	}
}

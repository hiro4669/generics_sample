
public class IntConsumer implements Consumer<Integer> {
	public void apply(Integer i) {
		System.out.println("apply Int = " + (i+i));
	}
}

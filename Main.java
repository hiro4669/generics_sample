public class Main {
	public static void main(String ...args) {
		Box<Integer> ibox = new Box<>();
		ibox.put(1);
		IntConsumer    ic = new IntConsumer();
		NumberConsumer nc = new NumberConsumer();

		Consumer<Integer> ic2 = new ConcConsumer<>();
		Consumer<Number>  nc2 = new ConcConsumer<>();
		
		foo(ibox, ic, nc);
		zoo(ibox, ic2, nc2);
	}

	public static void foo(Box<Integer> intBox, IntConsumer ic, NumberConsumer nc) {
		intBox.applyConsumer(ic);
		intBox.applyConsumer(nc);
	}

	public static void bar(Box<Integer> intBox, IntConsumer ic, NumberConsumer nc) {
		intBox.applyConsumerBad(ic);
		//intBox.applyConsumerBad(nc); // Compile Error
	}

	public static void zoo(Box<Integer> intBox, Consumer<Integer> ic, Consumer<Number> nc) {
		intBox.applyConsumer(ic);
		intBox.applyConsumer(nc);
	}
	

	
}

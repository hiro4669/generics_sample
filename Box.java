public class Box<T> {
	private T v;
	
    T get() {
		return v;
	}
    void put(T v) {
		this.v = v;
	}

    void put(Box<T> box) {
		this.v = box.get();
	}

    void applyConsumer(Consumer<? super T> consumer) {
		consumer.apply(v);
	}
	
	void applyConsumerBad(Consumer<T> consumer) {
		consumer.apply(v);
	}
	
}

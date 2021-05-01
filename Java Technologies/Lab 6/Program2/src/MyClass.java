public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	MyClass(T[] o){
		vals = o;
	}
	@Override
	public T findMin() {
		T temp = vals[0];
		for(int i = 1; i < vals.length; i++) {
			if(vals[i].compareTo(temp) < 0){
				temp = vals[i];
			}
		}
		return temp;
	}

	@Override
	public T findMax() {
		T temp = vals[0];
		for(int i = 1; i < vals.length; i++) {
			if(vals[i].compareTo(temp) > 0) {
				temp = vals[i];
			}
		}
		return temp;
	}
	
}

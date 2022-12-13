package lesson5;

public interface Compare<T> {
	boolean isBiggerThan(T o);
	boolean isSmallerThan(T o);
	boolean isEqual(T o);

}

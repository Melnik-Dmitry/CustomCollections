package by.epam.javawebtraining.melnik.task02;

public abstract  class CustomList <T> implements CustomAbstractlist <T> {

	 public static final int DEFAULT_CAPACITY = 10;

	 private T[] list;

	 public CustomList() {
		  list = (T[]) new Object[DEFAULT_CAPACITY];
	 }

	 public CustomList(int capacity) {
		  this.list = (T[]) new Object[capacity];
	 }

	 public CustomList(T [] list) {
		  this.list = list;
	 }

	 public T[] getList() {
		  return list;
	 }

	 public void setList(T[] list) throws NullPointerException {
		  if (list == null) {
				throw new NullPointerException();
		  }
		  this.list = list;
	 }
}

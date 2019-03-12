package by.epam.javawebtraining.melnik.task02;

public interface CustomCollection <T> {

	 int size ();

	 int capacity ();

	 boolean isEmpty ();

	 void add (T t);

	 void addAll (T ... t);

	 void remove (T t);

	 void removeAll (T ... t);
}

package by.epam.javawebtraining.melnik.task02;

import java.util.Collection;

public interface CustomCollection <T> {

	 int size ();

	 int capacity ();

	 boolean isEmpty ();

	 void add (T t);

	 void addAll (CustomCollection <T> collection);

	 T get (int index);

	 void remove (T t);

	 void removeAll (T ... t);
}

package test.java.first;

public class Type {

	private static <T> T hello(int notOfRows, DT t) {

		switch (t) {

			case STRING:
				return (T) "Hello World";

			case INT:
				return (T) Integer.valueOf("1");

			case DOUBLE:
				return (T) Double.valueOf("2.0");

			default: return null;

		}
	}

		public static void main(String[] args) {

			int i = hello(2, DT.INT);
			System.out.println(i);
		}

	}

	enum DT {

		STRING,
		INT,
		DOUBLE,
		FLOAT,
		EMAIL,
		ALPHA,
		SPECIAL;
}
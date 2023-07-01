package exception;

public class exceptionconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		try {
			System.out.println(a[4]);
		}

		catch (ArithmeticException e) {
			System.out.println("it cannot divide by zero");
			e.printStackTrace();
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("out of index");
		}

		catch (Exception e) {
			System.out.println("Array element is not defined");
			e.printStackTrace();
		}

		finally {
			System.out.println("it is exception handling concept");
		}

	}

}

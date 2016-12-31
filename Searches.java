/* Searches Program
 * This program contains the code for linear and binary search
 * Pranav Gogia
 * November 9, 2016
 */


public class Searches {


	/**
	 *This method searches through the given array using linear search and returns the place where the desired int is located or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the integer array that is searched
	 * @param target
	 *            the desired integer that is searched for
	 * @return returns the index of the target value or -1 if the target is not
	 *         found
	 */
	public static int linear(int[] a, int target) {

		for (int i = 0; i < a.length; i++) {

			if (target == a[i])
				return i;

		}

		return -1;// returns -1 if the target is not found
	}

	/**
	 * This method searches through the given array using linear search and returns the place where the desired double is located or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the double array that is searched
	 * @param target
	 *            the desired double that is searched for
	 * @return returns the index of the target value or -1 if the target is not
	 *         found
	 */
	public static int linear(double[] a, double target) {

		for (int i = 0; i < a.length; i++) {

			if (target == a[i])
				return i;

		}

		return -1;// returns -1 if the target is not found
	}

	/**
	 *This method searches through the given array using linear search and returns the place where the desired string is located or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the String array that is searched
	 * @param target
	 *            the desired String that is searched for
	 * @return returns the index of the target value or -1 if the target is not
	 *         found
	 */
	public static int linear(String[] a, String target) {

		for (int i = 0; i < a.length; i++) {

			if (target.equals(a[i]))
				return i;

		}

		return -1;// returns -1 if the target is not found
	}

	/**
	 * This method returns the place where the desired int value is placed or -1 if it doesnt existe
	 * 
	 * @param a
	 *            the integer array that is searched
	 * @param target
	 *            the desired integer that is searched for
	 * @return returns the index of the target value or -1 if the target is not
	 *         found
	 */
	public static int binary(int[] a, int target) {

		return (binary(a, 0, a.length - 1, target));

	}

	/**
	 * This method returns the place where the desired double value is placed or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the double array that is searched
	 * @param target
	 *            the desired double that is searched for
	 * @return returns the index of the target value or -1 if the target is not
	 *         found
	 */
	public static int binary(double[] a, double target) {

		return (binary(a, 0, a.length - 1, target));

	}

	/**
	 * This method returns the place where the desired string value is placed or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the String array that is searched
	 * @param target
	 *            the desired String that is searched for
	 * @return returns the index of the target value or -1 if the target is not
	 *         found
	 */
	public static int binary(String[] a, String target) {

		return (binary(a, 0, a.length - 1, target));

	}

	/**
	 *This method searches through the given array using binary search and returns the place where the desired int is located or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the integer array that is searched
	 * @param start
	 *            the initial integer value that is used as the start value for
	 *            the search
	 * @param end
	 *            the initial integer value that is used as the end value for
	 *            the search
	 * @param target
	 *            the desired integer that is searched for
	 * @return the index of the target value or -1 if the target is not found
	 */
	private static int binary(int[] a, int start, int end, int target) {

		int midpoint = (start + end) / 2;

		if (start > end)// returns -1 if the entire array has been searched and
						// the target is still not found
			return -1;
		if (a[midpoint] == target)// checks if the value of the array is equal
									// to the target
			return midpoint;
		else if (a[midpoint] < target)// checks if the value of the array less
										// than the target
			return (binary(a, midpoint + 1, end, target));
		else if (a[midpoint] > target)// checks if the value of the array
										// greater than the target
			return (binary(a, start, midpoint - 1, target));

		return -1;// returns -1 if the target is not found
	}

	/**
	 *This method searches through the given array using binary search and returns the place where the desired double is located or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the double array that is searched
	 * @param start
	 *            the initial integer value that is used as the start value for
	 *            the search
	 * @param end
	 *            the initial integer value that is used as the end value for
	 *            the search
	 * @param target
	 *            the desired double that is searched for
	 * @return the index of the target value or -1 if the target is not found
	 */
	private static int binary(double[] a, int start, int end, double target) {

		int midpoint = (start + end) / 2;

		if (start > end)// returns -1 if the entire array has been searched and
						// the target is still not found
			return -1;
		else if (a[midpoint] == target)// checks if the value of the array is
										// equal to the target
			return midpoint;
		else if (a[midpoint] < target)// checks if the value of the array less
										// than the target
			return (binary(a, midpoint + 1, end, target));
		else if (a[midpoint] > target)// checks if the value of the array
										// greater than the target
			return (binary(a, start, midpoint - 1, target));

		return -1;// returns -1 if the target is not found
	}

	/**
	 *This method searches through the given array using binary search and returns the place where the desired string is located or -1 if it doesnt exist
	 * 
	 * @param a
	 *            the String array that is searched
	 * @param start
	 *            the initial integer value that is used as the start value for
	 *            the search
	 * @param end
	 *            the initial integer value that is used as the end value for
	 *            the search
	 * @param target
	 *            the desired String that is searched for
	 * @return the index of the target value or -1 if the target is not found
	 */
	private static int binary(String[] a, int start, int end, String target) {

		int midpoint = (start + end) / 2;

		if (start > end)// returns -1 if the entire array has been searched and
						// the target is still not found
			return -1;
		else if (a[midpoint].equals(target))// checks if the value of the array
											// is equal to the target
			return midpoint;
		else if (a[midpoint].compareToIgnoreCase(target) < 0)// checks if the
																// value of the
																// array less
																// than the
																// target
			return (binary(a, midpoint + 1, end, target));
		else if (a[midpoint].compareToIgnoreCase(target) > 0)// checks if the
																// value of the
																// array greater
																// than the
																// target
			return (binary(a, start, midpoint - 1, target));

		return -1;// returns -1 if the target is not found
	}
}
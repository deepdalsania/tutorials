package stackoverflow;

import java.util.ArrayList;

public class StreamDoubleSum {
	public static void main(String[] args) {
		ArrayList<Double> values = new ArrayList<>();
		values.add(5.6);
		values.add(5632.221);
		values.add(23541.212);
		values.add(2154.005);
		values.add(545844.6);
		
		double result = values.stream().filter(i -> i > 0).mapToDouble(i -> i).sum();
		System.out.println(result);
	}
}

import java.util.stream.IntStream;
public class Main
{
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Fibonacci numbers till: " + n);
		fibonacci(n);
	}

	public static void fibonacci(int n) {
		IntStream.range(0,n) //creating stream of integers
                    .mapToObj(i->new int[] {0,1}) // making an array of first two elements since fibonacci is sum of previous two elements
            		.reduce(new int[] {0,1}, (prev, curr) -> {
            			System.out.println(prev[0]); // printing current number
            			return new int[] {prev[1], prev[0] + prev[1]};
            		});
		// passing array in reduce function, where prev stores the two numbers before our current iteration numbers
		// adding previous two numbers and adding to array
		// retrieving 0th element since it contains our target fibonacci number
	}
}

//Factorial of a number
//Yash Bhansali
//CI18788
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main
{
	public static void main(String[] args) {
        int num = 6;
        long factorial = factorialOfNum(num);
        System.out.println("Factorial of " + num + " is : " + factorial);
	}
	
	public static int factorialOfNum(int num){
	    return IntStream.rangeClosed(1, num) //streaming integers from 1 to num
	                    .boxed() // wrapper class applied to primitive integers in stream
	                    .collect(Collectors.reducing(1, (a,b) -> a*b)); 
	                    //reducing all integers till num into one using Collectors class where 1 is identity and (a,b)->a*b is accumulator use to
                      //compare two numbers of the stream and merge into one
	                    
	}
}

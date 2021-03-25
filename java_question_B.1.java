import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class multipleNumbers{

	public static void main(String []args){
		//	STREAM API introduced in JAVA 8, Used to process collection of agents
		/* 1. Code iterate over the mentioned list and filters values which are divisible by 3
		   2. Multiply the filtered numbers with 2 and returns the list
		   3. Print the numbers
		*/
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9)
		                        .stream().filter(n -> (n%3 == 0))
		                        .map(n -> n*2).collect(Collectors.toList());
		System.out.println(numbers);
	}
}
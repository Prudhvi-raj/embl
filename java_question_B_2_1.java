import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HelloWorld{

     public static void main(String []args){
        Random random = new Random();
        List<Integer> randomNumbers = random.ints(1, 11).distinct().limit(10).boxed().collect(Collectors.toList());
        System.out.println(randomNumbers);
     }
}
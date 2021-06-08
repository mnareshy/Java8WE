package Java8P.lamdas.functional.we;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionalWe {

	public static void main(String[] args) {


		//		Predicate Test

		Predicate<Boolean> prediate = p->true;

		System.out.println(prediate.test(true));

		String[] strs = {"sairam","naresh"};
		ArrayList strsList =  new ArrayList(Arrays.asList(strs));

		Predicate<String> prediateNwords = p -> {
			boolean predicate = false;

			if(p.indexOf('n') == 0)			
				predicate = true;

			return predicate;
		};

		strsList.removeIf(prediateNwords);
		System.out.println(strsList);

		//Consume		
		Consumer<String> strBuilderConsumer = str -> {

			StringBuilder strBuilder = new StringBuilder(str);	
			strBuilder.insert(0,LocalDateTime.now() + " : ");
			strBuilder.insert(0,FunctionalWe.class.descriptorString()+ " : ");


			System.out.println(strBuilder);

		};

		strBuilderConsumer.accept("Testing Cosumer");


		//	Supplier	

		Supplier<String> supplier = () -> {

			byte[] strByte = new byte[7];

			Random random = new Random();
			random.nextBytes(strByte);

			return new String(strByte);


		};


		System.out.println("Random Unbound String :" + supplier.get());
		
		
//		Function
		
		Function<String, Boolean> isStringValid = R ->  {
			boolean retunValue = false;
			
			if(R.equals("sai"))
				retunValue =  true;
			
			return retunValue;
		};
		
		System.out.println(isStringValid.apply("sai"));
		
	}

}

package features.mouse;

public class FizzBuzz implements features.FizzBuzz {

	@Override
	public String fizzBuzz(int i) {

		//20180818
		
		
		String str = "";

		if(i <= 0) {
			throw new RuntimeException();
		}

		if (i % 3 == 0) {
			str += "Fizz";
		}
		if (i % 5 == 0) {
			str += "Buzz";
		}
		if( str == "") {
			str = String.valueOf(i) ;
		}

		return str;
	}

}

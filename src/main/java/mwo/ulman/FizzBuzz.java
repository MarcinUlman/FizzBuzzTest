package main.java.mwo.ulman;

public class FizzBuzz {

	public String playGame(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		}

		if (i % 3 == 0) {
			return "Fizz";
		}
		if (i % 5 == 0) {
			return "Buzz";
		}
		return i + "";
	}

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		for (int i = 0; i < 100; i++) {
			System.out.println(fizzBuzz.playGame(i));
		}
	}

}

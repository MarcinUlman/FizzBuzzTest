package test.java.mwo.ulman;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.mwo.ulman.FizzBuzz;

class FizzBuzzTests {

	FizzBuzz fizzBuzz;

	@BeforeEach
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testFizz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				Assert.assertEquals("Fizz", fizzBuzz.playGame(3));
			}
		}
	}

	@Test
	public void testBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 != 0) {
				Assert.assertEquals("Buzz", fizzBuzz.playGame(i));
			}
		}
	}

	@Test
	public void testFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				Assert.assertEquals("FizzBuzz", fizzBuzz.playGame(i));
			}
		}
	}

	@Test
	public void testNumberPrint() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				Assert.assertEquals(i + "", fizzBuzz.playGame(i));
			}
		}
	}

}

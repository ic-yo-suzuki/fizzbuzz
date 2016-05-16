/**
 *
 */
package fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author trainee180
 *
 */
public class FizzBuzzTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * {@link fizzbuzz.FizzBuzz#getFizzBuzz()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFizzBuzz_CaseMutlipleOfThree(){
		System.out.println("3の倍数の時");
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(6)));
	}

	@Test
	public void testGetFizzBuzz_CaseMutlipleOfFive(){
		System.out.println("5の倍数の時");
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(20)));
	}

	@Test
	public void testGetFizzBuzz_CaseMultipleOfThreeAndFive() {
		System.out.println("3と5の倍数の時");
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(15)));
	}
	@Test
	public void testGetFizzBuzz_CaseNotMultipleOfThreeOrFive(){
		System.out.println("3と5の倍数ではないとき");
		assertThat("23", is(FizzBuzz.getFizzBuzz(23)));
	}
}

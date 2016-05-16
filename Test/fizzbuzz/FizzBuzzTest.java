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
	public void 三の倍数の時(){
		assertThat("2", is(FizzBuzz.getFizzBuzz(2)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(3)));
		assertThat("4", is(FizzBuzz.getFizzBuzz(4)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(6)));
	}

	@Test
	public void 負値の三の倍数の時(){
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(-3)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(-18)));
	}

	@Test
	public void 五の倍数の時(){
		assertThat("19", is(FizzBuzz.getFizzBuzz(19)));
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(20)));
		assertThat("22", is(FizzBuzz.getFizzBuzz(22)));
	}


	@Test
	public void 負値の五の倍数の時(){
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(-5)));
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(-100)));
	}

	@Test
	public void 三と五の倍数の時() {
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(15)));
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(600)));
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(-30)));
	}

	@Test
	public void ゼロの場合(){
		assertThat("0", is(FizzBuzz.getFizzBuzz(0)));
	}

	@Test(expected = NumberFormatException.class)
	public void 大きな数値の場合(){
		assertThat("2147483647", is(FizzBuzz.getFizzBuzz(Integer.parseInt("2147483647"))));
		assertThat("2147483648", is(FizzBuzz.getFizzBuzz(Integer.parseInt("2147483648"))));
		assertThat("-2147483647", is(FizzBuzz.getFizzBuzz(Integer.parseInt("-2147483647"))));
		assertThat("-2147483648", is(FizzBuzz.getFizzBuzz(Integer.parseInt("-2147483648"))));
	}

	@Test(expected = NumberFormatException.class)
	public void 無効な数値と文字の場合(){
		assertThat("+", is(FizzBuzz.getFizzBuzz(Integer.parseInt("+"))));		// 文字
		assertThat("3.3", is(FizzBuzz.getFizzBuzz(Integer.parseInt("3.3"))));	// 小数点数
	}

}

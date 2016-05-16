/**
 *
 */
package fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

/**
 * @author trainee180
 *
 */
public class FizzBuzzTest {

	/**
	 * {@link fizzbuzz.FizzBuzz#getFizzBuzz()} のためのテスト・メソッド。
	 */
	@Test
	public void 三の倍数の時にFizzと表示する(){
		assertThat("2", is(FizzBuzz.getFizzBuzz(2)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(3)));
		assertThat("4", is(FizzBuzz.getFizzBuzz(4)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(6)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(3 + 18)));
	}

	@Test
	public void マイナスの三の倍数の時にもFizzと表示する(){
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(-3)));
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(-18)));
	}

	@Test
	public void 五の倍数の時にBuzzと表示する(){
		assertThat("19", is(FizzBuzz.getFizzBuzz(19)));
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(20)));
		assertThat("22", is(FizzBuzz.getFizzBuzz(22)));
	}


	@Test
	public void マイナスの五の倍数の時にもBuzzと表示する(){
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(-5)));
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(-100)));
	}

	@Test
	public void 三と五の倍数の時にFizzBuzzと表示する() {
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(15)));
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(600)));
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(-30)));
	}

	@Test
	public void ゼロの場合に0と表示する(){
		assertThat("0", is(FizzBuzz.getFizzBuzz(0)));
		assertThat("0", is(FizzBuzz.getFizzBuzz(3 - 3)));
	}



}

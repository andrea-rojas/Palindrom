import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;


public class PalindromTests {

	@Test
	public void empty_input_returns_empty_output() {
		String output = palindrom.filter("");
		assertThat(output, equalTo(""));
	}

	@Test
	public void palindrom_returns_palindrom() {
		String output = palindrom.filter("abcba");
		assertThat(output, equalTo("abcba"));
	}
	
	@Test
	public void no_palindrom_returns_empty_output() {
		String output = palindrom.filter("rola");
		assertThat(output, equalTo(""));
	}
	
	@Test
	public void two_palindrom_returns_two_palindrom() {
		String output = palindrom.filter("abcba deed");
		assertThat(output, equalTo("abcba deed"));
	}
	
	@Test
	public void two_palindrom_with_spaces_returns_two_palindrom() {
		String output = palindrom.filter(" abcba  deed ");
		assertThat(output, equalTo("abcba deed"));
	}

}

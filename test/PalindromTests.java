import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;


public class PalindromTests {

	@Test
	public void empty_input_returns_empty_output() {
		String output = palindrom.filter("");
		assertThat(output, equalTo(""));
	}

}

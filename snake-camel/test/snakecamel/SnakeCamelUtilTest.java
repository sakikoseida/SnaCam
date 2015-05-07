package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void 先頭小文字を大文字へ変換() {
		SnakeCamelUtil snacame =new SnakeCamelUtil();
		String expected = "Abc_def";
		String actual = snacame.capitalize("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 先頭大文字を小文字へ変換() {
		SnakeCamelUtil snacame =new SnakeCamelUtil();
		String expected = "abcDef";
		String actual = snacame.uncapitalize("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void スネークをキャメルへ変換() {
		SnakeCamelUtil snacame =new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snacame.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void キャメルをスネークへ変換(){
		SnakeCamelUtil snacame =new SnakeCamelUtil();
		String expected = "abc_defg_hi";
		String actual = snacame.camelToSnakecase("AbcDefgHi");
		assertThat(actual, is(expected));
	}		
}	

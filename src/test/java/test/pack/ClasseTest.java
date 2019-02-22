package test.pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import dev.utils.StringUtils;


@RunWith(Parameterized.class)
public class ClasseTest  {
	
	@Parameters
	public static Collection<Object[]> chaineChar(){
		List<Object[]> chaineChar = new ArrayList<Object[]>();
		chaineChar.add(new Object[]{"Caniche", "Canin", 3});
		chaineChar.add(new Object[]{"Niche", "Niche", 0});
		chaineChar.add(new Object[]{"Canichouette", "Canichette", 2});
		chaineChar.add(new Object[]{"Caniche", "Chien", 5});
		chaineChar.add(new Object[]{"Liche", "Biche", 1});
		chaineChar.add(new Object[]{"Caniche", "Caniche", 0});
		chaineChar.add(new Object[]{"Capif", "Waf", 3});
		return chaineChar;
	}
	@Parameter public String nom01;
	@Parameter (value=1) public String nom02;
	@Parameter (value=2) public int resultExpected;
	
		
	@Test
	public void test1LevenshteinDistance() {
		Assert.assertEquals(resultExpected, StringUtils.levenshteinDistance(nom01, nom02));
	}
	
		
	@Test
	public void test2LevenshteinDistance() {


		int valeurObtenue = StringUtils.levenshteinDistance("Chat", "Chine");
		Assert.assertEquals(3, valeurObtenue);

		Assert.assertEquals(3, StringUtils.levenshteinDistance("Pokemon", "Pokestop"));
		Assert.assertEquals(1, StringUtils.levenshteinDistance("Dater", "Date"));
		Assert.assertEquals(0, StringUtils.levenshteinDistance("Luminea", "Luminea"));
		Assert.assertNull(null);			
	}
}
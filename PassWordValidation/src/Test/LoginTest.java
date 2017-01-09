package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ValidationPassWord.Login;

public class LoginTest {
	
	@Test
	public void test_oK() {
		boolean res = Login.validation("dfrt", "qwert", "qwert");
		Assert.assertTrue(" les res doit etre false ", res==true);
	}
	
	@Test
	public void test_UserVide() {

		boolean res = Login.validation("", "qwert", "qwert");
		Assert.assertTrue(" les res doit etre false ", res==false);
	}
	@Test
	public void test_PassWordVide_ConfirmationVide() {
		boolean res = Login.validation("dfrt", "qwert", "");
		Assert.assertTrue(" les res doit etre false ", res==false);
	}
	@Test
	public void test_UserInfaTrois() {
	
		 boolean res=Login.validation("ee", "erty", "erty");
		Assert.assertTrue("le resultat doit etre faux", res==false);
	}
	
	@Test
	public void test_PassWordDifConfirmation() {
		boolean res = Login.validation("dfrt", "qwert", "rfg");
		Assert.assertTrue(" les res doit etre false ", res==false);
	}
}

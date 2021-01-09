package org.com;

import org.net.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3_class extends BaseClass1 {

	
	public pom3_class() {
		
		
		PageFactory.initElements(driver, this);
	}
		
		
	


		@FindBy (id="radiobutton_0")
		private WebElement radiobutton_0;
		
		@FindBy (id="continue")
		private WebElement continue1;

		public WebElement getRadiobutton_0() {
			return radiobutton_0;
		}

		public WebElement getContinue1() {
			return continue1;
		}

		

		

		
		
	
}

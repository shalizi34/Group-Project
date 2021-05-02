package hrms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import hrms.qa.utils.CommonMethods;

public class AddingSkills extends CommonMethods {

	@FindBy (id="//input[@value='Add']")
	public WebElement add;
	
	@FindBy (xpath= "//input[@id='skill_name']")
	public WebElement NewSkills;
	
	
	@FindBy (xpath= "//input[@id='skill_description']")
	public WebElement SkillDescription;
	

	@FindBy(xpath= "//input[@id='btnSave']")
			public WebElement saveBtn;
}

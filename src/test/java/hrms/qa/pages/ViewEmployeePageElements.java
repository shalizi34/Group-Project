package hrms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrms.qa.testbase.BaseClass;

public class ViewEmployeePageElements {

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
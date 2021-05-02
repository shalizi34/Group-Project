package hrms.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrms.qa.testbase.BaseClass;
import hrms.qa.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	@FindBy(xpath="//div[@class='menu']/ul/li")
	public List<WebElement> dashMenu;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public WebElement cliclOnQualifications;
	
	@FindBy (xpath= "//a[text()='Skills']")
	public WebElement cliconSkills;
	
	@FindBy (xpath= "//a[@id='menu_admin_viewAdminModule']")
	public WebElement clickAdmin;
	
	@FindBy (xpath= "//input[@id='empsearch_id']")
	public WebElement ClickonId;
	
	@FindBy (id="searchBtn")
	public WebElement SearchBtn;
	
	@FindBy (xpath= "//a[text()='Farid']")
	public WebElement Farid;
	
	@FindBy (linkText = "Qualifications")
	public WebElement LinkQualifications;
	
	@FindBy (id ="addSkill")
	public WebElement AddSkill;
	
	@FindBy (xpath ="//select[@id='skill_code']")
	public WebElement select;
	
	@FindBy (id ="skill_years_of_exp")
	public WebElement YearsofExp;
	
	@FindBy (id="skill_comments")
	public WebElement Comments;
	
	@FindBy (id="btnSkillSave")
	public WebElement Save;
	
	@FindBy (xpath= "//a[text()=Automation skill")
	public WebElement Creative;
	
	
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
}
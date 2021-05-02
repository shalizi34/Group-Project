package hrms.qa.steps;

import org.junit.Assert;

import hrms.qa.utils.CommonMethods;
import hrms.qa.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkillSteps extends CommonMethods {

@Given("user should logged with valid admin credentials")
public void user_should_logged_with_valid_admin_credentials() {
	sendText(login.username, ConfigsReader.getProperty("username"));
	sendText(login.password, ConfigsReader.getProperty("password"));
	click(login.loginBtn);
}

@When("user navigate to PIM and click on employee list")
public void user_navigate_to_PIM_and_click_on_employee_list() {
    click(dashboard.PIM);
    wait(1);
    click(dashboard.empListPage);
  
}

@Then("admin find employee by ID {string} and click on it")
public void admin_find_employee_by_ID_and_click_on_it(String string) {
    sendText(dashboard.ClickonId, string);
    click(dashboard.SearchBtn);
    wait(2);
    click(dashboard.Farid);
     
}

@Then("the employee {string} is displayed")
public void the_employee_is_displayed(String string) {
	String expected= string;
	String actual= pdetails.profilePic.getText();
	Assert.assertEquals("text is not matched", expected, actual);
	
  
}

@Then("admin is navigated to qualifications")
public void admin_is_navigated_to_qualifications() {
	click(dashboard.LinkQualifications);
	wait(1);
}

@Then("user click on add  skills")
public void user_click_on_add_skills() {
	click(dashboard.AddSkill);
	wait(1);
	selectDdValue(dashboard.select, "Automation skill");
	wait(4);
	sendText(dashboard.YearsofExp, "2");
	sendText(dashboard.Comments, "We are done with Test Cases");
	click(dashboard.Save);
//	String expected= "Automation";
	//String actual= dashboard.Creative.getText();
	
}


}



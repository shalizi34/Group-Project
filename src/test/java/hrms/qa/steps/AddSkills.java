package hrms.qa.steps;

import java.util.List;
import java.util.Map;

import hrms.qa.utils.CommonMethods;
import hrms.qa.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddSkills extends CommonMethods{

	@Given("user is navigated to HRMS with valid admin credentials")
	public void user_is_navigated_to_HRMS_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);  
	}

	@Given("click skills under qualification button")
	public void click_skills_under_qualification_button() {
	
		click(dashboard.clickAdmin);
		click(dashboard.cliclOnQualifications);
		click(dashboard.cliconSkills);
		wait(3);
	}
	

@Then("click add button and add skills {string}, {string}")
public void click_add_button_and_add_skills(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
    List<Map<String, String>> el = dataTable.asMaps();
    for(Map<String, String> list:el) {
       click(skills.add);
 	   wait(4);
 	   sendText(skills.NewSkills, string);
 	   sendText(skills.SkillDescription, string2);
 	   click(skills.saveBtn);

    }
}



//	@Given("click add button")
//	public void click_add_button() {
//		wait(2);
//		click(skills.add);
//
//	}
//
//	@Then("add skills {string}, {string}, {string}, {string}")
//	public void add_skills(String PMP, String Creative, String CreativeSkills, String PMPCertified) {
//		sendText(skills.NewSkills, PMP);
//		sendText(skills.SkillDescription, PMPCertified);
//		jsClick(skills.saveBtn);
//		wait(2);
//		jsClick(skills.add);
		
	}
		
	





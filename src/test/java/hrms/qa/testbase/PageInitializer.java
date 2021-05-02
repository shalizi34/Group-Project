package hrms.qa.testbase;

import hrms.qa.pages.AddEmployeePageElements;
import hrms.qa.pages.AddingSkills;
import hrms.qa.pages.DashboardPageElements;
import hrms.qa.pages.LoginPageElements;
import hrms.qa.pages.PersonalDetailsPageElements;
import hrms.qa.pages.ViewEmployeePageElements;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ViewEmployeePageElements viewEmp;
	public static AddingSkills skills;
	public static void initialize() {
		skills=new AddingSkills();
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		viewEmp=new ViewEmployeePageElements();
	}
}
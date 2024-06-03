package ZohoPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZohoPage {
    WebDriver driver = null;
    ZohoPageElements elements;

    @Before
    public void setUp() {
        System.setProperty("WebDriver.firefox.driver", "C:\\Users\\admin\\Testing 101\\Selenium\\Gecko Drivers\\geckodriver.exe\\");
        driver = new FirefoxDriver();
        elements = new ZohoPageElements(driver);
    }

    @Given("Navigate to Zoho Page")
    public void navigatesToPage() throws Exception {
        driver.get("https://www.zoho.com/all-products.html");
    }

    @When("Login to page")
    public void LoginToPage() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]")).click();
        Thread.sleep(10000);

        //LOGIN EMAIL
        driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys("goldstainmusic22@gmail.com");

        //NEXT BUTTON
        driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();

        //PASSWORD
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("!Ama90sbitch");
        Thread.sleep(2000);
        //SIGN IN BUTTON
        driver.findElement(By.xpath("//button[@class='btn blue'][contains(.,'Sign in')]")).click();
        Thread.sleep(15000);

        //driver.findElement(By.xpath("//a[@id='continue_button']")).click();
        //Thread.sleep(15000);


    }

    @And("Select and create Leads")
    public void selectAndCreateLeads() throws InterruptedException {
        elements.CRM.click();
    }

    @Then("Save Lead")
    public void save() {
        elements.saveLead.click();
    }

    @And("^Enter email (.+)$")
    public void enterEmailAsEmail(String emailInput) {
        elements.email.sendKeys(emailInput);
    }

    @And("^Enter secondary email (.+)$")
    public void enterSecondaryEmailAsSecondaryEmail(String secEmail) {
        elements.secondaryEmail.sendKeys(secEmail);
    }

    @And("^Enter Company as (.*)$")
    public void enterCompanyAsCompany(String companyName) {
        elements.company.sendKeys(companyName);
    }


    @And("^Enter last name  as (.*)$")
    public void enterLastNameAsLastname(String lastNme) {
        elements.lastName.sendKeys(lastNme);
    }

    @And("Enter Company and last Name as {string} and {string}")
    public void enterCompanyAndLastNameAsAnd(String arg0, String arg1) {
        elements.company.sendKeys("WorldRunners");
        elements.lastName.sendKeys("Virjoen");
    }

    @And("^Enter website as (.+)$")
    public void enterWebsiteAsWebsiteName(String websiteName) {
        elements.website.sendKeys(websiteName);
    }

    @And("^Enter No of Employees as (.+)$")
    public void enterNoOfEmployeesAsNumOfEmp(String employeesTot) {
        elements.employees.sendKeys(employeesTot);

    }

    @And("^Enter No of Annual Revenue as(.*)$")
    public void enterNoOfAnnualRevenueAsAnnRevenue(String annRevenue) {
        elements.revenue.sendKeys(annRevenue);

    }

    @And("Select and create Tasks")
    public void selectAndCreateTasks() throws InterruptedException {
        elements.CRM.click();
        Thread.sleep(10000);

        elements.task.click();
        Thread.sleep(10000);

        elements.createTask.click();
        Thread.sleep(10000);
    }

    @And("^Enter subject as(.+)$")
    public void enterSubjectAsSubject(String subjLine) {
        elements.subject.sendKeys(subjLine);
    }

    @And("^Enter Due date as (.+)$")
    public void enterDueDateAsDueDate(String dueDate) {
        elements.due.sendKeys(dueDate);
    }

    @And("Enter default subject as {string}")
    public void enterDefaultSubjectAs(String arg0) {
        elements.subject.sendKeys("Contact Meeting");

    }

    @And("^Enter Lead as(.*)$")
    public void enterLeadAsLeadName(String nameOfLead) {
        elements.leadName.sendKeys(nameOfLead);
    }

    @Then("Save Task")
    public void saveTask() {
    }
}





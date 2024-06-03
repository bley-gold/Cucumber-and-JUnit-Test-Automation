package ZohoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ZohoPageElements {
    public WebElement CRM;
    public WebElement leads;
    public WebElement company;
    public WebElement lastName;
    public WebElement saveLead;
    public WebElement saveTask;
    public WebElement employees;
    public WebElement createLeads;
    public WebElement website;
    public WebElement revenue;
    public WebElement email;
    public WebElement secondaryEmail;
    public WebElement createTask;
    public WebElement task;
    public WebElement subject;
    public WebElement due;
    public WebElement leadName;

    public ZohoPageElements(WebDriver driver) {
        CRM = driver.findElement(By.xpath("//li[@class='zh-main-app zh-sec-apps zh-crm zapp-show']"));

        leads = driver.findElement(By.xpath("//*[@id=\"Visible_Leads\"]"));

        company = driver.findElement(By.xpath("//lyte-input[contains(@class,'lyteInputBox vertical')]//div[contains(@class,'')]//input[@id='inputId']"));

        lastName = driver.findElement(By.xpath("//*[@id=\'Crm_Leads_LASTNAME_LInput\']"));

        saveLead = driver.findElement(By.xpath("//button[@id='crm_create_savebutn']"));


        saveTask = driver.findElement(By.xpath("//div[@id='createFixedButtonDiv']//div[@class='cvpadding']//div[@class='set_mw']//table[@width='100%']//tbody//tr//td[@class='alignright pR30']//input[@id='saveTasksBtn']"));

        employees = driver.findElement(By.xpath("//input[@id='Crm_Leads_EMPCT_LInput']"));

        createLeads = driver.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/link-to/button"));

        website = driver.findElement(By.xpath("input[@id='Crm_Leads_WEBSITE_LInput']"));

        revenue = driver.findElement(By.xpath("//input[@id='Crm_Leads_ANNUALREVENUE_LInput']"));

        email = driver.findElement(By.xpath("//input[@id='Crm_Leads_EMAIL_LInput']"));

        secondaryEmail = driver.findElement(By.xpath("//input[@id='Crm_Leads_ADDN_EMAIL_LInput']"));

        createTask = driver.findElement(By.xpath("//button[@class='customPlusBtn crm-font-bold newwhitebtn cP']"));

        task = driver.findElement(By.xpath("//a[@id='Visible_Tasks']//span[contains(text(),'Tasks')]"));

        subject = driver.findElement(By.xpath("//input[@id='Crm_Tasks_SUBJECT']"));

        due = driver.findElement(By.xpath("//input[@id='Crm_Tasks_DUEDATE']"));

        leadName = driver.findElement(By.xpath("//input[@id='Crm_Tasks_CONTACTID']"));
    }
}

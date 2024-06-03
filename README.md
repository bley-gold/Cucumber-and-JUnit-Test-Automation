# Zoho CRM Lead Creation Automation

This project demonstrates automated testing of the Zoho CRM lead creation process using Cucumber and JUnit.

## Cucumber
![Screenshot 1](https://github.com/bley-gold/Cucumber-and-JUnit-Test-Automation/blob/master/CucumberTesting.png)


## JUnit
![Screenshot 2](https://github.com/bley-gold/Cucumber-and-JUnit-Test-Automation/blob/master/junitTesting.png)


## Prerequisites

- Java JDK 8 or higher
- Maven
- Firefox browser
- GeckoDriver (compatible with your Firefox version)

### Maven Configuration (pom.xml)
Ensure your pom.xml is configured to include the necessary dependencies for Cucumber, JUnit, and Selenium.

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>zoho-crm-automation</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.0</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.1.0</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.1.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
                <configuration>
                    <includes>
                        <include>**/RunCucumberTest.java</include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

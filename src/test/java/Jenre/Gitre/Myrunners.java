package Jenre.Gitre;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\Gitre\\feature456\\mytest999.feature",glue="Jenre.Gitre",plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class Myrunners {

}

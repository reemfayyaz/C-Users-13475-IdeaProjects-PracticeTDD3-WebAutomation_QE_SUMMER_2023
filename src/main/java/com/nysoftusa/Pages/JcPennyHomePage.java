package com.nysoftusa.Pages;

import com.nysoftusa.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class JcPennyHomePage extends WebTestBase {

public static void checkfunctionalityofBabyAndKidsSection(){
    driver.findElement(By.xpath("//*[@id=\"subMenuLevel1\"]/li[5]/div")).click();
//*[@id="submenuElement"]/div[1]/span[5]/a
driver.findElement(By.xpath("//*[@id=\"submenuElement\"]/div[1]/span[5]/a")).click();

  //  String expectedResult="Baby & Kids' Clearance";
  //  String actualResult=driver.findElement(By.xpath("//*[@id=\"gallery-title\"]/h1")).getText();
  //  Assert.assertEquals(actualResult,expectedResult,"does not match");


    // Baby & Kids' Clearance





}







}

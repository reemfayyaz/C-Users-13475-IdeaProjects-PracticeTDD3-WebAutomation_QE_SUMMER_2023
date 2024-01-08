package com.nysoftusa.testpages;

import com.nysoftusa.Pages.JcPennyHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JcPennyHomePageWebTest extends JcPennyHomePage {
    // Test Class: where we wrote all the test cases
    // Test case means the methods which belongs to a @Test annotation
    @Test
public static void verifyFunctionalityOfBabyKidsSection(){
        checkfunctionalityofBabyAndKidsSection();
    String expectedResult="Baby & Kids' Clearance";
    String actualResult=driver.findElement(By.xpath("//*[@id=\"gallery-title\"]/h1")).getText();
    Assert.assertEquals(actualResult,expectedResult,"does not match");
}
@Test
    public static void verifyFunctionalityOfBabyKidsSectionFailTesst(){
        checkfunctionalityofBabyAndKidsSection();
        String expectedResult="Baby & Kids'  Clearance";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"gallery-title\"]/h1")).getText();
        Assert.assertEquals(actualResult,expectedResult,"does not match");
    }

    }





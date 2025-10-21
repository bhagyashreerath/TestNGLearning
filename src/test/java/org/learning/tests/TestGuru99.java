package org.learning.tests;

import org.learning.pageActions.GuruPageAction;
import org.learning.pageActions.RahulShettyPageAction;
import org.testng.annotations.Test;

public class TestGuru99 {


    @Test
    public void testPage1() throws InterruptedException {
        GuruPageAction gp= new GuruPageAction();
        gp.navigateToGuru99Site();
        gp.verifyTitle();
        gp.navigateToWhatIsSelenium();
    }




}

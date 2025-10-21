package org.learning.tests;

import org.learning.pageActions.RahulShettyPageAction;
import org.testng.annotations.Test;

public class RahulShetty {
    @Test
    public void testpage2() throws InterruptedException {
        RahulShettyPageAction pa= new RahulShettyPageAction();
        pa.navigateToRahulLocator();
        pa.loginToRS("Deepak","Gudly");
        pa.errorMessage();

    }

}

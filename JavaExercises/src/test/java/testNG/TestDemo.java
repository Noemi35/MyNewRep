package testNG;

import org.testng.annotations.Test;


public class TestDemo {

    //if we don't provide priority is default value which is 0 -so it will be executed first
    //if they have same priority- alphabetical order will be executed
    //also provide negative numbers
    //test annotations is mandatory
    @Test(priority = 1)
    void openApp() {
        System.out.println("Open");
    }

   @Test(priority = 2)
    void loadingApp() {
    System.out.println("Load");

    }

    @Test(priority = 3)
    void closeApp() {
        System.out.println("Close");
    }


}

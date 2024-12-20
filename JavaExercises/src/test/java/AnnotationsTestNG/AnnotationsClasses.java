package AnnotationsTestNG;

import org.testng.annotations.*;

public class AnnotationsClasses {

    //repeated before and after each class of the class

        @BeforeClass
        void login() {
            System.out.println("Login completed");
        }

        @AfterClass
        void logout() {
            System.out.println("Logout completed");
        }

        @Test(priority = 1)
        void search() {
            System.out.println("Search completed");
        }
        @Test(priority = 2)
        void advancedSearch() {
            System.out.println("Advanced search completed");
        }

    }

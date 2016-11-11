package io.ionchannel.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testOne(){
        App myApp = new App();
        assertTrue(myApp.return_one() == 1);
    }


    public void testTwo(){
        App myApp = new App();
        assertTrue(myApp.return_two() == 2);
    }


    public void testThree(){
        App myApp = new App();
        assertTrue(myApp.return_three() == 3);
    }


    public void testFour(){
        App myApp = new App();
        assertTrue(myApp.return_four() == 4);
    }


    public void testFive(){
        App myApp = new App();
        assertTrue(myApp.return_five() == 5);
    }


    public void testSix(){
        App myApp = new App();
        assertTrue(myApp.return_six() == 6);
    }


    public void testSeven(){
        App myApp = new App();
        assertTrue(myApp.return_seven() == 7);
    }


    public void testEight(){
        App myApp = new App();
        assertTrue(myApp.return_eight() == 8);
    }


    public void testNine(){
        App myApp = new App();
        assertTrue(myApp.return_nine() == 9);
    }


    public void testTen(){
        App myApp = new App();
        assertTrue(myApp.return_ten() == 10);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

package com.kodilla.patterns.strategy.social;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTestSuite {
    private static int testCounter = 0;
    //private User marry;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testDefaultSharingStrategies() {

        User mateusz2000 = new YGeneration("mateusz2000");
        User majk35 = new ZGeneration("majk35");
        User ann92 = new Millenials("ann92");

        mateusz2000.share("java isn't simple");
        majk35.share("weather has suddenly changed");
        ann92.share("meal I proposed for today is...");

    }

    @Test
    public void testIndividualSharingStrategy1() {
        User marry1 = new YGeneration("marry");
        marry1.setSocialPublishingStrategy(new SnapchatPublisher());
        marry1.share("i dislike drugs!!! ");
    }

    @Test
    public void testIndividualSharingStrategy2() {
        User bobby1 = new ZGeneration("Bobby");
        bobby1.setSocialPublishingStrategy(new SnapchatPublisher());
        bobby1.share("i have found such a big diamond!!! ");

    }
}
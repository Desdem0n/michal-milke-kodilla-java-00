package com.kodilla.patterns.strategy.social;

import org.junit.*;

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
        //Given
        User mateusz = new YGeneration("mateusz500+");
        User majk = new ZGeneration("majk500+");
        User ann = new Millenials("ann500+");
        //When
        String user1ShouldShare = mateusz.sharePost();
        System.out.println("User1 should: " + user1ShouldShare);
        String user2ShouldShare = majk.sharePost();
        System.out.println("User2 should: " + user2ShouldShare);
        String user3ShouldShare = ann.sharePost();
        System.out.println("User3 should: " + user3ShouldShare);
        //Then
        Assert.assertEquals("facebook", user1ShouldShare);
        Assert.assertEquals("snapchat", user2ShouldShare);
        Assert.assertEquals("twitter", user3ShouldShare);

        System.out.println("hopefully everything works now");

    }

//    @Test
//    public void testIndividualSharingStrategy1() {
//        //Given
//        User marry1 = new YGeneration("marry");
//        //When
//        marry1.setSocialPublishingStrategy(new SnapchatPublisher());
//        String user4 = marry1.share();
//        //Then
//        Assert.assertEquals("i dislike drugs!!!",user4);

    }

//    @Test
//    public void testIndividualSharingStrategy2() {
//        User bobby1 = new ZGeneration("Bobby");
//        bobby1.setSocialPublishingStrategy(new SnapchatPublisher());
//        bobby1.share();
//
//    }

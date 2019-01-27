package com.kodilla.patterns.factory.tasks;

import org.junit.*;

public class TaskFactoryTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests were finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals("Shall buy: wheels, quantity: 4.0", shopping.executeTask());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals("Paint: whole flat, colour: green", painting.executeTask());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertEquals("Where: Rzeszoow, use: car", driving.executeTask());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }
}
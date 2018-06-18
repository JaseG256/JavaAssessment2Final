package com.zipcodewilmington.assessment2.part2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RouterTest {
    private Router router;

    @Before
    public void setup(){
        router = new Router();
    }

    @Test
    public void testAdd(){
        String path = "/users";
        String controller = "UserController";

        router.add(path, controller);

        int actualSize = router.size();
        int expectedSize = 1;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testSize() {

        router.add("/users", "UserController");
        router.add("/students", "StudentController");
        router.add("/instructor", "InstructorController");

        int actualSize = router.size();
        int expectedSize = 3;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testGetController(){
        String path = "/labs";
        String expectedController = "LabController";

        router.add(path, expectedController);
        String actualController = router.getController(path);

        Assert.assertEquals(expectedController, actualController);
    }

    @Test
    public void testGetController_withMultipleEntry() {
        String path = "/labs/statuses";
        String expectedController = "LabStatusController";

        router.add("/users", "UserController");
        router.add(path, expectedController);
        router.add("/students", "StudentController");
        router.add("/instructor", "InstructorController");

        String actualController = router.getController(path);

        Assert.assertEquals(expectedController, actualController);
    }

    @Test
    public void testUpdateController(){
        String path = "/student";
        String expectedController = "StudentController";

        router.add(path, "UserController");
        router.update(path, "StudentController");

        String actualController = router.getController(path);

        Assert.assertEquals(expectedController, actualController);
    }

    @Test
    public void testRemovePath(){
        String path = "/users";
        String expectedController = "UserController";

        router.add(path, expectedController);
        router.remove(path);

        Assert.assertNull(router.getController(path));
    }

    @Test
    public void testToString() {

        router.add("/users", "UserController");
        router.add("/students", "StudentController");
        router.add("/instructor", "InstructorController");

        String expectedString = "/instructor -> InstructorController\n"
                                + "/students -> StudentController\n"
                                + "/users -> UserController\n";

        String actualString = router.toString();

        Assert.assertEquals(expectedString, actualString);
    }
}

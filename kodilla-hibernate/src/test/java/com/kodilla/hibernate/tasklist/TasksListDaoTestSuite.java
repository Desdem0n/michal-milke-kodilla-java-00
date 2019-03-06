package com.kodilla.hibernate.tasklist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasksListDaoTestSuite {
    @Autowired
    private TasksListDao tasksListDao;
    private static final String LISTNAME = "List name";
    private static final String DESCRIPTION = "Tasks to do";

    @Test
    public void testFindByListName() {
        //Given
        TasksList tasksList = new TasksList(LISTNAME, DESCRIPTION);
        tasksListDao.save(tasksList);
        //When
        List<TasksList> readTasksList = tasksListDao.findByListName(LISTNAME);
        //Then
        Assert.assertEquals(1, readTasksList.size());
        //CleanUp
        int id = readTasksList.get(0).getId();
        tasksListDao.delete(id);
    }
}
package com.kodilla.hibernate.tasklist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TasksListDao extends CrudRepository<TasksList, Integer> {
    List<TasksList> findByListName(String listName);
}
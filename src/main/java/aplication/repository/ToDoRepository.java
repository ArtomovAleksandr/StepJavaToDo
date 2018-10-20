package aplication.repository;

import aplication.controller.AdminController;
import aplication.entity.TableToDo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ToDoRepository extends JpaRepository<TableToDo,Integer> {
}

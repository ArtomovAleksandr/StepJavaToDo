package aplication.service.implement;

import aplication.entity.TableToDo;
import aplication.repository.ToDoRepository;
import aplication.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToGoService implements EntityService<TableToDo> {
    @Autowired
    ToDoRepository toDoRepository;
    @Override
    public List<TableToDo> getAll() throws Exception {
        return toDoRepository.findAll();
    }

    @Override
    public TableToDo getById(int id) throws Exception {
        return toDoRepository.findById(id).get();
    }

    @Override
    public TableToDo save(TableToDo tableToDo) throws Exception {
        return toDoRepository.save(tableToDo);
    }

    @Override
    public void delete(int id) throws Exception {
        toDoRepository.deleteById(id);
    }
}

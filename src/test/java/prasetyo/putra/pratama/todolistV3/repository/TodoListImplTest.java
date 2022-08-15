package prasetyo.putra.pratama.todolistV3.repository;

import com.zaxxer.hikari.HikariDataSource;
import entity.TodoList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import util.DatabaseUtil;

import javax.sql.DataSource;

public class TodoListImplTest {

    private HikariDataSource dataSource;
    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp(){
        dataSource = DatabaseUtil.getDatSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        TodoList todoList = new TodoList();
        todoList.setTodo("Putra");

        todoListRepository.add(todoList);
    }

    @Test
    void testRemove() {
        System.out.println(todoListRepository.remove(1));
        System.out.println(todoListRepository.remove(2));
        System.out.println(todoListRepository.remove(3));
        System.out.println(todoListRepository.remove(4));
    }

    @Test
    void testGetAll() {
        todoListRepository.add(new TodoList("Prasetyo"));
        todoListRepository.add(new TodoList("Putra"));
        todoListRepository.add(new TodoList("Putra"));

        TodoList[] todoList = todoListRepository.getAll();
        for(var todo : todoList){
            System.out.println(todo.getId()+". "+todo.getTodo());
        }
    }

    @AfterEach
    void afterAll() {
        dataSource.close();
    }
}

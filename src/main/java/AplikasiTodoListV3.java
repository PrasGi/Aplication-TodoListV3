import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import util.DatabaseUtil;
import view.TodoListView;

import javax.sql.DataSource;

public class AplikasiTodoListV3 {
    public static void main(String[] args) {
        DataSource dataSource = DatabaseUtil.getDatSource();

        TodoListRepository todoListRepository = new TodoListRepositoryImpl(dataSource);
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}

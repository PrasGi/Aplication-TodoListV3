package entity;

public class TodoList {

    private Integer id;

    private String todo;

    public TodoList(String todo) {
        this.todo = todo;
    }

    public TodoList(){

    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

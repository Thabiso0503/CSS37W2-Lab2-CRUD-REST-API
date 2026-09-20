import java.util.List;
public interface TodoService {
    List<Todo> getTodos();
    Todo getTodoById(Long id);
    Todo insert(Todo todo);
    void updateTodo(Long id, Todo todo);
    void deleteTodo(Long todoId);

import com.example.demo.model.Todo;
import com.example.demo.repositories.TodoRepository;
import org.springframework.stereotype.Service;

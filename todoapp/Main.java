package todoapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import todoapp.config.Database;
import todoapp.repositories.TodoListRepository;
import todoapp.repositories.TodoListRepositoryDbImpl;
import todoapp.services.TodoListService;
import todoapp.services.TodoListServiceImpl;
import todoapp.views.TodoListTerminalViewImpl;
import todoapp.views.TodoListView;

@ComponentScan(basePackages = "todoapp")
public class Main {
    public static void main(String[] args) {

    }

    @Bean
    Database database() {
        Database database = new Database("my_database", "root", "", "localhost", "3306");
        database.setup();

        return database;
    }
}

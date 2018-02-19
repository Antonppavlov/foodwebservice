package ru.appavlov.food.web.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import ru.appavlov.food.web.service.model.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {

    List<Author> findByFio(String lastName);
}

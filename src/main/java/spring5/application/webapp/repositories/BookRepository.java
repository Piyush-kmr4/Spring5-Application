package spring5.application.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.application.webapp.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}

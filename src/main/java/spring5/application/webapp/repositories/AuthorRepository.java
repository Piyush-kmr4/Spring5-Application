package spring5.application.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.application.webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

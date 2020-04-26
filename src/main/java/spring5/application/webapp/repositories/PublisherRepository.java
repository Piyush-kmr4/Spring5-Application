package spring5.application.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.application.webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

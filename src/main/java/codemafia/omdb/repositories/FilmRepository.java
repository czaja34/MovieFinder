package codemafia.omdb.repositories;

import codemafia.omdb.domain.DBFilm;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<DBFilm, Long> {
}

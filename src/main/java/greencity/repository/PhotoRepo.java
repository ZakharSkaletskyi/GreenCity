package greencity.repository;

import greencity.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Provides an interface to manage {@link Photo} entity.
 */
@Repository
public interface PhotoRepo extends JpaRepository<Photo, Long> {
}

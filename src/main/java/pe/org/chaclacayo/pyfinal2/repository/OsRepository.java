package pe.org.chaclacayo.pyfinal2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.org.chaclacayo.pyfinal2.entity.Os;

/**
 *
 * @author admin
 */
@Repository
public interface OsRepository extends JpaRepository<Os, Integer>{


}
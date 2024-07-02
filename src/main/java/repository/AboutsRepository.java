package repository;

import model.Abouts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AboutsRepository extends JpaRepository<Abouts, Long>, JpaSpecificationExecutor<Abouts> {

}
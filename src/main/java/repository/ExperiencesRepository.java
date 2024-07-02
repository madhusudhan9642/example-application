package repository;

import model.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ExperiencesRepository extends JpaRepository<Experiences, Long>, JpaSpecificationExecutor<Experiences> {

}
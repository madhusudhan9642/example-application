package repository;

import model.Professions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProfessionsRepository extends JpaRepository<Professions, Long>, JpaSpecificationExecutor<Professions> {

}
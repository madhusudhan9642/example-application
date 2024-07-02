package repository;

import model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SkillsRepository extends JpaRepository<Skills, Long>, JpaSpecificationExecutor<Skills> {

}
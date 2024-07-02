package repository;

import model.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Long>, JpaSpecificationExecutor<CandidateSkill> {

}
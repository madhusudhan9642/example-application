package repository;

import model.CandidateEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidateEducationRepository extends JpaRepository<CandidateEducation, Long>, JpaSpecificationExecutor<CandidateEducation> {

}
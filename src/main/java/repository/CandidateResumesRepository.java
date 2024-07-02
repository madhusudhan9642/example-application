package repository;

import model.CandidateResumes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidateResumesRepository extends JpaRepository<CandidateResumes, Long>, JpaSpecificationExecutor<CandidateResumes> {

}
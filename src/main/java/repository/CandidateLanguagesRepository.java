package repository;

import model.CandidateLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidateLanguagesRepository extends JpaRepository<CandidateLanguages, Long>, JpaSpecificationExecutor<CandidateLanguages> {

}
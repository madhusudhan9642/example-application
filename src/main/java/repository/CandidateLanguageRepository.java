package repository;

import model.CandidateLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidateLanguageRepository extends JpaRepository<CandidateLanguage, Long>, JpaSpecificationExecutor<CandidateLanguage> {

}
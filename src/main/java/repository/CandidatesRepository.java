package repository;

import model.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidatesRepository extends JpaRepository<Candidates, Long>, JpaSpecificationExecutor<Candidates> {

}
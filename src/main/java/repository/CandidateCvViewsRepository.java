package repository;

import model.CandidateCvViews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CandidateCvViewsRepository extends JpaRepository<CandidateCvViews, Long>, JpaSpecificationExecutor<CandidateCvViews> {

}
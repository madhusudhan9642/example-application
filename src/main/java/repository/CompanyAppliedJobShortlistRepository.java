package repository;

import model.CompanyAppliedJobShortlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyAppliedJobShortlistRepository extends JpaRepository<CompanyAppliedJobShortlist, Long>, JpaSpecificationExecutor<CompanyAppliedJobShortlist> {

}
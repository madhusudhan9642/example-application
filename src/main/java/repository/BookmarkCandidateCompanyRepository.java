package repository;

import model.BookmarkCandidateCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookmarkCandidateCompanyRepository extends JpaRepository<BookmarkCandidateCompany, Long>, JpaSpecificationExecutor<BookmarkCandidateCompany> {

}
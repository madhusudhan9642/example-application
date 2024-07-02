package repository;

import model.BookmarkCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookmarkCompanyRepository extends JpaRepository<BookmarkCompany, Long>, JpaSpecificationExecutor<BookmarkCompany> {

}
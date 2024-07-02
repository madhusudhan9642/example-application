package repository;

import model.BookmarkCompanyCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookmarkCompanyCategoryRepository extends JpaRepository<BookmarkCompanyCategory, Long>, JpaSpecificationExecutor<BookmarkCompanyCategory> {

}
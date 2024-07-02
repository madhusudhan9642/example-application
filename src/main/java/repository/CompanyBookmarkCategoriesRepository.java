package repository;

import model.CompanyBookmarkCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyBookmarkCategoriesRepository extends JpaRepository<CompanyBookmarkCategories, Long>, JpaSpecificationExecutor<CompanyBookmarkCategories> {

}
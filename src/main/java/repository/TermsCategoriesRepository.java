package repository;

import model.TermsCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TermsCategoriesRepository extends JpaRepository<TermsCategories, Long>, JpaSpecificationExecutor<TermsCategories> {

}
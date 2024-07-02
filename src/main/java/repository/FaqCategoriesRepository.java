package repository;

import model.FaqCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FaqCategoriesRepository extends JpaRepository<FaqCategories, Long>, JpaSpecificationExecutor<FaqCategories> {

}
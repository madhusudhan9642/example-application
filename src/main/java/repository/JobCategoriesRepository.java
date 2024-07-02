package repository;

import model.JobCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobCategoriesRepository extends JpaRepository<JobCategories, Long>, JpaSpecificationExecutor<JobCategories> {

}
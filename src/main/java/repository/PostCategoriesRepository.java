package repository;

import model.PostCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostCategoriesRepository extends JpaRepository<PostCategories, Long>, JpaSpecificationExecutor<PostCategories> {

}
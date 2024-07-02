package repository;

import model.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TagsRepository extends JpaRepository<Tags, Long>, JpaSpecificationExecutor<Tags> {

}
package repository;

import model.Cms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CmsRepository extends JpaRepository<Cms, Long>, JpaSpecificationExecutor<Cms> {

}
package repository;

import model.CmsContents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CmsContentsRepository extends JpaRepository<CmsContents, Long>, JpaSpecificationExecutor<CmsContents> {

}
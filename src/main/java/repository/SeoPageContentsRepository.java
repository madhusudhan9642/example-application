package repository;

import model.SeoPageContents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SeoPageContentsRepository extends JpaRepository<SeoPageContents, Long>, JpaSpecificationExecutor<SeoPageContents> {

}
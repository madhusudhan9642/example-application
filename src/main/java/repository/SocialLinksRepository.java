package repository;

import model.SocialLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SocialLinksRepository extends JpaRepository<SocialLinks, Long>, JpaSpecificationExecutor<SocialLinks> {

}
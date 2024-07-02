package repository;

import model.WebsiteSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WebsiteSettingsRepository extends JpaRepository<WebsiteSettings, Long>, JpaSpecificationExecutor<WebsiteSettings> {

}
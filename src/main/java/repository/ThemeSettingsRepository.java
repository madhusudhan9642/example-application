package repository;

import model.ThemeSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ThemeSettingsRepository extends JpaRepository<ThemeSettings, Long>, JpaSpecificationExecutor<ThemeSettings> {

}
package repository;

import model.Migrations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MigrationsRepository extends JpaRepository<Migrations, Long>, JpaSpecificationExecutor<Migrations> {

}
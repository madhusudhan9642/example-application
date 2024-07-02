package repository;

import model.Currencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CurrenciesRepository extends JpaRepository<Currencies, Long>, JpaSpecificationExecutor<Currencies> {

}
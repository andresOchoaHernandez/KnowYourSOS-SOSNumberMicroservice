package knowyoursos.sosnumbermicroservice.repositories;

import knowyoursos.sosnumbermicroservice.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}

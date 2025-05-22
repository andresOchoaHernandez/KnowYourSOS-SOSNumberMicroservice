package knowyoursos.sosnumbermicroservice.repositories;

import knowyoursos.sosnumbermicroservice.entities.Fire;
import knowyoursos.sosnumbermicroservice.entities.compositeIds.FireId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireRepository extends JpaRepository<Fire, FireId> {
}

package knowyoursos.sosnumbermicroservice.repositories;

import knowyoursos.sosnumbermicroservice.entities.Police;
import knowyoursos.sosnumbermicroservice.entities.compositeIds.PoliceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliceRepository extends JpaRepository<Police, PoliceId> {
}

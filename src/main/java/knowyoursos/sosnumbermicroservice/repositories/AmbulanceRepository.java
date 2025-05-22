package knowyoursos.sosnumbermicroservice.repositories;

import knowyoursos.sosnumbermicroservice.entities.Ambulance;
import knowyoursos.sosnumbermicroservice.entities.compositeIds.AmbulanceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepository extends JpaRepository<Ambulance, AmbulanceId> {
}

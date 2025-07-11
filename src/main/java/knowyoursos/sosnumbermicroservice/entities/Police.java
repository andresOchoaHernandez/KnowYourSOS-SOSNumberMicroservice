package knowyoursos.sosnumbermicroservice.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import knowyoursos.sosnumbermicroservice.entities.compositeIds.PoliceId;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Police {
    @EmbeddedId
    private PoliceId policeId;
}

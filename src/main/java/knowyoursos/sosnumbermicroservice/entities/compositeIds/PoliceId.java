package knowyoursos.sosnumbermicroservice.entities.compositeIds;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@Embeddable
public class PoliceId implements Serializable {

    private Integer countryId;
    private String emergencyNumber;

    public PoliceId(Integer countryId, String emergencyNumber) {
        this.countryId = countryId;
        this.emergencyNumber = emergencyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PoliceId that = (PoliceId) o;
        return Objects.equals(getCountryId(), that.getCountryId()) && Objects.equals(getEmergencyNumber(), that.getEmergencyNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryId(), getEmergencyNumber());
    }
}

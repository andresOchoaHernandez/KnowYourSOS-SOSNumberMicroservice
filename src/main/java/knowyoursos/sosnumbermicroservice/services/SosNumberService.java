package knowyoursos.sosnumbermicroservice.services;

import knowyoursos.sosnumbermicroservice.entities.Ambulance;
import knowyoursos.sosnumbermicroservice.entities.Country;
import knowyoursos.sosnumbermicroservice.entities.Fire;
import knowyoursos.sosnumbermicroservice.entities.Police;
import knowyoursos.sosnumbermicroservice.repositories.AmbulanceRepository;
import knowyoursos.sosnumbermicroservice.repositories.CountryRepository;
import knowyoursos.sosnumbermicroservice.repositories.FireRepository;
import knowyoursos.sosnumbermicroservice.repositories.PoliceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SosNumberService {

    private final CountryRepository countryRepository;
    private final AmbulanceRepository ambulanceRepository;
    private final FireRepository fireRepository;
    private final PoliceRepository policeRepository;

    public List<Ambulance> getAllAmbulanceNumbers() {
        return ambulanceRepository.findAll();
    }

    public List<Fire> getAllFireNumbers() {
        return fireRepository.findAll();
    }

    public List<Police> getAllPoliceNumbers() {
        return policeRepository.findAll();
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
package knowyoursos.sosnumbermicroservice.controllers;

import knowyoursos.sosnumbermicroservice.entities.Country;
import knowyoursos.sosnumbermicroservice.services.SosNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sosnumbers")
public class SosNumberController {

    private final SosNumberService sosNumberService;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<List<Country>> getAllCountries()
    {
        return ResponseEntity.ok(sosNumberService.getAllCountries());
    }
}

package projekt.zespolowy.web;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.zespolowy.domain.Person;
import projekt.zespolowy.dao.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import projekt.zespolowy.service.PersonService;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("api/person")
public class PersonCtrl {

    @Inject
    private PersonService personService;

    @RequestMapping(value = "{personId}[0-9]*$", method = RequestMethod.GET)
    public ResponseEntity getPerson(@PathVariable Long personId {
        
    }
}

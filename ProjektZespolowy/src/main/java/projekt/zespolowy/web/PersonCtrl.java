package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projekt.zespolowy.domain.Person;
import projekt.zespolowy.service.PersonService;

import javax.inject.Inject;

@RestController
@RequestMapping("api/person")
public class PersonCtrl {

    @Inject
    private PersonService personService;

    @RequestMapping(value = "{personId}[0-9]*$", method = RequestMethod.GET)
    public ResponseEntity getPerson(@PathVariable Long personId) {
        Person person = personService.getPerson(personId);

        if (person == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(person);
    }
}

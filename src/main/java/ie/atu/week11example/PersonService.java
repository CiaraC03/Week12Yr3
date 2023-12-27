package ie.atu.week11example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    // Placeholder method to save a person (add to Db in the next two weeks)
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        return personRepository.findByEmployeeId(employeeId);

    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}

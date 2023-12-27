package ie.atu.week11example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        //Insert test data here
        Person testData = new Person(1L, "Ciara", 23, "Ciara@atu.ie", "Ms", "12345", "Lecturer", "Engineering");
        Person testData2 = new Person(2L, "Bob", 26, "Bob@atu.ie", "Mr", "12587", "Lecturer", "Engineering");
        Person testData3 = new Person(3L, "Amy", 31, "Amy@atu.ie", "Ms", "129963", "Lecturer", "Engineering");
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}

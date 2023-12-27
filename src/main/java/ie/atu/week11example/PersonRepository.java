package ie.atu.week11example;

import org.springframework.data.jpa.repository.JpaRepository;

//access to all crud operations by this
public interface PersonRepository extends JpaRepository<Person, Long> {
}

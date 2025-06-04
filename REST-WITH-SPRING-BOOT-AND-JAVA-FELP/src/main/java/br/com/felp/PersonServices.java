package br.com.felp;

import br.com.felp.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i <8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName " + i);
        person.setLastName("LastName " + i);
        person.setAddress("Address " + i);
        person.setGender("Gender");
        return person;
    }

    public Person findById(String id) {
        logger.info("Find one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Felps");
        person.setLastName("Nitro");
        person.setAddress("Brasília - Distrito Federal - Brasil");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person) {
        logger.info("Creating one Person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("Updating one Person!");
        return person;
    }

    public void delete(String id) {

        logger.info("Deleting one Person!");

    }




}

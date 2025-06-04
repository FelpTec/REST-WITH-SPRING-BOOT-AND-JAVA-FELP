package br.com.felp;

import br.com.felp.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

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
}

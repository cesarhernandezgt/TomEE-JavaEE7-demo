package jbatch.service;



import jbatch.model.Person;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
@Named
public class PersonService {

    private List<Person> personList;

    @PostConstruct
    void init(){
        personList = new ArrayList<Person>();
    }

    public List<Person> getPersonList() {
        return personList;
    }
}

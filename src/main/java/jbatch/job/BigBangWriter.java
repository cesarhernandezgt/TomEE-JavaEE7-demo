package jbatch.job;



import jbatch.service.PersonService;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BigBangWriter extends AbstractItemWriter {

    @Inject
    PersonService personService;

    @Override
    public void writeItems(List list) {
        System.out.println("Writing items: " + list);
        personService.getPersonList().addAll(list);
    }
}
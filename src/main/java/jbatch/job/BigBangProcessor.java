package jbatch.job;


import jbatch.model.Person;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

@Named
public class BigBangProcessor implements ItemProcessor {

    private SimpleDateFormat format = new SimpleDateFormat("M/dd/yy");

    @Override
    public Person processItem(Object t) {
        System.out.println("processItem: " + t);

        StringTokenizer tokens = new StringTokenizer((String) t, ",");

        String name = tokens.nextToken();
        String date;
        try {
            date = tokens.nextToken();
            format.setLenient(false);
            format.parse(date);
        } catch (ParseException e) {
            return null;
        }
        return new Person(name, date);
    }
}

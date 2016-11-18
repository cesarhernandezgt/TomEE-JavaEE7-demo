package jbatch.job;

import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Named;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
public class BigBangReader extends AbstractItemReader {

    private BufferedReader reader;

    @Override
    public void open(Serializable checkpoint) throws Exception {
        reader = new BufferedReader(
                new InputStreamReader(
                        Thread.currentThread().getContextClassLoader().getResourceAsStream("/mydata.csv")));
    }

    @Override
    public String readItem() {
        try {
            return reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
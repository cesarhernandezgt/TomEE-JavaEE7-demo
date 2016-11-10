package ejb;

import jaxb.Drum;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class CatalogBean {

    public List<Drum> catalog;

    public List<Drum> getCatalog() {
        return catalog;
    }

    public CatalogBean() {
        catalog = new ArrayList();
        catalog.add(new Drum(1,"Yamaha"));
        catalog.add(new Drum(2,"Pearl"));
        catalog.add(new Drum(3,"Mapex"));
    }
}

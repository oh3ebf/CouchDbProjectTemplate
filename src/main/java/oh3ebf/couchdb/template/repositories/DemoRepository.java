/**
 * Software: Spring CouchDb Template
 * Module: DemoRepository  class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */

package oh3ebf.couchdb.template.repositories;

import oh3ebf.couchdb.template.model.Demo;
import java.util.List;
import org.ektorp.CouchDbConnector;
import org.ektorp.ViewQuery;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DemoRepository extends CouchDbRepositorySupport<Demo> {

    @Autowired
    public DemoRepository(CouchDbConnector db) {
        super(Demo.class, db);
        initStandardDesignDocument();
    }

    /**
     * 
     * @return 
     */
    @GenerateView
    @Override
    public List<Demo> getAll() {
        ViewQuery q = createQuery("all").descending(true);
        return db.queryView(q, Demo.class);
    }

    /**
     * 
     * @param title
     * @return 
     */
    @GenerateView
    public List<Demo> findByTitle(String title) {
        return queryView("by_title", title);
    }
        
}

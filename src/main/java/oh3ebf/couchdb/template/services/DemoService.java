/**
 * Software: Spring CouchDb Template
 * Module: DemoService class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */

package oh3ebf.couchdb.template.services;

import oh3ebf.couchdb.template.model.Demo;
import oh3ebf.couchdb.template.repositories.DemoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements ServiceInterface {

    private DemoRepository demoRepository;

    @Autowired
    public void setProductRepository(DemoRepository p) {
        this.demoRepository = p;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Demo> listAllPolls() {
        return demoRepository.getAll();
    }

    /**
     *
     * @param title
     * @return
     */
    @Override
    public List<Demo> getPollByTitle(String title) {
        return demoRepository.findByTitle(title);
    }

    /**
     * 
     * @param p 
     */
    @Override
    public void createPoll(Demo p) {
        demoRepository.add(p);
    }

    /**
     * 
     * @param p 
     */
    @Override
    public void deletePoll(Demo p) {
        demoRepository.remove(p);
    }
}

/**
 * Software: Spring CouchDb Template
 * Module: CouchDbRepository unit test class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */

package oh3ebf.couchdb.template.services;

import oh3ebf.couchdb.template.model.Demo;
import java.util.List;

public interface ServiceInterface {
    void createPoll(Demo p);
    void deletePoll(Demo p);
    List<Demo> listAllPolls();   
    List<Demo> getPollByTitle(String title);
}

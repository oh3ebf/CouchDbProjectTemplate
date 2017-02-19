/**
 * Software: Spring CouchDb Template
 * Module: Main application class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */

package oh3ebf.couchdb.template;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class CouchDbDemoApplication {

    private final Logger log = Logger.getLogger(CouchDbDemoApplication.class);

    public static void main(String[] args) {
        
        SpringApplication.run(CouchDbDemoApplication.class, args);
    }
}

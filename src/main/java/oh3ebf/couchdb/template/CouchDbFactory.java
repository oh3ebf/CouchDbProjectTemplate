/**
 * Software: Spring CouchDb Template
 * Module: CouchDbFactory class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */

package oh3ebf.couchdb.template;

import org.apache.log4j.Logger;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CouchDbFactory {

    private final Logger log = Logger.getLogger(CouchDbFactory.class);
    private CouchDbConnector dbConnector = null;
    @Value("${couchdb.username}")
    private String user;
    @Value("${couchdb.password}")
    String passwd;
    @Value("${couchdb.database}")
    String dbName;

    /**
     * Function returns connector to database
     *
     * @return CouchDBConnection
     */
    @Bean
    public CouchDbConnector CouchDbConnector() {

        if (dbConnector == null) {
            HttpClient httpClient = new StdHttpClient.Builder()
                    .username(user)
                    .password(passwd)
                    .build();
            CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
            dbConnector = dbInstance.createConnector(dbName, true);

            log.info("Connected to CouchDb " + dbName + "...");
        }

        return dbConnector;
    }
}

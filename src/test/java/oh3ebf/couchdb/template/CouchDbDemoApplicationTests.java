/**
 * Software: Spring CouchDb Template
 * Module: Application unit test class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */
package oh3ebf.couchdb.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("testing")
public class CouchDbDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

}

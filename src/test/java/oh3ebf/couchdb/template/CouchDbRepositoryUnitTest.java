/**
 * Software: Spring CouchDb Template
 * Module: CouchDbRepository unit test class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 14.12.2016
 */
package oh3ebf.couchdb.template;

import oh3ebf.couchdb.template.model.Demo;
import oh3ebf.couchdb.template.services.DemoService;
import java.util.List;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("testing")
public class CouchDbRepositoryUnitTest {

    private final Logger log = Logger.getLogger(CouchDbFactory.class);

    @Autowired
    DemoService demoService;

    @Test
    public void createDocumentTest() {
        Demo p = new Demo("Test", "Test");
        demoService.createPoll(p);
        assertNotNull(p.getId());

        List<Demo> tmp = demoService.getPollByTitle("Test");
        assertEquals(tmp.size(), 1);
        assertEquals(tmp.get(0).getTitle(), "Test");

        tmp = demoService.getPollByTitle("Test");
        assertEquals(tmp.size(), 1);

        demoService.deletePoll(tmp.get(0));

        tmp = demoService.getPollByTitle("Test");
        assertEquals(tmp.size(), 0);
    }
}

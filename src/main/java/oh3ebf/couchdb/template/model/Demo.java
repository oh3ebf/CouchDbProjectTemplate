/**
 * Software: Spring CouchDb Template
 * Module: Demo data model class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 13.12.2016
 */
package oh3ebf.couchdb.template.model;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class Demo extends CouchDbDocument {

    private static final long serialVersionUID = 1L;

    @TypeDiscriminator
    private String title;
    private String body;

    public Demo() {
        
    }
    
    public Demo(String title, String body) {
       this.title = title;
       this.body = body;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

}

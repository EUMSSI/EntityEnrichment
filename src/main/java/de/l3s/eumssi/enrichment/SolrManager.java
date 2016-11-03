package de.l3s.eumssi.enrichment;

import org.apache.solr.client.solrj.impl.HttpSolrServer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by tumeteor on 03.11.16.
 */
public class SolrManager {

    HttpSolrServer solr;
    public Properties conf;
    public SolrManager() {

        try {
            loadConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        solr = new HttpSolrServer("http://demo.eumssi.eu/Solr_EUMSSI/content_items/");
    }


    public void loadConfiguration() throws FileNotFoundException, IOException {
        conf = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        conf.load(classLoader.getResourceAsStream("DBHandler.properties"));
    }
}

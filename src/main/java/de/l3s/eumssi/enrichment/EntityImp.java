package de.l3s.eumssi.enrichment;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import java.io.File;
import java.io.IOException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class EntityImp {

    SolrManager sm = new SolrManager();


    public void getTotalEntityFreqFromAllFields(String entity) {
        SolrQuery query = new SolrQuery();
        query.setFields(
                "meta.source.headline",
                "meta.source.text",
                "meta.source.keywords",
                "meta.extracted.text_nerl.ner.all"
        );
        query.setQuery("( meta.extracted.text_nerl.ner.all:*" + entity + "* ) OR " +
                "( meta.source.keywords:*" + entity + "* )");
        String language = "de";
        query.addFilterQuery("meta.source.inLanguage:\"" + language + "\"");

        query.setRows(Integer.MAX_VALUE);
        QueryResponse response;

        try {
            response = sm.solr.query(query);

            SolrDocumentList results = response.getResults();

            System.out.println(results.size());


        } catch (SolrServerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public int getTotalEntityFreq(String entity) {
        SolrQuery query = new SolrQuery();
        query.setFields(
                "meta.extracted.text_nerl.dbpedia.all"
        );
        query.setQuery("( meta.extracted.text_nerl.dbpedia.all:*" + entity + "* )");
        String source = "DW article";
        query.addFilterQuery("source:\"" + source + "\"");
        //query.addFilterQuery("meta.source.inLanguage:\"" + language + "\"");
        query.setRows(Integer.MAX_VALUE);
        QueryResponse response;

        try {
            response = sm.solr.query(query);

            SolrDocumentList results = response.getResults();

            return results.size();


        } catch (SolrServerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

    public void getEntityDF() throws IOException {

        SolrQuery query = new SolrQuery();
        query.setFields(
                "meta.extracted.text_nerl.dbpedia.all"
        );

        String source = "DW article";
        query.setQuery("( meta.extracted.text_nerl.dbpedia.all:* )");
        query.addFilterQuery("source:\"" + source + "\"");
        //String language = "fr";
        //query.addFilterQuery("meta.source.inLanguage:\"" + language + "\"");

        query.setRows(Integer.MAX_VALUE);
        QueryResponse response;


        try {
            response = sm.solr.query(query);
            SolrDocumentList results = response.getResults();

            int n = results.size();

            Map<String, Integer> dfmap = new HashMap();
            for (SolrDocument doc : results) {

                String nerstr = doc.getFieldValue("meta.extracted.text_nerl.dbpedia.all").toString();
                nerstr = clean(nerstr);
                String[] ners = nerstr.split(",");

                for (String ner : ners) {
                    if (!dfmap.containsKey(ner)) dfmap.put(ner, 1);
                    else dfmap.put(ner, dfmap.get(ner) + 1);
                }

            }


            StringBuffer sb = new StringBuffer();
            int i = 0;
            for (Map.Entry<String, Integer> entry : dfmap.entrySet()) {
                System.out.println(i++);
                double norm = Math.log(n / entry.getValue());
                sb.append(entry.getKey()).append("\t").append(entry.getValue())
                        .append("\t").append(norm).append("\n");

            }

            File f = new File("DW_entities.norm");
            Files.write(sb.toString(), f, Charsets.UTF_8);

        } catch (SolrServerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public Map<EntityKey, Integer> constructCoocGraph() {
        Map<EntityKey, Integer> coor_map = new HashMap<EntityKey, Integer>();

        SolrQuery query = new SolrQuery();
        query.setFields(
                "meta.extracted.text_nerl.dbpedia.all"
        );

        String source = "Twitter";
        query.setQuery("( meta.extracted.text_nerl.dbpedia.all:* )");
        query.addFilterQuery("source:\"" + source + "\"");
        //String language = "fr";
        //query.addFilterQuery("meta.source.inLanguage:\"" + language + "\"");

        query.setRows(Integer.MAX_VALUE);
        QueryResponse response;

        try {
            response = sm.solr.query(query);
            SolrDocumentList results = response.getResults();

            System.out.println(results.size());


            for (SolrDocument doc : results) {

                String nerstr = doc.getFieldValue("meta.extracted.text_nerl.dbpedia.all").toString();
                nerstr = clean(nerstr);
                String[] ners = nerstr.split(",");

                for (int i = 0; i < ners.length; i++) {
                    for (int j = i + 1; j < ners.length; j++) {
                        EntityKey key = new EntityKey(ners[i], ners[j]);
                        //System.out.println(key);
                        if (!coor_map.containsKey(key)) coor_map.put(key, 1);
                        else coor_map.put(key, coor_map.get(key) + 1);
                    }
                }

            }

            System.out.println(coor_map.size());
        } catch (SolrServerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return coor_map;

    }

    public void testMapKey() {
        HashMap<EntityKey, Integer> coor_map = new HashMap<EntityKey, Integer>();
        coor_map.put(new EntityKey("Belgien", "Deutschland"), 0);
        System.out.println(coor_map.size());
        if (coor_map.containsKey(new EntityKey("Deutschland", "Belgien")))
            System.out.println("aa");
        else System.out.println("bb");
    }

    public static void main(String[] args) throws IOException {
        EntityImp ei = new EntityImp();

        ei.getEntityDF();

//		Map<EntityKey,Integer> map = ei.constructCoocGraph();
//
//		StringBuffer sb = new StringBuffer();
//		for (Entry<EntityKey,Integer> e : map.entrySet()) {
//			sb.append(e.getKey().toString()).append("\t").append(e.getValue()).append("\n");
//		}

//		File f = new File("twitter_edge_all.list");
//		Files.write(sb.toString(), f, Charsets.UTF_8);

        ei.getTotalEntityFreq("Joachim_Sauer");
    }

    public String clean(String entity) {
        entity = entity.replaceAll("\\[", "");
        entity = entity.replaceAll("\\]", "");
        entity = entity.replace(" ", "");
        return entity;
    }


    class EntityKey {
        String e1;
        String e2;
        private final Set<String> set;

        public EntityKey(String e1, String e2) {
            this.e1 = e1;
            this.e2 = e2;
            set = new HashSet<String>();
            set.add(e1);
            set.add(e2);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this)
                return true;
            if (!(obj instanceof EntityKey))
                return false;
            return set.equals(((EntityKey) obj).set);
        }

        @Override
        public int hashCode() {
            return set.hashCode();
        }

        @Override
        public String toString() {
            return e1 + "\t" + e2;
        }
    }

    static <K, V extends Comparable<? super V>>
    List<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {

        List<Map.Entry<K, V>> sortedEntries = new ArrayList<Map.Entry<K, V>>(map.entrySet());

        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );

        return sortedEntries;
    }


}

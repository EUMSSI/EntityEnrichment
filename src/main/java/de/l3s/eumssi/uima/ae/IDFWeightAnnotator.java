package de.l3s.eumssi.uima.ae;

import de.l3s.eumssi.uima.ts.EEDBpediaResource;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.dbpedia.spotlight.uima.types.DBpediaResource;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.sparql.engine.http.QueryEngineHTTP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.apache.uima.fit.util.JCasUtil.select;

/**
 * The annotator that enriches one DBpedia resource with other DBpedia
 * resources using IDF attributes
 * Created by tumeteor on 02/11/16.
 */
public class IDFWeightAnnotator extends JCasAnnotator_ImplBase {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    public void process(JCas jCas) throws AnalysisEngineProcessException {

        // Caveat 1: Assuming the DBpedia resources are ready
        for (DBpediaResource res : select(jCas, DBpediaResource.class)) {

            // Caveat 2: Assuming the values in "text_nerl" come from Label attribute.
            String resName = res.getLabel();

            resName = resName.replaceAll(" ", "_");

            System.out.println("Name: " + resName);


            // construct the cross-lang dbpedia resource
            EEDBpediaResource a = new EEDBpediaResource(jCas,
                    res.getBegin(), res.getEnd());
            List<String> refs = new ArrayList<>();
            a.setContextualScore(res.getContextualScore());
            a.setFinalScore(res.getFinalScore());

            // Check this !
            a.setLabel(res.getLabel());

            a.setPercentageOfSecondRank(res.getPercentageOfSecondRank());
            a.setPriorScore(res.getPriorScore());
            a.setSupport(res.getSupport());
            a.setTypes(res.getTypes());
            a.setUri(res.getUri());
            a.addToIndexes();

            a.setEnref(res.getLabel());


            StringArray _refs = new StringArray(jCas, refs.size());

            for (int i = 0; i < refs.size(); i++) {
                _refs.set(i, refs.get(i));
            }

            a.setLangref(_refs);
        }

    }

}

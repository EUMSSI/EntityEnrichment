

/* First created by JCasGen Thu Jun 11 16:40:51 CEST 2015 */
package org.dbpedia.spotlight.uima.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat May 21 09:39:57 CEST 2016
 * XML source: /Users/tuan/L3S/Eumssi/code/crosslang-ned/src/main/resources/de/l3s/eumssi/uima/ts/CrosslangDBpediaResourceDescriptor.xml
 * @generated */
public class DBpediaResource extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DBpediaResource.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DBpediaResource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DBpediaResource(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DBpediaResource(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DBpediaResource(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: finalScore

  /** getter for finalScore - gets 
   * @generated
   * @return value of the feature 
   */
  public double getFinalScore() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_finalScore == null)
      jcasType.jcas.throwFeatMissing("finalScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_finalScore);}
    
  /** setter for finalScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFinalScore(double v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_finalScore == null)
      jcasType.jcas.throwFeatMissing("finalScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_finalScore, v);}    
   
    
  //*--------------*
  //* Feature: support

  /** getter for support - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSupport() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_support == null)
      jcasType.jcas.throwFeatMissing("support", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_support);}
    
  /** setter for support - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSupport(int v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_support == null)
      jcasType.jcas.throwFeatMissing("support", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setIntValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_support, v);}    
   
    
  //*--------------*
  //* Feature: types

  /** getter for types - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTypes() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_types);}
    
  /** setter for types - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypes(String v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_types, v);}    
   
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_uri);}
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_uri, v);}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: percentageOfSecondRank

  /** getter for percentageOfSecondRank - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPercentageOfSecondRank() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_percentageOfSecondRank == null)
      jcasType.jcas.throwFeatMissing("percentageOfSecondRank", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_percentageOfSecondRank);}
    
  /** setter for percentageOfSecondRank - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentageOfSecondRank(double v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_percentageOfSecondRank == null)
      jcasType.jcas.throwFeatMissing("percentageOfSecondRank", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_percentageOfSecondRank, v);}    
   
    
  //*--------------*
  //* Feature: contextualScore

  /** getter for contextualScore - gets 
   * @generated
   * @return value of the feature 
   */
  public double getContextualScore() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_contextualScore == null)
      jcasType.jcas.throwFeatMissing("contextualScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_contextualScore);}
    
  /** setter for contextualScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextualScore(double v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_contextualScore == null)
      jcasType.jcas.throwFeatMissing("contextualScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_contextualScore, v);}    
   
    
  //*--------------*
  //* Feature: priorScore

  /** getter for priorScore - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPriorScore() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_priorScore == null)
      jcasType.jcas.throwFeatMissing("priorScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_priorScore);}
    
  /** setter for priorScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPriorScore(double v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_priorScore == null)
      jcasType.jcas.throwFeatMissing("priorScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_priorScore, v);}    
  }

    
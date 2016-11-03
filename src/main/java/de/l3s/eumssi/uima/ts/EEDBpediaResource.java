

/* First created by JCasGen Thu Jun 11 16:28:13 CEST 2015 */
package de.l3s.eumssi.uima.ts;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.cas.StringArray;


import org.dbpedia.spotlight.uima.types.DBpediaResource;


/** The reference to cross-language resources of a given
        DBpedia resource
 * Updated by JCasGen Thu Jun 16 15:13:14 CEST 2016
 * XML source: /Users/Admin/Downloads/crosslang1/src/main/resources/de/l3s/eumssi/uima/ts/CrosslangDBpediaResourceDescriptor.xml
 * @generated */
public class EEDBpediaResource extends DBpediaResource {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EEDBpediaResource.class);
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
  protected EEDBpediaResource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EEDBpediaResource(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EEDBpediaResource(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EEDBpediaResource(JCas jcas, int begin, int end) {
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
  //* Feature: enref

  /** getter for enref - gets English reference
   * @generated
   * @return value of the feature 
   */
  public String getEnref() {
    if (EEDBpediaResource_Type.featOkTst && ((EEDBpediaResource_Type)jcasType).casFeat_enref == null)
      jcasType.jcas.throwFeatMissing("enref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_enref);}
    
  /** setter for enref - sets English reference 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnref(String v) {
    if (EEDBpediaResource_Type.featOkTst && ((EEDBpediaResource_Type)jcasType).casFeat_enref == null)
      jcasType.jcas.throwFeatMissing("enref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_enref, v);}
   
    
  //*--------------*
  //* Feature: langref

  /** getter for langref - gets List of references to cross-language resources
   * @generated
   * @return value of the feature 
   */
  public StringArray getLangref() {
    if (EEDBpediaResource_Type.featOkTst && ((EEDBpediaResource_Type)jcasType).casFeat_langref == null)
      jcasType.jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_langref)));}
    
  /** setter for langref - sets List of references to cross-language resources 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLangref(StringArray v) {
    if (EEDBpediaResource_Type.featOkTst && ((EEDBpediaResource_Type)jcasType).casFeat_langref == null)
      jcasType.jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    jcasType.ll_cas.ll_setRefValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_langref, jcasType.ll_cas.ll_getFSRef(v));}
    
  /** indexed getter for langref - gets an indexed value - List of references to cross-language resources
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getLangref(int i) {
    if (EEDBpediaResource_Type.featOkTst && ((EEDBpediaResource_Type)jcasType).casFeat_langref == null)
      jcasType.jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_langref), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_langref), i);}

  /** indexed setter for langref - sets an indexed value - List of references to cross-language resources
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setLangref(int i, String v) { 
    if (EEDBpediaResource_Type.featOkTst && ((EEDBpediaResource_Type)jcasType).casFeat_langref == null)
      jcasType.jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_langref), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EEDBpediaResource_Type)jcasType).casFeatCode_langref), i, v);}
  }

    
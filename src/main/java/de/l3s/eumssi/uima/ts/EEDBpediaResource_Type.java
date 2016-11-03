
/* First created by JCasGen Thu Jun 11 16:28:13 CEST 2015 */
package de.l3s.eumssi.uima.ts;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.dbpedia.spotlight.uima.types.DBpediaResource_Type;

/** The reference to cross-language resources of a given
        DBpedia resource
 * Updated by JCasGen Thu Jun 16 15:13:14 CEST 2016
 * @generated */
public class EEDBpediaResource_Type extends DBpediaResource_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EEDBpediaResource_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EEDBpediaResource_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EEDBpediaResource(addr, EEDBpediaResource_Type.this);
  			   EEDBpediaResource_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EEDBpediaResource(addr, EEDBpediaResource_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EEDBpediaResource.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.l3s.eumssi.uima.ts.EEDBpediaResource");
 
  /** @generated */
  final Feature casFeat_enref;
  /** @generated */
  final int     casFeatCode_enref;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEnref(int addr) {
        if (featOkTst && casFeat_enref == null)
      jcas.throwFeatMissing("enref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_enref);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnref(int addr, String v) {
        if (featOkTst && casFeat_enref == null)
      jcas.throwFeatMissing("enref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    ll_cas.ll_setStringValue(addr, casFeatCode_enref, v);}
    
  
 
  /** @generated */
  final Feature casFeat_langref;
  /** @generated */
  final int     casFeatCode_langref;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLangref(int addr) {
        if (featOkTst && casFeat_langref == null)
      jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    return ll_cas.ll_getRefValue(addr, casFeatCode_langref);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLangref(int addr, int v) {
        if (featOkTst && casFeat_langref == null)
      jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    ll_cas.ll_setRefValue(addr, casFeatCode_langref, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getLangref(int addr, int i) {
        if (featOkTst && casFeat_langref == null)
      jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_langref), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_langref), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_langref), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setLangref(int addr, int i, String v) {
        if (featOkTst && casFeat_langref == null)
      jcas.throwFeatMissing("langref", "de.l3s.eumssi.uima.ts.EEDBpediaResource");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_langref), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_langref), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_langref), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EEDBpediaResource_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_enref = jcas.getRequiredFeatureDE(casType, "enref", "uima.cas.String", featOkTst);
    casFeatCode_enref  = (null == casFeat_enref) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_enref).getCode();

 
    casFeat_langref = jcas.getRequiredFeatureDE(casType, "langref", "uima.cas.StringArray", featOkTst);
    casFeatCode_langref  = (null == casFeat_langref) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_langref).getCode();

  }
}



    
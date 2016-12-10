
/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Candidate Answer
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class CandidateAnswer_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (CandidateAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = CandidateAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new CandidateAnswer(addr, CandidateAnswer_Type.this);
  			   CandidateAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new CandidateAnswer(addr, CandidateAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CandidateAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
 
  /** @generated */
  final Feature casFeat_features;
  /** @generated */
  final int     casFeatCode_features;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFeatures(int addr) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_features);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatures(int addr, int v) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_features, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getFeatures(int addr, int i) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setFeatures(int addr, int i, int v) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_snippetIDs;
  /** @generated */
  final int     casFeatCode_snippetIDs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSnippetIDs(int addr) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSnippetIDs(int addr, int v) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_snippetIDs, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getSnippetIDs(int addr, int i) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i);
	return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSnippetIDs(int addr, int i, int v) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_passage;
  /** @generated */
  final int     casFeatCode_passage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPassage(int addr) {
        if (featOkTst && casFeat_passage == null)
      jcas.throwFeatMissing("passage", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_passage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassage(int addr, int v) {
        if (featOkTst && casFeat_passage == null)
      jcas.throwFeatMissing("passage", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_passage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_base;
  /** @generated */
  final int     casFeatCode_base;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBase(int addr) {
        if (featOkTst && casFeat_base == null)
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_base);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBase(int addr, int v) {
        if (featOkTst && casFeat_base == null)
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_base, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CandidateAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_features = jcas.getRequiredFeatureDE(casType, "features", "uima.cas.FSArray", featOkTst);
    casFeatCode_features  = (null == casFeat_features) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_features).getCode();

 
    casFeat_snippetIDs = jcas.getRequiredFeatureDE(casType, "snippetIDs", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_snippetIDs  = (null == casFeat_snippetIDs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_snippetIDs).getCode();

 
    casFeat_passage = jcas.getRequiredFeatureDE(casType, "passage", "cz.brmlab.yodaqa.model.SearchResult.Passage", featOkTst);
    casFeatCode_passage  = (null == casFeat_passage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passage).getCode();

 
    casFeat_base = jcas.getRequiredFeatureDE(casType, "base", "uima.tcas.Annotation", featOkTst);
    casFeatCode_base  = (null == casFeat_base) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_base).getCode();

  }
}



    
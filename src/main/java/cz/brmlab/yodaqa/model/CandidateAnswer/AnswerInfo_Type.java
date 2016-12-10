
/* First created by JCasGen Fri Dec 09 22:50:50 EST 2016 */
package cz.brmlab.yodaqa.model.CandidateAnswer;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Meta-information on the generated candidate answer
 * Updated by JCasGen Fri Dec 09 22:50:50 EST 2016
 * @generated */
public class AnswerInfo_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerInfo_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerInfo_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerInfo(addr, AnswerInfo_Type.this);
  			   AnswerInfo_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerInfo(addr, AnswerInfo_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerInfo.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
 
  /** @generated */
  final Feature casFeat_canonText;
  /** @generated */
  final int     casFeatCode_canonText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCanonText(int addr) {
        if (featOkTst && casFeat_canonText == null)
      jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_canonText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCanonText(int addr, String v) {
        if (featOkTst && casFeat_canonText == null)
      jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_canonText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerID;
  /** @generated */
  final int     casFeatCode_answerID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnswerID(int addr) {
        if (featOkTst && casFeat_answerID == null)
      jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerID(int addr, int v) {
        if (featOkTst && casFeat_answerID == null)
      jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerID, v);}
    
  
 
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
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSnippetIDs(int addr, int v) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    ll_cas.ll_setRefValue(addr, casFeatCode_snippetIDs, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getSnippetIDs(int addr, int i) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
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
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_resources;
  /** @generated */
  final int     casFeatCode_resources;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getResources(int addr) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return ll_cas.ll_getRefValue(addr, casFeatCode_resources);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setResources(int addr, int v) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    ll_cas.ll_setRefValue(addr, casFeatCode_resources, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getResources(int addr, int i) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setResources(int addr, int i, int v) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i, v);
  }
 
 
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
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return ll_cas.ll_getRefValue(addr, casFeatCode_features);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatures(int addr, int v) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    ll_cas.ll_setRefValue(addr, casFeatCode_features, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getFeatures(int addr, int i) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
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
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_isLast;
  /** @generated */
  final int     casFeatCode_isLast;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIsLast(int addr) {
        if (featOkTst && casFeat_isLast == null)
      jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_isLast);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsLast(int addr, int v) {
        if (featOkTst && casFeat_isLast == null)
      jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_isLast, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnswerInfo_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_canonText = jcas.getRequiredFeatureDE(casType, "canonText", "uima.cas.String", featOkTst);
    casFeatCode_canonText  = (null == casFeat_canonText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_canonText).getCode();

 
    casFeat_answerID = jcas.getRequiredFeatureDE(casType, "answerID", "uima.cas.Integer", featOkTst);
    casFeatCode_answerID  = (null == casFeat_answerID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerID).getCode();

 
    casFeat_snippetIDs = jcas.getRequiredFeatureDE(casType, "snippetIDs", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_snippetIDs  = (null == casFeat_snippetIDs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_snippetIDs).getCode();

 
    casFeat_resources = jcas.getRequiredFeatureDE(casType, "resources", "uima.cas.FSArray", featOkTst);
    casFeatCode_resources  = (null == casFeat_resources) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_resources).getCode();

 
    casFeat_features = jcas.getRequiredFeatureDE(casType, "features", "uima.cas.FSArray", featOkTst);
    casFeatCode_features  = (null == casFeat_features) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_features).getCode();

 
    casFeat_isLast = jcas.getRequiredFeatureDE(casType, "isLast", "uima.cas.Integer", featOkTst);
    casFeatCode_isLast  = (null == casFeat_isLast) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isLast).getCode();

  }
}



    
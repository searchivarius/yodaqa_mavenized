
/* First created by JCasGen Fri Dec 09 22:50:50 EST 2016 */
package cz.brmlab.yodaqa.model.AnswerHitlist;

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

/** Generated candidate answer
 * Updated by JCasGen Fri Dec 09 22:50:50 EST 2016
 * @generated */
public class Answer_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
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
      jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_canonText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCanonText(int addr, String v) {
        if (featOkTst && casFeat_canonText == null)
      jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
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
      jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerID(int addr, int v) {
        if (featOkTst && casFeat_answerID == null)
      jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
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
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSnippetIDs(int addr, int v) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_snippetIDs, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getSnippetIDs(int addr, int i) {
        if (featOkTst && casFeat_snippetIDs == null)
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
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
      jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_snippetIDs), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
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
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_resources);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setResources(int addr, int v) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_resources, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getResources(int addr, int i) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
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
      jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resources), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
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
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_features);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatures(int addr, int v) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_features, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getFeatures(int addr, int i) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
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
      jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_lats;
  /** @generated */
  final int     casFeatCode_lats;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLats(int addr) {
        if (featOkTst && casFeat_lats == null)
      jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lats);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLats(int addr, int v) {
        if (featOkTst && casFeat_lats == null)
      jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_lats, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getLats(int addr, int i) {
        if (featOkTst && casFeat_lats == null)
      jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lats), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_lats), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lats), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setLats(int addr, int i, int v) {
        if (featOkTst && casFeat_lats == null)
      jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lats), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_lats), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lats), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_focus;
  /** @generated */
  final int     casFeatCode_focus;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFocus(int addr) {
        if (featOkTst && casFeat_focus == null)
      jcas.throwFeatMissing("focus", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_focus);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFocus(int addr, String v) {
        if (featOkTst && casFeat_focus == null)
      jcas.throwFeatMissing("focus", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_focus, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_canonText = jcas.getRequiredFeatureDE(casType, "canonText", "uima.cas.String", featOkTst);
    casFeatCode_canonText  = (null == casFeat_canonText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_canonText).getCode();

 
    casFeat_answerID = jcas.getRequiredFeatureDE(casType, "answerID", "uima.cas.Integer", featOkTst);
    casFeatCode_answerID  = (null == casFeat_answerID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerID).getCode();

 
    casFeat_snippetIDs = jcas.getRequiredFeatureDE(casType, "snippetIDs", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_snippetIDs  = (null == casFeat_snippetIDs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_snippetIDs).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_resources = jcas.getRequiredFeatureDE(casType, "resources", "uima.cas.FSArray", featOkTst);
    casFeatCode_resources  = (null == casFeat_resources) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_resources).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_features = jcas.getRequiredFeatureDE(casType, "features", "uima.cas.FSArray", featOkTst);
    casFeatCode_features  = (null == casFeat_features) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_features).getCode();

 
    casFeat_lats = jcas.getRequiredFeatureDE(casType, "lats", "uima.cas.FSArray", featOkTst);
    casFeatCode_lats  = (null == casFeat_lats) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lats).getCode();

 
    casFeat_focus = jcas.getRequiredFeatureDE(casType, "focus", "uima.cas.String", featOkTst);
    casFeatCode_focus  = (null == casFeat_focus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_focus).getCode();

  }
}



    
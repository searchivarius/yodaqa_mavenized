
/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

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

/** Meta-information on the asked question
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class QuestionInfo_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionInfo_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionInfo_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionInfo(addr, QuestionInfo_Type.this);
  			   QuestionInfo_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionInfo(addr, QuestionInfo_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionInfo.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.Question.QuestionInfo");
 
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
      jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_questionId;
  /** @generated */
  final int     casFeatCode_questionId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuestionId(int addr) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_questionId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuestionId(int addr, String v) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_questionId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_questionType;
  /** @generated */
  final int     casFeatCode_questionType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuestionType(int addr) {
        if (featOkTst && casFeat_questionType == null)
      jcas.throwFeatMissing("questionType", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_questionType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuestionType(int addr, String v) {
        if (featOkTst && casFeat_questionType == null)
      jcas.throwFeatMissing("questionType", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_questionType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_questionText;
  /** @generated */
  final int     casFeatCode_questionText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuestionText(int addr) {
        if (featOkTst && casFeat_questionText == null)
      jcas.throwFeatMissing("questionText", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_questionText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuestionText(int addr, String v) {
        if (featOkTst && casFeat_questionText == null)
      jcas.throwFeatMissing("questionText", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_questionText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerPattern;
  /** @generated */
  final int     casFeatCode_answerPattern;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnswerPattern(int addr) {
        if (featOkTst && casFeat_answerPattern == null)
      jcas.throwFeatMissing("answerPattern", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_answerPattern);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerPattern(int addr, String v) {
        if (featOkTst && casFeat_answerPattern == null)
      jcas.throwFeatMissing("answerPattern", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_answerPattern, v);}
    
  
 
  /** @generated */
  final Feature casFeat_procBeginTime;
  /** @generated */
  final int     casFeatCode_procBeginTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getProcBeginTime(int addr) {
        if (featOkTst && casFeat_procBeginTime == null)
      jcas.throwFeatMissing("procBeginTime", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getLongValue(addr, casFeatCode_procBeginTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProcBeginTime(int addr, long v) {
        if (featOkTst && casFeat_procBeginTime == null)
      jcas.throwFeatMissing("procBeginTime", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setLongValue(addr, casFeatCode_procBeginTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_passE_scored;
  /** @generated */
  final int     casFeatCode_passE_scored;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPassE_scored(int addr) {
        if (featOkTst && casFeat_passE_scored == null)
      jcas.throwFeatMissing("passE_scored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_passE_scored);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassE_scored(int addr, int v) {
        if (featOkTst && casFeat_passE_scored == null)
      jcas.throwFeatMissing("passE_scored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_passE_scored, v);}
    
  
 
  /** @generated */
  final Feature casFeat_passE_gsscored;
  /** @generated */
  final int     casFeatCode_passE_gsscored;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPassE_gsscored(int addr) {
        if (featOkTst && casFeat_passE_gsscored == null)
      jcas.throwFeatMissing("passE_gsscored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_passE_gsscored);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassE_gsscored(int addr, int v) {
        if (featOkTst && casFeat_passE_gsscored == null)
      jcas.throwFeatMissing("passE_gsscored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_passE_gsscored, v);}
    
  
 
  /** @generated */
  final Feature casFeat_passE_picked;
  /** @generated */
  final int     casFeatCode_passE_picked;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPassE_picked(int addr) {
        if (featOkTst && casFeat_passE_picked == null)
      jcas.throwFeatMissing("passE_picked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_passE_picked);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassE_picked(int addr, int v) {
        if (featOkTst && casFeat_passE_picked == null)
      jcas.throwFeatMissing("passE_picked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_passE_picked, v);}
    
  
 
  /** @generated */
  final Feature casFeat_passE_gspicked;
  /** @generated */
  final int     casFeatCode_passE_gspicked;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPassE_gspicked(int addr) {
        if (featOkTst && casFeat_passE_gspicked == null)
      jcas.throwFeatMissing("passE_gspicked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_passE_gspicked);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassE_gspicked(int addr, int v) {
        if (featOkTst && casFeat_passE_gspicked == null)
      jcas.throwFeatMissing("passE_gspicked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_passE_gspicked, v);}
    
  
 
  /** @generated */
  final Feature casFeat_onlyArtificialConcepts;
  /** @generated */
  final int     casFeatCode_onlyArtificialConcepts;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getOnlyArtificialConcepts(int addr) {
        if (featOkTst && casFeat_onlyArtificialConcepts == null)
      jcas.throwFeatMissing("onlyArtificialConcepts", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_onlyArtificialConcepts);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOnlyArtificialConcepts(int addr, boolean v) {
        if (featOkTst && casFeat_onlyArtificialConcepts == null)
      jcas.throwFeatMissing("onlyArtificialConcepts", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_onlyArtificialConcepts, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuestionInfo_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_questionId = jcas.getRequiredFeatureDE(casType, "questionId", "uima.cas.String", featOkTst);
    casFeatCode_questionId  = (null == casFeat_questionId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionId).getCode();

 
    casFeat_questionType = jcas.getRequiredFeatureDE(casType, "questionType", "uima.cas.String", featOkTst);
    casFeatCode_questionType  = (null == casFeat_questionType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionType).getCode();

 
    casFeat_questionText = jcas.getRequiredFeatureDE(casType, "questionText", "uima.cas.String", featOkTst);
    casFeatCode_questionText  = (null == casFeat_questionText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionText).getCode();

 
    casFeat_answerPattern = jcas.getRequiredFeatureDE(casType, "answerPattern", "uima.cas.String", featOkTst);
    casFeatCode_answerPattern  = (null == casFeat_answerPattern) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerPattern).getCode();

 
    casFeat_procBeginTime = jcas.getRequiredFeatureDE(casType, "procBeginTime", "uima.cas.Long", featOkTst);
    casFeatCode_procBeginTime  = (null == casFeat_procBeginTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_procBeginTime).getCode();

 
    casFeat_passE_scored = jcas.getRequiredFeatureDE(casType, "passE_scored", "uima.cas.Integer", featOkTst);
    casFeatCode_passE_scored  = (null == casFeat_passE_scored) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passE_scored).getCode();

 
    casFeat_passE_gsscored = jcas.getRequiredFeatureDE(casType, "passE_gsscored", "uima.cas.Integer", featOkTst);
    casFeatCode_passE_gsscored  = (null == casFeat_passE_gsscored) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passE_gsscored).getCode();

 
    casFeat_passE_picked = jcas.getRequiredFeatureDE(casType, "passE_picked", "uima.cas.Integer", featOkTst);
    casFeatCode_passE_picked  = (null == casFeat_passE_picked) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passE_picked).getCode();

 
    casFeat_passE_gspicked = jcas.getRequiredFeatureDE(casType, "passE_gspicked", "uima.cas.Integer", featOkTst);
    casFeatCode_passE_gspicked  = (null == casFeat_passE_gspicked) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_passE_gspicked).getCode();

 
    casFeat_onlyArtificialConcepts = jcas.getRequiredFeatureDE(casType, "onlyArtificialConcepts", "uima.cas.Boolean", featOkTst);
    casFeatCode_onlyArtificialConcepts  = (null == casFeat_onlyArtificialConcepts) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_onlyArtificialConcepts).getCode();

  }
}



    


/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Meta-information on the asked question
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class QuestionInfo extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionInfo.class);
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
  protected QuestionInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuestionInfo(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuestionInfo(JCas jcas) {
    super(jcas);
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
  //* Feature: source

  /** getter for source - gets Data source identification
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Data source identification 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: questionId

  /** getter for questionId - gets ID of the question (specific to data source)
   * @generated
   * @return value of the feature 
   */
  public String getQuestionId() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_questionId);}
    
  /** setter for questionId - sets ID of the question (specific to data source) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionId(String v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_questionId, v);}    
   
    
  //*--------------*
  //* Feature: questionType

  /** getter for questionType - gets Type of question; "factoid", "list" or something else...; of course, this may be empty
   * @generated
   * @return value of the feature 
   */
  public String getQuestionType() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_questionType == null)
      jcasType.jcas.throwFeatMissing("questionType", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_questionType);}
    
  /** setter for questionType - sets Type of question; "factoid", "list" or something else...; of course, this may be empty 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionType(String v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_questionType == null)
      jcasType.jcas.throwFeatMissing("questionType", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_questionType, v);}    
   
    
  //*--------------*
  //* Feature: questionText

  /** getter for questionText - gets Text of question; redundant to QuestionCAS sofa, but useful in the final pipeline stages
   * @generated
   * @return value of the feature 
   */
  public String getQuestionText() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_questionText == null)
      jcasType.jcas.throwFeatMissing("questionText", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_questionText);}
    
  /** setter for questionText - sets Text of question; redundant to QuestionCAS sofa, but useful in the final pipeline stages 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionText(String v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_questionText == null)
      jcasType.jcas.throwFeatMissing("questionText", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_questionText, v);}    
   
    
  //*--------------*
  //* Feature: answerPattern

  /** getter for answerPattern - gets PCRE matching a valid answer; of course, this may be empty if the answer is unknown beforehand
   * @generated
   * @return value of the feature 
   */
  public String getAnswerPattern() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_answerPattern == null)
      jcasType.jcas.throwFeatMissing("answerPattern", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_answerPattern);}
    
  /** setter for answerPattern - sets PCRE matching a valid answer; of course, this may be empty if the answer is unknown beforehand 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerPattern(String v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_answerPattern == null)
      jcasType.jcas.throwFeatMissing("answerPattern", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_answerPattern, v);}    
   
    
  //*--------------*
  //* Feature: procBeginTime

  /** getter for procBeginTime - gets Time of processing start (as returned by System.currentTimeMillis()), for measuring answering speed
   * @generated
   * @return value of the feature 
   */
  public long getProcBeginTime() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_procBeginTime == null)
      jcasType.jcas.throwFeatMissing("procBeginTime", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getLongValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_procBeginTime);}
    
  /** setter for procBeginTime - sets Time of processing start (as returned by System.currentTimeMillis()), for measuring answering speed 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProcBeginTime(long v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_procBeginTime == null)
      jcasType.jcas.throwFeatMissing("procBeginTime", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setLongValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_procBeginTime, v);}    
   
    
  //*--------------*
  //* Feature: passE_scored

  /** getter for passE_scored - gets PassExtract statistics: Number of scored passages
   * @generated
   * @return value of the feature 
   */
  public int getPassE_scored() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_scored == null)
      jcasType.jcas.throwFeatMissing("passE_scored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_scored);}
    
  /** setter for passE_scored - sets PassExtract statistics: Number of scored passages 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassE_scored(int v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_scored == null)
      jcasType.jcas.throwFeatMissing("passE_scored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_scored, v);}    
   
    
  //*--------------*
  //* Feature: passE_gsscored

  /** getter for passE_gsscored - gets PassExtract statistics: Number of scored passages that match answerPattern
   * @generated
   * @return value of the feature 
   */
  public int getPassE_gsscored() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_gsscored == null)
      jcasType.jcas.throwFeatMissing("passE_gsscored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_gsscored);}
    
  /** setter for passE_gsscored - sets PassExtract statistics: Number of scored passages that match answerPattern 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassE_gsscored(int v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_gsscored == null)
      jcasType.jcas.throwFeatMissing("passE_gsscored", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_gsscored, v);}    
   
    
  //*--------------*
  //* Feature: passE_picked

  /** getter for passE_picked - gets PassExtract statistics: Number of picked passages
   * @generated
   * @return value of the feature 
   */
  public int getPassE_picked() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_picked == null)
      jcasType.jcas.throwFeatMissing("passE_picked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_picked);}
    
  /** setter for passE_picked - sets PassExtract statistics: Number of picked passages 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassE_picked(int v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_picked == null)
      jcasType.jcas.throwFeatMissing("passE_picked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_picked, v);}    
   
    
  //*--------------*
  //* Feature: passE_gspicked

  /** getter for passE_gspicked - gets PassExtract statistics: Number of picked passages that match answerPattern
   * @generated
   * @return value of the feature 
   */
  public int getPassE_gspicked() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_gspicked == null)
      jcasType.jcas.throwFeatMissing("passE_gspicked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_gspicked);}
    
  /** setter for passE_gspicked - sets PassExtract statistics: Number of picked passages that match answerPattern 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassE_gspicked(int v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_passE_gspicked == null)
      jcasType.jcas.throwFeatMissing("passE_gspicked", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_passE_gspicked, v);}    
   
    
  //*--------------*
  //* Feature: onlyArtificialConcepts

  /** getter for onlyArtificialConcepts - gets Don't execute concept linking stage on the question; concepts already come pre-determined along with the question from the collection reader
   * @generated
   * @return value of the feature 
   */
  public boolean getOnlyArtificialConcepts() {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_onlyArtificialConcepts == null)
      jcasType.jcas.throwFeatMissing("onlyArtificialConcepts", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_onlyArtificialConcepts);}
    
  /** setter for onlyArtificialConcepts - sets Don't execute concept linking stage on the question; concepts already come pre-determined along with the question from the collection reader 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOnlyArtificialConcepts(boolean v) {
    if (QuestionInfo_Type.featOkTst && ((QuestionInfo_Type)jcasType).casFeat_onlyArtificialConcepts == null)
      jcasType.jcas.throwFeatMissing("onlyArtificialConcepts", "cz.brmlab.yodaqa.model.Question.QuestionInfo");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((QuestionInfo_Type)jcasType).casFeatCode_onlyArtificialConcepts, v);}    
  }

    


/* First created by JCasGen Fri Dec 09 22:50:50 EST 2016 */
package cz.brmlab.yodaqa.model.AnswerHitlist;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import cz.brmlab.yodaqa.model.CandidateAnswer.AnswerFeature;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import cz.brmlab.yodaqa.model.CandidateAnswer.AnswerResource;
import cz.brmlab.yodaqa.model.TyCor.LAT;
import org.apache.uima.jcas.cas.IntegerArray;


/** Generated candidate answer
 * Updated by JCasGen Fri Dec 09 22:50:50 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/AnswerHitlistTypes_TS.xml
 * @generated */
public class Answer extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
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
  //* Feature: text

  /** getter for text - gets Text of the answer
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets Text of the answer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: canonText

  /** getter for canonText - gets Syntactically canonical form of the answer (without leading/trailing interpunction and the- and such)
   * @generated
   * @return value of the feature 
   */
  public String getCanonText() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_canonText == null)
      jcasType.jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_canonText);}
    
  /** setter for canonText - sets Syntactically canonical form of the answer (without leading/trailing interpunction and the- and such) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCanonText(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_canonText == null)
      jcasType.jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_canonText, v);}    
   
    
  //*--------------*
  //* Feature: answerID

  /** getter for answerID - gets ID of the candidateAnswer
   * @generated
   * @return value of the feature 
   */
  public int getAnswerID() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerID == null)
      jcasType.jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerID);}
    
  /** setter for answerID - sets ID of the candidateAnswer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerID(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerID == null)
      jcasType.jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerID, v);}    
   
    
  //*--------------*
  //* Feature: snippetIDs

  /** getter for snippetIDs - gets List of snippetIDs's used.
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getSnippetIDs() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_snippetIDs)));}
    
  /** setter for snippetIDs - sets List of snippetIDs's used. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSnippetIDs(IntegerArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_snippetIDs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for snippetIDs - gets an indexed value - List of snippetIDs's used.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getSnippetIDs(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_snippetIDs), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_snippetIDs), i);}

  /** indexed setter for snippetIDs - sets an indexed value - List of snippetIDs's used.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSnippetIDs(int i, int v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_snippetIDs), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_snippetIDs), i, v);}
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets Source of the candidate answer, either structured/fulltext search of wiki or freebase
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Source of the candidate answer, either structured/fulltext search of wiki or freebase 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: resources

  /** getter for resources - gets Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter.
   * @generated
   * @return value of the feature 
   */
  public FSArray getResources() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_resources)));}
    
  /** setter for resources - sets Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResources(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_resources, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for resources - gets an indexed value - Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerResource getResources(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_resources), i);
    return (AnswerResource)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_resources), i)));}

  /** indexed setter for resources - sets an indexed value - Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setResources(int i, AnswerResource v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_resources), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_resources), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Confidence of the answer; this is an estimate of the probability that the answer is right
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Confidence of the answer; this is an estimate of the probability that the answer is right 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: features

  /** getter for features - gets A set of features of this answer, see CandidateAnswerTypes.
   * @generated
   * @return value of the feature 
   */
  public FSArray getFeatures() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets A set of features of this answer, see CandidateAnswerTypes. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatures(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for features - gets an indexed value - A set of features of this answer, see CandidateAnswerTypes.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerFeature getFeatures(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features), i);
    return (AnswerFeature)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features), i)));}

  /** indexed setter for features - sets an indexed value - A set of features of this answer, see CandidateAnswerTypes.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeatures(int i, AnswerFeature v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_features), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: lats

  /** getter for lats - gets A set of LATs associated with this answer. These are simply LAT annotations copied from the candidate answer CAS.
   * @generated
   * @return value of the feature 
   */
  public FSArray getLats() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_lats == null)
      jcasType.jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_lats)));}
    
  /** setter for lats - sets A set of LATs associated with this answer. These are simply LAT annotations copied from the candidate answer CAS. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLats(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_lats == null)
      jcasType.jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_lats, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for lats - gets an indexed value - A set of LATs associated with this answer. These are simply LAT annotations copied from the candidate answer CAS.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public LAT getLats(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_lats == null)
      jcasType.jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_lats), i);
    return (LAT)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_lats), i)));}

  /** indexed setter for lats - sets an indexed value - A set of LATs associated with this answer. These are simply LAT annotations copied from the candidate answer CAS.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setLats(int i, LAT v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_lats == null)
      jcasType.jcas.throwFeatMissing("lats", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_lats), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_lats), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: focus

  /** getter for focus - gets The focus portion of the answer; typically a single word like the root noun or such.
   * @generated
   * @return value of the feature 
   */
  public String getFocus() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_focus == null)
      jcasType.jcas.throwFeatMissing("focus", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_focus);}
    
  /** setter for focus - sets The focus portion of the answer; typically a single word like the root noun or such. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFocus(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_focus == null)
      jcasType.jcas.throwFeatMissing("focus", "cz.brmlab.yodaqa.model.AnswerHitlist.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_focus, v);}    
  }

    


/* First created by JCasGen Fri Dec 09 22:50:50 EST 2016 */
package cz.brmlab.yodaqa.model.CandidateAnswer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.IntegerArray;


/** Meta-information on the generated candidate answer
 * Updated by JCasGen Fri Dec 09 22:50:50 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class AnswerInfo extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerInfo.class);
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
  protected AnswerInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerInfo(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerInfo(JCas jcas) {
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
  //* Feature: canonText

  /** getter for canonText - gets Syntactically canonical form of the answer (without leading/trailing interpunction and the- and such)
   * @generated
   * @return value of the feature 
   */
  public String getCanonText() {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_canonText == null)
      jcasType.jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_canonText);}
    
  /** setter for canonText - sets Syntactically canonical form of the answer (without leading/trailing interpunction and the- and such) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCanonText(String v) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_canonText == null)
      jcasType.jcas.throwFeatMissing("canonText", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_canonText, v);}    
   
    
  //*--------------*
  //* Feature: answerID

  /** getter for answerID - gets ID of the candidateAnswer
   * @generated
   * @return value of the feature 
   */
  public int getAnswerID() {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_answerID == null)
      jcasType.jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_answerID);}
    
  /** setter for answerID - sets ID of the candidateAnswer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerID(int v) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_answerID == null)
      jcasType.jcas.throwFeatMissing("answerID", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_answerID, v);}    
   
    
  //*--------------*
  //* Feature: snippetIDs

  /** getter for snippetIDs - gets List of snippetID's used.
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getSnippetIDs() {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_snippetIDs)));}
    
  /** setter for snippetIDs - sets List of snippetID's used. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSnippetIDs(IntegerArray v) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_snippetIDs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for snippetIDs - gets an indexed value - List of snippetID's used.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getSnippetIDs(int i) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_snippetIDs), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_snippetIDs), i);}

  /** indexed setter for snippetIDs - sets an indexed value - List of snippetID's used.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSnippetIDs(int i, int v) { 
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_snippetIDs), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_snippetIDs), i, v);}
   
    
  //*--------------*
  //* Feature: resources

  /** getter for resources - gets Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter.
   * @generated
   * @return value of the feature 
   */
  public FSArray getResources() {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_resources)));}
    
  /** setter for resources - sets Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResources(FSArray v) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_resources, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for resources - gets an indexed value - Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerResource getResources(int i) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_resources), i);
    return (AnswerResource)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_resources), i)));}

  /** indexed setter for resources - sets an indexed value - Set of resources corresponding to this answer. (There may be multiple, of course.) Duplicates should not appear, order should not matter.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setResources(int i, AnswerResource v) { 
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_resources), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_resources), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: features

  /** getter for features - gets A set of features of this answer. Unmatched features should simply not be present, and order does not matter. Duplicates should NOT appear.
   * @generated
   * @return value of the feature 
   */
  public FSArray getFeatures() {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets A set of features of this answer. Unmatched features should simply not be present, and order does not matter. Duplicates should NOT appear. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatures(FSArray v) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for features - gets an indexed value - A set of features of this answer. Unmatched features should simply not be present, and order does not matter. Duplicates should NOT appear.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerFeature getFeatures(int i) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_features), i);
    return (AnswerFeature)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_features), i)));}

  /** indexed setter for features - sets an indexed value - A set of features of this answer. Unmatched features should simply not be present, and order does not matter. Duplicates should NOT appear.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeatures(int i, AnswerFeature v) { 
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_features), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_features), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: isLast

  /** getter for isLast - gets If non-zero, this is the last candidate answer CAS and the value is #total generated CASes.
   * @generated
   * @return value of the feature 
   */
  public int getIsLast() {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_isLast == null)
      jcasType.jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_isLast);}
    
  /** setter for isLast - sets If non-zero, this is the last candidate answer CAS and the value is #total generated CASes. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsLast(int v) {
    if (AnswerInfo_Type.featOkTst && ((AnswerInfo_Type)jcasType).casFeat_isLast == null)
      jcasType.jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerInfo_Type)jcasType).casFeatCode_isLast, v);}    
  }

    


/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import cz.brmlab.yodaqa.model.CandidateAnswer.AnswerFeature;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** Interesting passages of the search result that will be examined in more detail.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class Passage extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Passage.class);
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
  protected Passage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Passage(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Passage(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Passage(JCas jcas, int begin, int end) {
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
  //* Feature: features

  /** getter for features - gets A set of features of this passage. Unmatched features need not be present, and order does not matter. Duplicates are also perfectly normal (e.g. multiple matching clues will generate copies of a feature) and are summed together.
   * @generated
   * @return value of the feature 
   */
  public FSArray getFeatures() {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets A set of features of this passage. Unmatched features need not be present, and order does not matter. Duplicates are also perfectly normal (e.g. multiple matching clues will generate copies of a feature) and are summed together. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatures(FSArray v) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.ll_cas.ll_setRefValue(addr, ((Passage_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for features - gets an indexed value - A set of features of this passage. Unmatched features need not be present, and order does not matter. Duplicates are also perfectly normal (e.g. multiple matching clues will generate copies of a feature) and are summed together.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public PassageFeature getFeatures(int i) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_features), i);
    return (PassageFeature)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_features), i)));}

  /** indexed setter for features - sets an indexed value - A set of features of this passage. Unmatched features need not be present, and order does not matter. Duplicates are also perfectly normal (e.g. multiple matching clues will generate copies of a feature) and are summed together.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeatures(int i, PassageFeature v) { 
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_features), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_features), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Score of the passage regarding relevance likelihood.
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Passage_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Score of the passage regarding relevance likelihood. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Passage_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: snippetID

  /** getter for snippetID - gets ID of corresponding snippet.
   * @generated
   * @return value of the feature 
   */
  public int getSnippetID() {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_snippetID == null)
      jcasType.jcas.throwFeatMissing("snippetID", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Passage_Type)jcasType).casFeatCode_snippetID);}
    
  /** setter for snippetID - sets ID of corresponding snippet. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSnippetID(int v) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_snippetID == null)
      jcasType.jcas.throwFeatMissing("snippetID", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.ll_cas.ll_setIntValue(addr, ((Passage_Type)jcasType).casFeatCode_snippetID, v);}    
   
    
  //*--------------*
  //* Feature: ansfeatures

  /** getter for ansfeatures - gets A set of answer features that should be inherited by all answers generated from this passage.
   * @generated
   * @return value of the feature 
   */
  public FSArray getAnsfeatures() {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_ansfeatures)));}
    
  /** setter for ansfeatures - sets A set of answer features that should be inherited by all answers generated from this passage. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnsfeatures(FSArray v) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.ll_cas.ll_setRefValue(addr, ((Passage_Type)jcasType).casFeatCode_ansfeatures, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ansfeatures - gets an indexed value - A set of answer features that should be inherited by all answers generated from this passage.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerFeature getAnsfeatures(int i) {
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_ansfeatures), i);
    return (AnswerFeature)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_ansfeatures), i)));}

  /** indexed setter for ansfeatures - sets an indexed value - A set of answer features that should be inherited by all answers generated from this passage.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAnsfeatures(int i, AnswerFeature v) { 
    if (Passage_Type.featOkTst && ((Passage_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.Passage");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_ansfeatures), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Passage_Type)jcasType).casFeatCode_ansfeatures), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    
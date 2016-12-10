

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import cz.brmlab.yodaqa.model.CandidateAnswer.AnswerFeature;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.IntegerArray;


/** Candidate Answer
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class CandidateAnswer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CandidateAnswer.class);
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
  protected CandidateAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CandidateAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CandidateAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CandidateAnswer(JCas jcas, int begin, int end) {
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

  /** getter for features - gets A set of features of this answer, see CandidateAnswerTypes.
   * @generated
   * @return value of the feature 
   */
  public FSArray getFeatures() {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets A set of features of this answer, see CandidateAnswerTypes. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatures(FSArray v) {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for features - gets an indexed value - A set of features of this answer, see CandidateAnswerTypes.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerFeature getFeatures(int i) {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_features), i);
    return (AnswerFeature)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_features), i)));}

  /** indexed setter for features - sets an indexed value - A set of features of this answer, see CandidateAnswerTypes.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeatures(int i, AnswerFeature v) { 
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_features), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_features), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: snippetIDs

  /** getter for snippetIDs - gets List of snippetID's used in creating this answer, may be more than one.
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getSnippetIDs() {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_snippetIDs)));}
    
  /** setter for snippetIDs - sets List of snippetID's used in creating this answer, may be more than one. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSnippetIDs(IntegerArray v) {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_snippetIDs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for snippetIDs - gets an indexed value - List of snippetID's used in creating this answer, may be more than one.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getSnippetIDs(int i) {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_snippetIDs), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_snippetIDs), i);}

  /** indexed setter for snippetIDs - sets an indexed value - List of snippetID's used in creating this answer, may be more than one.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSnippetIDs(int i, int v) { 
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_snippetIDs == null)
      jcasType.jcas.throwFeatMissing("snippetIDs", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_snippetIDs), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_snippetIDs), i, v);}
   
    
  //*--------------*
  //* Feature: passage

  /** getter for passage - gets The passage this answer belongs to. (Or one of them.)
   * @generated
   * @return value of the feature 
   */
  public Passage getPassage() {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_passage == null)
      jcasType.jcas.throwFeatMissing("passage", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return (Passage)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_passage)));}
    
  /** setter for passage - sets The passage this answer belongs to. (Or one of them.) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassage(Passage v) {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_passage == null)
      jcasType.jcas.throwFeatMissing("passage", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_passage, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: base

  /** getter for base - gets The annotation (or one of them) that eventually spawned this answer.
   * @generated
   * @return value of the feature 
   */
  public Annotation getBase() {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_base)));}
    
  /** setter for base - sets The annotation (or one of them) that eventually spawned this answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase(Annotation v) {
    if (CandidateAnswer_Type.featOkTst && ((CandidateAnswer_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.SearchResult.CandidateAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((CandidateAnswer_Type)jcasType).casFeatCode_base, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
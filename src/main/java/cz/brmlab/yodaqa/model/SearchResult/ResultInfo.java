

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import cz.brmlab.yodaqa.model.CandidateAnswer.AnswerFeature;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** Meta-information on the retrieved search result
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class ResultInfo extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ResultInfo.class);
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
  protected ResultInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ResultInfo(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ResultInfo(JCas jcas) {
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
  //* Feature: relevance

  /** getter for relevance - gets Relevance of the result; a metric between [0,1]
   * @generated
   * @return value of the feature 
   */
  public double getRelevance() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_relevance == null)
      jcasType.jcas.throwFeatMissing("relevance", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_relevance);}
    
  /** setter for relevance - sets Relevance of the result; a metric between [0,1] 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelevance(double v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_relevance == null)
      jcasType.jcas.throwFeatMissing("relevance", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_relevance, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets The name of the data source.
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets The name of the data source. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: documentId

  /** getter for documentId - gets ID of the document (specific to data source)
   * @generated
   * @return value of the feature 
   */
  public String getDocumentId() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_documentId == null)
      jcasType.jcas.throwFeatMissing("documentId", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_documentId);}
    
  /** setter for documentId - sets ID of the document (specific to data source) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentId(String v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_documentId == null)
      jcasType.jcas.throwFeatMissing("documentId", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_documentId, v);}    
   
    
  //*--------------*
  //* Feature: sourceID

  /** getter for sourceID - gets ID used to refer to this search result as an AnswerSource in the dashboard.
   * @generated
   * @return value of the feature 
   */
  public int getSourceID() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_sourceID == null)
      jcasType.jcas.throwFeatMissing("sourceID", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_sourceID);}
    
  /** setter for sourceID - sets ID used to refer to this search result as an AnswerSource in the dashboard. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceID(int v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_sourceID == null)
      jcasType.jcas.throwFeatMissing("sourceID", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_sourceID, v);}    
   
    
  //*--------------*
  //* Feature: documentTitle

  /** getter for documentTitle - gets Title of the document
   * @generated
   * @return value of the feature 
   */
  public String getDocumentTitle() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_documentTitle == null)
      jcasType.jcas.throwFeatMissing("documentTitle", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_documentTitle);}
    
  /** setter for documentTitle - sets Title of the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentTitle(String v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_documentTitle == null)
      jcasType.jcas.throwFeatMissing("documentTitle", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_documentTitle, v);}    
   
    
  //*--------------*
  //* Feature: isLast

  /** getter for isLast - gets If non-zero, this is the last search result CAS and the value is #total generated CASes.
   * @generated
   * @return value of the feature 
   */
  public int getIsLast() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_isLast == null)
      jcasType.jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_isLast);}
    
  /** setter for isLast - sets If non-zero, this is the last search result CAS and the value is #total generated CASes. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsLast(int v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_isLast == null)
      jcasType.jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_isLast, v);}    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets Originating annotator name
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_origin);}
    
  /** setter for origin - sets Originating annotator name 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_origin, v);}    
   
    
  //*--------------*
  //* Feature: ansfeatures

  /** getter for ansfeatures - gets A set of answer features that should be inherited by all answers generated from this result.
   * @generated
   * @return value of the feature 
   */
  public FSArray getAnsfeatures() {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_ansfeatures)));}
    
  /** setter for ansfeatures - sets A set of answer features that should be inherited by all answers generated from this result. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnsfeatures(FSArray v) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.ll_cas.ll_setRefValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_ansfeatures, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ansfeatures - gets an indexed value - A set of answer features that should be inherited by all answers generated from this result.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerFeature getAnsfeatures(int i) {
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_ansfeatures), i);
    return (AnswerFeature)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_ansfeatures), i)));}

  /** indexed setter for ansfeatures - sets an indexed value - A set of answer features that should be inherited by all answers generated from this result.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAnsfeatures(int i, AnswerFeature v) { 
    if (ResultInfo_Type.featOkTst && ((ResultInfo_Type)jcasType).casFeat_ansfeatures == null)
      jcasType.jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_ansfeatures), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ResultInfo_Type)jcasType).casFeatCode_ansfeatures), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    
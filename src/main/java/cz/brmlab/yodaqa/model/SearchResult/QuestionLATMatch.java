

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.jcas.tcas.Annotation;
import cz.brmlab.yodaqa.model.TyCor.LAT;


/** Match of a question LAT; this is data for essentially a super-rough TyCor that expects the type word near the answer text.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class QuestionLATMatch extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionLATMatch.class);
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
  protected QuestionLATMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuestionLATMatch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuestionLATMatch(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuestionLATMatch(JCas jcas, int begin, int end) {
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
  //* Feature: baseToken

  /** getter for baseToken - gets The matched passage token.
   * @generated
   * @return value of the feature 
   */
  public Token getBaseToken() {
    if (QuestionLATMatch_Type.featOkTst && ((QuestionLATMatch_Type)jcasType).casFeat_baseToken == null)
      jcasType.jcas.throwFeatMissing("baseToken", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuestionLATMatch_Type)jcasType).casFeatCode_baseToken)));}
    
  /** setter for baseToken - sets The matched passage token. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseToken(Token v) {
    if (QuestionLATMatch_Type.featOkTst && ((QuestionLATMatch_Type)jcasType).casFeat_baseToken == null)
      jcasType.jcas.throwFeatMissing("baseToken", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((QuestionLATMatch_Type)jcasType).casFeatCode_baseToken, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: baseLAT

  /** getter for baseLAT - gets The matched question LAT.
   * @generated
   * @return value of the feature 
   */
  public LAT getBaseLAT() {
    if (QuestionLATMatch_Type.featOkTst && ((QuestionLATMatch_Type)jcasType).casFeat_baseLAT == null)
      jcasType.jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    return (LAT)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuestionLATMatch_Type)jcasType).casFeatCode_baseLAT)));}
    
  /** setter for baseLAT - sets The matched question LAT. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseLAT(LAT v) {
    if (QuestionLATMatch_Type.featOkTst && ((QuestionLATMatch_Type)jcasType).casFeat_baseLAT == null)
      jcasType.jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((QuestionLATMatch_Type)jcasType).casFeatCode_baseLAT, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
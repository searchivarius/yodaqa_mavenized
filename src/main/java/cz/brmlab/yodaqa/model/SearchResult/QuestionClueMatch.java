

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import cz.brmlab.yodaqa.model.Question.Clue;
import org.apache.uima.jcas.tcas.Annotation;


/** Match of a question clue for transfoer to answer features (based on neighborhood, parse tree path etc.).
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class QuestionClueMatch extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionClueMatch.class);
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
  protected QuestionClueMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuestionClueMatch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuestionClueMatch(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuestionClueMatch(JCas jcas, int begin, int end) {
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
  //* Feature: baseClue

  /** getter for baseClue - gets The matched question clue.
   * @generated
   * @return value of the feature 
   */
  public Clue getBaseClue() {
    if (QuestionClueMatch_Type.featOkTst && ((QuestionClueMatch_Type)jcasType).casFeat_baseClue == null)
      jcasType.jcas.throwFeatMissing("baseClue", "cz.brmlab.yodaqa.model.SearchResult.QuestionClueMatch");
    return (Clue)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuestionClueMatch_Type)jcasType).casFeatCode_baseClue)));}
    
  /** setter for baseClue - sets The matched question clue. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseClue(Clue v) {
    if (QuestionClueMatch_Type.featOkTst && ((QuestionClueMatch_Type)jcasType).casFeat_baseClue == null)
      jcasType.jcas.throwFeatMissing("baseClue", "cz.brmlab.yodaqa.model.SearchResult.QuestionClueMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((QuestionClueMatch_Type)jcasType).casFeatCode_baseClue, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
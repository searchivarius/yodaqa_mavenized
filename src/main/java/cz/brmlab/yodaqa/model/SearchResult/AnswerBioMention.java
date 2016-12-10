

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A detected mention of answer in passage detected by B-I-O token tagging.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class AnswerBioMention extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerBioMention.class);
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
  protected AnswerBioMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerBioMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerBioMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerBioMention(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets Confidence score generated by the tagger.
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (AnswerBioMention_Type.featOkTst && ((AnswerBioMention_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.SearchResult.AnswerBioMention");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerBioMention_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Confidence score generated by the tagger. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (AnswerBioMention_Type.featOkTst && ((AnswerBioMention_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.SearchResult.AnswerBioMention");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerBioMention_Type)jcasType).casFeatCode_score, v);}    
  }

    
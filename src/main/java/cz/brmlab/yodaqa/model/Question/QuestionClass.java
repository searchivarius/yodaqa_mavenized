

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Information about question class
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class QuestionClass extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionClass.class);
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
  protected QuestionClass() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuestionClass(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuestionClass(JCas jcas) {
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
  //* Feature: questionClass

  /** getter for questionClass - gets Class of question; "ABBR", "DESC", "ENTY", "HUM", "LOC", "NUM"
   * @generated
   * @return value of the feature 
   */
  public String getQuestionClass() {
    if (QuestionClass_Type.featOkTst && ((QuestionClass_Type)jcasType).casFeat_questionClass == null)
      jcasType.jcas.throwFeatMissing("questionClass", "cz.brmlab.yodaqa.model.Question.QuestionClass");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionClass_Type)jcasType).casFeatCode_questionClass);}
    
  /** setter for questionClass - sets Class of question; "ABBR", "DESC", "ENTY", "HUM", "LOC", "NUM" 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionClass(String v) {
    if (QuestionClass_Type.featOkTst && ((QuestionClass_Type)jcasType).casFeat_questionClass == null)
      jcasType.jcas.throwFeatMissing("questionClass", "cz.brmlab.yodaqa.model.Question.QuestionClass");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionClass_Type)jcasType).casFeatCode_questionClass, v);}    
  }

    
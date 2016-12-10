

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Question Clue. A collection of clues is what supports search for answer-bearing passages. This is a base type that is never directly instantiated, though; subtypes representing various kinds of clues are.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class Clue extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Clue.class);
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
  protected Clue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Clue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Clue(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Clue(JCas jcas, int begin, int end) {
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
  //* Feature: base

  /** getter for base - gets The corresponding token/constituent.
   * @generated
   * @return value of the feature 
   */
  public Annotation getBase() {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Clue");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Clue_Type)jcasType).casFeatCode_base)));}
    
  /** setter for base - sets The corresponding token/constituent. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase(Annotation v) {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Clue");
    jcasType.ll_cas.ll_setRefValue(addr, ((Clue_Type)jcasType).casFeatCode_base, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: weight

  /** getter for weight - gets The more specific, selective or reliable the clue is, the higher weight it should get. Baseline weight is 1.0.
   * @generated
   * @return value of the feature 
   */
  public double getWeight() {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "cz.brmlab.yodaqa.model.Question.Clue");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Clue_Type)jcasType).casFeatCode_weight);}
    
  /** setter for weight - sets The more specific, selective or reliable the clue is, the higher weight it should get. Baseline weight is 1.0. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWeight(double v) {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "cz.brmlab.yodaqa.model.Question.Clue");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Clue_Type)jcasType).casFeatCode_weight, v);}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets Text of the clue.  Mostly, this is the same as getCoveredText() output, but some clues may expand or contract abbreviations, or in case of synsets or redirects, the name of the concept may be different (e.g. Wikipedia page title; "spacecraft" is covered, but an additional clue for "spaceship" is generated).
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "cz.brmlab.yodaqa.model.Question.Clue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Clue_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets Text of the clue.  Mostly, this is the same as getCoveredText() output, but some clues may expand or contract abbreviations, or in case of synsets or redirects, the name of the concept may be different (e.g. Wikipedia page title; "spacecraft" is covered, but an additional clue for "spaceship" is generated). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "cz.brmlab.yodaqa.model.Question.Clue");
    jcasType.ll_cas.ll_setStringValue(addr, ((Clue_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: isReliable

  /** getter for isReliable - gets Whether the clue label is reliable, i.e. can be used as a _required_ term during a search query.
   * @generated
   * @return value of the feature 
   */
  public boolean getIsReliable() {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_isReliable == null)
      jcasType.jcas.throwFeatMissing("isReliable", "cz.brmlab.yodaqa.model.Question.Clue");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Clue_Type)jcasType).casFeatCode_isReliable);}
    
  /** setter for isReliable - sets Whether the clue label is reliable, i.e. can be used as a _required_ term during a search query. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsReliable(boolean v) {
    if (Clue_Type.featOkTst && ((Clue_Type)jcasType).casFeat_isReliable == null)
      jcasType.jcas.throwFeatMissing("isReliable", "cz.brmlab.yodaqa.model.Question.Clue");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Clue_Type)jcasType).casFeatCode_isReliable, v);}    
  }

    
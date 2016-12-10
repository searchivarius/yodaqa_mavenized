

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A feature matched on a particular passage. This type is for sub-classing to particular features.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class PassageFeature extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PassageFeature.class);
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
  protected PassageFeature() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PassageFeature(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PassageFeature(JCas jcas) {
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
  //* Feature: value

  /** getter for value - gets Feature value. Unmatched features are assumed 0. Ideally, the feature value should be in the interval of [0,1], but this is not enforced.
   * @generated
   * @return value of the feature 
   */
  public double getValue() {
    if (PassageFeature_Type.featOkTst && ((PassageFeature_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "cz.brmlab.yodaqa.model.SearchResult.PassageFeature");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((PassageFeature_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets Feature value. Unmatched features are assumed 0. Ideally, the feature value should be in the interval of [0,1], but this is not enforced. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    if (PassageFeature_Type.featOkTst && ((PassageFeature_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "cz.brmlab.yodaqa.model.SearchResult.PassageFeature");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((PassageFeature_Type)jcasType).casFeatCode_value, v);}    
  }

    
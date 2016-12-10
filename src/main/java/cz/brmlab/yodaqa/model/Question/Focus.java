

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.jcas.tcas.Annotation;


/** Question Focus; e.g. in "What site did Lindbergh begin his flight from?", "site" is the focus.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class Focus extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Focus.class);
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
  protected Focus() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Focus(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Focus(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Focus(JCas jcas, int begin, int end) {
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

  /** getter for base - gets The corresponding token/constituent/dependency/NamedEntity/...
   * @generated
   * @return value of the feature 
   */
  public Annotation getBase() {
    if (Focus_Type.featOkTst && ((Focus_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Focus");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Focus_Type)jcasType).casFeatCode_base)));}
    
  /** setter for base - sets The corresponding token/constituent/dependency/NamedEntity/... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase(Annotation v) {
    if (Focus_Type.featOkTst && ((Focus_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Focus");
    jcasType.ll_cas.ll_setRefValue(addr, ((Focus_Type)jcasType).casFeatCode_base, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets The corresponding token.
   * @generated
   * @return value of the feature 
   */
  public Token getToken() {
    if (Focus_Type.featOkTst && ((Focus_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "cz.brmlab.yodaqa.model.Question.Focus");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Focus_Type)jcasType).casFeatCode_token)));}
    
  /** setter for token - sets The corresponding token. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToken(Token v) {
    if (Focus_Type.featOkTst && ((Focus_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "cz.brmlab.yodaqa.model.Question.Focus");
    jcasType.ll_cas.ll_setRefValue(addr, ((Focus_Type)jcasType).casFeatCode_token, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
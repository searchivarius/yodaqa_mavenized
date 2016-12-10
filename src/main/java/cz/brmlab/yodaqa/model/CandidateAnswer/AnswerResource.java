

/* First created by JCasGen Fri Dec 09 22:50:50 EST 2016 */
package cz.brmlab.yodaqa.model.CandidateAnswer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A resource (e.g. DBpedia, Freebase, enwiki article) corresponding to an answer.
 * Updated by JCasGen Fri Dec 09 22:50:50 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/SearchResultTypes_TS.xml
 * @generated */
public class AnswerResource extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerResource.class);
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
  protected AnswerResource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerResource(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerResource(JCas jcas) {
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
  //* Feature: iri

  /** getter for iri - gets The IRI (resource identifier, think URL) of the resource.
   * @generated
   * @return value of the feature 
   */
  public String getIri() {
    if (AnswerResource_Type.featOkTst && ((AnswerResource_Type)jcasType).casFeat_iri == null)
      jcasType.jcas.throwFeatMissing("iri", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerResource_Type)jcasType).casFeatCode_iri);}
    
  /** setter for iri - sets The IRI (resource identifier, think URL) of the resource. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIri(String v) {
    if (AnswerResource_Type.featOkTst && ((AnswerResource_Type)jcasType).casFeat_iri == null)
      jcasType.jcas.throwFeatMissing("iri", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerResource_Type)jcasType).casFeatCode_iri, v);}    
  }

    
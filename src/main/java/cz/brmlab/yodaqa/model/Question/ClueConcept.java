

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Clue representing a concept (identified by corresponding wikipedia title). This is born out of ClueNE or CluePhrase and linked to a set of Concept objects.carries information about the concept (page id and label - title).
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class ClueConcept extends Clue {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ClueConcept.class);
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
  protected ClueConcept() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ClueConcept(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ClueConcept(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ClueConcept(JCas jcas, int begin, int end) {
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
  //* Feature: concepts

  /** getter for concepts - gets List of concepts that generate this concept clue. If we have multiple concepts like "Frozen (2003 film)" and "Frozen (2015 film)", we'll produce just a single concept clue "Frozen" from that.
   * @generated
   * @return value of the feature 
   */
  public FSList getConcepts() {
    if (ClueConcept_Type.featOkTst && ((ClueConcept_Type)jcasType).casFeat_concepts == null)
      jcasType.jcas.throwFeatMissing("concepts", "cz.brmlab.yodaqa.model.Question.ClueConcept");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ClueConcept_Type)jcasType).casFeatCode_concepts)));}
    
  /** setter for concepts - sets List of concepts that generate this concept clue. If we have multiple concepts like "Frozen (2003 film)" and "Frozen (2015 film)", we'll produce just a single concept clue "Frozen" from that. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcepts(FSList v) {
    if (ClueConcept_Type.featOkTst && ((ClueConcept_Type)jcasType).casFeat_concepts == null)
      jcasType.jcas.throwFeatMissing("concepts", "cz.brmlab.yodaqa.model.Question.ClueConcept");
    jcasType.ll_cas.ll_setRefValue(addr, ((ClueConcept_Type)jcasType).casFeatCode_concepts, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
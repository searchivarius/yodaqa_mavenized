

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.TyCor;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;
import org.apache.uima.jcas.tcas.Annotation;


/** Lexical Answer Type; e.g. "Who was the first king
		of Bohemia?" can generate LATs "king";
		"Who invented the transistor?" can generate LATs "person"
		or "inventor".
		Some LATs are generated from the question itself while
		others are derived from other LATs/clues.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class LAT extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LAT.class);
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
  protected LAT() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LAT(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LAT(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LAT(JCas jcas, int begin, int end) {
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
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LAT_Type)jcasType).casFeatCode_base)));}
    
  /** setter for base - sets The corresponding token/constituent. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase(Annotation v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setRefValue(addr, ((LAT_Type)jcasType).casFeatCode_base, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets The part-of-speech POS tag of this LAT.
   * @generated
   * @return value of the feature 
   */
  public POS getPos() {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return (POS)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LAT_Type)jcasType).casFeatCode_pos)));}
    
  /** setter for pos - sets The part-of-speech POS tag of this LAT. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(POS v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setRefValue(addr, ((LAT_Type)jcasType).casFeatCode_pos, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The LAT string; this may not be the same as covered text, e.g. an LAT generated from "who" is a "person".
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LAT_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets The LAT string; this may not be the same as covered text, e.g. an LAT generated from "who" is a "person". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setStringValue(addr, ((LAT_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: synset

  /** getter for synset - gets A WordNet synset ID of the sense that corresponds to this LAT.  This can be null if the LAT is not anchored in a wordnet sense.
   * @generated
   * @return value of the feature 
   */
  public long getSynset() {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_synset == null)
      jcasType.jcas.throwFeatMissing("synset", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return jcasType.ll_cas.ll_getLongValue(addr, ((LAT_Type)jcasType).casFeatCode_synset);}
    
  /** setter for synset - sets A WordNet synset ID of the sense that corresponds to this LAT.  This can be null if the LAT is not anchored in a wordnet sense. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSynset(long v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_synset == null)
      jcasType.jcas.throwFeatMissing("synset", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setLongValue(addr, ((LAT_Type)jcasType).casFeatCode_synset, v);}    
   
    
  //*--------------*
  //* Feature: specificity

  /** getter for specificity - gets A value determining how specific this is; 0 is most specific and progressive negative numbers indicate reduced specificity; in some equations, this value might be an exponent for exponentially decaying specificity. The idea is that "inventor" may get 0, "creator" -1, "person" -5, "entity" -10 or something like that.
   * @generated
   * @return value of the feature 
   */
  public double getSpecificity() {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_specificity == null)
      jcasType.jcas.throwFeatMissing("specificity", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((LAT_Type)jcasType).casFeatCode_specificity);}
    
  /** setter for specificity - sets A value determining how specific this is; 0 is most specific and progressive negative numbers indicate reduced specificity; in some equations, this value might be an exponent for exponentially decaying specificity. The idea is that "inventor" may get 0, "creator" -1, "person" -5, "entity" -10 or something like that. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpecificity(double v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_specificity == null)
      jcasType.jcas.throwFeatMissing("specificity", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((LAT_Type)jcasType).casFeatCode_specificity, v);}    
   
    
  //*--------------*
  //* Feature: baseLAT

  /** getter for baseLAT - gets If this LAT was derived from another, the original LAT.
   * @generated
   * @return value of the feature 
   */
  public LAT getBaseLAT() {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_baseLAT == null)
      jcasType.jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return (LAT)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LAT_Type)jcasType).casFeatCode_baseLAT)));}
    
  /** setter for baseLAT - sets If this LAT was derived from another, the original LAT. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseLAT(LAT v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_baseLAT == null)
      jcasType.jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setRefValue(addr, ((LAT_Type)jcasType).casFeatCode_baseLAT, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: isHierarchical

  /** getter for isHierarchical - gets True if this LAT is part of a specificity hierarchy.  E.g. LAT generated by focus or evidence match is not, while LAT generated by WordNet or YAGO is.  This allows e.g. WordNet specificity matcher to match between WordNet and non-hierarchical LATs, but not between WordNet and YAGO LATs (which would be rather messy).
   * @generated
   * @return value of the feature 
   */
  public boolean getIsHierarchical() {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_isHierarchical == null)
      jcasType.jcas.throwFeatMissing("isHierarchical", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((LAT_Type)jcasType).casFeatCode_isHierarchical);}
    
  /** setter for isHierarchical - sets True if this LAT is part of a specificity hierarchy.  E.g. LAT generated by focus or evidence match is not, while LAT generated by WordNet or YAGO is.  This allows e.g. WordNet specificity matcher to match between WordNet and non-hierarchical LATs, but not between WordNet and YAGO LATs (which would be rather messy). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsHierarchical(boolean v) {
    if (LAT_Type.featOkTst && ((LAT_Type)jcasType).casFeat_isHierarchical == null)
      jcasType.jcas.throwFeatMissing("isHierarchical", "cz.brmlab.yodaqa.model.TyCor.LAT");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((LAT_Type)jcasType).casFeatCode_isHierarchical, v);}    
  }

    
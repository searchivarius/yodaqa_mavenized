

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Concept is basically a Wikipedia article, labelled by its full title and the label somehow occurring in the question text.  This is a strong indicator of the question topic, which in turn helps choose appropriate information sources.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * XML source: /home/leo/SourceTree3dParty/yodaqa-1.6/src/main/typesystem/TyCorTypes_TS.xml
 * @generated */
public class Concept extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Concept.class);
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
  protected Concept() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Concept(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Concept(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Concept(JCas jcas, int begin, int end) {
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
  //* Feature: fullLabel

  /** getter for fullLabel - gets Full title of the concept.  Compared to covered text, this might have traversed some Wikipedia redirects and disambiguations; most typically, the label has some extra stuff in parentheses.
   * @generated
   * @return value of the feature 
   */
  public String getFullLabel() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_fullLabel == null)
      jcasType.jcas.throwFeatMissing("fullLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Concept_Type)jcasType).casFeatCode_fullLabel);}
    
  /** setter for fullLabel - sets Full title of the concept.  Compared to covered text, this might have traversed some Wikipedia redirects and disambiguations; most typically, the label has some extra stuff in parentheses. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFullLabel(String v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_fullLabel == null)
      jcasType.jcas.throwFeatMissing("fullLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setStringValue(addr, ((Concept_Type)jcasType).casFeatCode_fullLabel, v);}    
   
    
  //*--------------*
  //* Feature: cookedLabel

  /** getter for cookedLabel - gets Polished title of the concept.  Compared to fullLabel, this has any trailing parentheses stripped out; it can still be different from the covered text if the official name differs from the (synonymous) text mention. This is the label used to generate concept clues.
   * @generated
   * @return value of the feature 
   */
  public String getCookedLabel() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_cookedLabel == null)
      jcasType.jcas.throwFeatMissing("cookedLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Concept_Type)jcasType).casFeatCode_cookedLabel);}
    
  /** setter for cookedLabel - sets Polished title of the concept.  Compared to fullLabel, this has any trailing parentheses stripped out; it can still be different from the covered text if the official name differs from the (synonymous) text mention. This is the label used to generate concept clues. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCookedLabel(String v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_cookedLabel == null)
      jcasType.jcas.throwFeatMissing("cookedLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setStringValue(addr, ((Concept_Type)jcasType).casFeatCode_cookedLabel, v);}    
   
    
  //*--------------*
  //* Feature: pageID

  /** getter for pageID - gets The id of the wikipedia page (can be fed to solr as well as freebase or dbpedia).
   * @generated
   * @return value of the feature 
   */
  public int getPageID() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_pageID == null)
      jcasType.jcas.throwFeatMissing("pageID", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Concept_Type)jcasType).casFeatCode_pageID);}
    
  /** setter for pageID - sets The id of the wikipedia page (can be fed to solr as well as freebase or dbpedia). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageID(int v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_pageID == null)
      jcasType.jcas.throwFeatMissing("pageID", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setIntValue(addr, ((Concept_Type)jcasType).casFeatCode_pageID, v);}    
   
    
  //*--------------*
  //* Feature: bySubject

  /** getter for bySubject - gets Whether this concept has subdued a ClueSubject.
   * @generated
   * @return value of the feature 
   */
  public boolean getBySubject() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_bySubject == null)
      jcasType.jcas.throwFeatMissing("bySubject", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_bySubject);}
    
  /** setter for bySubject - sets Whether this concept has subdued a ClueSubject. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBySubject(boolean v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_bySubject == null)
      jcasType.jcas.throwFeatMissing("bySubject", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_bySubject, v);}    
   
    
  //*--------------*
  //* Feature: byLAT

  /** getter for byLAT - gets Whether this concept has subdued a ClueLAT.
   * @generated
   * @return value of the feature 
   */
  public boolean getByLAT() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byLAT == null)
      jcasType.jcas.throwFeatMissing("byLAT", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byLAT);}
    
  /** setter for byLAT - sets Whether this concept has subdued a ClueLAT. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setByLAT(boolean v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byLAT == null)
      jcasType.jcas.throwFeatMissing("byLAT", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byLAT, v);}    
   
    
  //*--------------*
  //* Feature: byNE

  /** getter for byNE - gets Whether this concept has subdued a ClueNE.
   * @generated
   * @return value of the feature 
   */
  public boolean getByNE() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byNE == null)
      jcasType.jcas.throwFeatMissing("byNE", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byNE);}
    
  /** setter for byNE - sets Whether this concept has subdued a ClueNE. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setByNE(boolean v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byNE == null)
      jcasType.jcas.throwFeatMissing("byNE", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byNE, v);}    
   
    
  //*--------------*
  //* Feature: byNgram

  /** getter for byNgram - gets Whether this concept has subdued a ClueNgram.
   * @generated
   * @return value of the feature 
   */
  public boolean getByNgram() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byNgram == null)
      jcasType.jcas.throwFeatMissing("byNgram", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byNgram);}
    
  /** setter for byNgram - sets Whether this concept has subdued a ClueNgram. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setByNgram(boolean v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byNgram == null)
      jcasType.jcas.throwFeatMissing("byNgram", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byNgram, v);}    
   
    
  //*--------------*
  //* Feature: byFuzzyLookup

  /** getter for byFuzzyLookup - gets Whether this concept was found in fuzzy label lookup.
   * @generated
   * @return value of the feature 
   */
  public boolean getByFuzzyLookup() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byFuzzyLookup == null)
      jcasType.jcas.throwFeatMissing("byFuzzyLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byFuzzyLookup);}
    
  /** setter for byFuzzyLookup - sets Whether this concept was found in fuzzy label lookup. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setByFuzzyLookup(boolean v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byFuzzyLookup == null)
      jcasType.jcas.throwFeatMissing("byFuzzyLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byFuzzyLookup, v);}    
   
    
  //*--------------*
  //* Feature: byCWLookup

  /** getter for byCWLookup - gets Whether this concept was found in CrossWikis label lookup.
   * @generated
   * @return value of the feature 
   */
  public boolean getByCWLookup() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byCWLookup == null)
      jcasType.jcas.throwFeatMissing("byCWLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byCWLookup);}
    
  /** setter for byCWLookup - sets Whether this concept was found in CrossWikis label lookup. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setByCWLookup(boolean v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_byCWLookup == null)
      jcasType.jcas.throwFeatMissing("byCWLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Concept_Type)jcasType).casFeatCode_byCWLookup, v);}    
   
    
  //*--------------*
  //* Feature: logPopularity

  /** getter for logPopularity - gets The log(popularity) of the concept, where popularity is the number of concept links in DBpedia.
   * @generated
   * @return value of the feature 
   */
  public double getLogPopularity() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_logPopularity == null)
      jcasType.jcas.throwFeatMissing("logPopularity", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_logPopularity);}
    
  /** setter for logPopularity - sets The log(popularity) of the concept, where popularity is the number of concept links in DBpedia. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLogPopularity(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_logPopularity == null)
      jcasType.jcas.throwFeatMissing("logPopularity", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_logPopularity, v);}    
   
    
  //*--------------*
  //* Feature: labelProbability

  /** getter for labelProbability - gets Probability of the label generally expressing the concept (regardless of context; when from CrossWikis dataset)
   * @generated
   * @return value of the feature 
   */
  public double getLabelProbability() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_labelProbability == null)
      jcasType.jcas.throwFeatMissing("labelProbability", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_labelProbability);}
    
  /** setter for labelProbability - sets Probability of the label generally expressing the concept (regardless of context; when from CrossWikis dataset) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelProbability(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_labelProbability == null)
      jcasType.jcas.throwFeatMissing("labelProbability", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_labelProbability, v);}    
   
    
  //*--------------*
  //* Feature: editDistance

  /** getter for editDistance - gets Edit distance of the cookedlabel from the canonlabel (when from fuzzy lookup)
   * @generated
   * @return value of the feature 
   */
  public double getEditDistance() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_editDistance == null)
      jcasType.jcas.throwFeatMissing("editDistance", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_editDistance);}
    
  /** setter for editDistance - sets Edit distance of the cookedlabel from the canonlabel (when from fuzzy lookup) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEditDistance(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_editDistance == null)
      jcasType.jcas.throwFeatMissing("editDistance", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_editDistance, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets A brief description of the particular concept (about one sentence).
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Concept_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets A brief description of the particular concept (about one sentence). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setStringValue(addr, ((Concept_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: relatedness

  /** getter for relatedness - gets Alignment of concept description and question representation using word embeddings.
   * @generated
   * @return value of the feature 
   */
  public double getRelatedness() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_relatedness == null)
      jcasType.jcas.throwFeatMissing("relatedness", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_relatedness);}
    
  /** setter for relatedness - sets Alignment of concept description and question representation using word embeddings. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelatedness(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_relatedness == null)
      jcasType.jcas.throwFeatMissing("relatedness", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_relatedness, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Concept score in [0,1], classifier-determined probability estimate of this concept being a correctly linked entity
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Concept score in [0,1], classifier-determined probability estimate of this concept being a correctly linked entity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: sourceRr

  /** getter for sourceRr - gets The reciprocial rank in a best-score-sorted list of originating clues.
   * @generated
   * @return value of the feature 
   */
  public double getSourceRr() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_sourceRr == null)
      jcasType.jcas.throwFeatMissing("sourceRr", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_sourceRr);}
    
  /** setter for sourceRr - sets The reciprocial rank in a best-score-sorted list of originating clues. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceRr(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_sourceRr == null)
      jcasType.jcas.throwFeatMissing("sourceRr", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_sourceRr, v);}    
   
    
  //*--------------*
  //* Feature: labelRr

  /** getter for labelRr - gets The reciprocial rank in a score-sorted list of output labelled concepts.
   * @generated
   * @return value of the feature 
   */
  public double getLabelRr() {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_labelRr == null)
      jcasType.jcas.throwFeatMissing("labelRr", "cz.brmlab.yodaqa.model.Question.Concept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_labelRr);}
    
  /** setter for labelRr - sets The reciprocial rank in a score-sorted list of output labelled concepts. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelRr(double v) {
    if (Concept_Type.featOkTst && ((Concept_Type)jcasType).casFeat_labelRr == null)
      jcasType.jcas.throwFeatMissing("labelRr", "cz.brmlab.yodaqa.model.Question.Concept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Concept_Type)jcasType).casFeatCode_labelRr, v);}    
  }

    
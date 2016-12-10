
/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Concept is basically a Wikipedia article, labelled by its full title and the label somehow occurring in the question text.  This is a strong indicator of the question topic, which in turn helps choose appropriate information sources.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class Concept_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Concept_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Concept_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Concept(addr, Concept_Type.this);
  			   Concept_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Concept(addr, Concept_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Concept.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.Question.Concept");
 
  /** @generated */
  final Feature casFeat_fullLabel;
  /** @generated */
  final int     casFeatCode_fullLabel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFullLabel(int addr) {
        if (featOkTst && casFeat_fullLabel == null)
      jcas.throwFeatMissing("fullLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fullLabel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFullLabel(int addr, String v) {
        if (featOkTst && casFeat_fullLabel == null)
      jcas.throwFeatMissing("fullLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setStringValue(addr, casFeatCode_fullLabel, v);}
    
  
 
  /** @generated */
  final Feature casFeat_cookedLabel;
  /** @generated */
  final int     casFeatCode_cookedLabel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCookedLabel(int addr) {
        if (featOkTst && casFeat_cookedLabel == null)
      jcas.throwFeatMissing("cookedLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cookedLabel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCookedLabel(int addr, String v) {
        if (featOkTst && casFeat_cookedLabel == null)
      jcas.throwFeatMissing("cookedLabel", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setStringValue(addr, casFeatCode_cookedLabel, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pageID;
  /** @generated */
  final int     casFeatCode_pageID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPageID(int addr) {
        if (featOkTst && casFeat_pageID == null)
      jcas.throwFeatMissing("pageID", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getIntValue(addr, casFeatCode_pageID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPageID(int addr, int v) {
        if (featOkTst && casFeat_pageID == null)
      jcas.throwFeatMissing("pageID", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setIntValue(addr, casFeatCode_pageID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bySubject;
  /** @generated */
  final int     casFeatCode_bySubject;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getBySubject(int addr) {
        if (featOkTst && casFeat_bySubject == null)
      jcas.throwFeatMissing("bySubject", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_bySubject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBySubject(int addr, boolean v) {
        if (featOkTst && casFeat_bySubject == null)
      jcas.throwFeatMissing("bySubject", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_bySubject, v);}
    
  
 
  /** @generated */
  final Feature casFeat_byLAT;
  /** @generated */
  final int     casFeatCode_byLAT;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getByLAT(int addr) {
        if (featOkTst && casFeat_byLAT == null)
      jcas.throwFeatMissing("byLAT", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_byLAT);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setByLAT(int addr, boolean v) {
        if (featOkTst && casFeat_byLAT == null)
      jcas.throwFeatMissing("byLAT", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_byLAT, v);}
    
  
 
  /** @generated */
  final Feature casFeat_byNE;
  /** @generated */
  final int     casFeatCode_byNE;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getByNE(int addr) {
        if (featOkTst && casFeat_byNE == null)
      jcas.throwFeatMissing("byNE", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_byNE);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setByNE(int addr, boolean v) {
        if (featOkTst && casFeat_byNE == null)
      jcas.throwFeatMissing("byNE", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_byNE, v);}
    
  
 
  /** @generated */
  final Feature casFeat_byNgram;
  /** @generated */
  final int     casFeatCode_byNgram;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getByNgram(int addr) {
        if (featOkTst && casFeat_byNgram == null)
      jcas.throwFeatMissing("byNgram", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_byNgram);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setByNgram(int addr, boolean v) {
        if (featOkTst && casFeat_byNgram == null)
      jcas.throwFeatMissing("byNgram", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_byNgram, v);}
    
  
 
  /** @generated */
  final Feature casFeat_byFuzzyLookup;
  /** @generated */
  final int     casFeatCode_byFuzzyLookup;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getByFuzzyLookup(int addr) {
        if (featOkTst && casFeat_byFuzzyLookup == null)
      jcas.throwFeatMissing("byFuzzyLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_byFuzzyLookup);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setByFuzzyLookup(int addr, boolean v) {
        if (featOkTst && casFeat_byFuzzyLookup == null)
      jcas.throwFeatMissing("byFuzzyLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_byFuzzyLookup, v);}
    
  
 
  /** @generated */
  final Feature casFeat_byCWLookup;
  /** @generated */
  final int     casFeatCode_byCWLookup;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getByCWLookup(int addr) {
        if (featOkTst && casFeat_byCWLookup == null)
      jcas.throwFeatMissing("byCWLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_byCWLookup);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setByCWLookup(int addr, boolean v) {
        if (featOkTst && casFeat_byCWLookup == null)
      jcas.throwFeatMissing("byCWLookup", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_byCWLookup, v);}
    
  
 
  /** @generated */
  final Feature casFeat_logPopularity;
  /** @generated */
  final int     casFeatCode_logPopularity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLogPopularity(int addr) {
        if (featOkTst && casFeat_logPopularity == null)
      jcas.throwFeatMissing("logPopularity", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_logPopularity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLogPopularity(int addr, double v) {
        if (featOkTst && casFeat_logPopularity == null)
      jcas.throwFeatMissing("logPopularity", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_logPopularity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labelProbability;
  /** @generated */
  final int     casFeatCode_labelProbability;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLabelProbability(int addr) {
        if (featOkTst && casFeat_labelProbability == null)
      jcas.throwFeatMissing("labelProbability", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_labelProbability);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabelProbability(int addr, double v) {
        if (featOkTst && casFeat_labelProbability == null)
      jcas.throwFeatMissing("labelProbability", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_labelProbability, v);}
    
  
 
  /** @generated */
  final Feature casFeat_editDistance;
  /** @generated */
  final int     casFeatCode_editDistance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getEditDistance(int addr) {
        if (featOkTst && casFeat_editDistance == null)
      jcas.throwFeatMissing("editDistance", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_editDistance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEditDistance(int addr, double v) {
        if (featOkTst && casFeat_editDistance == null)
      jcas.throwFeatMissing("editDistance", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_editDistance, v);}
    
  
 
  /** @generated */
  final Feature casFeat_description;
  /** @generated */
  final int     casFeatCode_description;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDescription(int addr) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setStringValue(addr, casFeatCode_description, v);}
    
  
 
  /** @generated */
  final Feature casFeat_relatedness;
  /** @generated */
  final int     casFeatCode_relatedness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRelatedness(int addr) {
        if (featOkTst && casFeat_relatedness == null)
      jcas.throwFeatMissing("relatedness", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_relatedness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelatedness(int addr, double v) {
        if (featOkTst && casFeat_relatedness == null)
      jcas.throwFeatMissing("relatedness", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_relatedness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sourceRr;
  /** @generated */
  final int     casFeatCode_sourceRr;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSourceRr(int addr) {
        if (featOkTst && casFeat_sourceRr == null)
      jcas.throwFeatMissing("sourceRr", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_sourceRr);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceRr(int addr, double v) {
        if (featOkTst && casFeat_sourceRr == null)
      jcas.throwFeatMissing("sourceRr", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_sourceRr, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labelRr;
  /** @generated */
  final int     casFeatCode_labelRr;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLabelRr(int addr) {
        if (featOkTst && casFeat_labelRr == null)
      jcas.throwFeatMissing("labelRr", "cz.brmlab.yodaqa.model.Question.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_labelRr);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabelRr(int addr, double v) {
        if (featOkTst && casFeat_labelRr == null)
      jcas.throwFeatMissing("labelRr", "cz.brmlab.yodaqa.model.Question.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_labelRr, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Concept_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_fullLabel = jcas.getRequiredFeatureDE(casType, "fullLabel", "uima.cas.String", featOkTst);
    casFeatCode_fullLabel  = (null == casFeat_fullLabel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fullLabel).getCode();

 
    casFeat_cookedLabel = jcas.getRequiredFeatureDE(casType, "cookedLabel", "uima.cas.String", featOkTst);
    casFeatCode_cookedLabel  = (null == casFeat_cookedLabel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cookedLabel).getCode();

 
    casFeat_pageID = jcas.getRequiredFeatureDE(casType, "pageID", "uima.cas.Integer", featOkTst);
    casFeatCode_pageID  = (null == casFeat_pageID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pageID).getCode();

 
    casFeat_bySubject = jcas.getRequiredFeatureDE(casType, "bySubject", "uima.cas.Boolean", featOkTst);
    casFeatCode_bySubject  = (null == casFeat_bySubject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bySubject).getCode();

 
    casFeat_byLAT = jcas.getRequiredFeatureDE(casType, "byLAT", "uima.cas.Boolean", featOkTst);
    casFeatCode_byLAT  = (null == casFeat_byLAT) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_byLAT).getCode();

 
    casFeat_byNE = jcas.getRequiredFeatureDE(casType, "byNE", "uima.cas.Boolean", featOkTst);
    casFeatCode_byNE  = (null == casFeat_byNE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_byNE).getCode();

 
    casFeat_byNgram = jcas.getRequiredFeatureDE(casType, "byNgram", "uima.cas.Boolean", featOkTst);
    casFeatCode_byNgram  = (null == casFeat_byNgram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_byNgram).getCode();

 
    casFeat_byFuzzyLookup = jcas.getRequiredFeatureDE(casType, "byFuzzyLookup", "uima.cas.Boolean", featOkTst);
    casFeatCode_byFuzzyLookup  = (null == casFeat_byFuzzyLookup) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_byFuzzyLookup).getCode();

 
    casFeat_byCWLookup = jcas.getRequiredFeatureDE(casType, "byCWLookup", "uima.cas.Boolean", featOkTst);
    casFeatCode_byCWLookup  = (null == casFeat_byCWLookup) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_byCWLookup).getCode();

 
    casFeat_logPopularity = jcas.getRequiredFeatureDE(casType, "logPopularity", "uima.cas.Double", featOkTst);
    casFeatCode_logPopularity  = (null == casFeat_logPopularity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_logPopularity).getCode();

 
    casFeat_labelProbability = jcas.getRequiredFeatureDE(casType, "labelProbability", "uima.cas.Double", featOkTst);
    casFeatCode_labelProbability  = (null == casFeat_labelProbability) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labelProbability).getCode();

 
    casFeat_editDistance = jcas.getRequiredFeatureDE(casType, "editDistance", "uima.cas.Double", featOkTst);
    casFeatCode_editDistance  = (null == casFeat_editDistance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_editDistance).getCode();

 
    casFeat_description = jcas.getRequiredFeatureDE(casType, "description", "uima.cas.String", featOkTst);
    casFeatCode_description  = (null == casFeat_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_description).getCode();

 
    casFeat_relatedness = jcas.getRequiredFeatureDE(casType, "relatedness", "uima.cas.Double", featOkTst);
    casFeatCode_relatedness  = (null == casFeat_relatedness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relatedness).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_sourceRr = jcas.getRequiredFeatureDE(casType, "sourceRr", "uima.cas.Double", featOkTst);
    casFeatCode_sourceRr  = (null == casFeat_sourceRr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceRr).getCode();

 
    casFeat_labelRr = jcas.getRequiredFeatureDE(casType, "labelRr", "uima.cas.Double", featOkTst);
    casFeatCode_labelRr  = (null == casFeat_labelRr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labelRr).getCode();

  }
}



    
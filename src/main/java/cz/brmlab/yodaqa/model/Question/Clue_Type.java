
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

/** Question Clue. A collection of clues is what supports search for answer-bearing passages. This is a base type that is never directly instantiated, though; subtypes representing various kinds of clues are.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class Clue_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Clue_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Clue_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Clue(addr, Clue_Type.this);
  			   Clue_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Clue(addr, Clue_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Clue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.Question.Clue");
 
  /** @generated */
  final Feature casFeat_base;
  /** @generated */
  final int     casFeatCode_base;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBase(int addr) {
        if (featOkTst && casFeat_base == null)
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Clue");
    return ll_cas.ll_getRefValue(addr, casFeatCode_base);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBase(int addr, int v) {
        if (featOkTst && casFeat_base == null)
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Clue");
    ll_cas.ll_setRefValue(addr, casFeatCode_base, v);}
    
  
 
  /** @generated */
  final Feature casFeat_weight;
  /** @generated */
  final int     casFeatCode_weight;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getWeight(int addr) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "cz.brmlab.yodaqa.model.Question.Clue");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_weight);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWeight(int addr, double v) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "cz.brmlab.yodaqa.model.Question.Clue");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_weight, v);}
    
  
 
  /** @generated */
  final Feature casFeat_label;
  /** @generated */
  final int     casFeatCode_label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "cz.brmlab.yodaqa.model.Question.Clue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "cz.brmlab.yodaqa.model.Question.Clue");
    ll_cas.ll_setStringValue(addr, casFeatCode_label, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isReliable;
  /** @generated */
  final int     casFeatCode_isReliable;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsReliable(int addr) {
        if (featOkTst && casFeat_isReliable == null)
      jcas.throwFeatMissing("isReliable", "cz.brmlab.yodaqa.model.Question.Clue");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isReliable);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsReliable(int addr, boolean v) {
        if (featOkTst && casFeat_isReliable == null)
      jcas.throwFeatMissing("isReliable", "cz.brmlab.yodaqa.model.Question.Clue");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isReliable, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Clue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_base = jcas.getRequiredFeatureDE(casType, "base", "uima.tcas.Annotation", featOkTst);
    casFeatCode_base  = (null == casFeat_base) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_base).getCode();

 
    casFeat_weight = jcas.getRequiredFeatureDE(casType, "weight", "uima.cas.Double", featOkTst);
    casFeatCode_weight  = (null == casFeat_weight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_weight).getCode();

 
    casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
    casFeatCode_label  = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_label).getCode();

 
    casFeat_isReliable = jcas.getRequiredFeatureDE(casType, "isReliable", "uima.cas.Boolean", featOkTst);
    casFeatCode_isReliable  = (null == casFeat_isReliable) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isReliable).getCode();

  }
}



    
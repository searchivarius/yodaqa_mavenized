
/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.TyCor;

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

/** Lexical Answer Type; e.g. "Who was the first king
		of Bohemia?" can generate LATs "king";
		"Who invented the transistor?" can generate LATs "person"
		or "inventor".
		Some LATs are generated from the question itself while
		others are derived from other LATs/clues.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class LAT_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LAT_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LAT_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LAT(addr, LAT_Type.this);
  			   LAT_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LAT(addr, LAT_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LAT.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.TyCor.LAT");
 
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
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getRefValue(addr, casFeatCode_base);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBase(int addr, int v) {
        if (featOkTst && casFeat_base == null)
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setRefValue(addr, casFeatCode_base, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pos;
  /** @generated */
  final int     casFeatCode_pos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPos(int addr) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getRefValue(addr, casFeatCode_pos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos(int addr, int v) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setRefValue(addr, casFeatCode_pos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_synset;
  /** @generated */
  final int     casFeatCode_synset;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getSynset(int addr) {
        if (featOkTst && casFeat_synset == null)
      jcas.throwFeatMissing("synset", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getLongValue(addr, casFeatCode_synset);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSynset(int addr, long v) {
        if (featOkTst && casFeat_synset == null)
      jcas.throwFeatMissing("synset", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setLongValue(addr, casFeatCode_synset, v);}
    
  
 
  /** @generated */
  final Feature casFeat_specificity;
  /** @generated */
  final int     casFeatCode_specificity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSpecificity(int addr) {
        if (featOkTst && casFeat_specificity == null)
      jcas.throwFeatMissing("specificity", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_specificity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpecificity(int addr, double v) {
        if (featOkTst && casFeat_specificity == null)
      jcas.throwFeatMissing("specificity", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_specificity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_baseLAT;
  /** @generated */
  final int     casFeatCode_baseLAT;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBaseLAT(int addr) {
        if (featOkTst && casFeat_baseLAT == null)
      jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseLAT);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseLAT(int addr, int v) {
        if (featOkTst && casFeat_baseLAT == null)
      jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseLAT, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isHierarchical;
  /** @generated */
  final int     casFeatCode_isHierarchical;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsHierarchical(int addr) {
        if (featOkTst && casFeat_isHierarchical == null)
      jcas.throwFeatMissing("isHierarchical", "cz.brmlab.yodaqa.model.TyCor.LAT");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isHierarchical);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsHierarchical(int addr, boolean v) {
        if (featOkTst && casFeat_isHierarchical == null)
      jcas.throwFeatMissing("isHierarchical", "cz.brmlab.yodaqa.model.TyCor.LAT");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isHierarchical, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LAT_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_base = jcas.getRequiredFeatureDE(casType, "base", "uima.tcas.Annotation", featOkTst);
    casFeatCode_base  = (null == casFeat_base) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_base).getCode();

 
    casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS", featOkTst);
    casFeatCode_pos  = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pos).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_synset = jcas.getRequiredFeatureDE(casType, "synset", "uima.cas.Long", featOkTst);
    casFeatCode_synset  = (null == casFeat_synset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_synset).getCode();

 
    casFeat_specificity = jcas.getRequiredFeatureDE(casType, "specificity", "uima.cas.Double", featOkTst);
    casFeatCode_specificity  = (null == casFeat_specificity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_specificity).getCode();

 
    casFeat_baseLAT = jcas.getRequiredFeatureDE(casType, "baseLAT", "cz.brmlab.yodaqa.model.TyCor.LAT", featOkTst);
    casFeatCode_baseLAT  = (null == casFeat_baseLAT) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseLAT).getCode();

 
    casFeat_isHierarchical = jcas.getRequiredFeatureDE(casType, "isHierarchical", "uima.cas.Boolean", featOkTst);
    casFeatCode_isHierarchical  = (null == casFeat_isHierarchical) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isHierarchical).getCode();

  }
}



    
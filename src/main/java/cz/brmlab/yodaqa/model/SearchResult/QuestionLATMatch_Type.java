
/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.SearchResult;

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

/** Match of a question LAT; this is data for essentially a super-rough TyCor that expects the type word near the answer text.
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class QuestionLATMatch_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionLATMatch_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionLATMatch_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionLATMatch(addr, QuestionLATMatch_Type.this);
  			   QuestionLATMatch_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionLATMatch(addr, QuestionLATMatch_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionLATMatch.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
 
  /** @generated */
  final Feature casFeat_baseToken;
  /** @generated */
  final int     casFeatCode_baseToken;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBaseToken(int addr) {
        if (featOkTst && casFeat_baseToken == null)
      jcas.throwFeatMissing("baseToken", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseToken);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseToken(int addr, int v) {
        if (featOkTst && casFeat_baseToken == null)
      jcas.throwFeatMissing("baseToken", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseToken, v);}
    
  
 
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
      jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseLAT);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseLAT(int addr, int v) {
        if (featOkTst && casFeat_baseLAT == null)
      jcas.throwFeatMissing("baseLAT", "cz.brmlab.yodaqa.model.SearchResult.QuestionLATMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseLAT, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuestionLATMatch_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseToken = jcas.getRequiredFeatureDE(casType, "baseToken", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token", featOkTst);
    casFeatCode_baseToken  = (null == casFeat_baseToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseToken).getCode();

 
    casFeat_baseLAT = jcas.getRequiredFeatureDE(casType, "baseLAT", "cz.brmlab.yodaqa.model.TyCor.LAT", featOkTst);
    casFeatCode_baseLAT  = (null == casFeat_baseLAT) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseLAT).getCode();

  }
}



    
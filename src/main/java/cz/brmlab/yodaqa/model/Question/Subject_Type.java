
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

/** Question Subject; e.g. in "What site did Lindbergh begin his flight from?", "Lindbergh" is the subject.  It might be the sentence NSUBJ, but also e.g. the object as in "Who painted 'Sunflowers'?" - 'Sunflowers'.  Note that this is typically *not* a single token but a constituent, e.g. for "When is Fashion week in NYC?" it is "Fashion week", not "week".
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class Subject_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Subject_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Subject_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Subject(addr, Subject_Type.this);
  			   Subject_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Subject(addr, Subject_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Subject.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.Question.Subject");
 
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
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Subject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_base);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBase(int addr, int v) {
        if (featOkTst && casFeat_base == null)
      jcas.throwFeatMissing("base", "cz.brmlab.yodaqa.model.Question.Subject");
    ll_cas.ll_setRefValue(addr, casFeatCode_base, v);}
    
  
 
  /** @generated */
  final Feature casFeat_token;
  /** @generated */
  final int     casFeatCode_token;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getToken(int addr) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "cz.brmlab.yodaqa.model.Question.Subject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setToken(int addr, int v) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "cz.brmlab.yodaqa.model.Question.Subject");
    ll_cas.ll_setRefValue(addr, casFeatCode_token, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Subject_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_base = jcas.getRequiredFeatureDE(casType, "base", "uima.tcas.Annotation", featOkTst);
    casFeatCode_base  = (null == casFeat_base) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_base).getCode();

 
    casFeat_token = jcas.getRequiredFeatureDE(casType, "token", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token", featOkTst);
    casFeatCode_token  = (null == casFeat_token) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token).getCode();

  }
}



    
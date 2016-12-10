
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
import org.apache.uima.jcas.cas.TOP_Type;

/** Information about question class
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class QuestionClass_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionClass_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionClass_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionClass(addr, QuestionClass_Type.this);
  			   QuestionClass_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionClass(addr, QuestionClass_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionClass.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.Question.QuestionClass");
 
  /** @generated */
  final Feature casFeat_questionClass;
  /** @generated */
  final int     casFeatCode_questionClass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuestionClass(int addr) {
        if (featOkTst && casFeat_questionClass == null)
      jcas.throwFeatMissing("questionClass", "cz.brmlab.yodaqa.model.Question.QuestionClass");
    return ll_cas.ll_getStringValue(addr, casFeatCode_questionClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuestionClass(int addr, String v) {
        if (featOkTst && casFeat_questionClass == null)
      jcas.throwFeatMissing("questionClass", "cz.brmlab.yodaqa.model.Question.QuestionClass");
    ll_cas.ll_setStringValue(addr, casFeatCode_questionClass, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuestionClass_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionClass = jcas.getRequiredFeatureDE(casType, "questionClass", "uima.cas.String", featOkTst);
    casFeatCode_questionClass  = (null == casFeat_questionClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionClass).getCode();

  }
}



    
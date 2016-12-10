
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

/** Match of a question clue for transfoer to answer features (based on neighborhood, parse tree path etc.).
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class QuestionClueMatch_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionClueMatch_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionClueMatch_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionClueMatch(addr, QuestionClueMatch_Type.this);
  			   QuestionClueMatch_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionClueMatch(addr, QuestionClueMatch_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionClueMatch.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.SearchResult.QuestionClueMatch");
 
  /** @generated */
  final Feature casFeat_baseClue;
  /** @generated */
  final int     casFeatCode_baseClue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBaseClue(int addr) {
        if (featOkTst && casFeat_baseClue == null)
      jcas.throwFeatMissing("baseClue", "cz.brmlab.yodaqa.model.SearchResult.QuestionClueMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseClue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseClue(int addr, int v) {
        if (featOkTst && casFeat_baseClue == null)
      jcas.throwFeatMissing("baseClue", "cz.brmlab.yodaqa.model.SearchResult.QuestionClueMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseClue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuestionClueMatch_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseClue = jcas.getRequiredFeatureDE(casType, "baseClue", "cz.brmlab.yodaqa.model.Question.Clue", featOkTst);
    casFeatCode_baseClue  = (null == casFeat_baseClue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseClue).getCode();

  }
}



    
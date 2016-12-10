
/* First created by JCasGen Fri Dec 09 22:50:50 EST 2016 */
package cz.brmlab.yodaqa.model.CandidateAnswer;

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

/** A resource (e.g. DBpedia, Freebase, enwiki article) corresponding to an answer.
 * Updated by JCasGen Fri Dec 09 22:50:50 EST 2016
 * @generated */
public class AnswerResource_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerResource_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerResource_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerResource(addr, AnswerResource_Type.this);
  			   AnswerResource_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerResource(addr, AnswerResource_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerResource.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.CandidateAnswer.AnswerResource");
 
  /** @generated */
  final Feature casFeat_iri;
  /** @generated */
  final int     casFeatCode_iri;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIri(int addr) {
        if (featOkTst && casFeat_iri == null)
      jcas.throwFeatMissing("iri", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerResource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_iri);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIri(int addr, String v) {
        if (featOkTst && casFeat_iri == null)
      jcas.throwFeatMissing("iri", "cz.brmlab.yodaqa.model.CandidateAnswer.AnswerResource");
    ll_cas.ll_setStringValue(addr, casFeatCode_iri, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnswerResource_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_iri = jcas.getRequiredFeatureDE(casType, "iri", "uima.cas.String", featOkTst);
    casFeatCode_iri  = (null == casFeat_iri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_iri).getCode();

  }
}



    

/* First created by JCasGen Fri Dec 09 22:50:51 EST 2016 */
package cz.brmlab.yodaqa.model.Question;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Clue based on the question subject, indicating that it is a full phrase (e.g. "capital of Laos" in "What is the capital of Laos?").
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class ClueSubjectPhrase_Type extends ClueSubject_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ClueSubjectPhrase_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ClueSubjectPhrase_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ClueSubjectPhrase(addr, ClueSubjectPhrase_Type.this);
  			   ClueSubjectPhrase_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ClueSubjectPhrase(addr, ClueSubjectPhrase_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ClueSubjectPhrase.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.Question.ClueSubjectPhrase");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ClueSubjectPhrase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    
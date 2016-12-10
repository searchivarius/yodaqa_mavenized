
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
import org.apache.uima.jcas.cas.TOP_Type;

/** Meta-information on the retrieved search result
 * Updated by JCasGen Fri Dec 09 22:50:51 EST 2016
 * @generated */
public class ResultInfo_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ResultInfo_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ResultInfo_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ResultInfo(addr, ResultInfo_Type.this);
  			   ResultInfo_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ResultInfo(addr, ResultInfo_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ResultInfo.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
 
  /** @generated */
  final Feature casFeat_relevance;
  /** @generated */
  final int     casFeatCode_relevance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRelevance(int addr) {
        if (featOkTst && casFeat_relevance == null)
      jcas.throwFeatMissing("relevance", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_relevance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelevance(int addr, double v) {
        if (featOkTst && casFeat_relevance == null)
      jcas.throwFeatMissing("relevance", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_relevance, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_documentId;
  /** @generated */
  final int     casFeatCode_documentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentId(int addr) {
        if (featOkTst && casFeat_documentId == null)
      jcas.throwFeatMissing("documentId", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentId(int addr, String v) {
        if (featOkTst && casFeat_documentId == null)
      jcas.throwFeatMissing("documentId", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sourceID;
  /** @generated */
  final int     casFeatCode_sourceID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSourceID(int addr) {
        if (featOkTst && casFeat_sourceID == null)
      jcas.throwFeatMissing("sourceID", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sourceID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceID(int addr, int v) {
        if (featOkTst && casFeat_sourceID == null)
      jcas.throwFeatMissing("sourceID", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_sourceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_documentTitle;
  /** @generated */
  final int     casFeatCode_documentTitle;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentTitle(int addr) {
        if (featOkTst && casFeat_documentTitle == null)
      jcas.throwFeatMissing("documentTitle", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentTitle);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentTitle(int addr, String v) {
        if (featOkTst && casFeat_documentTitle == null)
      jcas.throwFeatMissing("documentTitle", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentTitle, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isLast;
  /** @generated */
  final int     casFeatCode_isLast;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIsLast(int addr) {
        if (featOkTst && casFeat_isLast == null)
      jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getIntValue(addr, casFeatCode_isLast);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsLast(int addr, int v) {
        if (featOkTst && casFeat_isLast == null)
      jcas.throwFeatMissing("isLast", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setIntValue(addr, casFeatCode_isLast, v);}
    
  
 
  /** @generated */
  final Feature casFeat_origin;
  /** @generated */
  final int     casFeatCode_origin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOrigin(int addr) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_origin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigin(int addr, String v) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_origin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ansfeatures;
  /** @generated */
  final int     casFeatCode_ansfeatures;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnsfeatures(int addr) {
        if (featOkTst && casFeat_ansfeatures == null)
      jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnsfeatures(int addr, int v) {
        if (featOkTst && casFeat_ansfeatures == null)
      jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    ll_cas.ll_setRefValue(addr, casFeatCode_ansfeatures, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getAnsfeatures(int addr, int i) {
        if (featOkTst && casFeat_ansfeatures == null)
      jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAnsfeatures(int addr, int i, int v) {
        if (featOkTst && casFeat_ansfeatures == null)
      jcas.throwFeatMissing("ansfeatures", "cz.brmlab.yodaqa.model.SearchResult.ResultInfo");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ansfeatures), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ResultInfo_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_relevance = jcas.getRequiredFeatureDE(casType, "relevance", "uima.cas.Double", featOkTst);
    casFeatCode_relevance  = (null == casFeat_relevance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relevance).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_documentId = jcas.getRequiredFeatureDE(casType, "documentId", "uima.cas.String", featOkTst);
    casFeatCode_documentId  = (null == casFeat_documentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentId).getCode();

 
    casFeat_sourceID = jcas.getRequiredFeatureDE(casType, "sourceID", "uima.cas.Integer", featOkTst);
    casFeatCode_sourceID  = (null == casFeat_sourceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceID).getCode();

 
    casFeat_documentTitle = jcas.getRequiredFeatureDE(casType, "documentTitle", "uima.cas.String", featOkTst);
    casFeatCode_documentTitle  = (null == casFeat_documentTitle) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentTitle).getCode();

 
    casFeat_isLast = jcas.getRequiredFeatureDE(casType, "isLast", "uima.cas.Integer", featOkTst);
    casFeatCode_isLast  = (null == casFeat_isLast) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isLast).getCode();

 
    casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "uima.cas.String", featOkTst);
    casFeatCode_origin  = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origin).getCode();

 
    casFeat_ansfeatures = jcas.getRequiredFeatureDE(casType, "ansfeatures", "uima.cas.FSArray", featOkTst);
    casFeatCode_ansfeatures  = (null == casFeat_ansfeatures) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ansfeatures).getCode();

  }
}



    
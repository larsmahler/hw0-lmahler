
/* First created by JCasGen Sun Sep 08 19:34:34 EDT 2013 */
package qa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** An Annotation type used to annotate n-grams (series of consecutive {@link Token} types). The <b>elements</b> feature stores an array of all {@link Token} elements covered by the text span.
<p>
 * Updated by JCasGen Sun Sep 08 23:37:45 EDT 2013
 * @generated */
public class NGram_Type extends AbstractSpanAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("qa.NGram");
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "qa.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "qa.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
   /** @generated */
  public int getElements(int addr, int i) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "qa.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  }
   
  /** @generated */ 
  public void setElements(int addr, int i, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "qa.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSArray", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

  }
}



    
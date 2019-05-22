//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 02:51:26 PM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.validation.RevocationType;
import eu.europa.esig.dss.validation.XmlRevocationOrigin;


/**
 * <p>Java class for Revocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}AbstractToken"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationOriginType"/&gt;
 *         &lt;element name="Type" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationType"/&gt;
 *         &lt;element name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ThisUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NextUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpiredCertsOnCRL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArchiveCutOff" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CertHashExtensionPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CertHashExtensionMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DigestAlgoAndValues" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValues" minOccurs="0"/&gt;
 *         &lt;element name="BasicSignature" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicSignature" minOccurs="0"/&gt;
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}SigningCertificate" minOccurs="0"/&gt;
 *         &lt;element name="CertificateChain" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateChain" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Base64Encoded" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revocation", propOrder = {
    "origin",
    "type",
    "sourceAddress",
    "productionDate",
    "thisUpdate",
    "nextUpdate",
    "expiredCertsOnCRL",
    "archiveCutOff",
    "certHashExtensionPresent",
    "certHashExtensionMatch",
    "digestAlgoAndValues",
    "basicSignature",
    "signingCertificate",
    "certificateChain",
    "base64Encoded",
    "digestAlgoAndValue"
})
public class XmlRevocation
    extends XmlAbstractToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Origin", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected XmlRevocationOrigin origin;
    @XmlElement(name = "Type", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected RevocationType type;
    @XmlElement(name = "SourceAddress")
    protected String sourceAddress;
    @XmlElement(name = "ProductionDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date productionDate;
    @XmlElement(name = "ThisUpdate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date thisUpdate;
    @XmlElement(name = "NextUpdate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date nextUpdate;
    @XmlElement(name = "ExpiredCertsOnCRL", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expiredCertsOnCRL;
    @XmlElement(name = "ArchiveCutOff", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date archiveCutOff;
    @XmlElement(name = "CertHashExtensionPresent")
    protected Boolean certHashExtensionPresent;
    @XmlElement(name = "CertHashExtensionMatch")
    protected Boolean certHashExtensionMatch;
    @XmlElementWrapper(name = "DigestAlgoAndValues")
    @XmlElement(name = "DigestAlgoAndValue", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlDigestAlgoAndValue> digestAlgoAndValues;
    @XmlElement(name = "BasicSignature")
    protected XmlBasicSignature basicSignature;
    @XmlElement(name = "SigningCertificate")
    protected XmlSigningCertificate signingCertificate;
    @XmlElementWrapper(name = "CertificateChain")
    @XmlElement(name = "ChainItem", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlChainItem> certificateChain;
    @XmlElement(name = "Base64Encoded")
    protected byte[] base64Encoded;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlDigestAlgoAndValue digestAlgoAndValue;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XmlRevocationOrigin getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(XmlRevocationOrigin value) {
        this.origin = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RevocationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(RevocationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the sourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Sets the value of the sourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionDate(Date value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the thisUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getThisUpdate() {
        return thisUpdate;
    }

    /**
     * Sets the value of the thisUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisUpdate(Date value) {
        this.thisUpdate = value;
    }

    /**
     * Gets the value of the nextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNextUpdate() {
        return nextUpdate;
    }

    /**
     * Sets the value of the nextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextUpdate(Date value) {
        this.nextUpdate = value;
    }

    /**
     * Gets the value of the expiredCertsOnCRL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpiredCertsOnCRL() {
        return expiredCertsOnCRL;
    }

    /**
     * Sets the value of the expiredCertsOnCRL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredCertsOnCRL(Date value) {
        this.expiredCertsOnCRL = value;
    }

    /**
     * Gets the value of the archiveCutOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArchiveCutOff() {
        return archiveCutOff;
    }

    /**
     * Sets the value of the archiveCutOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveCutOff(Date value) {
        this.archiveCutOff = value;
    }

    /**
     * Gets the value of the certHashExtensionPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertHashExtensionPresent() {
        return certHashExtensionPresent;
    }

    /**
     * Sets the value of the certHashExtensionPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertHashExtensionPresent(Boolean value) {
        this.certHashExtensionPresent = value;
    }

    /**
     * Gets the value of the certHashExtensionMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertHashExtensionMatch() {
        return certHashExtensionMatch;
    }

    /**
     * Sets the value of the certHashExtensionMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertHashExtensionMatch(Boolean value) {
        this.certHashExtensionMatch = value;
    }

    /**
     * Gets the value of the basicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link XmlBasicSignature }
     *     
     */
    public XmlBasicSignature getBasicSignature() {
        return basicSignature;
    }

    /**
     * Sets the value of the basicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlBasicSignature }
     *     
     */
    public void setBasicSignature(XmlBasicSignature value) {
        this.basicSignature = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public XmlSigningCertificate getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public void setSigningCertificate(XmlSigningCertificate value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the base64Encoded property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64Encoded() {
        return base64Encoded;
    }

    /**
     * Sets the value of the base64Encoded property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64Encoded(byte[] value) {
        this.base64Encoded = value;
    }

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

    public List<XmlDigestAlgoAndValue> getDigestAlgoAndValues() {
        if (digestAlgoAndValues == null) {
            digestAlgoAndValues = new ArrayList<XmlDigestAlgoAndValue>();
        }
        return digestAlgoAndValues;
    }

    public void setDigestAlgoAndValues(List<XmlDigestAlgoAndValue> digestAlgoAndValues) {
        this.digestAlgoAndValues = digestAlgoAndValues;
    }

    public List<XmlChainItem> getCertificateChain() {
        if (certificateChain == null) {
            certificateChain = new ArrayList<XmlChainItem>();
        }
        return certificateChain;
    }

    public void setCertificateChain(List<XmlChainItem> certificateChain) {
        this.certificateChain = certificateChain;
    }

}

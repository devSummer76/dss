//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 02:51:26 PM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.validation.CertificateOriginType;


/**
 * <p>Java class for FoundCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoundCertificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateOriginType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CertificateRef" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundCertificate", propOrder = {
    "origin",
    "certificateRef"
})
@XmlSeeAlso({
    XmlRelatedCertificate.class,
    XmlOrphanCertificate.class
})
public abstract class XmlFoundCertificate implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Origin", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected List<CertificateOriginType> origin;
    @XmlElement(name = "CertificateRef")
    protected List<XmlCertificateRef> certificateRef;

    /**
     * Gets the value of the origin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<CertificateOriginType> getOrigin() {
        if (origin == null) {
            origin = new ArrayList<CertificateOriginType>();
        }
        return this.origin;
    }

    /**
     * Gets the value of the certificateRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlCertificateRef }
     * 
     * 
     */
    public List<XmlCertificateRef> getCertificateRef() {
        if (certificateRef == null) {
            certificateRef = new ArrayList<XmlCertificateRef>();
        }
        return this.certificateRef;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.22 at 02:51:26 PM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.validation.RevocationType;

public class Adapter10
    extends XmlAdapter<String, RevocationType>
{


    public RevocationType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationTypeParser.parse(value));
    }

    public String marshal(RevocationType value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationTypeParser.print(value));
    }

}

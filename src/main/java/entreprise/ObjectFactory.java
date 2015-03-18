
package entreprise;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entreprise package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MethodeResponse_QNAME = new QName("http://entreprise/", "methodeResponse");
    private final static QName _Methode_QNAME = new QName("http://entreprise/", "methode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entreprise
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Methode }
     * 
     */
    public Methode createMethode() {
        return new Methode();
    }

    /**
     * Create an instance of {@link MethodeResponse }
     * 
     */
    public MethodeResponse createMethodeResponse() {
        return new MethodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MethodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entreprise/", name = "methodeResponse")
    public JAXBElement<MethodeResponse> createMethodeResponse(MethodeResponse value) {
        return new JAXBElement<MethodeResponse>(_MethodeResponse_QNAME, MethodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Methode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entreprise/", name = "methode")
    public JAXBElement<Methode> createMethode(Methode value) {
        return new JAXBElement<Methode>(_Methode_QNAME, Methode.class, null, value);
    }

}

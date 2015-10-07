
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

    private final static QName _MaMethode_QNAME = new QName("http://entreprise/", "maMethode");
    private final static QName _MaMethodeResponse_QNAME = new QName("http://entreprise/", "maMethodeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entreprise
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaMethodeResponse }
     * 
     */
    public MaMethodeResponse createMaMethodeResponse() {
        return new MaMethodeResponse();
    }

    /**
     * Create an instance of {@link MaMethode }
     * 
     */
    public MaMethode createMaMethode() {
        return new MaMethode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMethode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entreprise/", name = "maMethode")
    public JAXBElement<MaMethode> createMaMethode(MaMethode value) {
        return new JAXBElement<MaMethode>(_MaMethode_QNAME, MaMethode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaMethodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entreprise/", name = "maMethodeResponse")
    public JAXBElement<MaMethodeResponse> createMaMethodeResponse(MaMethodeResponse value) {
        return new JAXBElement<MaMethodeResponse>(_MaMethodeResponse_QNAME, MaMethodeResponse.class, null, value);
    }

}

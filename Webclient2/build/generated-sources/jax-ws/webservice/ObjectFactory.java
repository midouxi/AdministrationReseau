
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _Creerfichier_QNAME = new QName("http://WebService/", "creerfichier");
    private final static QName _ExecuteCommand_QNAME = new QName("http://WebService/", "executeCommand");
    private final static QName _ExecuteCommandResponse_QNAME = new QName("http://WebService/", "executeCommandResponse");
    private final static QName _CreerfichierResponse_QNAME = new QName("http://WebService/", "creerfichierResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerfichierResponse }
     * 
     */
    public CreerfichierResponse createCreerfichierResponse() {
        return new CreerfichierResponse();
    }

    /**
     * Create an instance of {@link ExecuteCommandResponse }
     * 
     */
    public ExecuteCommandResponse createExecuteCommandResponse() {
        return new ExecuteCommandResponse();
    }

    /**
     * Create an instance of {@link Creerfichier }
     * 
     */
    public Creerfichier createCreerfichier() {
        return new Creerfichier();
    }

    /**
     * Create an instance of {@link ExecuteCommand }
     * 
     */
    public ExecuteCommand createExecuteCommand() {
        return new ExecuteCommand();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Creerfichier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "creerfichier")
    public JAXBElement<Creerfichier> createCreerfichier(Creerfichier value) {
        return new JAXBElement<Creerfichier>(_Creerfichier_QNAME, Creerfichier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCommand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "executeCommand")
    public JAXBElement<ExecuteCommand> createExecuteCommand(ExecuteCommand value) {
        return new JAXBElement<ExecuteCommand>(_ExecuteCommand_QNAME, ExecuteCommand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCommandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "executeCommandResponse")
    public JAXBElement<ExecuteCommandResponse> createExecuteCommandResponse(ExecuteCommandResponse value) {
        return new JAXBElement<ExecuteCommandResponse>(_ExecuteCommandResponse_QNAME, ExecuteCommandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerfichierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "creerfichierResponse")
    public JAXBElement<CreerfichierResponse> createCreerfichierResponse(CreerfichierResponse value) {
        return new JAXBElement<CreerfichierResponse>(_CreerfichierResponse_QNAME, CreerfichierResponse.class, null, value);
    }

}

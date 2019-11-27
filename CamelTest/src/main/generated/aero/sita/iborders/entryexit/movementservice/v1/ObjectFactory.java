
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import aero.sita.iborders.entryexit.common.v1.FaultType;
import aero.sita.iborders.entryexit.common.v1.KeyValueType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.sita.iborders.entryexit.movementservice.v1 package. 
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

    private final static QName _UpdateMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "UpdateMovementFault");
    private final static QName _Data_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "Data");
    private final static QName _GetMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "GetMovementFault");
    private final static QName _CancelMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "CancelMovementFault");
    private final static QName _FindMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindMovementFault");
    private final static QName _GetRejectedMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "GetRejectedMovementRequest");
    private final static QName _ListRejectedMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListRejectedMovementFault");
    private final static QName _CreateMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "CreateMovementRequest");
    private final static QName _ListMovementResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListMovementResponse");
    private final static QName _FindShipArrivalMovementsFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindShipArrivalMovementsFault");
    private final static QName _ListRejectedMovementResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListRejectedMovementResponse");
    private final static QName _GetRejectedMovementResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "GetRejectedMovementResponse");
    private final static QName _CreateMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "CreateMovementFault");
    private final static QName _CreateUpdateMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "CreateUpdateMovementFault");
    private final static QName _ListMovementCriteria_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListMovementCriteria");
    private final static QName _ListMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListMovementRequest");
    private final static QName _ListRejectedMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListRejectedMovementRequest");
    private final static QName _GetRejectedMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "GetRejectedMovementFault");
    private final static QName _FindShipArrivalMovementsRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindShipArrivalMovementsRequest");
    private final static QName _GetMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "GetMovementRequest");
    private final static QName _CreateUpdateMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "CreateUpdateMovementRequest");
    private final static QName _FindMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindMovementRequest");
    private final static QName _FindMovementCriteria_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindMovementCriteria");
    private final static QName _CancelMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "CancelMovementRequest");
    private final static QName _FindShipArrivalMovementsResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindShipArrivalMovementsResponse");
    private final static QName _FindMovementResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "FindMovementResponse");
    private final static QName _UpdateMovementRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "UpdateMovementRequest");
    private final static QName _GetMovementResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "GetMovementResponse");
    private final static QName _ListMovementFault_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ListMovementFault");
    private final static QName _ListMovementCriteriaTypeEndDateTime_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "EndDateTime");
    private final static QName _ListMovementCriteriaTypeStatus_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "Status");
    private final static QName _ListMovementCriteriaTypeStartDateTime_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "StartDateTime");
    private final static QName _MovementLinkTypeCompanion_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "Companion");
    private final static QName _MovementTypeStayExpiryDate_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "StayExpiryDate");
    private final static QName _MovementTypeVisa_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "Visa");
    private final static QName _MovementTypeLinks_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "Links");
    private final static QName _MovementTypeVesselId_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "VesselId");
    private final static QName _MovementTypeEvents_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "Events");
    private final static QName _MovementTypeOwnerRole_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "OwnerRole");
    private final static QName _MovementTypeAdditionalData_QNAME = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "AdditionalData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.sita.iborders.entryexit.movementservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindShipArrivalMovementsResponseType }
     * 
     */
    public FindShipArrivalMovementsResponseType createFindShipArrivalMovementsResponseType() {
        return new FindShipArrivalMovementsResponseType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link OverstayInfoType }
     * 
     */
    public OverstayInfoType createOverstayInfoType() {
        return new OverstayInfoType();
    }

    /**
     * Create an instance of {@link CancelMovementResponse }
     * 
     */
    public CancelMovementResponse createCancelMovementResponse() {
        return new CancelMovementResponse();
    }

    /**
     * Create an instance of {@link GetRejectedMovementResponseType }
     * 
     */
    public GetRejectedMovementResponseType createGetRejectedMovementResponseType() {
        return new GetRejectedMovementResponseType();
    }

    /**
     * Create an instance of {@link GetMovementResponseType }
     * 
     */
    public GetMovementResponseType createGetMovementResponseType() {
        return new GetMovementResponseType();
    }

    /**
     * Create an instance of {@link CreateMovementRequestType }
     * 
     */
    public CreateMovementRequestType createCreateMovementRequestType() {
        return new CreateMovementRequestType();
    }

    /**
     * Create an instance of {@link ListMovementResponseType }
     * 
     */
    public ListMovementResponseType createListMovementResponseType() {
        return new ListMovementResponseType();
    }

    /**
     * Create an instance of {@link FindMovementResponseType }
     * 
     */
    public FindMovementResponseType createFindMovementResponseType() {
        return new FindMovementResponseType();
    }

    /**
     * Create an instance of {@link RejectedMovementType }
     * 
     */
    public RejectedMovementType createRejectedMovementType() {
        return new RejectedMovementType();
    }

    /**
     * Create an instance of {@link PassengerArrivalListType }
     * 
     */
    public PassengerArrivalListType createPassengerArrivalListType() {
        return new PassengerArrivalListType();
    }

    /**
     * Create an instance of {@link ListMovementRequestType }
     * 
     */
    public ListMovementRequestType createListMovementRequestType() {
        return new ListMovementRequestType();
    }

    /**
     * Create an instance of {@link CreateMovementResponse }
     * 
     */
    public CreateMovementResponse createCreateMovementResponse() {
        return new CreateMovementResponse();
    }

    /**
     * Create an instance of {@link CompanionLinkType }
     * 
     */
    public CompanionLinkType createCompanionLinkType() {
        return new CompanionLinkType();
    }

    /**
     * Create an instance of {@link ListRejectedMovementResponseType }
     * 
     */
    public ListRejectedMovementResponseType createListRejectedMovementResponseType() {
        return new ListRejectedMovementResponseType();
    }

    /**
     * Create an instance of {@link TaggedMovementType }
     * 
     */
    public TaggedMovementType createTaggedMovementType() {
        return new TaggedMovementType();
    }

    /**
     * Create an instance of {@link CreateUpdateMovementRequestType }
     * 
     */
    public CreateUpdateMovementRequestType createCreateUpdateMovementRequestType() {
        return new CreateUpdateMovementRequestType();
    }

    /**
     * Create an instance of {@link MovementType }
     * 
     */
    public MovementType createMovementType() {
        return new MovementType();
    }

    /**
     * Create an instance of {@link MovementLinkType }
     * 
     */
    public MovementLinkType createMovementLinkType() {
        return new MovementLinkType();
    }

    /**
     * Create an instance of {@link GetRejectedMovementType }
     * 
     */
    public GetRejectedMovementType createGetRejectedMovementType() {
        return new GetRejectedMovementType();
    }

    /**
     * Create an instance of {@link EndorseeLinkType }
     * 
     */
    public EndorseeLinkType createEndorseeLinkType() {
        return new EndorseeLinkType();
    }

    /**
     * Create an instance of {@link UpdateMovementRequestType }
     * 
     */
    public UpdateMovementRequestType createUpdateMovementRequestType() {
        return new UpdateMovementRequestType();
    }

    /**
     * Create an instance of {@link UpdateMovementResponse }
     * 
     */
    public UpdateMovementResponse createUpdateMovementResponse() {
        return new UpdateMovementResponse();
    }

    /**
     * Create an instance of {@link MovementListType }
     * 
     */
    public MovementListType createMovementListType() {
        return new MovementListType();
    }

    /**
     * Create an instance of {@link RejectedMovementXmlType }
     * 
     */
    public RejectedMovementXmlType createRejectedMovementXmlType() {
        return new RejectedMovementXmlType();
    }

    /**
     * Create an instance of {@link FindShipArrivalMovementsRequestType }
     * 
     */
    public FindShipArrivalMovementsRequestType createFindShipArrivalMovementsRequestType() {
        return new FindShipArrivalMovementsRequestType();
    }

    /**
     * Create an instance of {@link ListRejectedMovementRequestType }
     * 
     */
    public ListRejectedMovementRequestType createListRejectedMovementRequestType() {
        return new ListRejectedMovementRequestType();
    }

    /**
     * Create an instance of {@link AdditionalDataType }
     * 
     */
    public AdditionalDataType createAdditionalDataType() {
        return new AdditionalDataType();
    }

    /**
     * Create an instance of {@link ListMovementCriteriaType }
     * 
     */
    public ListMovementCriteriaType createListMovementCriteriaType() {
        return new ListMovementCriteriaType();
    }

    /**
     * Create an instance of {@link CreateUpdateMovementResponse }
     * 
     */
    public CreateUpdateMovementResponse createCreateUpdateMovementResponse() {
        return new CreateUpdateMovementResponse();
    }

    /**
     * Create an instance of {@link FindMovementCriteriaType }
     * 
     */
    public FindMovementCriteriaType createFindMovementCriteriaType() {
        return new FindMovementCriteriaType();
    }

    /**
     * Create an instance of {@link MovementType.Events }
     * 
     */
    public MovementType.Events createMovementTypeEvents() {
        return new MovementType.Events();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link CancelMovementRequestType }
     * 
     */
    public CancelMovementRequestType createCancelMovementRequestType() {
        return new CancelMovementRequestType();
    }

    /**
     * Create an instance of {@link VisaType }
     * 
     */
    public VisaType createVisaType() {
        return new VisaType();
    }

    /**
     * Create an instance of {@link FindMovementRequestType }
     * 
     */
    public FindMovementRequestType createFindMovementRequestType() {
        return new FindMovementRequestType();
    }

    /**
     * Create an instance of {@link GetMovementRequestType }
     * 
     */
    public GetMovementRequestType createGetMovementRequestType() {
        return new GetMovementRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "UpdateMovementFault")
    public JAXBElement<FaultType> createUpdateMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_UpdateMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Data")
    public JAXBElement<KeyValueType> createData(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_Data_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "GetMovementFault")
    public JAXBElement<FaultType> createGetMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_GetMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "CancelMovementFault")
    public JAXBElement<FaultType> createCancelMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_CancelMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindMovementFault")
    public JAXBElement<FaultType> createFindMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_FindMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRejectedMovementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "GetRejectedMovementRequest")
    public JAXBElement<GetRejectedMovementType> createGetRejectedMovementRequest(GetRejectedMovementType value) {
        return new JAXBElement<GetRejectedMovementType>(_GetRejectedMovementRequest_QNAME, GetRejectedMovementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListRejectedMovementFault")
    public JAXBElement<FaultType> createListRejectedMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_ListRejectedMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "CreateMovementRequest")
    public JAXBElement<CreateMovementRequestType> createCreateMovementRequest(CreateMovementRequestType value) {
        return new JAXBElement<CreateMovementRequestType>(_CreateMovementRequest_QNAME, CreateMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListMovementResponse")
    public JAXBElement<ListMovementResponseType> createListMovementResponse(ListMovementResponseType value) {
        return new JAXBElement<ListMovementResponseType>(_ListMovementResponse_QNAME, ListMovementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindShipArrivalMovementsFault")
    public JAXBElement<FaultType> createFindShipArrivalMovementsFault(FaultType value) {
        return new JAXBElement<FaultType>(_FindShipArrivalMovementsFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRejectedMovementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListRejectedMovementResponse")
    public JAXBElement<ListRejectedMovementResponseType> createListRejectedMovementResponse(ListRejectedMovementResponseType value) {
        return new JAXBElement<ListRejectedMovementResponseType>(_ListRejectedMovementResponse_QNAME, ListRejectedMovementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRejectedMovementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "GetRejectedMovementResponse")
    public JAXBElement<GetRejectedMovementResponseType> createGetRejectedMovementResponse(GetRejectedMovementResponseType value) {
        return new JAXBElement<GetRejectedMovementResponseType>(_GetRejectedMovementResponse_QNAME, GetRejectedMovementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "CreateMovementFault")
    public JAXBElement<FaultType> createCreateMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_CreateMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "CreateUpdateMovementFault")
    public JAXBElement<FaultType> createCreateUpdateMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_CreateUpdateMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovementCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListMovementCriteria")
    public JAXBElement<ListMovementCriteriaType> createListMovementCriteria(ListMovementCriteriaType value) {
        return new JAXBElement<ListMovementCriteriaType>(_ListMovementCriteria_QNAME, ListMovementCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListMovementRequest")
    public JAXBElement<ListMovementRequestType> createListMovementRequest(ListMovementRequestType value) {
        return new JAXBElement<ListMovementRequestType>(_ListMovementRequest_QNAME, ListMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRejectedMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListRejectedMovementRequest")
    public JAXBElement<ListRejectedMovementRequestType> createListRejectedMovementRequest(ListRejectedMovementRequestType value) {
        return new JAXBElement<ListRejectedMovementRequestType>(_ListRejectedMovementRequest_QNAME, ListRejectedMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "GetRejectedMovementFault")
    public JAXBElement<FaultType> createGetRejectedMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_GetRejectedMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShipArrivalMovementsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindShipArrivalMovementsRequest")
    public JAXBElement<FindShipArrivalMovementsRequestType> createFindShipArrivalMovementsRequest(FindShipArrivalMovementsRequestType value) {
        return new JAXBElement<FindShipArrivalMovementsRequestType>(_FindShipArrivalMovementsRequest_QNAME, FindShipArrivalMovementsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "GetMovementRequest")
    public JAXBElement<GetMovementRequestType> createGetMovementRequest(GetMovementRequestType value) {
        return new JAXBElement<GetMovementRequestType>(_GetMovementRequest_QNAME, GetMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUpdateMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "CreateUpdateMovementRequest")
    public JAXBElement<CreateUpdateMovementRequestType> createCreateUpdateMovementRequest(CreateUpdateMovementRequestType value) {
        return new JAXBElement<CreateUpdateMovementRequestType>(_CreateUpdateMovementRequest_QNAME, CreateUpdateMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindMovementRequest")
    public JAXBElement<FindMovementRequestType> createFindMovementRequest(FindMovementRequestType value) {
        return new JAXBElement<FindMovementRequestType>(_FindMovementRequest_QNAME, FindMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovementCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindMovementCriteria")
    public JAXBElement<FindMovementCriteriaType> createFindMovementCriteria(FindMovementCriteriaType value) {
        return new JAXBElement<FindMovementCriteriaType>(_FindMovementCriteria_QNAME, FindMovementCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "CancelMovementRequest")
    public JAXBElement<CancelMovementRequestType> createCancelMovementRequest(CancelMovementRequestType value) {
        return new JAXBElement<CancelMovementRequestType>(_CancelMovementRequest_QNAME, CancelMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShipArrivalMovementsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindShipArrivalMovementsResponse")
    public JAXBElement<FindShipArrivalMovementsResponseType> createFindShipArrivalMovementsResponse(FindShipArrivalMovementsResponseType value) {
        return new JAXBElement<FindShipArrivalMovementsResponseType>(_FindShipArrivalMovementsResponse_QNAME, FindShipArrivalMovementsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "FindMovementResponse")
    public JAXBElement<FindMovementResponseType> createFindMovementResponse(FindMovementResponseType value) {
        return new JAXBElement<FindMovementResponseType>(_FindMovementResponse_QNAME, FindMovementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "UpdateMovementRequest")
    public JAXBElement<UpdateMovementRequestType> createUpdateMovementRequest(UpdateMovementRequestType value) {
        return new JAXBElement<UpdateMovementRequestType>(_UpdateMovementRequest_QNAME, UpdateMovementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "GetMovementResponse")
    public JAXBElement<GetMovementResponseType> createGetMovementResponse(GetMovementResponseType value) {
        return new JAXBElement<GetMovementResponseType>(_GetMovementResponse_QNAME, GetMovementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "ListMovementFault")
    public JAXBElement<FaultType> createListMovementFault(FaultType value) {
        return new JAXBElement<FaultType>(_ListMovementFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "EndDateTime", scope = ListMovementCriteriaType.class)
    public JAXBElement<XMLGregorianCalendar> createListMovementCriteriaTypeEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListMovementCriteriaTypeEndDateTime_QNAME, XMLGregorianCalendar.class, ListMovementCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Status", scope = ListMovementCriteriaType.class)
    public JAXBElement<MovementStatus> createListMovementCriteriaTypeStatus(MovementStatus value) {
        return new JAXBElement<MovementStatus>(_ListMovementCriteriaTypeStatus_QNAME, MovementStatus.class, ListMovementCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "StartDateTime", scope = ListMovementCriteriaType.class)
    public JAXBElement<XMLGregorianCalendar> createListMovementCriteriaTypeStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListMovementCriteriaTypeStartDateTime_QNAME, XMLGregorianCalendar.class, ListMovementCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanionLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Companion", scope = MovementLinkType.class)
    public JAXBElement<CompanionLinkType> createMovementLinkTypeCompanion(CompanionLinkType value) {
        return new JAXBElement<CompanionLinkType>(_MovementLinkTypeCompanion_QNAME, CompanionLinkType.class, MovementLinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "StayExpiryDate", scope = MovementType.class)
    public JAXBElement<XMLGregorianCalendar> createMovementTypeStayExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovementTypeStayExpiryDate_QNAME, XMLGregorianCalendar.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Visa", scope = MovementType.class)
    public JAXBElement<VisaType> createMovementTypeVisa(VisaType value) {
        return new JAXBElement<VisaType>(_MovementTypeVisa_QNAME, VisaType.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Links", scope = MovementType.class)
    public JAXBElement<MovementLinkType> createMovementTypeLinks(MovementLinkType value) {
        return new JAXBElement<MovementLinkType>(_MovementTypeLinks_QNAME, MovementLinkType.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "VesselId", scope = MovementType.class)
    public JAXBElement<String> createMovementTypeVesselId(String value) {
        return new JAXBElement<String>(_MovementTypeVesselId_QNAME, String.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementType.Events }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Events", scope = MovementType.class)
    public JAXBElement<MovementType.Events> createMovementTypeEvents(MovementType.Events value) {
        return new JAXBElement<MovementType.Events>(_MovementTypeEvents_QNAME, MovementType.Events.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "OwnerRole", scope = MovementType.class)
    public JAXBElement<Short> createMovementTypeOwnerRole(Short value) {
        return new JAXBElement<Short>(_MovementTypeOwnerRole_QNAME, Short.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "AdditionalData", scope = MovementType.class)
    public JAXBElement<AdditionalDataType> createMovementTypeAdditionalData(AdditionalDataType value) {
        return new JAXBElement<AdditionalDataType>(_MovementTypeAdditionalData_QNAME, AdditionalDataType.class, MovementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "EndDateTime", scope = FindMovementCriteriaType.class)
    public JAXBElement<XMLGregorianCalendar> createFindMovementCriteriaTypeEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListMovementCriteriaTypeEndDateTime_QNAME, XMLGregorianCalendar.class, FindMovementCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "Status", scope = FindMovementCriteriaType.class)
    public JAXBElement<MovementStatus> createFindMovementCriteriaTypeStatus(MovementStatus value) {
        return new JAXBElement<MovementStatus>(_ListMovementCriteriaTypeStatus_QNAME, MovementStatus.class, FindMovementCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "StartDateTime", scope = FindMovementCriteriaType.class)
    public JAXBElement<XMLGregorianCalendar> createFindMovementCriteriaTypeStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListMovementCriteriaTypeStartDateTime_QNAME, XMLGregorianCalendar.class, FindMovementCriteriaType.class, value);
    }

}

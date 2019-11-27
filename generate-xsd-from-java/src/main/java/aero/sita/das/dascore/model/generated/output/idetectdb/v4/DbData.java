package aero.sita.das.dascore.model.generated.output.idetectdb.v4;

import aero.sita.das.dascore.model.generated.output.idetectdb.v4.common.CarrierProcessingInfo;
import aero.sita.das.dascore.modelling.CorrectAndReportHelper;
import aero.sita.das.dascore.modelling.Correctable;
import aero.sita.das.dascore.modelling.CorrectionHelper;
import aero.sita.das.dascore.modelling.DiffHelper;
import aero.sita.das.dascore.modelling.ErrorReporting;
import aero.sita.das.dascore.modelling.XmlDiffable;
import aero.sita.das.dascore.modelling.generated.ValidationError;
import aero.sita.das.dascore.modelling.generated.ViolationError;
import aero.sita.das.dascore.modelling.generated.ViolationErrorHolder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.hibernate.annotations.Index;





























































@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DbData", propOrder={"createdDateTime", "sequenceNumber", "clientSystem", "journeySegment", "ruleInfo", "noOfPax", "noOfCrew", "noOfPaxApi", "noOfPaxDcs", "noOfPaxPnr", "apiList", "dcsList", "pnrList", "linkageList"})
@XmlRootElement(name="DbData")
@Entity(name="DbData")
@SequenceGenerator(name="SEQ_STORE", sequenceName="DbData_seq")
public class DbData
  implements Serializable, Cloneable, Comparable<DbData>, Correctable, ErrorReporting, XmlDiffable
{
  @XmlElement(name="CreatedDateTime", required=true)
  protected String createdDateTime;
  @XmlElement(name="SequenceNumber")
  protected int sequenceNumber;
  @XmlElement(name="ClientSystem")
  protected ClientSystemType clientSystem;
  @XmlElement(name="JourneySegment", required=true)
  protected JourneySegmentType journeySegment;
  @XmlElement(name="RuleInfo", required=true)
  protected CarrierProcessingInfo ruleInfo;
  @XmlElement(name="NoOfPax")
  protected Integer noOfPax;
  @XmlElement(name="NoOfCrew")
  protected Integer noOfCrew;
  @XmlElement(name="NoOfPaxApi")
  protected Integer noOfPaxApi;
  @XmlElement(name="NoOfPaxDcs")
  protected Integer noOfPaxDcs;
  @XmlElement(name="NoOfPaxPnr")
  protected Integer noOfPaxPnr;
  @XmlElement(name="ApiList")
  protected ApiListType apiList;
  @XmlElement(name="DcsList")
  protected DcsListType dcsList;
  @XmlElement(name="PnrList")
  protected PnrListType pnrList;
  @XmlElement(name="LinkageList")
  protected LinkageListType linkageList;
  @XmlTransient
  protected ViolationErrorHolder violationErrorHolder;
  @XmlTransient
  private static final DATE19_TYPE date19_type = new DATE19_TYPE();
  

  @XmlTransient
  protected Long id;
  


  public DbData() {}
  

  @Column(name="CreatedDateTime")
  public String getCreatedDateTime()
  {
    return createdDateTime;
  }
  







  public void setCreatedDateTime(String value)
  {
    createdDateTime = value;
  }
  



  @Column(name="SequenceNumber")
  public int getSequenceNumber()
  {
    return sequenceNumber;
  }
  



  public void setSequenceNumber(int value)
  {
    sequenceNumber = value;
  }
  







  @Enumerated(EnumType.STRING)
  public ClientSystemType getClientSystem()
  {
    return clientSystem;
  }
  







  public void setClientSystem(ClientSystemType value)
  {
    clientSystem = value;
  }
  







  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_JourneySegment_fk")
  @Index(name="DbDataJourneySegmentIndex")
  public JourneySegmentType getJourneySegment()
  {
    return journeySegment;
  }
  







  public void setJourneySegment(JourneySegmentType value)
  {
    journeySegment = value;
  }
  







  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_RuleInfo_fk")
  @Index(name="DbDataRuleInfoIndex")
  public CarrierProcessingInfo getRuleInfo()
  {
    return ruleInfo;
  }
  







  public void setRuleInfo(CarrierProcessingInfo value)
  {
    ruleInfo = value;
  }
  







  @Column(name="NoOfPax")
  public Integer getNoOfPax()
  {
    return noOfPax;
  }
  







  public void setNoOfPax(Integer value)
  {
    noOfPax = value;
  }
  







  @Column(name="NoOfCrew")
  public Integer getNoOfCrew()
  {
    return noOfCrew;
  }
  







  public void setNoOfCrew(Integer value)
  {
    noOfCrew = value;
  }
  







  @Column(name="NoOfPaxApi")
  public Integer getNoOfPaxApi()
  {
    return noOfPaxApi;
  }
  







  public void setNoOfPaxApi(Integer value)
  {
    noOfPaxApi = value;
  }
  







  @Column(name="NoOfPaxDcs")
  public Integer getNoOfPaxDcs()
  {
    return noOfPaxDcs;
  }
  







  public void setNoOfPaxDcs(Integer value)
  {
    noOfPaxDcs = value;
  }
  







  @Column(name="NoOfPaxPnr")
  public Integer getNoOfPaxPnr()
  {
    return noOfPaxPnr;
  }
  







  public void setNoOfPaxPnr(Integer value)
  {
    noOfPaxPnr = value;
  }
  







  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_ApiList_fk")
  @Index(name="DbDataApiListIndex")
  public ApiListType getApiList()
  {
    return apiList;
  }
  







  public void setApiList(ApiListType value)
  {
    apiList = value;
  }
  







  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_DcsList_fk")
  @Index(name="DbDataDcsListIndex")
  public DcsListType getDcsList()
  {
    return dcsList;
  }
  







  public void setDcsList(DcsListType value)
  {
    dcsList = value;
  }
  







  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_PnrList_fk")
  @Index(name="DbDataPnrListIndex")
  public PnrListType getPnrList()
  {
    return pnrList;
  }
  







  public void setPnrList(PnrListType value)
  {
    pnrList = value;
  }
  







  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_LinkageList_fk")
  @Index(name="DbDataLinkageListIndex")
  public LinkageListType getLinkageList()
  {
    return linkageList;
  }
  







  public void setLinkageList(LinkageListType value)
  {
    linkageList = value;
  }
  
  @OneToOne(cascade={javax.persistence.CascadeType.ALL})
  @JoinColumn(name="DbData_ViolationErrorHolder_fk")
  @Index(name="DbDtVltnErrrHldrIndx")
  public ViolationErrorHolder getViolationErrorHolder()
  {
    return violationErrorHolder;
  }
  
  public void setViolationErrorHolder(ViolationErrorHolder value)
  {
    violationErrorHolder = value;
  }
  
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
  public Long getId() {
    return id;
  }
  
  public void setId(Long value) {
    id = value;
  }
  
  public void correctViolations()
  {
    if ((createdDateTime != null) && (!date19_type.isAllowed(createdDateTime))) {
      createdDateTime = CorrectionHelper.getErrorAndCorrect(this, "CreatedDateTime", createdDateTime, date19_type);
    }
    if (journeySegment != null) {
      journeySegment.correctViolations();
    }
    if (ruleInfo != null) {
      ruleInfo.correctViolations();
    }
    if ((noOfPax != null) && (Integer.signum(noOfPax.intValue()) * noOfPax.intValue() > 9999)) {
      noOfPax = CorrectionHelper.getErrorAndCorrect(this, "NoOfPax", noOfPax.intValue(), 9999);
    }
    if ((noOfCrew != null) && (Integer.signum(noOfCrew.intValue()) * noOfCrew.intValue() > 9999)) {
      noOfCrew = CorrectionHelper.getErrorAndCorrect(this, "NoOfCrew", noOfCrew.intValue(), 9999);
    }
    if ((noOfPaxApi != null) && (Integer.signum(noOfPaxApi.intValue()) * noOfPaxApi.intValue() > 9999)) {
      noOfPaxApi = CorrectionHelper.getErrorAndCorrect(this, "NoOfPaxApi", noOfPaxApi.intValue(), 9999);
    }
    if ((noOfPaxDcs != null) && (Integer.signum(noOfPaxDcs.intValue()) * noOfPaxDcs.intValue() > 9999)) {
      noOfPaxDcs = CorrectionHelper.getErrorAndCorrect(this, "NoOfPaxDcs", noOfPaxDcs.intValue(), 9999);
    }
    if ((noOfPaxPnr != null) && (Integer.signum(noOfPaxPnr.intValue()) * noOfPaxPnr.intValue() > 9999)) {
      noOfPaxPnr = CorrectionHelper.getErrorAndCorrect(this, "NoOfPaxPnr", noOfPaxPnr.intValue(), 9999);
    }
    if (apiList != null) {
      apiList.correctViolations();
    }
    if (dcsList != null) {
      dcsList.correctViolations();
    }
    if (pnrList != null) {
      pnrList.correctViolations();
    }
    if (linkageList != null) {
      linkageList.correctViolations();
    }
  }
  
  @Transient
  public DbData getUncorrected()
  {
    if (violationErrorHolder != null) {
      DbData uncorrected = clone();
      

      for (ViolationError error : violationErrorHolder.getViolationError()) {
        String errorElement = error.getElement();
        String errorData = error.getData();
        if ("CreatedDateTime".equals(errorElement)) {
          uncorrected.setCreatedDateTime(errorData);
        }
        else if ("NoOfPax".equals(errorElement)) {
          uncorrected.setNoOfPax(new Integer(errorData));
        }
        else if ("NoOfCrew".equals(errorElement)) {
          uncorrected.setNoOfCrew(new Integer(errorData));
        }
        else if ("NoOfPaxApi".equals(errorElement)) {
          uncorrected.setNoOfPaxApi(new Integer(errorData));
        }
        else if ("NoOfPaxDcs".equals(errorElement)) {
          uncorrected.setNoOfPaxDcs(new Integer(errorData));
        }
        else if ("NoOfPaxPnr".equals(errorElement)) {
          uncorrected.setNoOfPaxPnr(new Integer(errorData));
        }
      }
      





      return uncorrected;
    }
    return this;
  }
  
  public DbData clone()
  {
    try {
      return (DbData)super.clone();
    }
    catch (CloneNotSupportedException e) {
      throw new Error("Clone Failed!");
    }
  }
  
  public String toString()
  {
    StringBuffer sb = new StringBuffer();
    sb.append("[DbData:");
    sb.append(" createdDateTime:");
    sb.append(createdDateTime);
    sb.append(" sequenceNumber:");
    sb.append(sequenceNumber);
    sb.append(" clientSystem:");
    sb.append(clientSystem);
    sb.append(" journeySegment:");
    sb.append(journeySegment);
    sb.append(" ruleInfo:");
    sb.append(ruleInfo);
    sb.append(" noOfPax:");
    sb.append(noOfPax);
    sb.append(" noOfCrew:");
    sb.append(noOfCrew);
    sb.append(" noOfPaxApi:");
    sb.append(noOfPaxApi);
    sb.append(" noOfPaxDcs:");
    sb.append(noOfPaxDcs);
    sb.append(" noOfPaxPnr:");
    sb.append(noOfPaxPnr);
    sb.append(" apiList:");
    sb.append(apiList);
    sb.append(" dcsList:");
    sb.append(dcsList);
    sb.append(" pnrList:");
    sb.append(pnrList);
    sb.append(" linkageList:");
    sb.append(linkageList);
    sb.append(" violationErrorHolder:");
    sb.append(violationErrorHolder);
    sb.append(" hashCode:");
    sb.append(hashCode());
    sb.append(']');
    return sb.toString();
  }
  
  public boolean equals(Object obj)
  {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof DbData)) {
      return false;
    }
    DbData that = (DbData)obj;
    return (violationErrorHolder == null ? violationErrorHolder == null : violationErrorHolder.equals(violationErrorHolder)) && (createdDateTime == null ? createdDateTime == null : createdDateTime.equals(createdDateTime)) && (sequenceNumber == sequenceNumber) && (clientSystem == null ? clientSystem == null : clientSystem.equals(clientSystem)) && (journeySegment == null ? journeySegment == null : journeySegment.equals(journeySegment)) && (ruleInfo == null ? ruleInfo == null : ruleInfo.equals(ruleInfo)) && (noOfPax == null ? noOfPax == null : noOfPax.equals(noOfPax)) && (noOfCrew == null ? noOfCrew == null : noOfCrew.equals(noOfCrew)) && (noOfPaxApi == null ? noOfPaxApi == null : noOfPaxApi.equals(noOfPaxApi)) && (noOfPaxDcs == null ? noOfPaxDcs == null : noOfPaxDcs.equals(noOfPaxDcs)) && (noOfPaxPnr == null ? noOfPaxPnr == null : noOfPaxPnr.equals(noOfPaxPnr)) && (apiList == null ? apiList == null : apiList.equals(apiList)) && (dcsList == null ? dcsList == null : dcsList.equals(dcsList)) && (pnrList == null ? pnrList == null : pnrList.equals(pnrList)) && (linkageList == null ? linkageList == null : linkageList.equals(linkageList));
  }
  

  public int hashCode()
  {
    int _hash = 17;
    _hash = 33 * _hash + (getViolationErrorHolder() == null ? 0 : getViolationErrorHolder().hashCode());
    _hash = 33 * _hash + (getCreatedDateTime() == null ? 0 : getCreatedDateTime().hashCode());
    _hash = 33 * _hash + getSequenceNumber();
    _hash = 33 * _hash + (getClientSystem() == null ? 0 : getClientSystem().hashCode());
    _hash = 33 * _hash + (getJourneySegment() == null ? 0 : getJourneySegment().hashCode());
    _hash = 33 * _hash + (getRuleInfo() == null ? 0 : getRuleInfo().hashCode());
    _hash = 33 * _hash + (getNoOfPax() == null ? 0 : getNoOfPax().hashCode());
    _hash = 33 * _hash + (getNoOfCrew() == null ? 0 : getNoOfCrew().hashCode());
    _hash = 33 * _hash + (getNoOfPaxApi() == null ? 0 : getNoOfPaxApi().hashCode());
    _hash = 33 * _hash + (getNoOfPaxDcs() == null ? 0 : getNoOfPaxDcs().hashCode());
    _hash = 33 * _hash + (getNoOfPaxPnr() == null ? 0 : getNoOfPaxPnr().hashCode());
    _hash = 33 * _hash + (getApiList() == null ? 0 : getApiList().hashCode());
    _hash = 33 * _hash + (getDcsList() == null ? 0 : getDcsList().hashCode());
    _hash = 33 * _hash + (getPnrList() == null ? 0 : getPnrList().hashCode());
    _hash = 33 * _hash + (getLinkageList() == null ? 0 : getLinkageList().hashCode());
    return _hash;
  }
  

  public <T> List<String> diff(String _name, T obj)
  {
    List<String> diffList = new ArrayList();
    if (this != obj) {
      if (obj == null) {
        StringBuffer path = new StringBuffer();
        path.append(_name);
        path.append(" ( null value )");
        diffList.add(path.toString());
      }
      else if (!(obj instanceof DbData)) {
        StringBuffer path = new StringBuffer();
        path.append(_name);
        path.append(" ( not instance of DbData ) )");
        diffList.add(path.toString());
      } else {
        List<String> contentDiffList = new ArrayList();
        DbData that = (DbData)obj;
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "violationErrorHolder", violationErrorHolder, violationErrorHolder));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "CreatedDateTime", createdDateTime, createdDateTime));
        contentDiffList.addAll(DiffHelper.primitiveDiff(_name, "SequenceNumber", sequenceNumber, sequenceNumber));
        contentDiffList.addAll(DiffHelper.primitiveDiff(_name, "ClientSystem", clientSystem, clientSystem));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "JourneySegment", journeySegment, journeySegment));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "RuleInfo", ruleInfo, ruleInfo));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "NoOfPax", noOfPax, noOfPax));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "NoOfCrew", noOfCrew, noOfCrew));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "NoOfPaxApi", noOfPaxApi, noOfPaxApi));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "NoOfPaxDcs", noOfPaxDcs, noOfPaxDcs));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "NoOfPaxPnr", noOfPaxPnr, noOfPaxPnr));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "ApiList", apiList, apiList));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "DcsList", dcsList, dcsList));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "PnrList", pnrList, pnrList));
        contentDiffList.addAll(DiffHelper.objectDiff(_name, "LinkageList", linkageList, linkageList));
        if (contentDiffList.size() != 0) {
          diffList.addAll(contentDiffList);
        }
      }
    }
    
    if (diffList.size() == 0) {
      diffList = Collections.emptyList();
    }
    return diffList;
  }
  
  public List<ValidationError> correctAndReport(List<ValidationError> validationErrors, String xPath)
  {
    if (createdDateTime != null) {
      createdDateTime = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "CreatedDateTime", createdDateTime, date19_type);
    } else {
      createdDateTime = ((String)CorrectAndReportHelper.correctAndReport(validationErrors, xPath, "CreatedDateTime", date19_type.getDefaultValue()));
    }
    if ((sequenceNumber > 99999) || (sequenceNumber < 0)) {
      sequenceNumber = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "SequenceNumber", Integer.valueOf(sequenceNumber), 99999, 0).intValue();
    }
    if (journeySegment == null) {
      journeySegment = ((JourneySegmentType)CorrectAndReportHelper.correctAndReport(validationErrors, xPath, "JourneySegment", new JourneySegmentType()));
    }
    validationErrors = journeySegment.correctAndReport(validationErrors, xPath + '/' + "JourneySegment");
    if (ruleInfo == null) {
      ruleInfo = ((CarrierProcessingInfo)CorrectAndReportHelper.correctAndReport(validationErrors, xPath, "RuleInfo", new CarrierProcessingInfo()));
    }
    validationErrors = ruleInfo.correctAndReport(validationErrors, xPath + '/' + "RuleInfo");
    if (noOfPax != null) {
      noOfPax = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "NoOfPax", noOfPax, 9999, 0);
    }
    if (noOfCrew != null) {
      noOfCrew = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "NoOfCrew", noOfCrew, 9999, 0);
    }
    if (noOfPaxApi != null) {
      noOfPaxApi = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "NoOfPaxApi", noOfPaxApi, 9999, 0);
    }
    if (noOfPaxDcs != null) {
      noOfPaxDcs = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "NoOfPaxDcs", noOfPaxDcs, 9999, 0);
    }
    if (noOfPaxPnr != null) {
      noOfPaxPnr = CorrectAndReportHelper.correctAndReport(validationErrors, xPath + '/' + "NoOfPaxPnr", noOfPaxPnr, 9999, 0);
    }
    if (apiList != null) {
      validationErrors = apiList.correctAndReport(validationErrors, xPath + '/' + "ApiList");
    }
    if (dcsList != null) {
      validationErrors = dcsList.correctAndReport(validationErrors, xPath + '/' + "DcsList");
    }
    if (pnrList != null) {
      validationErrors = pnrList.correctAndReport(validationErrors, xPath + '/' + "PnrList");
    }
    if (linkageList != null) {
      validationErrors = linkageList.correctAndReport(validationErrors, xPath + '/' + "LinkageList");
    }
    return validationErrors;
  }
  
  public int compareTo(DbData obj)
  {
    if (this == obj) {
      return 0;
    }
    int result = 0;
    result = createdDateTime != null ? createdDateTime.compareTo(createdDateTime) : createdDateTime == null ? -1 : createdDateTime == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = sequenceNumber - sequenceNumber;
    if (result != 0) {
      return result;
    }
    result = clientSystem != null ? clientSystem.hashCode() - clientSystem.hashCode() : clientSystem == null ? -1 : clientSystem == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = journeySegment != null ? journeySegment.compareTo(journeySegment) : journeySegment == null ? -1 : journeySegment == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = ruleInfo != null ? ruleInfo.compareTo(ruleInfo) : ruleInfo == null ? -1 : ruleInfo == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = noOfPax != null ? noOfPax.compareTo(noOfPax) : noOfPax == null ? -1 : noOfPax == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = noOfCrew != null ? noOfCrew.compareTo(noOfCrew) : noOfCrew == null ? -1 : noOfCrew == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = noOfPaxApi != null ? noOfPaxApi.compareTo(noOfPaxApi) : noOfPaxApi == null ? -1 : noOfPaxApi == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = noOfPaxDcs != null ? noOfPaxDcs.compareTo(noOfPaxDcs) : noOfPaxDcs == null ? -1 : noOfPaxDcs == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = noOfPaxPnr != null ? noOfPaxPnr.compareTo(noOfPaxPnr) : noOfPaxPnr == null ? -1 : noOfPaxPnr == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = apiList != null ? apiList.compareTo(apiList) : apiList == null ? -1 : apiList == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = dcsList != null ? dcsList.compareTo(dcsList) : dcsList == null ? -1 : dcsList == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = pnrList != null ? pnrList.compareTo(pnrList) : pnrList == null ? -1 : pnrList == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = linkageList != null ? linkageList.compareTo(linkageList) : linkageList == null ? -1 : linkageList == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    result = violationErrorHolder != null ? violationErrorHolder.hashCode() - violationErrorHolder.hashCode() : violationErrorHolder == null ? -1 : violationErrorHolder == null ? 0 : 1;
    if (result != 0) {
      return result;
    }
    return result;
  }
  
  public void sort()
  {
    if (journeySegment != null) {
      journeySegment.sort();
    }
    if (ruleInfo != null) {
      ruleInfo.sort();
    }
    if (apiList != null) {
      apiList.sort();
    }
    if (dcsList != null) {
      dcsList.sort();
    }
    if (pnrList != null) {
      pnrList.sort();
    }
    if (linkageList != null) {
      linkageList.sort();
    }
  }
}
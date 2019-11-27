package com.test.camel.processor;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aero.sita.iborders.entryexit.movementservice.v1.CreateUpdateMovementRequestType;

public class SampleProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        
        /*String str= "<CreateUpdateMovementRequestType  xmlns=\"http://sita.aero/iborders/entryExit/MovementService/V1\" xmlns:ns2=\"http://sita.aero/iborders/entryExit/Common/V1\">"+
                    "    <Movement>"+
                    "        <Id>91196020-f59c-4dae-a716-d97ec8052b98</Id>"+
                    "        <WorkstationID>Sandhya</WorkstationID>"+
                    "        <App>EE</App>"+
                    "        <PersonId>872015</PersonId>"+
                    "        <IdentityId>835658</IdentityId>"+
                    "        <DateTime>2018-04-06T17:17:45.7667013+05:30</DateTime>"+
                    "        <Location>0104</Location>"+
                    "        <Status>Refer</Status>"+
                    "        <Direction>DEPARTURE</Direction>"+
                    "        <PaxType>Passenger</PaxType>"+
                    "        <IsBackLoad>0</IsBackLoad>"+
                    "        <TravelDocument>"+
                    "          <No>SANDHYA11</No>"+
                    "          <Type>P</Type>"+
                    "          <Names>"+
                    "            <GivenNames>KJH</GivenNames>"+
                    "            <FamilyName>KJH</FamilyName>"+
                    "            <LocaleID>en</LocaleID>"+
                    "          </Names>"+
                    "          <Gender>MALE</Gender>"+
                    "          <BirthDate>2000-09-01</BirthDate>"+
                    "          <Nationality>AUS</Nationality>"+
                    "          <IssuingState>AUS</IssuingState>"+
                    "          <IssueDate>2010-01-01</IssueDate>"+
                    "          <ExpiryDate>2020-01-01</ExpiryDate>"+
                    "        </TravelDocument>"+
                    "        <EntryTypeId>41</EntryTypeId>"+
                    "        <Visa>"+
                    "          <VisaTypeId>26A</VisaTypeId>"+
                    "          <No>1542785</No>"+
                    "          <IssueDate>2018-03-14T05:30:00+05:30</IssueDate>"+
                    "          <ExpiryDate>2018-03-24</ExpiryDate>"+
                    "        </Visa>"+
                "        <RuleId>3782</RuleId>"+
                "       <AssessRiskResult>DGPRVIS:NOHIT,DGCIDVIS:NOHIT,INTERPOL:NOHIT,COMPANIONINCOUNTRY:NA,PROFILE:NOHIT,RL1:UNKNOWN,RL2:PASS,VISA:INVALIDVISIT,LOCATION:IN</AssessRiskResult>"+
                "        <Outcome>0</Outcome>"+
                "        <VesselId>QF0001</VesselId>"+
                "        <StayExpiryDate>2018-03-24</StayExpiryDate>"+
                "        <OverstayPayment>"+
                "          <ReceiptNo />"+
                "          <Amount>"+
                "            <Amount>120</Amount>"+
                "            <Currency>OMR</Currency>"+
                "          </Amount>"+
                "        </OverstayPayment>"+
                "        <Events>"+
                "          <Event>"+
                "            <DateTime>2018-04-06T17:16:58.378963+05:30</DateTime>"+
                "            <EventType>SkipBiometrics</EventType>"+
                "            <Category>DNA</Category>"+
                "            <Description>Device Not Available</Description>"+
                "            <UserId>BORDERSUPERVISORS</UserId>"+
                "          </Event>"+
                "          <Event>"+
                "            <DateTime>2018-04-06T17:17:44.723597+05:30</DateTime>"+
                "            <EventType>ManualReferral</EventType>"+
                "            <Category>DCN</Category>"+
                "            <Description>ZXDSFDG</Description>"+
                "            <UserId>BORDERSUPERVISORS</UserId>"+
                "          </Event>"+
                "        </Events>"+
                "        <AdditionalData>"+
                "          <Data>"+
                "            <Key>IS_OFFLINE_MODE</Key>"+
                "            <DataType>STR</DataType>"+
                "            <ValueString>false</ValueString>"+
                "          </Data>"+
                "          <Data>"+
                "            <Key>Overstay_Total_Fine_Amount</Key>"+
                "            <DataType>STR</DataType>"+
                "            <ValueString>120</ValueString>"+
                "          </Data>"+
                "          <Data>"+
                "            <Key>FINAL_EXIT</Key>"+
                "            <DataType>STR</DataType>"+
                "            <ValueString>true</ValueString>"+
                "          </Data>"+
                "        </AdditionalData>"+
                "        <Links>"+
                "          <Endorsee>"+
                "            <Id>6ae169e6-90fb-4386-b0a2-4f90828d959f</Id>"+
                "            <PersonId>997162</PersonId>"+
                "            <IdentityId>957796</IdentityId>"+
                "            <Names>"+
                "              <GivenNames>FGUHJ</GivenNames>"+
                "              <FamilyName>FGHJ</FamilyName>"+
                "              <LocaleID>en</LocaleID>"+
                "            </Names>"+
                "            <Gender>MALE</Gender>"+
                "            <BirthDate>2002-01-01</BirthDate>"+
                "            <LinkType>EndorseeChild</LinkType>"+
                "          </Endorsee>"+
                "          <Endorsee>"+
                "            <Id>df89ddff-58ee-4064-9871-0f91e1d88fe6</Id>"+
                "            <PersonId>997161</PersonId>"+
                "            <IdentityId>957795</IdentityId>"+
                "            <Names>"+
                "              <FamilyName>FGYJHFGHJ</FamilyName>"+
                "              <LocaleID>en</LocaleID>"+
                "            </Names>"+
                "            <Gender>MALE</Gender>"+
                "            <BirthDate>2001-01-01</BirthDate>"+
                "            <LinkType>EndorseeChild</LinkType>"+
                "          </Endorsee>        "+
                "        </Links>"+
                "      </Movement>"+
                "      <AuditTag>"+
                "        <CreatedBy>BORDERSUPERVISORS</CreatedBy>"+
                "        <CreatedUserName>BORDER SUPERVISOR</CreatedUserName>"+
                "        <CreatedOn>2018-04-06T17:16:58.378963+05:30</CreatedOn>"+
                "        <LastUpdatedBy>BORDERSUPERVISORS</LastUpdatedBy>"+
                "        <LastUpdatedUserName>BORDER SUPERVISOR</LastUpdatedUserName>"+
                "        <LastUpdatedOn>2018-04-06T17:17:45.7867033+05:30</LastUpdatedOn>"+
                "      </AuditTag>"+
                "</CreateUpdateMovementRequestType>";
        
        JAXBContext context = JAXBContext.newInstance(CreateUpdateMovementRequestType.class);
        StringReader reader = new StringReader(str);
        StringReader reader1 = new StringReader(exchange.getIn().getBody(String.class));
        
        CreateUpdateMovementRequestType cmreq=null;
        
        
        try{
        Unmarshaller unmarshaller = context.createUnmarshaller();
        cmreq = (CreateUpdateMovementRequestType)unmarshaller.unmarshal(reader);
        }catch(Exception e)
        {
            e.printStackTrace();
        }*/
        
        CreateUpdateMovementRequestType cmreq = (CreateUpdateMovementRequestType) exchange.getIn().getBody(CreateUpdateMovementRequestType.class);
        if(cmreq==null)
        {
            JAXBContext context = JAXBContext.newInstance(CreateUpdateMovementRequestType.class);
            String xml = exchange.getIn().getBody(String.class);
            StringReader reader = new StringReader(xml);
            try{
            Unmarshaller unmarshaller = context.createUnmarshaller();
            cmreq = (CreateUpdateMovementRequestType)unmarshaller.unmarshal(reader);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        exchange.getOut().setBody(cmreq);


    }

}

package kidde.e1.bssv.JP563291.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Calendar;

import kidde.e1.bssv.J5632001.InternalConfiguredItemsQuestions;
import kidde.e1.bssv.J5632001.valueobject.D5632001A;
import kidde.e1.bssv.J5632002.InternalConfigurationAnswers;
import kidde.e1.bssv.J5632002.valueobject.InsertConfigurationAnswers_D5632002B;
import kidde.e1.bssv.J56F3291.valueobject.InternalResults_F3291;
import kidde.e1.bssv.J56F3291.valueobject.InternalSelectSegment_F3291;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SegmentDataReply extends MessageValueObject implements Serializable {

    private SegmentDetails[] segQuestion = null;
    
    /**
     * Unique Key ID 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer uniqueKeyID = null;     


    public void setSegQuestion(SegmentDetails[] segQuestion) {
        this.segQuestion = segQuestion;
    }

    public SegmentDetails[] getSegQuestion() {
        return segQuestion;
    }

    public void setUniqueKeyID(Integer uniqueKeyID) {
        this.uniqueKeyID = uniqueKeyID;
    }

    public Integer getUniqueKeyID() {
        return uniqueKeyID;
    }

    
    /**
     * TODO: Default public constructor for instantiating: SegmentDataReply
     */
    public SegmentDataReply() {
    }
    
    public SegmentDataReply(IContext context, IConnection connection, InternalSelectSegment_F3291 segmentData, Integer transactionUKID){

        E1MessageList messageList = new E1MessageList();
        
        
        ArrayList segmentList = new ArrayList();
        int isPreviousSegment = 0;
        
        if (segmentData.getQueryResults() != null){
            for (int i=0; i<segmentData.getQueryResults().size(); i++){
                InternalResults_F3291 oneResult = segmentData.getQueryResults(i);
                SegmentDetails oneQuestion = new SegmentDetails();
                oneQuestion.setItemNumberShortKit(oneResult.getF3291_KIT().intValue());
                oneQuestion.setIdentifier2ndItem(oneResult.getF3291_LITM());
                oneQuestion.setIdentifier3rdItem(oneResult.getF3291_AITM());
                oneQuestion.setCostCenter(oneResult.getF3291_MCU());
                if (oneResult.getF3291_PEL() != null){
                    oneQuestion.setParentSegmentNumber(oneResult.getF3291_PEL().intValue());

                    ArrayList answerList = new ArrayList();
                        
                           
                    D5632001A segmentAnswer = new D5632001A();
                    segmentAnswer.setSzCostCenter_MCU(oneResult.getF3291_MCU());
                    segmentAnswer.setSzIdentifier2ndItem_LITM(oneResult.getF3291_LITM());
                    segmentAnswer.setMnParentSegmentNumber_PEL(new MathNumeric(oneResult.getF3291_PEL()));
                        
                    messageList.addMessages(InternalConfiguredItemsQuestions.getQuestionsAnswers(context, connection, segmentAnswer));
                    String segmentAnswers = segmentAnswer.getSzSegmentValues_DESC2000();
                        
                        
                    String[] splitPipeToRecord = segmentAnswers.split("\\|");
                    for(int k=0; k<splitPipeToRecord.length; k++){
                        SegmentAnswers oneAnswer = new SegmentAnswers();
                        oneAnswer.setSegmentValue(splitPipeToRecord[k]);
                        answerList.add(oneAnswer);
                    }
                    SegmentAnswers[] answersSeg = new SegmentAnswers[answerList.size()];
                    answerList.toArray(answersSeg);
                    oneQuestion.setAnswers(answersSeg);
                }

                if (oneResult.getF3291_EFFF() != null){
                    Calendar aCal = Calendar.getInstance();
                    aCal.setTime(oneResult.getF3291_EFFF());
                    oneQuestion.setEffectiveFromDate(aCal);
                }
                if (oneResult.getF3291_EFFT() != null){
                    Calendar bCal = Calendar.getInstance();
                    bCal.setTime(oneResult.getF3291_EFFT());
                    oneQuestion.setEffectiveThruDate(bCal);
                }
                oneQuestion.setDescriptionLine1(oneResult.getF3291_DSC1());
                oneQuestion.setDataItem(oneResult.getF3291_DTAI());
                oneQuestion.setRequiredToBe(oneResult.getF3291_ATRQ());
                oneQuestion.setProductCode(oneResult.getF3291_SY());
                oneQuestion.setUserDefinedCodes(oneResult.getF3291_RT());
                oneQuestion.setValueForEntryDefault(oneResult.getF3291_DVAL());
                oneQuestion.setLowerAllowedValueDd(oneResult.getF3291_LVAL());
                oneQuestion.setAllowedValueUpper(oneResult.getF3291_UVAL());
                oneQuestion.setNumericYN(oneResult.getF3291_CNUM());
                if (oneResult.getF3291_DTAS() != null){
                    oneQuestion.setDataItemSize(oneResult.getF3291_DTAS().intValue());
                }
                oneQuestion.setDataDisplayDecimals(oneResult.getF3291_CDEC());
                oneQuestion.setSaveSegment(oneResult.getF3291_ATSA());
                if (oneResult.getF3291_SPBN() != null){
                    oneQuestion.setSpacesBeforeSegmentInfor(oneResult.getF3291_SPBN().intValue());
                }
                oneQuestion.setPrintSegmentNumber(oneResult.getF3291_ATSN());
                oneQuestion.setPrintSegmentDescription(oneResult.getF3291_ATSD());
                oneQuestion.setPrintSegmentValue(oneResult.getF3291_ATSV());
                oneQuestion.setPrintSegmentValueDesc(oneResult.getF3291_ATVD());
                if (oneResult.getF3291_SPAN() != null){
                    oneQuestion.setSpacesAfterSegmentInform(oneResult.getF3291_SPAN().intValue());
                }
                oneQuestion.setReturnandStartNewLine(oneResult.getF3291_RTNL());
                oneQuestion.setDerivedCalculationRound(oneResult.getF3291_RNDC());
                oneQuestion.setUpdateCategoryCode(oneResult.getF3291_UPCC());
                oneQuestion.setUserReservedCode(oneResult.getF3291_URCD());
                if (oneResult.getF3291_URDT() != null){
                    Calendar cCal = Calendar.getInstance();
                    cCal.setTime(oneResult.getF3291_URDT());
                    oneQuestion.setUserReservedDate(cCal);
                }
                if (oneResult.getF3291_URAT() != null){
                    oneQuestion.setUserReservedAmount(oneResult.getF3291_URAT().asBigDecimal());
                }
                if (oneResult.getF3291_URAB() != null){
                    oneQuestion.setUserReservedNumber(oneResult.getF3291_URAB().intValue());
                }
                oneQuestion.setUserReservedReference(oneResult.getF3291_URRF());
                oneQuestion.setUserId(oneResult.getF3291_USER());
                oneQuestion.setProgramId(oneResult.getF3291_PID());
                oneQuestion.setWorkStationId(oneResult.getF3291_JOBN());
                if (oneResult.getF3291_UPMJ() != null){
                    Calendar dCal = Calendar.getInstance();
                    dCal.setTime(oneResult.getF3291_UPMJ());
                    oneQuestion.setDateUpdated(dCal);
                }
                if (oneResult.getF3291_TDAY() != null){
                    oneQuestion.setTimeOfDay(oneResult.getF3291_TDAY().intValue());
                }
                oneQuestion.setDisplayCalculatedSegment(oneResult.getF3291_DSPCALC());
                
                
                segmentList.add(oneQuestion);
            }
        }
        SegmentDetails[] segDetails = new SegmentDetails[segmentList.size()];
        segmentList.toArray(segDetails);
        this.setSegQuestion(segDetails);
        this.setUniqueKeyID(transactionUKID);
    }

    
    public SegmentDataReply(IContext context, IConnection connection, InternalSelectSegment_F3291 segmentData, String segmentAnswers, Integer previousSegmentNumber, Integer transactionUKID, String currentAnswer){
        E1MessageList messageList = new E1MessageList();
        
        
        ArrayList segmentList = new ArrayList();
        int isPreviousSegment = 0;
        
        if (segmentData.getQueryResults() != null){
            for (int i=0; i<segmentData.getQueryResults().size(); i++){
                InternalResults_F3291 oneResult = segmentData.getQueryResults(i);
                SegmentDetails oneQuestion = new SegmentDetails();
                oneQuestion.setItemNumberShortKit(oneResult.getF3291_KIT().intValue());
                oneQuestion.setIdentifier2ndItem(oneResult.getF3291_LITM());
                oneQuestion.setIdentifier3rdItem(oneResult.getF3291_AITM());
                oneQuestion.setCostCenter(oneResult.getF3291_MCU());
                if (oneResult.getF3291_PEL() != null){
                    oneQuestion.setParentSegmentNumber(oneResult.getF3291_PEL().intValue());
                    if (isPreviousSegment == 1){
                        isPreviousSegment = 0;
                        ArrayList answerList = new ArrayList();
                        String[] splitPipeToRecord = segmentAnswers.split("\\|");
                        for(int k=0; k<splitPipeToRecord.length; k++){
                            SegmentAnswers oneAnswer = new SegmentAnswers();
                            oneAnswer.setSegmentValue(splitPipeToRecord[k]);
                            answerList.add(oneAnswer);
                        }
                        SegmentAnswers[] answersSeg = new SegmentAnswers[answerList.size()];
                        answerList.toArray(answersSeg);
                        oneQuestion.setAnswers(answersSeg);

                        InsertConfigurationAnswers_D5632002B recordAnswer = new InsertConfigurationAnswers_D5632002B();
                        recordAnswer.setMnUniqueKeyIDInternal(new MathNumeric(transactionUKID));
                        recordAnswer.setMnParentSegmentNumber(new MathNumeric(previousSegmentNumber));
                        recordAnswer.setSzIdentifier2ndItem(oneResult.getF3291_LITM());
                        recordAnswer.setSzCostCenter(oneResult.getF3291_MCU());
                        recordAnswer.setSzSegmentValue(currentAnswer);
                        InternalConfigurationAnswers.insertAnswerData(context, connection, recordAnswer);                        
                        
                        
                        
                    }
                    
                    
                    if (oneQuestion.getParentSegmentNumber().intValue() == previousSegmentNumber.intValue()){
                        isPreviousSegment = 1;
                    }
                }
                if (oneResult.getF3291_EFFF() != null){
                    Calendar aCal = Calendar.getInstance();
                    aCal.setTime(oneResult.getF3291_EFFF());
                    oneQuestion.setEffectiveFromDate(aCal);
                }
                if (oneResult.getF3291_EFFT() != null){
                    Calendar bCal = Calendar.getInstance();
                    bCal.setTime(oneResult.getF3291_EFFT());
                    oneQuestion.setEffectiveThruDate(bCal);
                }
                oneQuestion.setDescriptionLine1(oneResult.getF3291_DSC1());
                oneQuestion.setDataItem(oneResult.getF3291_DTAI());
                oneQuestion.setRequiredToBe(oneResult.getF3291_ATRQ());
                oneQuestion.setProductCode(oneResult.getF3291_SY());
                oneQuestion.setUserDefinedCodes(oneResult.getF3291_RT());
                oneQuestion.setValueForEntryDefault(oneResult.getF3291_DVAL());
                oneQuestion.setLowerAllowedValueDd(oneResult.getF3291_LVAL());
                oneQuestion.setAllowedValueUpper(oneResult.getF3291_UVAL());
                oneQuestion.setNumericYN(oneResult.getF3291_CNUM());
                if (oneResult.getF3291_DTAS() != null){
                    oneQuestion.setDataItemSize(oneResult.getF3291_DTAS().intValue());
                }
                oneQuestion.setDataDisplayDecimals(oneResult.getF3291_CDEC());
                oneQuestion.setSaveSegment(oneResult.getF3291_ATSA());
                if (oneResult.getF3291_SPBN() != null){
                    oneQuestion.setSpacesBeforeSegmentInfor(oneResult.getF3291_SPBN().intValue());
                }
                oneQuestion.setPrintSegmentNumber(oneResult.getF3291_ATSN());
                oneQuestion.setPrintSegmentDescription(oneResult.getF3291_ATSD());
                oneQuestion.setPrintSegmentValue(oneResult.getF3291_ATSV());
                oneQuestion.setPrintSegmentValueDesc(oneResult.getF3291_ATVD());
                if (oneResult.getF3291_SPAN() != null){
                    oneQuestion.setSpacesAfterSegmentInform(oneResult.getF3291_SPAN().intValue());
                }
                oneQuestion.setReturnandStartNewLine(oneResult.getF3291_RTNL());
                oneQuestion.setDerivedCalculationRound(oneResult.getF3291_RNDC());
                oneQuestion.setUpdateCategoryCode(oneResult.getF3291_UPCC());
                oneQuestion.setUserReservedCode(oneResult.getF3291_URCD());
                if (oneResult.getF3291_URDT() != null){
                    Calendar cCal = Calendar.getInstance();
                    cCal.setTime(oneResult.getF3291_URDT());
                    oneQuestion.setUserReservedDate(cCal);
                }
                if (oneResult.getF3291_URAT() != null){
                    oneQuestion.setUserReservedAmount(oneResult.getF3291_URAT().asBigDecimal());
                }
                if (oneResult.getF3291_URAB() != null){
                    oneQuestion.setUserReservedNumber(oneResult.getF3291_URAB().intValue());
                }
                oneQuestion.setUserReservedReference(oneResult.getF3291_URRF());
                oneQuestion.setUserId(oneResult.getF3291_USER());
                oneQuestion.setProgramId(oneResult.getF3291_PID());
                oneQuestion.setWorkStationId(oneResult.getF3291_JOBN());
                if (oneResult.getF3291_UPMJ() != null){
                    Calendar dCal = Calendar.getInstance();
                    dCal.setTime(oneResult.getF3291_UPMJ());
                    oneQuestion.setDateUpdated(dCal);
                }
                if (oneResult.getF3291_TDAY() != null){
                    oneQuestion.setTimeOfDay(oneResult.getF3291_TDAY().intValue());
                }
                oneQuestion.setDisplayCalculatedSegment(oneResult.getF3291_DSPCALC());
                
                
                segmentList.add(oneQuestion);
            }
        }
        SegmentDetails[] segDetails = new SegmentDetails[segmentList.size()];
        segmentList.toArray(segDetails);
        this.setSegQuestion(segDetails);
        this.setUniqueKeyID(transactionUKID);
        
    }
}

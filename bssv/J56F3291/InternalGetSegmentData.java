package kidde.e1.bssv.J56F3291;

import java.util.ArrayList;
import java.util.Date;

import kidde.e1.bssv.J56F3291.valueobject.InternalResults_F3291;
import kidde.e1.bssv.J56F3291.valueobject.InternalSelectSegment_F3291;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.DBServiceException;
import oracle.e1.bssvfoundation.services.BSSVDBField;
import oracle.e1.bssvfoundation.services.BSSVDBFieldMap;
import oracle.e1.bssvfoundation.services.BSSVDBResultSet;
import oracle.e1.bssvfoundation.services.BSSVDBSortDirection;
import oracle.e1.bssvfoundation.services.BSSVDBSortField;
import oracle.e1.bssvfoundation.services.BSSVDBWhereClauseBuilder;
import oracle.e1.bssvfoundation.services.BSSVDBWhereField;
import oracle.e1.bssvfoundation.services.IDBService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.IBSSVLogger;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class InternalGetSegmentData extends BusinessService {
    /**
     * TODO: Create Java Doc for: selectSegmentData
     * Method selectSegmentData is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList selectSegmentData(IContext context, IConnection connection, InternalSelectSegment_F3291 internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "selectSegmentData", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        
        if((internalVO.getQueryWhereFields().getF3291_MCU() !=null)&& (internalVO.getQueryWhereFields().getF3291_MCU().trim().length()>1)){
            messages.addMessages(selectFromF3291ALL(context, connection, internalVO));
        }else{
            messages.addMessages(selectFromF3291byLITM(context, connection, internalVO));
        }
       
        //Call finish internal method passing context.
        finishInternalMethod(context, "selectSegmentData");



        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Selects records from the F3291 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT *
     *
     * FROM F3291
     *
     * WHERE F3291.LITM=? AND F3291.MCU=?
     *
     * ORDER BY F3291.PEL ASC
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF3291ALL(IContext context, IConnection connection, InternalSelectSegment_F3291 internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F3291.KIT"), // Numeric - ItemNumberShortKit
         new BSSVDBField("F3291.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F3291.AITM"), // String - Identifier3rdItem
         new BSSVDBField("F3291.MCU"), // String - CostCenter
         new BSSVDBField("F3291.PEL"), // Numeric - ParentSegmentNumber
         new BSSVDBField("F3291.EFFF"), // Date - EffectiveFromDate
         new BSSVDBField("F3291.EFFT"), // Date - EffectiveThruDate
         new BSSVDBField("F3291.DSC1"), // String - DescriptionLine1
         new BSSVDBField("F3291.DTAI"), // String - DataItem
         new BSSVDBField("F3291.ATRQ"), // Character - RequiredToBe
         new BSSVDBField("F3291.SY"), // String - ProductCode
         new BSSVDBField("F3291.RT"), // String - UserDefinedCodes
         new BSSVDBField("F3291.DVAL"), // String - ValueForEntryDefault
         new BSSVDBField("F3291.LVAL"), // String - LowerAllowedValueDd
         new BSSVDBField("F3291.UVAL"), // String - AllowedValueUpper
         new BSSVDBField("F3291.CNUM"), // Character - NumericYN
         new BSSVDBField("F3291.DTAS"), // Numeric - DataItemSize
         new BSSVDBField("F3291.CDEC"), // Character - DataDisplayDecimals
         new BSSVDBField("F3291.ATSA"), // Character - SaveSegment
         new BSSVDBField("F3291.SPBN"), // Numeric - SpacesBeforeSegmentInfor
         new BSSVDBField("F3291.ATSN"), // Character - PrintSegmentNumber
         new BSSVDBField("F3291.ATSD"), // Character - PrintSegmentDescription
         new BSSVDBField("F3291.ATSV"), // Character - PrintSegmentValue
         new BSSVDBField("F3291.ATVD"), // Character - PrintSegmentValueDesc
         new BSSVDBField("F3291.SPAN"), // Numeric - SpacesAfterSegmentInform
         new BSSVDBField("F3291.RTNL"), // Character - ReturnandStartNewLine
         new BSSVDBField("F3291.RNDC"), // Character - DerivedCalculationRound
         new BSSVDBField("F3291.UPCC"), // String - UpdateCategoryCode
         new BSSVDBField("F3291.URCD"), // String - UserReservedCode
         new BSSVDBField("F3291.URDT"), // Date - UserReservedDate
         new BSSVDBField("F3291.URAT"), // Numeric - UserReservedAmount
         new BSSVDBField("F3291.URAB"), // Numeric - UserReservedNumber
         new BSSVDBField("F3291.URRF"), // String - UserReservedReference
         new BSSVDBField("F3291.USER"), // String - UserId
         new BSSVDBField("F3291.PID"), // String - ProgramId
         new BSSVDBField("F3291.JOBN"), // String - WorkStationId
         new BSSVDBField("F3291.UPMJ"), // Date - DateUpdated
         new BSSVDBField("F3291.TDAY"), // Numeric - TimeOfDay
         new BSSVDBField("F3291.DSPCALC") // Character - DisplayCalculatedSegment
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder =
        {new BSSVDBSortField(new BSSVDBField("F3291.PEL"), BSSVDBSortDirection.ASCENDING)};

        //specify condition records must meet - assume inputs are optional
        /*     specify condition records must meet to be selected
             BSSVDBWhereField[] whereFields =
             {new BSSVDBWhereField(null, new BSSVDBField("F3291.LITM"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF3291_LITM()),
              new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F3291.MCU"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF3291_MCU())};
         */


        ArrayList whereFieldsList = new ArrayList();
        
        if(internalVO.getQueryWhereFields().getF3291_LITM() != null){
           whereFieldsList.add(new BSSVDBWhereField(null, new BSSVDBField("F3291.LITM"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF3291_LITM())); 
        }
        
        if (internalVO.getQueryWhereFields().getF3291_MCU() != null) {
            whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F3291.MCU"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF3291_MCU()));

        }

        BSSVDBWhereField[] whereFields =  new BSSVDBWhereField[whereFieldsList.size()];
        whereFieldsList.toArray(whereFields);
        
        
        
        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "F3291", IDBService.DB_TABLE, selectDistinct,
                 IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
            context.getBSSVLogger().app(context,"SUCCESS - Results set has data, count is "+resultSet.getFieldMap().length);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalResults_F3291 result = new InternalResults_F3291();
                    result.setF3291_KIT((MathNumeric)map.getValue("F3291.KIT"));
                    result.setF3291_LITM((String)map.getValue("F3291.LITM"));
                    result.setF3291_AITM((String)map.getValue("F3291.AITM"));
                    result.setF3291_MCU((String)map.getValue("F3291.MCU"));
                    result.setF3291_PEL((MathNumeric)map.getValue("F3291.PEL"));
                    result.setF3291_EFFF((Date)map.getValue("F3291.EFFF"));
                    result.setF3291_EFFT((Date)map.getValue("F3291.EFFT"));
                    result.setF3291_DSC1((String)map.getValue("F3291.DSC1"));
                    result.setF3291_DTAI((String)map.getValue("F3291.DTAI"));
                    result.setF3291_ATRQ(map.getValue("F3291.ATRQ").toString());
                    result.setF3291_SY((String)map.getValue("F3291.SY"));
                    result.setF3291_RT((String)map.getValue("F3291.RT"));
                    result.setF3291_DVAL((String)map.getValue("F3291.DVAL"));
                    result.setF3291_LVAL((String)map.getValue("F3291.LVAL"));
                    result.setF3291_UVAL((String)map.getValue("F3291.UVAL"));
                    result.setF3291_CNUM(map.getValue("F3291.CNUM").toString());
                    result.setF3291_DTAS((MathNumeric)map.getValue("F3291.DTAS"));
                    result.setF3291_CDEC(map.getValue("F3291.CDEC").toString());
                    result.setF3291_ATSA(map.getValue("F3291.ATSA").toString());
                    result.setF3291_SPBN((MathNumeric)map.getValue("F3291.SPBN"));
                    result.setF3291_ATSN(map.getValue("F3291.ATSN").toString());
                    result.setF3291_ATSD(map.getValue("F3291.ATSD").toString());
                    result.setF3291_ATSV(map.getValue("F3291.ATSV").toString());
                    result.setF3291_ATVD(map.getValue("F3291.ATVD").toString());
                    result.setF3291_SPAN((MathNumeric)map.getValue("F3291.SPAN"));
                    result.setF3291_RTNL(map.getValue("F3291.RTNL").toString());
                    result.setF3291_RNDC(map.getValue("F3291.RNDC").toString());
                    result.setF3291_UPCC((String)map.getValue("F3291.UPCC"));
                    result.setF3291_URCD((String)map.getValue("F3291.URCD"));
                    result.setF3291_URDT((Date)map.getValue("F3291.URDT"));
                    result.setF3291_URAT((MathNumeric)map.getValue("F3291.URAT"));
                    result.setF3291_URAB((MathNumeric)map.getValue("F3291.URAB"));
                    result.setF3291_URRF((String)map.getValue("F3291.URRF"));
                    result.setF3291_USER((String)map.getValue("F3291.USER"));
                    result.setF3291_PID((String)map.getValue("F3291.PID"));
                    result.setF3291_JOBN((String)map.getValue("F3291.JOBN"));
                    result.setF3291_UPMJ((Date)map.getValue("F3291.UPMJ"));
                    result.setF3291_TDAY((MathNumeric)map.getValue("F3291.TDAY"));
                    result.setF3291_DSPCALC(map.getValue("F3291.DSPCALC").toString());
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }


    /**
     * Selects records from the F3291 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT *
     *
     * FROM F3291
     *
     * WHERE F3291.LITM=?
     *
     * ORDER BY F3291.PEL ASC
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF3291byLITM(IContext context, IConnection connection, InternalSelectSegment_F3291 internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F3291.KIT"), // Numeric - ItemNumberShortKit
         new BSSVDBField("F3291.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F3291.AITM"), // String - Identifier3rdItem
         new BSSVDBField("F3291.MCU"), // String - CostCenter
         new BSSVDBField("F3291.PEL"), // Numeric - ParentSegmentNumber
         new BSSVDBField("F3291.EFFF"), // Date - EffectiveFromDate
         new BSSVDBField("F3291.EFFT"), // Date - EffectiveThruDate
         new BSSVDBField("F3291.DSC1"), // String - DescriptionLine1
         new BSSVDBField("F3291.DTAI"), // String - DataItem
         new BSSVDBField("F3291.ATRQ"), // Character - RequiredToBe
         new BSSVDBField("F3291.SY"), // String - ProductCode
         new BSSVDBField("F3291.RT"), // String - UserDefinedCodes
         new BSSVDBField("F3291.DVAL"), // String - ValueForEntryDefault
         new BSSVDBField("F3291.LVAL"), // String - LowerAllowedValueDd
         new BSSVDBField("F3291.UVAL"), // String - AllowedValueUpper
         new BSSVDBField("F3291.CNUM"), // Character - NumericYN
         new BSSVDBField("F3291.DTAS"), // Numeric - DataItemSize
         new BSSVDBField("F3291.CDEC"), // Character - DataDisplayDecimals
         new BSSVDBField("F3291.ATSA"), // Character - SaveSegment
         new BSSVDBField("F3291.SPBN"), // Numeric - SpacesBeforeSegmentInfor
         new BSSVDBField("F3291.ATSN"), // Character - PrintSegmentNumber
         new BSSVDBField("F3291.ATSD"), // Character - PrintSegmentDescription
         new BSSVDBField("F3291.ATSV"), // Character - PrintSegmentValue
         new BSSVDBField("F3291.ATVD"), // Character - PrintSegmentValueDesc
         new BSSVDBField("F3291.SPAN"), // Numeric - SpacesAfterSegmentInform
         new BSSVDBField("F3291.RTNL"), // Character - ReturnandStartNewLine
         new BSSVDBField("F3291.RNDC"), // Character - DerivedCalculationRound
         new BSSVDBField("F3291.UPCC"), // String - UpdateCategoryCode
         new BSSVDBField("F3291.URCD"), // String - UserReservedCode
         new BSSVDBField("F3291.URDT"), // Date - UserReservedDate
         new BSSVDBField("F3291.URAT"), // Numeric - UserReservedAmount
         new BSSVDBField("F3291.URAB"), // Numeric - UserReservedNumber
         new BSSVDBField("F3291.URRF"), // String - UserReservedReference
         new BSSVDBField("F3291.USER"), // String - UserId
         new BSSVDBField("F3291.PID"), // String - ProgramId
         new BSSVDBField("F3291.JOBN"), // String - WorkStationId
         new BSSVDBField("F3291.UPMJ"), // Date - DateUpdated
         new BSSVDBField("F3291.TDAY"), // Numeric - TimeOfDay
         new BSSVDBField("F3291.DSPCALC") // Character - DisplayCalculatedSegment
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder =
        {new BSSVDBSortField(new BSSVDBField("F3291.PEL"), BSSVDBSortDirection.ASCENDING)};

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        {new BSSVDBWhereField(null, new BSSVDBField("F3291.LITM"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF3291_LITM())};

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = true;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "F3291", IDBService.DB_TABLE, selectDistinct, IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
            context.getBSSVLogger().app(context,"SUCCESS - Results set has data, count is "+resultSet.getFieldMap().length);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        } 

        //process the results of the select
        if (resultSet != null) {
            
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalResults_F3291 result = new InternalResults_F3291();
                    result.setF3291_KIT((MathNumeric)map.getValue("F3291.KIT"));
                    result.setF3291_LITM((String)map.getValue("F3291.LITM"));
                    result.setF3291_AITM((String)map.getValue("F3291.AITM"));
                    result.setF3291_MCU((String)map.getValue("F3291.MCU"));
                    result.setF3291_PEL((MathNumeric)map.getValue("F3291.PEL"));
                    result.setF3291_EFFF((Date)map.getValue("F3291.EFFF"));
                    result.setF3291_EFFT((Date)map.getValue("F3291.EFFT"));
                    result.setF3291_DSC1((String)map.getValue("F3291.DSC1"));
                    result.setF3291_DTAI((String)map.getValue("F3291.DTAI"));
                    result.setF3291_ATRQ(map.getValue("F3291.ATRQ").toString());
                    result.setF3291_SY((String)map.getValue("F3291.SY"));
                    result.setF3291_RT((String)map.getValue("F3291.RT"));
                    result.setF3291_DVAL((String)map.getValue("F3291.DVAL"));
                    result.setF3291_LVAL((String)map.getValue("F3291.LVAL"));
                    result.setF3291_UVAL((String)map.getValue("F3291.UVAL"));
                    result.setF3291_CNUM(map.getValue("F3291.CNUM").toString());
                    result.setF3291_DTAS((MathNumeric)map.getValue("F3291.DTAS"));
                    result.setF3291_CDEC(map.getValue("F3291.CDEC").toString());
                    result.setF3291_ATSA(map.getValue("F3291.ATSA").toString());
                    result.setF3291_SPBN((MathNumeric)map.getValue("F3291.SPBN"));
                    result.setF3291_ATSN(map.getValue("F3291.ATSN").toString());
                    result.setF3291_ATSD(map.getValue("F3291.ATSD").toString());
                    result.setF3291_ATSV(map.getValue("F3291.ATSV").toString());
                    result.setF3291_ATVD(map.getValue("F3291.ATVD").toString());
                    result.setF3291_SPAN((MathNumeric)map.getValue("F3291.SPAN"));
                    result.setF3291_RTNL(map.getValue("F3291.RTNL").toString());
                    result.setF3291_RNDC(map.getValue("F3291.RNDC").toString());
                    result.setF3291_UPCC((String)map.getValue("F3291.UPCC"));
                    result.setF3291_URCD((String)map.getValue("F3291.URCD"));
                    result.setF3291_URDT((Date)map.getValue("F3291.URDT"));
                    result.setF3291_URAT((MathNumeric)map.getValue("F3291.URAT"));
                    result.setF3291_URAB((MathNumeric)map.getValue("F3291.URAB"));
                    result.setF3291_URRF((String)map.getValue("F3291.URRF"));
                    result.setF3291_USER((String)map.getValue("F3291.USER"));
                    result.setF3291_PID((String)map.getValue("F3291.PID"));
                    result.setF3291_JOBN((String)map.getValue("F3291.JOBN"));
                    result.setF3291_UPMJ((Date)map.getValue("F3291.UPMJ"));
                    result.setF3291_TDAY((MathNumeric)map.getValue("F3291.TDAY"));
                    result.setF3291_DSPCALC(map.getValue("F3291.DSPCALC").toString());
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

}

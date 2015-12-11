package kidde.e1.bssv.J56F3291.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalResults_F3291 extends ValueObject implements Serializable {
    /**
     * Parent (short) Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KIT <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F3291_KIT = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F3291_LITM = null;

    /**
     * 3rd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F3291_AITM = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F3291_MCU = null;

    /**
     * Number - Parent Segment Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PEL <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F3291_PEL = null;

    /**
     * Effective - From Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFFF <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F3291_EFFF = null;

    /**
     * Effective - Thru Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFFT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F3291_EFFT = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F3291_DSC1 = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String F3291_DTAI = null;

    /**
     * Required or Optional
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATRQ <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: R <br>
     * EnterpriseOne User Defined Code: 32/AR <br>
     */
    private String F3291_ATRQ = null;

    /**
     * Product Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SY <br>
     * EnterpriseOne field length:  4 <br>
     * EnterpriseOne User Defined Code: 98/SY <br>
     */
    private String F3291_SY = null;

    /**
     * User Defined Codes
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RT <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String F3291_RT = null;

    /**
     * Value for Entry - Default
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String F3291_DVAL = null;

    /**
     * Allowed Value - Lower
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String F3291_LVAL = null;

    /**
     * Allowed Value - Upper
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UVAL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String F3291_UVAL = null;

    /**
     * Numeric (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNUM <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: N <br>
     * EnterpriseOne User Defined Code: 00/AA <br>
     */
    private String F3291_CNUM = null;

    /**
     * Data Item Size
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAS <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private MathNumeric F3291_DTAS = null;

    /**
     * Display Decimals
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CDEC <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private String F3291_CDEC = null;

    /**
     * Configurator Save Segment
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSA <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_ATSA = null;

    /**
     * Spaces Before Segment Information
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SPBN <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private MathNumeric F3291_SPBN = null;

    /**
     * Configurator Print Segment Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSN <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_ATSN = null;

    /**
     * Configurator Print Segment Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSD <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_ATSD = null;

    /**
     * Configurator Print Segment Value
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATSV <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_ATSV = null;

    /**
     * Configurator Print Segmt Value Descript
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATVD <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_ATVD = null;

    /**
     * Spaces After Segment Information
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SPAN <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private MathNumeric F3291_SPAN = null;

    /**
     * Return and Start New Line
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RTNL <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_RTNL = null;

    /**
     * Derived Calculation Round
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RNDC <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: 32/DC <br>
     */
    private String F3291_RNDC = null;

    /**
     * Update Category Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPCC <br>
     * EnterpriseOne field length:  4 <br>
     * EnterpriseOne User Defined Code: 32/WC <br>
     */
    private String F3291_UPCC = null;

    /**
     * User Reserved Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URCD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String F3291_URCD = null;

    /**
     * User Reserved Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URDT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F3291_URDT = null;

    /**
     * User Reserved Amount
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URAT <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F3291_URAT = null;

    /**
     * User Reserved Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URAB <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F3291_URAB = null;

    /**
     * User Reserved Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URRF <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String F3291_URRF = null;

    /**
     * User ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: USER <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String F3291_USER = null;

    /**
     * Program ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PID <br>
     * EnterpriseOne field length:  10 <br>
     * EnterpriseOne Edit Rule:CHKOBJ <br>
     */
    private String F3291_PID = null;

    /**
     * Work Station ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBN <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String F3291_JOBN = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F3291_UPMJ = null;

    /**
     * Time of Day
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TDAY <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F3291_TDAY = null;

    /**
     * Display Calculated Segment
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSPCALC <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 1 <br>
     * EnterpriseOne User Defined Code: 32/YN <br>
     */
    private String F3291_DSPCALC = null;

    public void setF3291_KIT(MathNumeric F3291_KIT) {
        this.F3291_KIT = F3291_KIT;
    }

    public MathNumeric getF3291_KIT() {
        return F3291_KIT;
    }

    public void setF3291_LITM(String F3291_LITM) {
        this.F3291_LITM = F3291_LITM;
    }

    public String getF3291_LITM() {
        return F3291_LITM;
    }

    public void setF3291_AITM(String F3291_AITM) {
        this.F3291_AITM = F3291_AITM;
    }

    public String getF3291_AITM() {
        return F3291_AITM;
    }

    public void setF3291_MCU(String F3291_MCU) {
        this.F3291_MCU = F3291_MCU;
    }

    public String getF3291_MCU() {
        return F3291_MCU;
    }

    public void setF3291_PEL(MathNumeric F3291_PEL) {
        this.F3291_PEL = F3291_PEL;
    }

    public MathNumeric getF3291_PEL() {
        return F3291_PEL;
    }

    public void setF3291_EFFF(Date F3291_EFFF) {
        this.F3291_EFFF = F3291_EFFF;
    }

    public Date getF3291_EFFF() {
        return F3291_EFFF;
    }

    public void setF3291_EFFT(Date F3291_EFFT) {
        this.F3291_EFFT = F3291_EFFT;
    }

    public Date getF3291_EFFT() {
        return F3291_EFFT;
    }

    public void setF3291_DSC1(String F3291_DSC1) {
        this.F3291_DSC1 = F3291_DSC1;
    }

    public String getF3291_DSC1() {
        return F3291_DSC1;
    }

    public void setF3291_DTAI(String F3291_DTAI) {
        this.F3291_DTAI = F3291_DTAI;
    }

    public String getF3291_DTAI() {
        return F3291_DTAI;
    }

    public void setF3291_ATRQ(String F3291_ATRQ) {
        this.F3291_ATRQ = F3291_ATRQ;
    }

    public String getF3291_ATRQ() {
        return F3291_ATRQ;
    }

    public void setF3291_SY(String F3291_SY) {
        this.F3291_SY = F3291_SY;
    }

    public String getF3291_SY() {
        return F3291_SY;
    }

    public void setF3291_RT(String F3291_RT) {
        this.F3291_RT = F3291_RT;
    }

    public String getF3291_RT() {
        return F3291_RT;
    }

    public void setF3291_DVAL(String F3291_DVAL) {
        this.F3291_DVAL = F3291_DVAL;
    }

    public String getF3291_DVAL() {
        return F3291_DVAL;
    }

    public void setF3291_LVAL(String F3291_LVAL) {
        this.F3291_LVAL = F3291_LVAL;
    }

    public String getF3291_LVAL() {
        return F3291_LVAL;
    }

    public void setF3291_UVAL(String F3291_UVAL) {
        this.F3291_UVAL = F3291_UVAL;
    }

    public String getF3291_UVAL() {
        return F3291_UVAL;
    }

    public void setF3291_CNUM(String F3291_CNUM) {
        this.F3291_CNUM = F3291_CNUM;
    }

    public String getF3291_CNUM() {
        return F3291_CNUM;
    }

    public void setF3291_DTAS(MathNumeric F3291_DTAS) {
        this.F3291_DTAS = F3291_DTAS;
    }

    public MathNumeric getF3291_DTAS() {
        return F3291_DTAS;
    }

    public void setF3291_CDEC(String F3291_CDEC) {
        this.F3291_CDEC = F3291_CDEC;
    }

    public String getF3291_CDEC() {
        return F3291_CDEC;
    }

    public void setF3291_ATSA(String F3291_ATSA) {
        this.F3291_ATSA = F3291_ATSA;
    }

    public String getF3291_ATSA() {
        return F3291_ATSA;
    }

    public void setF3291_SPBN(MathNumeric F3291_SPBN) {
        this.F3291_SPBN = F3291_SPBN;
    }

    public MathNumeric getF3291_SPBN() {
        return F3291_SPBN;
    }

    public void setF3291_ATSN(String F3291_ATSN) {
        this.F3291_ATSN = F3291_ATSN;
    }

    public String getF3291_ATSN() {
        return F3291_ATSN;
    }

    public void setF3291_ATSD(String F3291_ATSD) {
        this.F3291_ATSD = F3291_ATSD;
    }

    public String getF3291_ATSD() {
        return F3291_ATSD;
    }

    public void setF3291_ATSV(String F3291_ATSV) {
        this.F3291_ATSV = F3291_ATSV;
    }

    public String getF3291_ATSV() {
        return F3291_ATSV;
    }

    public void setF3291_ATVD(String F3291_ATVD) {
        this.F3291_ATVD = F3291_ATVD;
    }

    public String getF3291_ATVD() {
        return F3291_ATVD;
    }

    public void setF3291_SPAN(MathNumeric F3291_SPAN) {
        this.F3291_SPAN = F3291_SPAN;
    }

    public MathNumeric getF3291_SPAN() {
        return F3291_SPAN;
    }

    public void setF3291_RTNL(String F3291_RTNL) {
        this.F3291_RTNL = F3291_RTNL;
    }

    public String getF3291_RTNL() {
        return F3291_RTNL;
    }

    public void setF3291_RNDC(String F3291_RNDC) {
        this.F3291_RNDC = F3291_RNDC;
    }

    public String getF3291_RNDC() {
        return F3291_RNDC;
    }

    public void setF3291_UPCC(String F3291_UPCC) {
        this.F3291_UPCC = F3291_UPCC;
    }

    public String getF3291_UPCC() {
        return F3291_UPCC;
    }

    public void setF3291_URCD(String F3291_URCD) {
        this.F3291_URCD = F3291_URCD;
    }

    public String getF3291_URCD() {
        return F3291_URCD;
    }

    public void setF3291_URDT(Date F3291_URDT) {
        this.F3291_URDT = F3291_URDT;
    }

    public Date getF3291_URDT() {
        return F3291_URDT;
    }

    public void setF3291_URAT(MathNumeric F3291_URAT) {
        this.F3291_URAT = F3291_URAT;
    }

    public MathNumeric getF3291_URAT() {
        return F3291_URAT;
    }

    public void setF3291_URAB(MathNumeric F3291_URAB) {
        this.F3291_URAB = F3291_URAB;
    }

    public MathNumeric getF3291_URAB() {
        return F3291_URAB;
    }

    public void setF3291_URRF(String F3291_URRF) {
        this.F3291_URRF = F3291_URRF;
    }

    public String getF3291_URRF() {
        return F3291_URRF;
    }

    public void setF3291_USER(String F3291_USER) {
        this.F3291_USER = F3291_USER;
    }

    public String getF3291_USER() {
        return F3291_USER;
    }

    public void setF3291_PID(String F3291_PID) {
        this.F3291_PID = F3291_PID;
    }

    public String getF3291_PID() {
        return F3291_PID;
    }

    public void setF3291_JOBN(String F3291_JOBN) {
        this.F3291_JOBN = F3291_JOBN;
    }

    public String getF3291_JOBN() {
        return F3291_JOBN;
    }

    public void setF3291_UPMJ(Date F3291_UPMJ) {
        this.F3291_UPMJ = F3291_UPMJ;
    }

    public Date getF3291_UPMJ() {
        return F3291_UPMJ;
    }

    public void setF3291_TDAY(MathNumeric F3291_TDAY) {
        this.F3291_TDAY = F3291_TDAY;
    }

    public MathNumeric getF3291_TDAY() {
        return F3291_TDAY;
    }

    public void setF3291_DSPCALC(String F3291_DSPCALC) {
        this.F3291_DSPCALC = F3291_DSPCALC;
    }

    public String getF3291_DSPCALC() {
        return F3291_DSPCALC;
    }
}

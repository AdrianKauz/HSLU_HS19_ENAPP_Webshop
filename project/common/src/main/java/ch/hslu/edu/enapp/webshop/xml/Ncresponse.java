
package ch.hslu.edu.enapp.webshop.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="PAYID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="NCSTATUS" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="NCERROR" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="ACCEPTANCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="IPCTY" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="CCCTY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ECI" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="CVCCheck" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AAVCheck" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BRAND" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NCERRORPLUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ncresponse")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Ncresponse {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "orderID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Short orderID;
    @XmlAttribute(name = "PAYID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Long payid;
    @XmlAttribute(name = "NCSTATUS")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ncstatus;
    @XmlAttribute(name = "NCERROR")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ncerror;
    @XmlAttribute(name = "ACCEPTANCE")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String acceptance;
    @XmlAttribute(name = "STATUS")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte status;
    @XmlAttribute(name = "IPCTY")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ipcty;
    @XmlAttribute(name = "CCCTY")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cccty;
    @XmlAttribute(name = "ECI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte eci;
    @XmlAttribute(name = "CVCCheck")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cvcCheck;
    @XmlAttribute(name = "AAVCheck")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String aavCheck;
    @XmlAttribute(name = "VC")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String vc;
    @XmlAttribute(name = "amount")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte amount;
    @XmlAttribute(name = "currency")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String currency;
    @XmlAttribute(name = "PM")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pm;
    @XmlAttribute(name = "BRAND")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String brand;
    @XmlAttribute(name = "NCERRORPLUS")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String ncerrorplus;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Short getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrderID(Short value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the payid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Long getPAYID() {
        return payid;
    }

    /**
     * Sets the value of the payid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPAYID(Long value) {
        this.payid = value;
    }

    /**
     * Gets the value of the ncstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getNCSTATUS() {
        return ncstatus;
    }

    /**
     * Sets the value of the ncstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNCSTATUS(Byte value) {
        this.ncstatus = value;
    }

    /**
     * Gets the value of the ncerror property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getNCERROR() {
        return ncerror;
    }

    /**
     * Sets the value of the ncerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNCERROR(Byte value) {
        this.ncerror = value;
    }

    /**
     * Gets the value of the acceptance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getACCEPTANCE() {
        return acceptance;
    }

    /**
     * Sets the value of the acceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setACCEPTANCE(String value) {
        this.acceptance = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSTATUS(Byte value) {
        this.status = value;
    }

    /**
     * Gets the value of the ipcty property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getIPCTY() {
        return ipcty;
    }

    /**
     * Sets the value of the ipcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIPCTY(Byte value) {
        this.ipcty = value;
    }

    /**
     * Gets the value of the cccty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCCCTY() {
        return cccty;
    }

    /**
     * Sets the value of the cccty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCCCTY(String value) {
        this.cccty = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getECI() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setECI(Byte value) {
        this.eci = value;
    }

    /**
     * Gets the value of the cvcCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCVCCheck() {
        return cvcCheck;
    }

    /**
     * Sets the value of the cvcCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCVCCheck(String value) {
        this.cvcCheck = value;
    }

    /**
     * Gets the value of the aavCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAAVCheck() {
        return aavCheck;
    }

    /**
     * Sets the value of the aavCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAAVCheck(String value) {
        this.aavCheck = value;
    }

    /**
     * Gets the value of the vc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getVC() {
        return vc;
    }

    /**
     * Sets the value of the vc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVC(String value) {
        this.vc = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmount(Byte value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the pm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPM() {
        return pm;
    }

    /**
     * Sets the value of the pm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPM(String value) {
        this.pm = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getBRAND() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBRAND(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the ncerrorplus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNCERRORPLUS() {
        return ncerrorplus;
    }

    /**
     * Sets the value of the ncerrorplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-12T05:06:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNCERRORPLUS(String value) {
        this.ncerrorplus = value;
    }

}

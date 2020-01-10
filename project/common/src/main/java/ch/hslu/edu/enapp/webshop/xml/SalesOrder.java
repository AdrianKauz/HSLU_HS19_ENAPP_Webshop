
package ch.hslu.edu.enapp.webshop.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="purchaseTotalCost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="purchaseItemCount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="postFinancePayId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dynNAVSalesOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dynNAVCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "correlationId",
    "status",
    "lastUpdate",
    "purchaseTotalCost",
    "purchaseItemCount",
    "postFinancePayId",
    "dynNAVSalesOrderNo",
    "purchaseDateTime",
    "studentName",
    "purchaseId",
    "dynNAVCustomerNo"
})
@XmlRootElement(name = "salesorder")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Salesorder {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String correlationId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar lastUpdate;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected float purchaseTotalCost;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected byte purchaseItemCount;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long postFinancePayId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dynNAVSalesOrderNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar purchaseDateTime;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String studentName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String purchaseId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dynNAVCustomerNo;

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the purchaseTotalCost property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public float getPurchaseTotalCost() {
        return purchaseTotalCost;
    }

    /**
     * Sets the value of the purchaseTotalCost property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseTotalCost(float value) {
        this.purchaseTotalCost = value;
    }

    /**
     * Gets the value of the purchaseItemCount property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte getPurchaseItemCount() {
        return purchaseItemCount;
    }

    /**
     * Sets the value of the purchaseItemCount property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseItemCount(byte value) {
        this.purchaseItemCount = value;
    }

    /**
     * Gets the value of the postFinancePayId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getPostFinancePayId() {
        return postFinancePayId;
    }

    /**
     * Sets the value of the postFinancePayId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPostFinancePayId(long value) {
        this.postFinancePayId = value;
    }

    /**
     * Gets the value of the dynNAVSalesOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDynNAVSalesOrderNo() {
        return dynNAVSalesOrderNo;
    }

    /**
     * Sets the value of the dynNAVSalesOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDynNAVSalesOrderNo(String value) {
        this.dynNAVSalesOrderNo = value;
    }

    /**
     * Gets the value of the purchaseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getPurchaseDateTime() {
        return purchaseDateTime;
    }

    /**
     * Sets the value of the purchaseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseDateTime(XMLGregorianCalendar value) {
        this.purchaseDateTime = value;
    }

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the purchaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPurchaseId() {
        return purchaseId;
    }

    /**
     * Sets the value of the purchaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseId(String value) {
        this.purchaseId = value;
    }

    /**
     * Gets the value of the dynNAVCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDynNAVCustomerNo() {
        return dynNAVCustomerNo;
    }

    /**
     * Sets the value of the dynNAVCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T09:24:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDynNAVCustomerNo(String value) {
        this.dynNAVCustomerNo = value;
    }

}

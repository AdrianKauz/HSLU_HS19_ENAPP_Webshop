
package ch.hslu.edu.enapp.webshop.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="payId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="student" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalPrice" type="{}positive-float"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="customer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dynNavCustNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shopLoginname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lines">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="line" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="msDynNAVItemNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="totalLinePrice" type="{}positive-float"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "payId",
    "purchaseId",
    "student",
    "totalPrice",
    "date",
    "customer",
    "lines"
})
@XmlRootElement(name = "purchaseMessage")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PurchaseMessage {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String payId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String purchaseId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String student;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected float totalPrice;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PurchaseMessage.Customer customer;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PurchaseMessage.Lines lines;

    /**
     * Gets the value of the payId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPayId() {
        return payId;
    }

    /**
     * Sets the value of the payId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPayId(String value) {
        this.payId = value;
    }

    /**
     * Gets the value of the purchaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseId(String value) {
        this.purchaseId = value;
    }

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStudent(String value) {
        this.student = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTotalPrice(float value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMessage.Customer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PurchaseMessage.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMessage.Customer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCustomer(PurchaseMessage.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMessage.Lines }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PurchaseMessage.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMessage.Lines }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLines(PurchaseMessage.Lines value) {
        this.lines = value;
    }


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
     *         &lt;element name="dynNavCustNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shopLoginname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dynNavCustNo",
        "name",
        "address",
        "postCode",
        "city",
        "shopLoginname"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Customer {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String dynNavCustNo;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String name;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String address;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected short postCode;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String city;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String shopLoginname;

        /**
         * Gets the value of the dynNavCustNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getDynNavCustNo() {
            return dynNavCustNo;
        }

        /**
         * Sets the value of the dynNavCustNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setDynNavCustNo(String value) {
            this.dynNavCustNo = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the postCode property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public short getPostCode() {
            return postCode;
        }

        /**
         * Sets the value of the postCode property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPostCode(short value) {
            this.postCode = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the shopLoginname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getShopLoginname() {
            return shopLoginname;
        }

        /**
         * Sets the value of the shopLoginname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setShopLoginname(String value) {
            this.shopLoginname = value;
        }

    }


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
     *         &lt;element name="line" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="msDynNAVItemNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="totalLinePrice" type="{}positive-float"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "line"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Lines {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<PurchaseMessage.Lines.Line> line = new ArrayList<>();

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PurchaseMessage.Lines.Line }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<PurchaseMessage.Lines.Line> getLine() {
            if (line == null) {
                line = new ArrayList<PurchaseMessage.Lines.Line>();
            }
            return this.line;
        }


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
         *         &lt;element name="msDynNAVItemNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="totalLinePrice" type="{}positive-float"/>
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
            "msDynNAVItemNo",
            "description",
            "quantity",
            "totalLinePrice"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Line {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String msDynNAVItemNo;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String description;
            @XmlElement(required = true)
            @XmlSchemaType(name = "positiveInteger")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected int quantity;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected float totalLinePrice;

            /**
             * Gets the value of the msDynNAVItemNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getMsDynNAVItemNo() {
                return msDynNAVItemNo;
            }

            /**
             * Sets the value of the msDynNAVItemNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setMsDynNAVItemNo(String value) {
                this.msDynNAVItemNo = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link int }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public int getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link int }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setQuantity(int value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the totalLinePrice property.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public float getTotalLinePrice() {
                return totalLinePrice;
            }

            /**
             * Sets the value of the totalLinePrice property.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-02T02:56:09+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setTotalLinePrice(float value) {
                this.totalLinePrice = value;
            }

        }

    }

}

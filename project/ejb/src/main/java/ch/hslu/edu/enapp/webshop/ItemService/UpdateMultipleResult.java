
package ch.hslu.edu.enapp.webshop.ItemService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item_List" type="{urn:microsoft-dynamics-schemas/page/item}Item_List"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemList"
})
@XmlRootElement(name = "UpdateMultiple_Result")
public class UpdateMultipleResult {

    @XmlElement(name = "Item_List", required = true)
    protected ItemList itemList;

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setItemList(ItemList value) {
        this.itemList = value;
    }

}

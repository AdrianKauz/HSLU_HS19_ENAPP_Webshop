
package ch.hslu.edu.enapp.webshop.ItemService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flushing_Method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Flushing_Method"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *     &lt;enumeration value="Backward"/&gt;
 *     &lt;enumeration value="Pick__x002B__Forward"/&gt;
 *     &lt;enumeration value="Pick__x002B__Backward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Flushing_Method")
@XmlEnum
public enum FlushingMethod {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("Backward")
    BACKWARD("Backward"),
    @XmlEnumValue("Pick__x002B__Forward")
    PICK_X_002_B_FORWARD("Pick__x002B__Forward"),
    @XmlEnumValue("Pick__x002B__Backward")
    PICK_X_002_B_BACKWARD("Pick__x002B__Backward");
    private final String value;

    FlushingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlushingMethod fromValue(String v) {
        for (FlushingMethod c: FlushingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

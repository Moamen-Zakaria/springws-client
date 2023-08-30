
package com.kn.springwsdemo.message;

import javax.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="listOfEmployees" type="{http://www.kn.com/springsoap}Employee" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", namespace = "http://www.kn.com/springsoap", propOrder = {
    "listOfEmployees"
})
@XmlRootElement(name = "getEmployeeResponse", namespace = "http://www.kn.com/springsoap")
public class GetEmployeeResponse {

    @XmlElement(required = true, namespace = "http://www.kn.com/springsoap")
    protected List<Employee> listOfEmployees;

    /**
     * Gets the value of the listOfEmployees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listOfEmployees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employee }
     * 
     * 
     */
    public List<Employee> getListOfEmployees() {
        if (listOfEmployees == null) {
            listOfEmployees = new ArrayList<Employee>();
        }
        return this.listOfEmployees;
    }

}

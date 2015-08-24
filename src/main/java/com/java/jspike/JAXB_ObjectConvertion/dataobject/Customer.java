/**
 * 
 */
package com.java.jspike.JAXB_ObjectConvertion.dataobject;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * customer pojo
 * @author Aravind
 *
 */
@XmlRootElement
public class Customer {
	Integer customerID;
	String customer_name;
	Integer product_id;
	String product_name;
	/**
	 * @return the customerID
	 */
	public Integer getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	@XmlAttribute
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}
	/**
	 * @param customer_name the customer_name to set
	 */
	@XmlElement
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	/**
	 * @return the product_id
	 */
	public Integer getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	@XmlAttribute
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	/**
	 * @param product_name the product_name to set
	 */
	@XmlElement
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
}

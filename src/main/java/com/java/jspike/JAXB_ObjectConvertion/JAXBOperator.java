/**
 * 
 */
package com.java.jspike.JAXB_ObjectConvertion;

import com.java.jspike.JAXB_ObjectConvertion.convertion.Converter;
import com.java.jspike.JAXB_ObjectConvertion.dataobject.Customer;

/**
 * @author Aravind
 *
 */
public class JAXBOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerID(12001);
		customer.setCustomer_name("ITPL");
		customer.setProduct_id(1011);
		customer.setProduct_name("ERP1.1");
		
		Converter.objectToXMLConverter(customer);
		Converter.XMLToObjectConverter("E:/LearnigWorkSpace/employee.xml");
		
	}

}

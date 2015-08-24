package com.java.jspike.JAXB_ObjectConvertion.convertion;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.java.jspike.JAXB_ObjectConvertion.dataobject.Customer;

public final class Converter {
	public static void objectToXMLConverter(Customer customer){
		try {
			File file = new File("E:/LearnigWorkSpace/employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(customer, System.out);
			marshaller.marshal(customer, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	public static void XMLToObjectConverter(String file_path){
		File file = new File(file_path);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) unmarshaller.unmarshal(file);
			System.out.println(customer);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}

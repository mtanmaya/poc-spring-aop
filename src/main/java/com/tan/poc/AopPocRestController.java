/**
 * https://lankydan.dev/2017/03/11/passing-data-transfer-objects-with-get-in-spring-boot
 * 
 */

package com.tan.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tmalik
 *
 */

@RestController
public class AopPocRestController {

	private InterfaceA classAImpl;

	@Autowired
	public AopPocRestController(InterfaceA classA) {
		this.classAImpl = classA;
	}

	@RequestMapping(value = "/getPersonDetails/{name}", method = RequestMethod.GET)
	public PersonDTO getPersonDetails(@RequestParam(value = "name") String name) {

		try {
			return classAImpl.methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/getDetailsOfPersonParam", method = RequestMethod.GET)
	public PersonDTO getDetailsOfPersonParam(PersonDTO person) {

		try {
			return classAImpl.methodDWithParam(person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
}

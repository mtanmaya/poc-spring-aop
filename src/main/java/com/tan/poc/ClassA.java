/**
 * 
 */
package com.tan.poc;

import org.springframework.stereotype.Service;

/**
 * @author tmalik
 *
 */

@Service
public class ClassA implements InterfaceA {

	private InterfaceB classB;

	public ClassA(InterfaceB classBb) {
		this.classB = classBb;
	}

	@Override
	public PersonDTO methodA() throws Exception {

		return classB.methodB();

	}

	@Override
	public PersonDTO methodDWithParam(PersonDTO person) throws Exception {
		return classB.methodCWithParam(person);
	}

}

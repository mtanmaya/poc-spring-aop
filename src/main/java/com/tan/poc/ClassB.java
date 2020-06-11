package com.tan.poc;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

/**
 * @author tmalik
 *
 */

@Service
public class ClassB implements InterfaceB {

	@Override
	public PersonDTO methodB() throws Exception {

		PersonDTO p = new PersonDTO();
		p.setFirstName("dudu");
		p.setLastName("malik");

		throw new Exception("throwing exception from B for purpose");
		
	}

	@Override
	public PersonDTO methodCWithParam(PersonDTO person) throws Exception {
		throw new SQLException("throwing SQL exception from C with param for purpose");
	}

}

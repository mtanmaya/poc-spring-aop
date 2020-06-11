/**
 * 
 */
package com.tan.poc;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author tmalik
 *
 */

@Getter
@Setter
public class PersonDTO implements Serializable {

	private static final long serialVersionUID = 2116062554287237089L;

	private String firstName;
	private String lastName;
}

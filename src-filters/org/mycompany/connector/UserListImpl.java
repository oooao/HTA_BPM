/**
 * 
 */
package org.mycompany.connector;


import java.util.List;

import org.bonitasoft.engine.connector.ConnectorValidationException;
import org.bonitasoft.engine.filter.UserFilterException;


/**
 * The actor filter execution will follow the steps 1 - setInputParameters() -->
 * the actor filter receives input parameters values 2 -
 * validateInputParameters() --> the actor filter can validate input parameters
 * values 3 - filter(final String actorName) --> execute the user filter 4 -
 * shouldAutoAssignTaskIfSingleResult() --> auto-assign the task if filter
 * returns a single result
 */
public class UserListImpl extends AbstractUserListImpl {

	/** Name of the manager role as defined in Bonita organization. */
	//private static final String MEMBER = "member";

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		// At least one group id should be provided
		if (getUserIds().isEmpty()) {
			throw new ConnectorValidationException("Provided list of group ids is empty");
		}
	}

	@Override
	public List<Long> filter(final String actorName) throws UserFilterException {
		
		return getUserIds();
	}

}

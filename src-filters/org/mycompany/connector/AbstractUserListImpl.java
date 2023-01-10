/**
 * 
 */
package org.mycompany.connector;

import org.bonitasoft.engine.filter.AbstractUserFilter;
import org.bonitasoft.engine.connector.ConnectorValidationException;

/**
 * This abstract class is generated and should not be modified.
 */
public abstract class AbstractUserListImpl extends AbstractUserFilter {

	protected final static String USERIDS_INPUT_PARAMETER = "userIds";
	@SuppressWarnings("unchecked")
	protected final java.util.List<Long> getUserIds() {
		return (java.util.List<Long>) getInputParameter(USERIDS_INPUT_PARAMETER);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getUserIds();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("userIds type is invalid");
		}

	}

}

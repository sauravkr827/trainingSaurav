/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingSaurav.fulfilmentprocess.constants.TrainingSauravFulfilmentProcessConstants;

public class TrainingSauravFulfilmentProcessManager extends GeneratedTrainingSauravFulfilmentProcessManager
{
	public static final TrainingSauravFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingSauravFulfilmentProcessManager) em.getExtension(TrainingSauravFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}

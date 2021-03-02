/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import de.hybris.trainingSaurav.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TrainingSauravCoreManager extends GeneratedTrainingSauravCoreManager
{
	public static final TrainingSauravCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingSauravCoreManager) em.getExtension(TrainingSauravCoreConstants.EXTENSIONNAME);
	}
}

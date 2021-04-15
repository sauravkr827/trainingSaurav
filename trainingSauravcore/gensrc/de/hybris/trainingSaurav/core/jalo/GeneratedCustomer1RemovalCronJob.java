/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 15, 2021, 12:18:44 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob Customer1RemovalCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomer1RemovalCronJob extends CronJob
{
	/** Qualifier of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute **/
	public static final String XDAYSOLD = "xDaysOld";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(XDAYSOLD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute.
	 * @return the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public Integer getXDaysOld(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, XDAYSOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute.
	 * @return the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public Integer getXDaysOld()
	{
		return getXDaysOld( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute. 
	 * @return the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public int getXDaysOldAsPrimitive(final SessionContext ctx)
	{
		Integer value = getXDaysOld( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute. 
	 * @return the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public int getXDaysOldAsPrimitive()
	{
		return getXDaysOldAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public void setXDaysOld(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, XDAYSOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public void setXDaysOld(final Integer value)
	{
		setXDaysOld( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public void setXDaysOld(final SessionContext ctx, final int value)
	{
		setXDaysOld( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1RemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - All Customer1 older than this value in days and whose price is not defined will be removed
	 */
	public void setXDaysOld(final int value)
	{
		setXDaysOld( getSession().getSessionContext(), value );
	}
	
}

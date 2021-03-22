/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 22, 2021, 5:40:41 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob ManufacturerRemovalCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufacturerRemovalCronJob extends CronJob
{
	/** Qualifier of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute **/
	public static final String IDREMOVE = "idRemove";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(IDREMOVE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute.
	 * @return the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public Integer getIdRemove(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, IDREMOVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute.
	 * @return the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public Integer getIdRemove()
	{
		return getIdRemove( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute. 
	 * @return the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public int getIdRemoveAsPrimitive(final SessionContext ctx)
	{
		Integer value = getIdRemove( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute. 
	 * @return the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public int getIdRemoveAsPrimitive()
	{
		return getIdRemoveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute. 
	 * @param value the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public void setIdRemove(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, IDREMOVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute. 
	 * @param value the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public void setIdRemove(final Integer value)
	{
		setIdRemove( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute. 
	 * @param value the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public void setIdRemove(final SessionContext ctx, final int value)
	{
		setIdRemove( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerRemovalCronJob.idRemove</code> attribute. 
	 * @param value the idRemove - All ManufacturerDetails less than this value in days and whose name is not defined will be removed
	 */
	public void setIdRemove(final int value)
	{
		setIdRemove( getSession().getSessionContext(), value );
	}
	
}

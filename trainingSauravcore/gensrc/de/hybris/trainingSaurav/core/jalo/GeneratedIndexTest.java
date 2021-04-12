/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 8, 2021, 8:04:38 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IndexTest}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedIndexTest extends GenericItem
{
	/** Qualifier of the <code>IndexTest.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>IndexTest.city</code> attribute **/
	public static final String CITY = "city";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexTest.city</code> attribute.
	 * @return the city
	 */
	public Map<String,String> getAllCity(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, CITY);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexTest.city</code> attribute.
	 * @return the city
	 */
	public Map<String,String> getAllCity()
	{
		return getAllCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IndexTest.city</code> attribute. 
	 * @param value the city
	 */
	public void setAllCity(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IndexTest.city</code> attribute. 
	 * @param value the city
	 */
	public void setAllCity(final Map<String,String> value)
	{
		setAllCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexTest.country</code> attribute.
	 * @return the country
	 */
	public Set<String> getCountry(final SessionContext ctx)
	{
		Set<String> coll = (Set<String>)getProperty( ctx, COUNTRY);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexTest.country</code> attribute.
	 * @return the country
	 */
	public Set<String> getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IndexTest.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Set<String> value)
	{
		setProperty(ctx, COUNTRY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IndexTest.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Set<String> value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
}

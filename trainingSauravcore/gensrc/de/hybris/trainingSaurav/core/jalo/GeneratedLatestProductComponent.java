/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 15, 2021, 12:18:44 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.trainingSaurav.core.jalo.LatestProductComponent LatestProductComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedLatestProductComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>LatestProductComponent.latestProduct</code> attribute **/
	public static final String LATESTPRODUCT = "latestProduct";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LATESTPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.latestProduct</code> attribute.
	 * @return the latestProduct
	 */
	public Integer getLatestProduct(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedLatestProductComponent.getLatestProduct requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, LATESTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.latestProduct</code> attribute.
	 * @return the latestProduct
	 */
	public Integer getLatestProduct()
	{
		return getLatestProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @return the latestProduct
	 */
	public int getLatestProductAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLatestProduct( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @return the latestProduct
	 */
	public int getLatestProductAsPrimitive()
	{
		return getLatestProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @return the localized latestProduct
	 */
	public Map<Language,Integer> getAllLatestProduct(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,LATESTPRODUCT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @return the localized latestProduct
	 */
	public Map<Language,Integer> getAllLatestProduct()
	{
		return getAllLatestProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @param value the latestProduct
	 */
	public void setLatestProduct(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedLatestProductComponent.setLatestProduct requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LATESTPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @param value the latestProduct
	 */
	public void setLatestProduct(final Integer value)
	{
		setLatestProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @param value the latestProduct
	 */
	public void setLatestProduct(final SessionContext ctx, final int value)
	{
		setLatestProduct( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @param value the latestProduct
	 */
	public void setLatestProduct(final int value)
	{
		setLatestProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @param value the latestProduct
	 */
	public void setAllLatestProduct(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,LATESTPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.latestProduct</code> attribute. 
	 * @param value the latestProduct
	 */
	public void setAllLatestProduct(final Map<Language,Integer> value)
	{
		setAllLatestProduct( getSession().getSessionContext(), value );
	}
	
}

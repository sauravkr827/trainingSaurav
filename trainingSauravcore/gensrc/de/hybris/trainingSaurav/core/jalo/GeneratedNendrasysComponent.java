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
 * Generated class for type {@link de.hybris.trainingSaurav.core.jalo.NendrasysComponent NendrasysComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNendrasysComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>NendrasysComponent.offer</code> attribute **/
	public static final String OFFER = "offer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(OFFER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NendrasysComponent.offer</code> attribute.
	 * @return the offer
	 */
	public String getOffer(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNendrasysComponent.getOffer requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, OFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NendrasysComponent.offer</code> attribute.
	 * @return the offer
	 */
	public String getOffer()
	{
		return getOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NendrasysComponent.offer</code> attribute. 
	 * @return the localized offer
	 */
	public Map<Language,String> getAllOffer(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,OFFER,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NendrasysComponent.offer</code> attribute. 
	 * @return the localized offer
	 */
	public Map<Language,String> getAllOffer()
	{
		return getAllOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NendrasysComponent.offer</code> attribute. 
	 * @param value the offer
	 */
	public void setOffer(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNendrasysComponent.setOffer requires a session language", 0 );
		}
		setLocalizedProperty(ctx, OFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NendrasysComponent.offer</code> attribute. 
	 * @param value the offer
	 */
	public void setOffer(final String value)
	{
		setOffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NendrasysComponent.offer</code> attribute. 
	 * @param value the offer
	 */
	public void setAllOffer(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,OFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NendrasysComponent.offer</code> attribute. 
	 * @param value the offer
	 */
	public void setAllOffer(final Map<Language,String> value)
	{
		setAllOffer( getSession().getSessionContext(), value );
	}
	
}

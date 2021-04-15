/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 15, 2021, 12:18:44 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent CustomOffersComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomOffersComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>CustomOffersComponent.headrerText</code> attribute **/
	public static final String HEADRERTEXT = "headrerText";
	/** Qualifier of the <code>CustomOffersComponent.footerText</code> attribute **/
	public static final String FOOTERTEXT = "footerText";
	/** Qualifier of the <code>CustomOffersComponent.offerImage</code> attribute **/
	public static final String OFFERIMAGE = "offerImage";
	/** Qualifier of the <code>CustomOffersComponent.offerImageLink</code> attribute **/
	public static final String OFFERIMAGELINK = "offerImageLink";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HEADRERTEXT, AttributeMode.INITIAL);
		tmp.put(FOOTERTEXT, AttributeMode.INITIAL);
		tmp.put(OFFERIMAGE, AttributeMode.INITIAL);
		tmp.put(OFFERIMAGELINK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.footerText</code> attribute.
	 * @return the footerText
	 */
	public String getFooterText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FOOTERTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.footerText</code> attribute.
	 * @return the footerText
	 */
	public String getFooterText()
	{
		return getFooterText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.footerText</code> attribute. 
	 * @param value the footerText
	 */
	public void setFooterText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FOOTERTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.footerText</code> attribute. 
	 * @param value the footerText
	 */
	public void setFooterText(final String value)
	{
		setFooterText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.headrerText</code> attribute.
	 * @return the headrerText
	 */
	public String getHeadrerText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADRERTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.headrerText</code> attribute.
	 * @return the headrerText
	 */
	public String getHeadrerText()
	{
		return getHeadrerText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.headrerText</code> attribute. 
	 * @param value the headrerText
	 */
	public void setHeadrerText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADRERTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.headrerText</code> attribute. 
	 * @param value the headrerText
	 */
	public void setHeadrerText(final String value)
	{
		setHeadrerText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.offerImage</code> attribute.
	 * @return the offerImage
	 */
	public Media getOfferImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, OFFERIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.offerImage</code> attribute.
	 * @return the offerImage
	 */
	public Media getOfferImage()
	{
		return getOfferImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.offerImage</code> attribute. 
	 * @param value the offerImage
	 */
	public void setOfferImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, OFFERIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.offerImage</code> attribute. 
	 * @param value the offerImage
	 */
	public void setOfferImage(final Media value)
	{
		setOfferImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.offerImageLink</code> attribute.
	 * @return the offerImageLink - List of CMS Link Component
	 */
	public List<CMSLinkComponent> getOfferImageLink(final SessionContext ctx)
	{
		List<CMSLinkComponent> coll = (List<CMSLinkComponent>)getProperty( ctx, OFFERIMAGELINK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOffersComponent.offerImageLink</code> attribute.
	 * @return the offerImageLink - List of CMS Link Component
	 */
	public List<CMSLinkComponent> getOfferImageLink()
	{
		return getOfferImageLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.offerImageLink</code> attribute. 
	 * @param value the offerImageLink - List of CMS Link Component
	 */
	public void setOfferImageLink(final SessionContext ctx, final List<CMSLinkComponent> value)
	{
		setProperty(ctx, OFFERIMAGELINK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOffersComponent.offerImageLink</code> attribute. 
	 * @param value the offerImageLink - List of CMS Link Component
	 */
	public void setOfferImageLink(final List<CMSLinkComponent> value)
	{
		setOfferImageLink( getSession().getSessionContext(), value );
	}
	
}

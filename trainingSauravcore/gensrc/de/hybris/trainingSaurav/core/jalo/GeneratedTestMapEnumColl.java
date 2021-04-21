/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 20, 2021, 11:40:09 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import de.hybris.trainingSaurav.core.jalo.ManufacturerDetails;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TestMapEnumColl}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestMapEnumColl extends GenericItem
{
	/** Qualifier of the <code>TestMapEnumColl.ColletionMan</code> attribute **/
	public static final String COLLETIONMAN = "ColletionMan";
	/** Qualifier of the <code>TestMapEnumColl.MapTEst</code> attribute **/
	public static final String MAPTEST = "MapTEst";
	/** Qualifier of the <code>TestMapEnumColl.EnumTest</code> attribute **/
	public static final String ENUMTEST = "EnumTest";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COLLETIONMAN, AttributeMode.INITIAL);
		tmp.put(MAPTEST, AttributeMode.INITIAL);
		tmp.put(ENUMTEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestMapEnumColl.ColletionMan</code> attribute.
	 * @return the ColletionMan
	 */
	public Set<ManufacturerDetails> getColletionMan(final SessionContext ctx)
	{
		Set<ManufacturerDetails> coll = (Set<ManufacturerDetails>)getProperty( ctx, COLLETIONMAN);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestMapEnumColl.ColletionMan</code> attribute.
	 * @return the ColletionMan
	 */
	public Set<ManufacturerDetails> getColletionMan()
	{
		return getColletionMan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestMapEnumColl.ColletionMan</code> attribute. 
	 * @param value the ColletionMan
	 */
	public void setColletionMan(final SessionContext ctx, final Set<ManufacturerDetails> value)
	{
		setProperty(ctx, COLLETIONMAN,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestMapEnumColl.ColletionMan</code> attribute. 
	 * @param value the ColletionMan
	 */
	public void setColletionMan(final Set<ManufacturerDetails> value)
	{
		setColletionMan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestMapEnumColl.EnumTest</code> attribute.
	 * @return the EnumTest
	 */
	public EnumerationValue getEnumTest(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENUMTEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestMapEnumColl.EnumTest</code> attribute.
	 * @return the EnumTest
	 */
	public EnumerationValue getEnumTest()
	{
		return getEnumTest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestMapEnumColl.EnumTest</code> attribute. 
	 * @param value the EnumTest
	 */
	public void setEnumTest(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENUMTEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestMapEnumColl.EnumTest</code> attribute. 
	 * @param value the EnumTest
	 */
	public void setEnumTest(final EnumerationValue value)
	{
		setEnumTest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestMapEnumColl.MapTEst</code> attribute.
	 * @return the MapTEst
	 */
	public Map<String,ManufacturerDetails> getAllMapTEst(final SessionContext ctx)
	{
		Map<String,ManufacturerDetails> map = (Map<String,ManufacturerDetails>)getProperty( ctx, MAPTEST);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestMapEnumColl.MapTEst</code> attribute.
	 * @return the MapTEst
	 */
	public Map<String,ManufacturerDetails> getAllMapTEst()
	{
		return getAllMapTEst( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestMapEnumColl.MapTEst</code> attribute. 
	 * @param value the MapTEst
	 */
	public void setAllMapTEst(final SessionContext ctx, final Map<String,ManufacturerDetails> value)
	{
		setProperty(ctx, MAPTEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestMapEnumColl.MapTEst</code> attribute. 
	 * @param value the MapTEst
	 */
	public void setAllMapTEst(final Map<String,ManufacturerDetails> value)
	{
		setAllMapTEst( getSession().getSessionContext(), value );
	}
	
}

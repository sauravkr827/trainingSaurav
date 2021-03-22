/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 22, 2021, 5:40:41 PM                    ---
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Customer1}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomer1 extends GenericItem
{
	/** Qualifier of the <code>Customer1.customerId</code> attribute **/
	public static final String CUSTOMERID = "customerId";
	/** Qualifier of the <code>Customer1.customerName</code> attribute **/
	public static final String CUSTOMERNAME = "customerName";
	/** Qualifier of the <code>Customer1.customerCreated</code> attribute **/
	public static final String CUSTOMERCREATED = "customerCreated";
	/** Qualifier of the <code>Customer1.newCustomer</code> attribute **/
	public static final String NEWCUSTOMER = "newCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMERID, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNAME, AttributeMode.INITIAL);
		tmp.put(CUSTOMERCREATED, AttributeMode.INITIAL);
		tmp.put(NEWCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CUSTOMERCREATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated()
	{
		return getCustomerCreated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CUSTOMERCREATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final Date value)
	{
		setCustomerCreated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerId</code> attribute.
	 * @return the customerId
	 */
	public Integer getCustomerId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerId</code> attribute.
	 * @return the customerId
	 */
	public Integer getCustomerId()
	{
		return getCustomerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerId</code> attribute. 
	 * @return the customerId
	 */
	public int getCustomerIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCustomerId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerId</code> attribute. 
	 * @return the customerId
	 */
	public int getCustomerIdAsPrimitive()
	{
		return getCustomerIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CUSTOMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final Integer value)
	{
		setCustomerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final SessionContext ctx, final int value)
	{
		setCustomerId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final int value)
	{
		setCustomerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName()
	{
		return getCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final String value)
	{
		setCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer()
	{
		return isNewCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNewCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer1.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive()
	{
		return isNewCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final Boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final boolean value)
	{
		setNewCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer1.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), value );
	}
	
}

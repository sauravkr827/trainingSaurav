/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 11, 2021, 11:13:39 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import com.stackextend.training.core.jalo.HelloWorldCustomerJob;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import de.hybris.trainingSaurav.core.jalo.ApparelProduct;
import de.hybris.trainingSaurav.core.jalo.ApparelSizeVariantProduct;
import de.hybris.trainingSaurav.core.jalo.ApparelStyleVariantProduct;
import de.hybris.trainingSaurav.core.jalo.Customer1;
import de.hybris.trainingSaurav.core.jalo.Customer1RemovalCronJob;
import de.hybris.trainingSaurav.core.jalo.CustomerIsNewCronJob;
import de.hybris.trainingSaurav.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.trainingSaurav.core.jalo.IndexTest;
import de.hybris.trainingSaurav.core.jalo.ManufacturerDetails;
import de.hybris.trainingSaurav.core.jalo.ManufacturerDetailsAuditEntry;
import de.hybris.trainingSaurav.core.jalo.ManufacturerRemovalCronJob;
import de.hybris.trainingSaurav.core.jalo.Saurav1;
import de.hybris.trainingSaurav.core.jalo.TestMapEnumColl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingSauravCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingSauravCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isNewCustomer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Customer1 createCustomer1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.CUSTOMER1 );
			return (Customer1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Customer1 : "+e.getMessage(), 0 );
		}
	}
	
	public Customer1 createCustomer1(final Map attributeValues)
	{
		return createCustomer1( getSession().getSessionContext(), attributeValues );
	}
	
	public Customer1RemovalCronJob createCustomer1RemovalCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.CUSTOMER1REMOVALCRONJOB );
			return (Customer1RemovalCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Customer1RemovalCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public Customer1RemovalCronJob createCustomer1RemovalCronJob(final Map attributeValues)
	{
		return createCustomer1RemovalCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerIsNewCronJob createCustomerIsNewCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.CUSTOMERISNEWCRONJOB );
			return (CustomerIsNewCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerIsNewCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerIsNewCronJob createCustomerIsNewCronJob(final Map attributeValues)
	{
		return createCustomerIsNewCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public HelloWorldCustomerJob createHelloWorldJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.HELLOWORLDJOB );
			return (HelloWorldCustomerJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HelloWorldJob : "+e.getMessage(), 0 );
		}
	}
	
	public HelloWorldCustomerJob createHelloWorldJob(final Map attributeValues)
	{
		return createHelloWorldJob( getSession().getSessionContext(), attributeValues );
	}
	
	public IndexTest createIndexTest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.INDEXTEST );
			return (IndexTest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating IndexTest : "+e.getMessage(), 0 );
		}
	}
	
	public IndexTest createIndexTest(final Map attributeValues)
	{
		return createIndexTest( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerDetails createManufacturerDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.MANUFACTURERDETAILS );
			return (ManufacturerDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerDetails createManufacturerDetails(final Map attributeValues)
	{
		return createManufacturerDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerDetailsAuditEntry createManufacturerDetailsAuditEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.MANUFACTURERDETAILSAUDITENTRY );
			return (ManufacturerDetailsAuditEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerDetailsAuditEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerDetailsAuditEntry createManufacturerDetailsAuditEntry(final Map attributeValues)
	{
		return createManufacturerDetailsAuditEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerRemovalCronJob createManufacturerRemovalCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.MANUFACTURERREMOVALCRONJOB );
			return (ManufacturerRemovalCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerRemovalCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerRemovalCronJob createManufacturerRemovalCronJob(final Map attributeValues)
	{
		return createManufacturerRemovalCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public Saurav1 createSaurav1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.SAURAV1 );
			return (Saurav1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Saurav1 : "+e.getMessage(), 0 );
		}
	}
	
	public Saurav1 createSaurav1(final Map attributeValues)
	{
		return createSaurav1( getSession().getSessionContext(), attributeValues );
	}
	
	public TestMapEnumColl createTestMapEnumColl(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.TESTMAPENUMCOLL );
			return (TestMapEnumColl)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TestMapEnumColl : "+e.getMessage(), 0 );
		}
	}
	
	public TestMapEnumColl createTestMapEnumColl(final Map attributeValues)
	{
		return createTestMapEnumColl( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingSauravCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingSauravCoreConstants.Attributes.Customer.ISNEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final Customer item)
	{
		return isIsNewCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewCustomer( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final Customer item)
	{
		return isIsNewCustomerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingSauravCoreConstants.Attributes.Customer.ISNEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final Boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewCustomer( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
}

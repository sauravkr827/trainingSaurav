/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 16, 2021, 10:23:36 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSaurav.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.PrincipalGroup;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.solrfacetsearch.jalo.config.SolrFacetSearchConfig;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingSaurav.core.constants.TrainingSauravCoreConstants;
import de.hybris.trainingSaurav.core.jalo.ApparelProduct;
import de.hybris.trainingSaurav.core.jalo.ApparelSizeVariantProduct;
import de.hybris.trainingSaurav.core.jalo.ApparelStyleVariantProduct;
import de.hybris.trainingSaurav.core.jalo.CustomOffersComponent;
import de.hybris.trainingSaurav.core.jalo.CustomPage;
import de.hybris.trainingSaurav.core.jalo.Customer1;
import de.hybris.trainingSaurav.core.jalo.Customer1RemovalCronJob;
import de.hybris.trainingSaurav.core.jalo.CustomerIsNewCronJob;
import de.hybris.trainingSaurav.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.trainingSaurav.core.jalo.IndexTest;
import de.hybris.trainingSaurav.core.jalo.LatestProductComponent;
import de.hybris.trainingSaurav.core.jalo.ManufacturerDetails;
import de.hybris.trainingSaurav.core.jalo.ManufacturerDetailsAuditEntry;
import de.hybris.trainingSaurav.core.jalo.ManufacturerRemovalCronJob;
import de.hybris.trainingSaurav.core.jalo.NendrasysComponent;
import de.hybris.trainingSaurav.core.jalo.Saurav1;
import de.hybris.trainingSaurav.core.jalo.TestMapEnumColl;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.jalo.CustomOffersComponent1;

/**
 * Generated class for type <code>TrainingSauravCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingSauravCoreManager extends Extension
{
	/** Relation ordering override parameter constants for SolrfacetSearchRelationUserGroup from ((trainingSauravcore))*/
	protected static String SOLRFACETSEARCHRELATIONUSERGROUP_SRC_ORDERED = "relation.SolrfacetSearchRelationUserGroup.source.ordered";
	protected static String SOLRFACETSEARCHRELATIONUSERGROUP_TGT_ORDERED = "relation.SolrfacetSearchRelationUserGroup.target.ordered";
	/** Relation disable markmodifed parameter constants for SolrfacetSearchRelationUserGroup from ((trainingSauravcore))*/
	protected static String SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED = "relation.SolrfacetSearchRelationUserGroup.markmodified";
	/** Relation ordering override parameter constants for ManufacturerToProduct from ((trainingSauravcore))*/
	protected static String MANUFACTURERTOPRODUCT_SRC_ORDERED = "relation.ManufacturerToProduct.source.ordered";
	protected static String MANUFACTURERTOPRODUCT_TGT_ORDERED = "relation.ManufacturerToProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for ManufacturerToProduct from ((trainingSauravcore))*/
	protected static String MANUFACTURERTOPRODUCT_MARKMODIFIED = "relation.ManufacturerToProduct.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("userPriceGroup", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.solrfacetsearch.jalo.config.SolrFacetSearchConfig", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("isNewCustomer", AttributeMode.INITIAL);
		tmp.put("isNewBussinessUser", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("customSEOKeyword", AttributeMode.INITIAL);
		tmp.put("canBeSold", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("vatNumber", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute.
	 * @return the canBeSold
	 */
	public Boolean isCanBeSold(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TrainingSauravCoreConstants.Attributes.Product.CANBESOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute.
	 * @return the canBeSold
	 */
	public Boolean isCanBeSold(final Product item)
	{
		return isCanBeSold( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute. 
	 * @return the canBeSold
	 */
	public boolean isCanBeSoldAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isCanBeSold( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute. 
	 * @return the canBeSold
	 */
	public boolean isCanBeSoldAsPrimitive(final Product item)
	{
		return isCanBeSoldAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TrainingSauravCoreConstants.Attributes.Product.CANBESOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final Product item, final Boolean value)
	{
		setCanBeSold( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final SessionContext ctx, final Product item, final boolean value)
	{
		setCanBeSold( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final Product item, final boolean value)
	{
		setCanBeSold( getSession().getSessionContext(), item, value );
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
	
	public CustomOffersComponent createCustomOffersComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.CUSTOMOFFERSCOMPONENT );
			return (CustomOffersComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CustomOffersComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomOffersComponent createCustomOffersComponent(final Map attributeValues)
	{
		return createCustomOffersComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomOffersComponent1 createCustomOffersComponent1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.CUSTOMOFFERSCOMPONENT1 );
			return (CustomOffersComponent1)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CustomOffersComponent1 : "+e.getMessage(), 0 );
		}
	}
	
	public CustomOffersComponent1 createCustomOffersComponent1(final Map attributeValues)
	{
		return createCustomOffersComponent1( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomPage createCustomPage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.CUSTOMPAGE );
			return (CustomPage)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CustomPage : "+e.getMessage(), 0 );
		}
	}
	
	public CustomPage createCustomPage(final Map attributeValues)
	{
		return createCustomPage( getSession().getSessionContext(), attributeValues );
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
	
	public LatestProductComponent createLatestProductComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.LATESTPRODUCTCOMPONENT );
			return (LatestProductComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating LatestProductComponent : "+e.getMessage(), 0 );
		}
	}
	
	public LatestProductComponent createLatestProductComponent(final Map attributeValues)
	{
		return createLatestProductComponent( getSession().getSessionContext(), attributeValues );
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
	
	public NendrasysComponent createNendrasysComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingSauravCoreConstants.TC.NENDRASYSCOMPONENT );
			return (NendrasysComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NendrasysComponent : "+e.getMessage(), 0 );
		}
	}
	
	public NendrasysComponent createNendrasysComponent(final Map attributeValues)
	{
		return createNendrasysComponent( getSession().getSessionContext(), attributeValues );
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEOKeyword</code> attribute.
	 * @return the customSEOKeyword
	 */
	public String getCustomSEOKeyword(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingSauravCoreConstants.Attributes.Product.CUSTOMSEOKEYWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEOKeyword</code> attribute.
	 * @return the customSEOKeyword
	 */
	public String getCustomSEOKeyword(final Product item)
	{
		return getCustomSEOKeyword( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEOKeyword</code> attribute. 
	 * @param value the customSEOKeyword
	 */
	public void setCustomSEOKeyword(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingSauravCoreConstants.Attributes.Product.CUSTOMSEOKEYWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEOKeyword</code> attribute. 
	 * @param value the customSEOKeyword
	 */
	public void setCustomSEOKeyword(final Product item, final String value)
	{
		setCustomSEOKeyword( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingSauravCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBussinessUser</code> attribute.
	 * @return the isNewBussinessUser
	 */
	public Boolean isIsNewBussinessUser(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingSauravCoreConstants.Attributes.Customer.ISNEWBUSSINESSUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBussinessUser</code> attribute.
	 * @return the isNewBussinessUser
	 */
	public Boolean isIsNewBussinessUser(final Customer item)
	{
		return isIsNewBussinessUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBussinessUser</code> attribute. 
	 * @return the isNewBussinessUser
	 */
	public boolean isIsNewBussinessUserAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewBussinessUser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBussinessUser</code> attribute. 
	 * @return the isNewBussinessUser
	 */
	public boolean isIsNewBussinessUserAsPrimitive(final Customer item)
	{
		return isIsNewBussinessUserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBussinessUser</code> attribute. 
	 * @param value the isNewBussinessUser
	 */
	public void setIsNewBussinessUser(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingSauravCoreConstants.Attributes.Customer.ISNEWBUSSINESSUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBussinessUser</code> attribute. 
	 * @param value the isNewBussinessUser
	 */
	public void setIsNewBussinessUser(final Customer item, final Boolean value)
	{
		setIsNewBussinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBussinessUser</code> attribute. 
	 * @param value the isNewBussinessUser
	 */
	public void setIsNewBussinessUser(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewBussinessUser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBussinessUser</code> attribute. 
	 * @param value the isNewBussinessUser
	 */
	public void setIsNewBussinessUser(final Customer item, final boolean value)
	{
		setIsNewBussinessUser( getSession().getSessionContext(), item, value );
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturerDetails</code> attribute.
	 * @return the manufacturerDetails
	 */
	public Collection<ManufacturerDetails> getManufacturerDetails(final SessionContext ctx, final Product item)
	{
		final List<ManufacturerDetails> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.MANUFACTURERTOPRODUCT,
			"ManufacturerDetails",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturerDetails</code> attribute.
	 * @return the manufacturerDetails
	 */
	public Collection<ManufacturerDetails> getManufacturerDetails(final Product item)
	{
		return getManufacturerDetails( getSession().getSessionContext(), item );
	}
	
	public long getManufacturerDetailsCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.MANUFACTURERTOPRODUCT,
			"ManufacturerDetails",
			null
		);
	}
	
	public long getManufacturerDetailsCount(final Product item)
	{
		return getManufacturerDetailsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturerDetails</code> attribute. 
	 * @param value the manufacturerDetails
	 */
	public void setManufacturerDetails(final SessionContext ctx, final Product item, final Collection<ManufacturerDetails> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.MANUFACTURERTOPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturerDetails</code> attribute. 
	 * @param value the manufacturerDetails
	 */
	public void setManufacturerDetails(final Product item, final Collection<ManufacturerDetails> value)
	{
		setManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturerDetails. 
	 * @param value the item to add to manufacturerDetails
	 */
	public void addToManufacturerDetails(final SessionContext ctx, final Product item, final ManufacturerDetails value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.MANUFACTURERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturerDetails. 
	 * @param value the item to add to manufacturerDetails
	 */
	public void addToManufacturerDetails(final Product item, final ManufacturerDetails value)
	{
		addToManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturerDetails. 
	 * @param value the item to remove from manufacturerDetails
	 */
	public void removeFromManufacturerDetails(final SessionContext ctx, final Product item, final ManufacturerDetails value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.MANUFACTURERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturerDetails. 
	 * @param value the item to remove from manufacturerDetails
	 */
	public void removeFromManufacturerDetails(final Product item, final ManufacturerDetails value)
	{
		removeFromManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.solrFacetSearchConfig</code> attribute.
	 * @return the solrFacetSearchConfig
	 */
	public List<SolrFacetSearchConfig> getSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item)
	{
		final List<SolrFacetSearchConfig> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			"SolrFacetSearchConfig",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.solrFacetSearchConfig</code> attribute.
	 * @return the solrFacetSearchConfig
	 */
	public List<SolrFacetSearchConfig> getSolrFacetSearchConfig(final UserGroup item)
	{
		return getSolrFacetSearchConfig( getSession().getSessionContext(), item );
	}
	
	public long getSolrFacetSearchConfigCount(final SessionContext ctx, final UserGroup item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			"SolrFacetSearchConfig",
			null
		);
	}
	
	public long getSolrFacetSearchConfigCount(final UserGroup item)
	{
		return getSolrFacetSearchConfigCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.solrFacetSearchConfig</code> attribute. 
	 * @param value the solrFacetSearchConfig
	 */
	public void setSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item, final List<SolrFacetSearchConfig> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.solrFacetSearchConfig</code> attribute. 
	 * @param value the solrFacetSearchConfig
	 */
	public void setSolrFacetSearchConfig(final UserGroup item, final List<SolrFacetSearchConfig> value)
	{
		setSolrFacetSearchConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to solrFacetSearchConfig. 
	 * @param value the item to add to solrFacetSearchConfig
	 */
	public void addToSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item, final SolrFacetSearchConfig value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to solrFacetSearchConfig. 
	 * @param value the item to add to solrFacetSearchConfig
	 */
	public void addToSolrFacetSearchConfig(final UserGroup item, final SolrFacetSearchConfig value)
	{
		addToSolrFacetSearchConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from solrFacetSearchConfig. 
	 * @param value the item to remove from solrFacetSearchConfig
	 */
	public void removeFromSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item, final SolrFacetSearchConfig value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from solrFacetSearchConfig. 
	 * @param value the item to remove from solrFacetSearchConfig
	 */
	public void removeFromSolrFacetSearchConfig(final UserGroup item, final SolrFacetSearchConfig value)
	{
		removeFromSolrFacetSearchConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public List<UserGroup> getUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		final List<UserGroup> items = item.getLinkedItems( 
			ctx,
			true,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			"UserGroup",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public List<UserGroup> getUserGroup(final SolrFacetSearchConfig item)
	{
		return getUserGroup( getSession().getSessionContext(), item );
	}
	
	public long getUserGroupCount(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			"UserGroup",
			null
		);
	}
	
	public long getUserGroupCount(final SolrFacetSearchConfig item)
	{
		return getUserGroupCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final List<UserGroup> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final SolrFacetSearchConfig item, final List<UserGroup> value)
	{
		setUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to userGroup. 
	 * @param value the item to add to userGroup
	 */
	public void addToUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final UserGroup value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to userGroup. 
	 * @param value the item to add to userGroup
	 */
	public void addToUserGroup(final SolrFacetSearchConfig item, final UserGroup value)
	{
		addToUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from userGroup. 
	 * @param value the item to remove from userGroup
	 */
	public void removeFromUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final UserGroup value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			TrainingSauravCoreConstants.Relations.SOLRFACETSEARCHRELATIONUSERGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SOLRFACETSEARCHRELATIONUSERGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from userGroup. 
	 * @param value the item to remove from userGroup
	 */
	public void removeFromUserGroup(final SolrFacetSearchConfig item, final UserGroup value)
	{
		removeFromUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.userPriceGroup</code> attribute.
	 * @return the userPriceGroup
	 */
	public EnumerationValue getUserPriceGroup(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		return (EnumerationValue)item.getProperty( ctx, TrainingSauravCoreConstants.Attributes.SolrFacetSearchConfig.USERPRICEGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.userPriceGroup</code> attribute.
	 * @return the userPriceGroup
	 */
	public EnumerationValue getUserPriceGroup(final SolrFacetSearchConfig item)
	{
		return getUserPriceGroup( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.userPriceGroup</code> attribute. 
	 * @param value the userPriceGroup
	 */
	public void setUserPriceGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final EnumerationValue value)
	{
		item.setProperty(ctx, TrainingSauravCoreConstants.Attributes.SolrFacetSearchConfig.USERPRICEGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.userPriceGroup</code> attribute. 
	 * @param value the userPriceGroup
	 */
	public void setUserPriceGroup(final SolrFacetSearchConfig item, final EnumerationValue value)
	{
		setUserPriceGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.vatNumber</code> attribute.
	 * @return the vatNumber
	 */
	public String getVatNumber(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, TrainingSauravCoreConstants.Attributes.Address.VATNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.vatNumber</code> attribute.
	 * @return the vatNumber
	 */
	public String getVatNumber(final Address item)
	{
		return getVatNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.vatNumber</code> attribute. 
	 * @param value the vatNumber
	 */
	public void setVatNumber(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, TrainingSauravCoreConstants.Attributes.Address.VATNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.vatNumber</code> attribute. 
	 * @param value the vatNumber
	 */
	public void setVatNumber(final Address item, final String value)
	{
		setVatNumber( getSession().getSessionContext(), item, value );
	}
	
}

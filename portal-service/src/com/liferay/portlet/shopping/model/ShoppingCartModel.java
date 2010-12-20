/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.shopping.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ShoppingCart service. Represents a row in the &quot;ShoppingCart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.shopping.model.impl.ShoppingCartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.shopping.model.impl.ShoppingCartImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCart
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCartImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCartModelImpl
 * @generated
 */
public interface ShoppingCartModel extends BaseModel<ShoppingCart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a shopping cart model instance should use the {@link ShoppingCart} interface instead.
	 */

	/**
	 * Gets the primary key of this shopping cart.
	 *
	 * @return the primary key of this shopping cart
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this shopping cart
	 *
	 * @param pk the primary key of this shopping cart
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the cart ID of this shopping cart.
	 *
	 * @return the cart ID of this shopping cart
	 */
	public long getCartId();

	/**
	 * Sets the cart ID of this shopping cart.
	 *
	 * @param cartId the cart ID of this shopping cart
	 */
	public void setCartId(long cartId);

	/**
	 * Gets the group ID of this shopping cart.
	 *
	 * @return the group ID of this shopping cart
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this shopping cart.
	 *
	 * @param groupId the group ID of this shopping cart
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this shopping cart.
	 *
	 * @return the company ID of this shopping cart
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this shopping cart.
	 *
	 * @param companyId the company ID of this shopping cart
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this shopping cart.
	 *
	 * @return the user ID of this shopping cart
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this shopping cart.
	 *
	 * @param userId the user ID of this shopping cart
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this shopping cart.
	 *
	 * @return the user uuid of this shopping cart
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this shopping cart.
	 *
	 * @param userUuid the user uuid of this shopping cart
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this shopping cart.
	 *
	 * @return the user name of this shopping cart
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this shopping cart.
	 *
	 * @param userName the user name of this shopping cart
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this shopping cart.
	 *
	 * @return the create date of this shopping cart
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this shopping cart.
	 *
	 * @param createDate the create date of this shopping cart
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this shopping cart.
	 *
	 * @return the modified date of this shopping cart
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this shopping cart.
	 *
	 * @param modifiedDate the modified date of this shopping cart
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the item IDs of this shopping cart.
	 *
	 * @return the item IDs of this shopping cart
	 */
	@AutoEscape
	public String getItemIds();

	/**
	 * Sets the item IDs of this shopping cart.
	 *
	 * @param itemIds the item IDs of this shopping cart
	 */
	public void setItemIds(String itemIds);

	/**
	 * Gets the coupon codes of this shopping cart.
	 *
	 * @return the coupon codes of this shopping cart
	 */
	@AutoEscape
	public String getCouponCodes();

	/**
	 * Sets the coupon codes of this shopping cart.
	 *
	 * @param couponCodes the coupon codes of this shopping cart
	 */
	public void setCouponCodes(String couponCodes);

	/**
	 * Gets the alt shipping of this shopping cart.
	 *
	 * @return the alt shipping of this shopping cart
	 */
	public int getAltShipping();

	/**
	 * Sets the alt shipping of this shopping cart.
	 *
	 * @param altShipping the alt shipping of this shopping cart
	 */
	public void setAltShipping(int altShipping);

	/**
	 * Gets the insure of this shopping cart.
	 *
	 * @return the insure of this shopping cart
	 */
	public boolean getInsure();

	/**
	 * Determines if this shopping cart is insure.
	 *
	 * @return <code>true</code> if this shopping cart is insure; <code>false</code> otherwise
	 */
	public boolean isInsure();

	/**
	 * Sets whether this shopping cart is insure.
	 *
	 * @param insure the insure of this shopping cart
	 */
	public void setInsure(boolean insure);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(ShoppingCart shoppingCart);

	public int hashCode();

	public ShoppingCart toEscapedModel();

	public String toString();

	public String toXmlString();
}
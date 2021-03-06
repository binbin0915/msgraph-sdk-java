// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AlternativeSecurityId;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device.
 */
public class Device extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * true if the account is enabled; otherwise, false. Required.
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Alternative Security Ids.
     * For internal use only. Not nullable.
     */
    @SerializedName("alternativeSecurityIds")
    @Expose
    public java.util.List<AlternativeSecurityId> alternativeSecurityIds;

    /**
     * The Approximate Last Sign In Date Time.
     * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName("approximateLastSignInDateTime")
    @Expose
    public java.util.Calendar approximateLastSignInDateTime;

    /**
     * The Compliance Expiration Date Time.
     * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName("complianceExpirationDateTime")
    @Expose
    public java.util.Calendar complianceExpirationDateTime;

    /**
     * The Device Id.
     * Unique identifier set by Azure Device Registration Service at the time of registration.
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Device Metadata.
     * For interal use only. Set to null.
     */
    @SerializedName("deviceMetadata")
    @Expose
    public String deviceMetadata;

    /**
     * The Device Version.
     * For interal use only.
     */
    @SerializedName("deviceVersion")
    @Expose
    public Integer deviceVersion;

    /**
     * The Display Name.
     * The display name for the device. Required.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Compliant.
     * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
     */
    @SerializedName("isCompliant")
    @Expose
    public Boolean isCompliant;

    /**
     * The Is Managed.
     * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
     */
    @SerializedName("isManaged")
    @Expose
    public Boolean isManaged;

    /**
     * The Mdm App Id.
     * Application identifier used to register device into MDM. Read-only. Supports $filter.
     */
    @SerializedName("mdmAppId")
    @Expose
    public String mdmAppId;

    /**
     * The On Premises Last Sync Date Time.
     * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z' Read-only.
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only.
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Operating System.
     * The type of operating system on the device. Required.
     */
    @SerializedName("operatingSystem")
    @Expose
    public String operatingSystem;

    /**
     * The Operating System Version.
     * The version of the operating system on the device. Required.
     */
    @SerializedName("operatingSystemVersion")
    @Expose
    public String operatingSystemVersion;

    /**
     * The Physical Ids.
     * For interal use only. Not nullable.
     */
    @SerializedName("physicalIds")
    @Expose
    public java.util.List<String> physicalIds;

    /**
     * The Profile Type.
     * The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT
     */
    @SerializedName("profileType")
    @Expose
    public String profileType;

    /**
     * The System Labels.
     * List of labels applied to the device by the system.
     */
    @SerializedName("systemLabels")
    @Expose
    public java.util.List<String> systemLabels;

    /**
     * The Trust Type.
     * Type of trust for the joined device. Read-only. Possible values: Workplace - indicates bring your own personal devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD. For more details, see Introduction to device management in Azure Active Directory
     */
    @SerializedName("trustType")
    @Expose
    public String trustType;

    /**
     * The Member Of.
     * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Registered Owners.
     * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredOwners;

    /**
     * The Registered Users.
     * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredUsers;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Extensions.
     * The collection of open extensions defined for the device. Read-only. Nullable.
     */
    public ExtensionCollectionPage extensions;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("memberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("registeredOwners")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("registeredOwners@odata.nextLink")) {
                response.nextLink = json.get("registeredOwners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredOwners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredOwners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("registeredUsers")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("registeredUsers@odata.nextLink")) {
                response.nextLink = json.get("registeredUsers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredUsers").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredUsers = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("transitiveMemberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("transitiveMemberOf@odata.nextLink")) {
                response.nextLink = json.get("transitiveMemberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            transitiveMemberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final ExtensionCollectionResponse response = new ExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }
    }
}

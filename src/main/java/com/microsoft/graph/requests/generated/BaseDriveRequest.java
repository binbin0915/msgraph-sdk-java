// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Request.
 */
public class BaseDriveRequest extends BaseRequest implements IBaseDriveRequest {

    /**
     * The request for the Drive
     *
     * @param requestUrl The request URL
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the response
     */
    public BaseDriveRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Drive> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Drive from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Drive> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Drive from the service
     * @return The Drive from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Drive get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Drive with a source
     * @param sourceDrive The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Drive sourceDrive, final ICallback<Drive> callback) {
        send(HttpMethod.PATCH, callback, sourceDrive);
    }

    /**
     * Patches this Drive with a source
     * @param sourceDrive The source object with updates
     * @return The updated Drive
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Drive patch(final Drive sourceDrive) throws ClientException {
        return send(HttpMethod.PATCH, sourceDrive);
    }

    /**
     * Creates a Drive with a new object
     * @param newDrive The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Drive newDrive, final ICallback<Drive> callback) {
        send(HttpMethod.POST, callback, newDrive);
    }

    /**
     * Creates a Drive with a new object
     * @param newDrive The new object to create
     * @return The created Drive
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Drive post(final Drive newDrive) throws ClientException {
        return send(HttpMethod.POST, newDrive);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IDriveRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DriveRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IDriveRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DriveRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Teams App Installation Collection Request.
 */
public class BaseTeamsAppInstallationCollectionRequest extends BaseCollectionRequest<BaseTeamsAppInstallationCollectionResponse, ITeamsAppInstallationCollectionPage> implements IBaseTeamsAppInstallationCollectionRequest {

    /**
     * The request builder for this collection of TeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTeamsAppInstallationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseTeamsAppInstallationCollectionResponse.class, ITeamsAppInstallationCollectionPage.class);
    }

    public void get(final ICallback<ITeamsAppInstallationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITeamsAppInstallationCollectionPage get() throws ClientException {
        final BaseTeamsAppInstallationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TeamsAppInstallation newTeamsAppInstallation, final ICallback<TeamsAppInstallation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TeamsAppInstallationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTeamsAppInstallation, callback);
    }

    public TeamsAppInstallation post(final TeamsAppInstallation newTeamsAppInstallation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamsAppInstallationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTeamsAppInstallation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppInstallationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (TeamsAppInstallationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppInstallationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (TeamsAppInstallationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamsAppInstallationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (TeamsAppInstallationCollectionRequest)this;
    }

    public ITeamsAppInstallationCollectionPage buildFromResponse(final BaseTeamsAppInstallationCollectionResponse response) {
        final ITeamsAppInstallationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamsAppInstallationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TeamsAppInstallationCollectionPage page = new TeamsAppInstallationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
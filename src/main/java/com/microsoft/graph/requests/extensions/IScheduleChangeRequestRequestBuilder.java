// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IScheduleChangeRequestRequest;
import com.microsoft.graph.requests.extensions.IScheduleChangeRequestApproveRequestBuilder;
import com.microsoft.graph.requests.extensions.IScheduleChangeRequestDeclineRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Schedule Change Request Request Builder.
 */
public interface IScheduleChangeRequestRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IScheduleChangeRequestRequest instance
     */
    IScheduleChangeRequestRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IScheduleChangeRequestRequest instance
     */
    IScheduleChangeRequestRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IScheduleChangeRequestApproveRequestBuilder approve(final String message);
    IScheduleChangeRequestDeclineRequestBuilder decline(final String message);

}

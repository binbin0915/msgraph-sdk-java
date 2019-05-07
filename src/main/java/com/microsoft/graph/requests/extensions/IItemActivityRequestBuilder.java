// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IItemActivityRequest;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity Request Builder.
 */
public interface IItemActivityRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IItemActivityRequest instance
     */
    IItemActivityRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IItemActivityRequest instance
     */
    IItemActivityRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder driveItem();

}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableDataBodyRangeRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Data Body Range Request Builder.
 */
public interface IWorkbookTableDataBodyRangeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableDataBodyRangeRequest
     *
     * @return the IWorkbookTableDataBodyRangeRequest instance
     */
    IWorkbookTableDataBodyRangeRequest buildRequest();

    /**
     * Creates the IWorkbookTableDataBodyRangeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableDataBodyRangeRequest instance
     */
    IWorkbookTableDataBodyRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

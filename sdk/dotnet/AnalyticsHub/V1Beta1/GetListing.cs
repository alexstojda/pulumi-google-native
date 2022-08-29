// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.AnalyticsHub.V1Beta1
{
    public static class GetListing
    {
        /// <summary>
        /// Gets the details of a listing.
        /// </summary>
        public static Task<GetListingResult> InvokeAsync(GetListingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetListingResult>("google-native:analyticshub/v1beta1:getListing", args ?? new GetListingArgs(), options.WithDefaults());

        /// <summary>
        /// Gets the details of a listing.
        /// </summary>
        public static Output<GetListingResult> Invoke(GetListingInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetListingResult>("google-native:analyticshub/v1beta1:getListing", args ?? new GetListingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetListingArgs : global::Pulumi.InvokeArgs
    {
        [Input("dataExchangeId", required: true)]
        public string DataExchangeId { get; set; } = null!;

        [Input("listingId", required: true)]
        public string ListingId { get; set; } = null!;

        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        public GetListingArgs()
        {
        }
        public static new GetListingArgs Empty => new GetListingArgs();
    }

    public sealed class GetListingInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("dataExchangeId", required: true)]
        public Input<string> DataExchangeId { get; set; } = null!;

        [Input("listingId", required: true)]
        public Input<string> ListingId { get; set; } = null!;

        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetListingInvokeArgs()
        {
        }
        public static new GetListingInvokeArgs Empty => new GetListingInvokeArgs();
    }


    [OutputType]
    public sealed class GetListingResult
    {
        /// <summary>
        /// Shared dataset i.e. BigQuery dataset source.
        /// </summary>
        public readonly Outputs.BigQueryDatasetSourceResponse BigqueryDataset;
        /// <summary>
        /// Optional. Categories of the listing. Up to two categories are allowed.
        /// </summary>
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// Optional. Details of the data provider who owns the source data.
        /// </summary>
        public readonly Outputs.DataProviderResponse DataProvider;
        /// <summary>
        /// Optional. Short description of the listing. The description must not contain Unicode non-characters and C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Human-readable display name of the listing. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&amp;) and can't start or end with spaces. Default value is an empty string. Max length: 63 bytes.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// Optional. Documentation describing the listing.
        /// </summary>
        public readonly string Documentation;
        /// <summary>
        /// Optional. Base64 encoded image representing the listing. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the contents of the field are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
        /// </summary>
        public readonly string Icon;
        /// <summary>
        /// The resource name of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Optional. Email or URL of the primary point of contact of the listing. Max Length: 1000 bytes.
        /// </summary>
        public readonly string PrimaryContact;
        /// <summary>
        /// Optional. Details of the publisher who owns the listing and who can share the source data.
        /// </summary>
        public readonly Outputs.PublisherResponse Publisher;
        /// <summary>
        /// Optional. Email or URL of the request access of the listing. Subscribers can use this reference to request access. Max Length: 1000 bytes.
        /// </summary>
        public readonly string RequestAccess;
        /// <summary>
        /// Current state of the listing.
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetListingResult(
            Outputs.BigQueryDatasetSourceResponse bigqueryDataset,

            ImmutableArray<string> categories,

            Outputs.DataProviderResponse dataProvider,

            string description,

            string displayName,

            string documentation,

            string icon,

            string name,

            string primaryContact,

            Outputs.PublisherResponse publisher,

            string requestAccess,

            string state)
        {
            BigqueryDataset = bigqueryDataset;
            Categories = categories;
            DataProvider = dataProvider;
            Description = description;
            DisplayName = displayName;
            Documentation = documentation;
            Icon = icon;
            Name = name;
            PrimaryContact = primaryContact;
            Publisher = publisher;
            RequestAccess = requestAccess;
            State = state;
        }
    }
}
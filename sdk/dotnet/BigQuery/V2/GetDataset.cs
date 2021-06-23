// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.BigQuery.V2
{
    public static class GetDataset
    {
        /// <summary>
        /// Returns the dataset specified by datasetID.
        /// </summary>
        public static Task<GetDatasetResult> InvokeAsync(GetDatasetArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDatasetResult>("google-native:bigquery/v2:getDataset", args ?? new GetDatasetArgs(), options.WithVersion());
    }


    public sealed class GetDatasetArgs : Pulumi.InvokeArgs
    {
        [Input("datasetId", required: true)]
        public string DatasetId { get; set; } = null!;

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        public GetDatasetArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDatasetResult
    {
        /// <summary>
        /// [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
        /// </summary>
        public readonly ImmutableArray<Outputs.DatasetAccessItemResponse> Access;
        /// <summary>
        /// [Output-only] The time when this dataset was created, in milliseconds since the epoch.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// [Required] A reference that identifies the dataset.
        /// </summary>
        public readonly Outputs.DatasetReferenceResponse DatasetReference;
        public readonly Outputs.EncryptionConfigurationResponse DefaultEncryptionConfiguration;
        /// <summary>
        /// [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
        /// </summary>
        public readonly string DefaultPartitionExpirationMs;
        /// <summary>
        /// [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
        /// </summary>
        public readonly string DefaultTableExpirationMs;
        /// <summary>
        /// [Optional] A user-friendly description of the dataset.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// [Output-only] A hash of the resource.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// [Optional] A descriptive name for the dataset.
        /// </summary>
        public readonly string FriendlyName;
        /// <summary>
        /// [Output-only] The resource type.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// [Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
        /// </summary>
        public readonly string LastModifiedTime;
        /// <summary>
        /// The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// [Output-only] Reserved for future use.
        /// </summary>
        public readonly bool SatisfiesPZS;
        /// <summary>
        /// [Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
        /// </summary>
        public readonly string SelfLink;

        [OutputConstructor]
        private GetDatasetResult(
            ImmutableArray<Outputs.DatasetAccessItemResponse> access,

            string creationTime,

            Outputs.DatasetReferenceResponse datasetReference,

            Outputs.EncryptionConfigurationResponse defaultEncryptionConfiguration,

            string defaultPartitionExpirationMs,

            string defaultTableExpirationMs,

            string description,

            string etag,

            string friendlyName,

            string kind,

            ImmutableDictionary<string, string> labels,

            string lastModifiedTime,

            string location,

            bool satisfiesPZS,

            string selfLink)
        {
            Access = access;
            CreationTime = creationTime;
            DatasetReference = datasetReference;
            DefaultEncryptionConfiguration = defaultEncryptionConfiguration;
            DefaultPartitionExpirationMs = defaultPartitionExpirationMs;
            DefaultTableExpirationMs = defaultTableExpirationMs;
            Description = description;
            Etag = etag;
            FriendlyName = friendlyName;
            Kind = kind;
            Labels = labels;
            LastModifiedTime = lastModifiedTime;
            Location = location;
            SatisfiesPZS = satisfiesPZS;
            SelfLink = selfLink;
        }
    }
}
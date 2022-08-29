// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Firestore.V1
{
    public static class GetDatabase
    {
        /// <summary>
        /// Gets information about a database.
        /// </summary>
        public static Task<GetDatabaseResult> InvokeAsync(GetDatabaseArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseResult>("google-native:firestore/v1:getDatabase", args ?? new GetDatabaseArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a database.
        /// </summary>
        public static Output<GetDatabaseResult> Invoke(GetDatabaseInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDatabaseResult>("google-native:firestore/v1:getDatabase", args ?? new GetDatabaseInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseArgs : global::Pulumi.InvokeArgs
    {
        [Input("databaseId", required: true)]
        public string DatabaseId { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        public GetDatabaseArgs()
        {
        }
        public static new GetDatabaseArgs Empty => new GetDatabaseArgs();
    }

    public sealed class GetDatabaseInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("databaseId", required: true)]
        public Input<string> DatabaseId { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetDatabaseInvokeArgs()
        {
        }
        public static new GetDatabaseInvokeArgs Empty => new GetDatabaseInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabaseResult
    {
        /// <summary>
        /// The App Engine integration mode to use for this database.
        /// </summary>
        public readonly string AppEngineIntegrationMode;
        /// <summary>
        /// The concurrency control mode to use for this database.
        /// </summary>
        public readonly string ConcurrencyMode;
        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The key_prefix for this database. This key_prefix is used, in combination with the project id ("~") to construct the application id that is returned from the Cloud Datastore APIs in Google App Engine first generation runtimes. This value may be empty in which case the appid to use for URL-encoded keys is the project_id (eg: foo instead of v~foo).
        /// </summary>
        public readonly string KeyPrefix;
        /// <summary>
        /// The location of the database. Available databases are listed at https://cloud.google.com/firestore/docs/locations.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The resource name of the Database. Format: `projects/{project}/databases/{database}`
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The type of the database. See https://cloud.google.com/datastore/docs/firestore-or-datastore for information about how to choose.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDatabaseResult(
            string appEngineIntegrationMode,

            string concurrencyMode,

            string etag,

            string keyPrefix,

            string location,

            string name,

            string type)
        {
            AppEngineIntegrationMode = appEngineIntegrationMode;
            ConcurrencyMode = concurrencyMode;
            Etag = etag;
            KeyPrefix = keyPrefix;
            Location = location;
            Name = name;
            Type = type;
        }
    }
}
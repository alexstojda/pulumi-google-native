// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Aiplatform.V1Beta1.Outputs
{

    /// <summary>
    /// Further describes this job's output. Supplements output_config.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudAiplatformV1beta1BatchPredictionJobOutputInfoResponse
    {
        /// <summary>
        /// The path of the BigQuery dataset created, in `bq://projectId.bqDatasetId` format, into which the prediction output is written.
        /// </summary>
        public readonly string BigqueryOutputDataset;
        /// <summary>
        /// The name of the BigQuery table created, in `predictions_` format, into which the prediction output is written. Can be used by UI to generate the BigQuery output path, for example.
        /// </summary>
        public readonly string BigqueryOutputTable;
        /// <summary>
        /// The full path of the Cloud Storage directory created, into which the prediction output is written.
        /// </summary>
        public readonly string GcsOutputDirectory;

        [OutputConstructor]
        private GoogleCloudAiplatformV1beta1BatchPredictionJobOutputInfoResponse(
            string bigqueryOutputDataset,

            string bigqueryOutputTable,

            string gcsOutputDirectory)
        {
            BigqueryOutputDataset = bigqueryOutputDataset;
            BigqueryOutputTable = bigqueryOutputTable;
            GcsOutputDirectory = gcsOutputDirectory;
        }
    }
}

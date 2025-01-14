// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dataplex.V1.Outputs
{

    /// <summary>
    /// The output of a DataQualityScan.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudDataplexV1DataQualityResultResponse
    {
        /// <summary>
        /// A list of results at the column level.A column will have a corresponding DataQualityColumnResult if and only if there is at least one rule with the 'column' field set to it.
        /// </summary>
        public readonly ImmutableArray<Outputs.GoogleCloudDataplexV1DataQualityColumnResultResponse> Columns;
        /// <summary>
        /// A list of results at the dimension level.A dimension will have a corresponding DataQualityDimensionResult if and only if there is at least one rule with the 'dimension' field set to it.
        /// </summary>
        public readonly ImmutableArray<Outputs.GoogleCloudDataplexV1DataQualityDimensionResultResponse> Dimensions;
        /// <summary>
        /// Overall data quality result -- true if all rules passed.
        /// </summary>
        public readonly bool Passed;
        /// <summary>
        /// The result of post scan actions.
        /// </summary>
        public readonly Outputs.GoogleCloudDataplexV1DataQualityResultPostScanActionsResultResponse PostScanActionsResult;
        /// <summary>
        /// The count of rows processed.
        /// </summary>
        public readonly string RowCount;
        /// <summary>
        /// A list of all the rules in a job, and their results.
        /// </summary>
        public readonly ImmutableArray<Outputs.GoogleCloudDataplexV1DataQualityRuleResultResponse> Rules;
        /// <summary>
        /// The data scanned for this result.
        /// </summary>
        public readonly Outputs.GoogleCloudDataplexV1ScannedDataResponse ScannedData;
        /// <summary>
        /// The overall data quality score.The score ranges between 0, 100 (up to two decimal points).
        /// </summary>
        public readonly double Score;

        [OutputConstructor]
        private GoogleCloudDataplexV1DataQualityResultResponse(
            ImmutableArray<Outputs.GoogleCloudDataplexV1DataQualityColumnResultResponse> columns,

            ImmutableArray<Outputs.GoogleCloudDataplexV1DataQualityDimensionResultResponse> dimensions,

            bool passed,

            Outputs.GoogleCloudDataplexV1DataQualityResultPostScanActionsResultResponse postScanActionsResult,

            string rowCount,

            ImmutableArray<Outputs.GoogleCloudDataplexV1DataQualityRuleResultResponse> rules,

            Outputs.GoogleCloudDataplexV1ScannedDataResponse scannedData,

            double score)
        {
            Columns = columns;
            Dimensions = dimensions;
            Passed = passed;
            PostScanActionsResult = postScanActionsResult;
            RowCount = rowCount;
            Rules = rules;
            ScannedData = scannedData;
            Score = score;
        }
    }
}

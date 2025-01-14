// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Testing.V1.Outputs
{

    /// <summary>
    /// Locations where the results of running the test are stored.
    /// </summary>
    [OutputType]
    public sealed class ResultStorageResponse
    {
        /// <summary>
        /// Required.
        /// </summary>
        public readonly Outputs.GoogleCloudStorageResponse GoogleCloudStorage;
        /// <summary>
        /// URL to the results in the Firebase Web Console.
        /// </summary>
        public readonly string ResultsUrl;
        /// <summary>
        /// The tool results execution that results are written to.
        /// </summary>
        public readonly Outputs.ToolResultsExecutionResponse ToolResultsExecution;
        /// <summary>
        /// The tool results history that contains the tool results execution that results are written to. If not provided, the service will choose an appropriate value.
        /// </summary>
        public readonly Outputs.ToolResultsHistoryResponse ToolResultsHistory;

        [OutputConstructor]
        private ResultStorageResponse(
            Outputs.GoogleCloudStorageResponse googleCloudStorage,

            string resultsUrl,

            Outputs.ToolResultsExecutionResponse toolResultsExecution,

            Outputs.ToolResultsHistoryResponse toolResultsHistory)
        {
            GoogleCloudStorage = googleCloudStorage;
            ResultsUrl = resultsUrl;
            ToolResultsExecution = toolResultsExecution;
            ToolResultsHistory = toolResultsHistory;
        }
    }
}

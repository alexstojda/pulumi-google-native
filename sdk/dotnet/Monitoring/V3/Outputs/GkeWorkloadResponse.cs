// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Monitoring.V3.Outputs
{

    /// <summary>
    /// A GKE Workload (Deployment, StatefulSet, etc). The field names correspond to the metadata labels on monitored resources that fall under a workload (for example, k8s_container or k8s_pod).
    /// </summary>
    [OutputType]
    public sealed class GkeWorkloadResponse
    {
        /// <summary>
        /// The name of the parent cluster.
        /// </summary>
        public readonly string ClusterName;
        /// <summary>
        /// The location of the parent cluster. This may be a zone or region.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The name of the parent namespace.
        /// </summary>
        public readonly string NamespaceName;
        /// <summary>
        /// The project this resource lives in. For legacy services migrated from the Custom type, this may be a distinct project from the one parenting the service itself.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// The name of this workload.
        /// </summary>
        public readonly string TopLevelControllerName;
        /// <summary>
        /// The type of this workload (for example, "Deployment" or "DaemonSet")
        /// </summary>
        public readonly string TopLevelControllerType;

        [OutputConstructor]
        private GkeWorkloadResponse(
            string clusterName,

            string location,

            string namespaceName,

            string project,

            string topLevelControllerName,

            string topLevelControllerType)
        {
            ClusterName = clusterName;
            Location = location;
            NamespaceName = namespaceName;
            Project = project;
            TopLevelControllerName = topLevelControllerName;
            TopLevelControllerType = topLevelControllerType;
        }
    }
}

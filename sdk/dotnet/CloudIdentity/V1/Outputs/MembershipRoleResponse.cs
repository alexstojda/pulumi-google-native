// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudIdentity.V1.Outputs
{

    /// <summary>
    /// A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges granted to a `Membership`.
    /// </summary>
    [OutputType]
    public sealed class MembershipRoleResponse
    {
        /// <summary>
        /// The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
        /// </summary>
        public readonly Outputs.ExpiryDetailResponse ExpiryDetail;
        /// <summary>
        /// The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Evaluations of restrictions applied to parent group on this membership.
        /// </summary>
        public readonly Outputs.RestrictionEvaluationsResponse RestrictionEvaluations;

        [OutputConstructor]
        private MembershipRoleResponse(
            Outputs.ExpiryDetailResponse expiryDetail,

            string name,

            Outputs.RestrictionEvaluationsResponse restrictionEvaluations)
        {
            ExpiryDetail = expiryDetail;
            Name = name;
            RestrictionEvaluations = restrictionEvaluations;
        }
    }
}

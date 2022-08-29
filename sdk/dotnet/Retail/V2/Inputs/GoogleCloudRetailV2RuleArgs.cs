// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Retail.V2.Inputs
{

    /// <summary>
    /// A rule is a condition-action pair * A condition defines when a rule is to be triggered. * An action specifies what occurs on that trigger. Currently rules only work for controls with SOLUTION_TYPE_SEARCH.
    /// </summary>
    public sealed class GoogleCloudRetailV2RuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boost action.
        /// </summary>
        [Input("boostAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleBoostActionArgs>? BoostAction { get; set; }

        /// <summary>
        /// The condition that triggers the rule. If the condition is empty, the rule will always apply.
        /// </summary>
        [Input("condition", required: true)]
        public Input<Inputs.GoogleCloudRetailV2ConditionArgs> Condition { get; set; } = null!;

        /// <summary>
        /// Prevents term from being associated with other terms.
        /// </summary>
        [Input("doNotAssociateAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleDoNotAssociateActionArgs>? DoNotAssociateAction { get; set; }

        /// <summary>
        /// Filters results.
        /// </summary>
        [Input("filterAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleFilterActionArgs>? FilterAction { get; set; }

        /// <summary>
        /// Ignores specific terms from query during search.
        /// </summary>
        [Input("ignoreAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleIgnoreActionArgs>? IgnoreAction { get; set; }

        /// <summary>
        /// Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
        /// </summary>
        [Input("onewaySynonymsAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleOnewaySynonymsActionArgs>? OnewaySynonymsAction { get; set; }

        /// <summary>
        /// Redirects a shopper to a specific page.
        /// </summary>
        [Input("redirectAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleRedirectActionArgs>? RedirectAction { get; set; }

        /// <summary>
        /// Replaces specific terms in the query.
        /// </summary>
        [Input("replacementAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleReplacementActionArgs>? ReplacementAction { get; set; }

        /// <summary>
        /// Treats a set of terms as synonyms of one another.
        /// </summary>
        [Input("twowaySynonymsAction")]
        public Input<Inputs.GoogleCloudRetailV2RuleTwowaySynonymsActionArgs>? TwowaySynonymsAction { get; set; }

        public GoogleCloudRetailV2RuleArgs()
        {
        }
        public static new GoogleCloudRetailV2RuleArgs Empty => new GoogleCloudRetailV2RuleArgs();
    }
}
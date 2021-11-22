// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Retail.V2Beta.Outputs
{

    /// <summary>
    /// Promotion information.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudRetailV2betaPromotionResponse
    {
        /// <summary>
        /// ID of the promotion. For example, "free gift". The value value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: a-zA-Z*. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
        /// </summary>
        public readonly string PromotionId;

        [OutputConstructor]
        private GoogleCloudRetailV2betaPromotionResponse(string promotionId)
        {
            PromotionId = promotionId;
        }
    }
}
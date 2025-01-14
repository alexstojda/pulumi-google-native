// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Healthcare.V1.Outputs
{

    /// <summary>
    /// A transformation to apply to text that is identified as a specific info_type.
    /// </summary>
    [OutputType]
    public sealed class InfoTypeTransformationResponse
    {
        /// <summary>
        /// Config for character mask.
        /// </summary>
        public readonly Outputs.CharacterMaskConfigResponse CharacterMaskConfig;
        /// <summary>
        /// Config for crypto hash.
        /// </summary>
        public readonly Outputs.CryptoHashConfigResponse CryptoHashConfig;
        /// <summary>
        /// Config for date shift.
        /// </summary>
        public readonly Outputs.DateShiftConfigResponse DateShiftConfig;
        /// <summary>
        /// InfoTypes to apply this transformation to. If this is not specified, the transformation applies to any info_type.
        /// </summary>
        public readonly ImmutableArray<string> InfoTypes;
        /// <summary>
        /// Config for text redaction.
        /// </summary>
        public readonly Outputs.RedactConfigResponse RedactConfig;
        /// <summary>
        /// Config for replace with InfoType.
        /// </summary>
        public readonly Outputs.ReplaceWithInfoTypeConfigResponse ReplaceWithInfoTypeConfig;

        [OutputConstructor]
        private InfoTypeTransformationResponse(
            Outputs.CharacterMaskConfigResponse characterMaskConfig,

            Outputs.CryptoHashConfigResponse cryptoHashConfig,

            Outputs.DateShiftConfigResponse dateShiftConfig,

            ImmutableArray<string> infoTypes,

            Outputs.RedactConfigResponse redactConfig,

            Outputs.ReplaceWithInfoTypeConfigResponse replaceWithInfoTypeConfig)
        {
            CharacterMaskConfig = characterMaskConfig;
            CryptoHashConfig = cryptoHashConfig;
            DateShiftConfig = dateShiftConfig;
            InfoTypes = infoTypes;
            RedactConfig = redactConfig;
            ReplaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
        }
    }
}

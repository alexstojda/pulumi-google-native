// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Healthcare.V1Beta1.Outputs
{

    /// <summary>
    /// Specifies the FHIR paths to match and how to handle the de-identification of matching fields.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudHealthcareV1beta1DeidentifyFieldMetadataResponse
    {
        /// <summary>
        /// Replace the field's value with a masking character. Supported [types](https://www.hl7.org/fhir/datatypes.html): Code, Decimal, HumanName, Id, LanguageCode, Markdown, Oid, String, Uri, Uuid, Xhtml
        /// </summary>
        public readonly Outputs.CharacterMaskFieldResponse CharacterMaskField;
        /// <summary>
        /// Inspect the field's text and transform sensitive text. Configure using `TextConfig`. Supported [types](https://www.hl7.org/fhir/datatypes.html): Code, Date, DateTime, Decimal, HumanName, Id, LanguageCode, Markdown, Oid, String, Uri, Uuid, Xhtml
        /// </summary>
        public readonly Outputs.CleanTextFieldResponse CleanTextField;
        /// <summary>
        /// Replace field value with a hash of that value. Supported [types](https://www.hl7.org/fhir/datatypes.html): Code, Decimal, HumanName, Id, LanguageCode, Markdown, Oid, String, Uri, Uuid, Xhtml
        /// </summary>
        public readonly Outputs.CryptoHashFieldResponse CryptoHashField;
        /// <summary>
        /// Shift the date by a randomized number of days. See [date shifting](https://cloud.google.com/dlp/docs/concepts-date-shifting) for more information. Supported [types](https://www.hl7.org/fhir/datatypes.html): Date, DateTime
        /// </summary>
        public readonly Outputs.DateShiftFieldResponse DateShiftField;
        /// <summary>
        /// Keep the field unchanged.
        /// </summary>
        public readonly Outputs.KeepFieldResponse KeepField;
        /// <summary>
        /// List of paths to FHIR fields to redact. Each path is a period-separated list where each component is either a field name or FHIR type name. All types begin with an upper case letter. For example, the resource field "Patient.Address.city", which uses a string type, can be matched by "Patient.Address.String". Path also supports partialkk matching. For example, "Patient.Address.city" can be matched by "Address.city" (Patient omitted). Partial matching and type matching can be combined, for example "Patient.Address.city" can be matched by "Address.String". For "choice" types (those defined in the FHIR spec with the form: field[x]), use two separate components. For example, "deceasedAge.unit" is matched by "Deceased.Age.unit". Supported [types](https://www.hl7.org/fhir/datatypes.html) are: AdministrativeGenderCode, Base64Binary, Boolean, Code, Date, DateTime, Decimal, HumanName, Id, Instant, Integer, LanguageCode, Markdown, Oid, PositiveInt, String, UnsignedInt, Uri, Uuid, Xhtml. The sub-type for HumanName (for example HumanName.given, HumanName.family) can be omitted.
        /// </summary>
        public readonly ImmutableArray<string> Paths;
        /// <summary>
        /// Remove the field.
        /// </summary>
        public readonly Outputs.RemoveFieldResponse RemoveField;

        [OutputConstructor]
        private GoogleCloudHealthcareV1beta1DeidentifyFieldMetadataResponse(
            Outputs.CharacterMaskFieldResponse characterMaskField,

            Outputs.CleanTextFieldResponse cleanTextField,

            Outputs.CryptoHashFieldResponse cryptoHashField,

            Outputs.DateShiftFieldResponse dateShiftField,

            Outputs.KeepFieldResponse keepField,

            ImmutableArray<string> paths,

            Outputs.RemoveFieldResponse removeField)
        {
            CharacterMaskField = characterMaskField;
            CleanTextField = cleanTextField;
            CryptoHashField = cryptoHashField;
            DateShiftField = dateShiftField;
            KeepField = keepField;
            Paths = paths;
            RemoveField = removeField;
        }
    }
}
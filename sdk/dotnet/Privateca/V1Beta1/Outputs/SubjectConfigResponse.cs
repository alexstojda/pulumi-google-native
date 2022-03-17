// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Privateca.V1Beta1.Outputs
{

    /// <summary>
    /// These values are used to create the distinguished name and subject alternative name fields in an X.509 certificate.
    /// </summary>
    [OutputType]
    public sealed class SubjectConfigResponse
    {
        /// <summary>
        /// Optional. The "common name" of the distinguished name.
        /// </summary>
        public readonly string CommonName;
        /// <summary>
        /// Contains distinguished name fields such as the location and organization.
        /// </summary>
        public readonly Outputs.SubjectResponse Subject;
        /// <summary>
        /// Optional. The subject alternative name fields.
        /// </summary>
        public readonly Outputs.SubjectAltNamesResponse SubjectAltName;

        [OutputConstructor]
        private SubjectConfigResponse(
            string commonName,

            Outputs.SubjectResponse subject,

            Outputs.SubjectAltNamesResponse subjectAltName)
        {
            CommonName = commonName;
            Subject = subject;
            SubjectAltName = subjectAltName;
        }
    }
}
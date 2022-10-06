// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.ComponentModel;
using Pulumi;

namespace Pulumi.GoogleNative.AssuredWorkloads.V1Beta1
{
    /// <summary>
    /// Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
    /// </summary>
    [EnumType]
    public readonly struct GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType : IEquatable<GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType>
    {
        private readonly string _value;

        private GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Unknown resource type.
        /// </summary>
        public static GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType ResourceTypeUnspecified { get; } = new GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType("RESOURCE_TYPE_UNSPECIFIED");
        /// <summary>
        /// Deprecated. Existing workloads will continue to support this, but new CreateWorkloadRequests should not specify this as an input value.
        /// </summary>
        public static GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType ConsumerProject { get; } = new GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType("CONSUMER_PROJECT");
        /// <summary>
        /// Consumer Folder.
        /// </summary>
        public static GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType ConsumerFolder { get; } = new GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType("CONSUMER_FOLDER");
        /// <summary>
        /// Consumer project containing encryption keys.
        /// </summary>
        public static GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType EncryptionKeysProject { get; } = new GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType("ENCRYPTION_KEYS_PROJECT");
        /// <summary>
        /// Keyring resource that hosts encryption keys.
        /// </summary>
        public static GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType Keyring { get; } = new GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType("KEYRING");

        public static bool operator ==(GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType left, GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType right) => left.Equals(right);
        public static bool operator !=(GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType left, GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType right) => !left.Equals(right);

        public static explicit operator string(GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType other && Equals(other);
        public bool Equals(GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Required. Immutable. Compliance Regime associated with this workload.
    /// </summary>
    [EnumType]
    public readonly struct WorkloadComplianceRegime : IEquatable<WorkloadComplianceRegime>
    {
        private readonly string _value;

        private WorkloadComplianceRegime(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Unknown compliance regime.
        /// </summary>
        public static WorkloadComplianceRegime ComplianceRegimeUnspecified { get; } = new WorkloadComplianceRegime("COMPLIANCE_REGIME_UNSPECIFIED");
        /// <summary>
        /// Information protection as per DoD IL4 requirements.
        /// </summary>
        public static WorkloadComplianceRegime Il4 { get; } = new WorkloadComplianceRegime("IL4");
        /// <summary>
        /// Criminal Justice Information Services (CJIS) Security policies.
        /// </summary>
        public static WorkloadComplianceRegime Cjis { get; } = new WorkloadComplianceRegime("CJIS");
        /// <summary>
        /// FedRAMP High data protection controls
        /// </summary>
        public static WorkloadComplianceRegime FedrampHigh { get; } = new WorkloadComplianceRegime("FEDRAMP_HIGH");
        /// <summary>
        /// FedRAMP Moderate data protection controls
        /// </summary>
        public static WorkloadComplianceRegime FedrampModerate { get; } = new WorkloadComplianceRegime("FEDRAMP_MODERATE");
        /// <summary>
        /// Assured Workloads For US Regions data protection controls
        /// </summary>
        public static WorkloadComplianceRegime UsRegionalAccess { get; } = new WorkloadComplianceRegime("US_REGIONAL_ACCESS");
        /// <summary>
        /// Health Insurance Portability and Accountability Act controls
        /// </summary>
        public static WorkloadComplianceRegime Hipaa { get; } = new WorkloadComplianceRegime("HIPAA");
        /// <summary>
        /// Health Information Trust Alliance controls
        /// </summary>
        public static WorkloadComplianceRegime Hitrust { get; } = new WorkloadComplianceRegime("HITRUST");
        /// <summary>
        /// Assured Workloads For EU Regions and Support controls
        /// </summary>
        public static WorkloadComplianceRegime EuRegionsAndSupport { get; } = new WorkloadComplianceRegime("EU_REGIONS_AND_SUPPORT");
        /// <summary>
        /// Assured Workloads For Canada Regions and Support controls
        /// </summary>
        public static WorkloadComplianceRegime CaRegionsAndSupport { get; } = new WorkloadComplianceRegime("CA_REGIONS_AND_SUPPORT");
        /// <summary>
        /// International Traffic in Arms Regulations
        /// </summary>
        public static WorkloadComplianceRegime Itar { get; } = new WorkloadComplianceRegime("ITAR");

        public static bool operator ==(WorkloadComplianceRegime left, WorkloadComplianceRegime right) => left.Equals(right);
        public static bool operator !=(WorkloadComplianceRegime left, WorkloadComplianceRegime right) => !left.Equals(right);

        public static explicit operator string(WorkloadComplianceRegime value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is WorkloadComplianceRegime other && Equals(other);
        public bool Equals(WorkloadComplianceRegime other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }
}
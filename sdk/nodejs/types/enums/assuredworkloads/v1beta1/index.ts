// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***


export const GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType = {
    /**
     * Unknown resource type.
     */
    ResourceTypeUnspecified: "RESOURCE_TYPE_UNSPECIFIED",
    /**
     * Deprecated. Existing workloads will continue to support this, but new CreateWorkloadRequests should not specify this as an input value.
     */
    ConsumerProject: "CONSUMER_PROJECT",
    /**
     * Consumer Folder.
     */
    ConsumerFolder: "CONSUMER_FOLDER",
    /**
     * Consumer project containing encryption keys.
     */
    EncryptionKeysProject: "ENCRYPTION_KEYS_PROJECT",
    /**
     * Keyring resource that hosts encryption keys.
     */
    Keyring: "KEYRING",
} as const;

/**
 * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
 */
export type GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType = (typeof GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType)[keyof typeof GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettingsResourceType];

export const WorkloadComplianceRegime = {
    /**
     * Unknown compliance regime.
     */
    ComplianceRegimeUnspecified: "COMPLIANCE_REGIME_UNSPECIFIED",
    /**
     * Information protection as per DoD IL4 requirements.
     */
    Il4: "IL4",
    /**
     * Criminal Justice Information Services (CJIS) Security policies.
     */
    Cjis: "CJIS",
    /**
     * FedRAMP High data protection controls
     */
    FedrampHigh: "FEDRAMP_HIGH",
    /**
     * FedRAMP Moderate data protection controls
     */
    FedrampModerate: "FEDRAMP_MODERATE",
    /**
     * Assured Workloads For US Regions data protection controls
     */
    UsRegionalAccess: "US_REGIONAL_ACCESS",
    /**
     * Health Insurance Portability and Accountability Act controls
     */
    Hipaa: "HIPAA",
    /**
     * Health Information Trust Alliance controls
     */
    Hitrust: "HITRUST",
    /**
     * Assured Workloads For EU Regions and Support controls
     */
    EuRegionsAndSupport: "EU_REGIONS_AND_SUPPORT",
    /**
     * Assured Workloads For Canada Regions and Support controls
     */
    CaRegionsAndSupport: "CA_REGIONS_AND_SUPPORT",
    /**
     * International Traffic in Arms Regulations
     */
    Itar: "ITAR",
    /**
     * Assured Workloads for Australia Regions and Support controls
     */
    AuRegionsAndUsSupport: "AU_REGIONS_AND_US_SUPPORT",
    /**
     * Assured Workloads for Partners;
     */
    AssuredWorkloadsForPartners: "ASSURED_WORKLOADS_FOR_PARTNERS",
    /**
     * Assured Workloads for Israel
     */
    IsrRegions: "ISR_REGIONS",
    /**
     * Assured Workloads for Israel Regions
     */
    IsrRegionsAndSupport: "ISR_REGIONS_AND_SUPPORT",
    /**
     * Assured Workloads for Canada Protected B regime
     */
    CaProtectedB: "CA_PROTECTED_B",
    /**
     * Information protection as per DoD IL5 requirements.
     */
    Il5: "IL5",
    /**
     * Information protection as per DoD IL2 requirements.
     */
    Il2: "IL2",
    /**
     * Assured Workloads for Japan Regions
     */
    JpRegionsAndSupport: "JP_REGIONS_AND_SUPPORT",
} as const;

/**
 * Required. Immutable. Compliance Regime associated with this workload.
 */
export type WorkloadComplianceRegime = (typeof WorkloadComplianceRegime)[keyof typeof WorkloadComplianceRegime];

export const WorkloadPartner = {
    PartnerUnspecified: "PARTNER_UNSPECIFIED",
    /**
     * Enum representing S3NS (Thales) partner.
     */
    LocalControlsByS3ns: "LOCAL_CONTROLS_BY_S3NS",
    /**
     * Enum representing T_SYSTEM (TSI) partner.
     */
    SovereignControlsByTSystems: "SOVEREIGN_CONTROLS_BY_T_SYSTEMS",
    /**
     * Enum representing SIA_MINSAIT (Indra) partner.
     */
    SovereignControlsBySiaMinsait: "SOVEREIGN_CONTROLS_BY_SIA_MINSAIT",
    /**
     * Enum representing PSN (TIM) partner.
     */
    SovereignControlsByPsn: "SOVEREIGN_CONTROLS_BY_PSN",
} as const;

/**
 * Optional. Partner regime associated with this workload.
 */
export type WorkloadPartner = (typeof WorkloadPartner)[keyof typeof WorkloadPartner];

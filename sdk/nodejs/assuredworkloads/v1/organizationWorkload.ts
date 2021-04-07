// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../../types";
import * as utilities from "../../utilities";

/**
 * Creates Assured Workload.
 */
export class OrganizationWorkload extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationWorkload resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): OrganizationWorkload {
        return new OrganizationWorkload(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp-native:assuredworkloads/v1:OrganizationWorkload';

    /**
     * Returns true if the given object is an instance of OrganizationWorkload.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationWorkload {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationWorkload.__pulumiType;
    }

    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     */
    public readonly billingAccount!: pulumi.Output<string>;
    /**
     * Required. Immutable. Compliance Regime associated with this workload.
     */
    public readonly complianceRegime!: pulumi.Output<string>;
    /**
     * Immutable. The Workload creation timestamp.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
     */
    public readonly etag!: pulumi.Output<string>;
    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     */
    public readonly kmsSettings!: pulumi.Output<outputs.assuredworkloads.v1.GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse>;
    /**
     * Optional. Labels applied to the workload.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id} organizations/{organization_id}
     */
    public readonly provisionedResourcesParent!: pulumi.Output<string>;
    /**
     * The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation will fail. Always read only.
     */
    public /*out*/ readonly resources!: pulumi.Output<outputs.assuredworkloads.v1.GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse[]>;

    /**
     * Create a OrganizationWorkload resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationWorkloadArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.locationsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'locationsId'");
            }
            if ((!args || args.organizationsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationsId'");
            }
            if ((!args || args.workloadsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workloadsId'");
            }
            inputs["billingAccount"] = args ? args.billingAccount : undefined;
            inputs["complianceRegime"] = args ? args.complianceRegime : undefined;
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["etag"] = args ? args.etag : undefined;
            inputs["kmsSettings"] = args ? args.kmsSettings : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["locationsId"] = args ? args.locationsId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["organizationsId"] = args ? args.organizationsId : undefined;
            inputs["provisionedResourcesParent"] = args ? args.provisionedResourcesParent : undefined;
            inputs["workloadsId"] = args ? args.workloadsId : undefined;
            inputs["createTime"] = undefined /*out*/;
            inputs["resources"] = undefined /*out*/;
        } else {
            inputs["billingAccount"] = undefined /*out*/;
            inputs["complianceRegime"] = undefined /*out*/;
            inputs["createTime"] = undefined /*out*/;
            inputs["displayName"] = undefined /*out*/;
            inputs["etag"] = undefined /*out*/;
            inputs["kmsSettings"] = undefined /*out*/;
            inputs["labels"] = undefined /*out*/;
            inputs["name"] = undefined /*out*/;
            inputs["provisionedResourcesParent"] = undefined /*out*/;
            inputs["resources"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(OrganizationWorkload.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a OrganizationWorkload resource.
 */
export interface OrganizationWorkloadArgs {
    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     */
    readonly billingAccount?: pulumi.Input<string>;
    /**
     * Required. Immutable. Compliance Regime associated with this workload.
     */
    readonly complianceRegime?: pulumi.Input<string>;
    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     */
    readonly kmsSettings?: pulumi.Input<inputs.assuredworkloads.v1.GoogleCloudAssuredworkloadsV1WorkloadKMSSettings>;
    /**
     * Optional. Labels applied to the workload.
     */
    readonly labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    readonly locationsId: pulumi.Input<string>;
    /**
     * Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     */
    readonly name?: pulumi.Input<string>;
    readonly organizationsId: pulumi.Input<string>;
    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id} organizations/{organization_id}
     */
    readonly provisionedResourcesParent?: pulumi.Input<string>;
    readonly workloadsId: pulumi.Input<string>;
}
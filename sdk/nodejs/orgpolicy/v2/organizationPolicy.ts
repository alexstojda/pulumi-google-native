// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../../types";
import * as utilities from "../../utilities";

/**
 * Creates a Policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the policy already exists on the given Cloud resource.
 */
export class OrganizationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): OrganizationPolicy {
        return new OrganizationPolicy(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp-native:orgpolicy/v2:OrganizationPolicy';

    /**
     * Returns true if the given object is an instance of OrganizationPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationPolicy.__pulumiType;
    }

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Basic information about the Organization Policy.
     */
    public readonly spec!: pulumi.Output<outputs.orgpolicy.v2.GoogleCloudOrgpolicyV2PolicySpecResponse>;

    /**
     * Create a OrganizationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationPolicyArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.organizationsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationsId'");
            }
            if ((!args || args.policiesId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policiesId'");
            }
            inputs["name"] = args ? args.name : undefined;
            inputs["organizationsId"] = args ? args.organizationsId : undefined;
            inputs["policiesId"] = args ? args.policiesId : undefined;
            inputs["spec"] = args ? args.spec : undefined;
        } else {
            inputs["name"] = undefined /*out*/;
            inputs["spec"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(OrganizationPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a OrganizationPolicy resource.
 */
export interface OrganizationPolicyArgs {
    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     */
    readonly name?: pulumi.Input<string>;
    readonly organizationsId: pulumi.Input<string>;
    readonly policiesId: pulumi.Input<string>;
    /**
     * Basic information about the Organization Policy.
     */
    readonly spec?: pulumi.Input<inputs.orgpolicy.v2.GoogleCloudOrgpolicyV2PolicySpec>;
}
// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * Creates an instance config and begins preparing it to be used. The returned long-running operation can be used to track the progress of preparing the new instance config. The instance config name is assigned by the caller. If the named instance config already exists, `CreateInstanceConfig` returns `ALREADY_EXISTS`. Immediately after the request returns: * The instance config is readable via the API, with all requested attributes. The instance config's reconciling field is set to true. Its state is `CREATING`. While the operation is pending: * Cancelling the operation renders the instance config immediately unreadable via the API. * Except for deleting the creating resource, all other attempts to modify the instance config are rejected. Upon completion of the returned operation: * Instances can be created using the instance configuration. * The instance config's reconciling field becomes false. Its state becomes `READY`. The returned long-running operation will have a name of the format `/operations/` and can be used to track creation of the instance config. The metadata field type is CreateInstanceConfigMetadata. The response field type is InstanceConfig, if successful. Authorization requires `spanner.instanceConfigs.create` permission on the resource parent.
 */
export class InstanceConfig extends pulumi.CustomResource {
    /**
     * Get an existing InstanceConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): InstanceConfig {
        return new InstanceConfig(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'google-native:spanner/v1:InstanceConfig';

    /**
     * Returns true if the given object is an instance of InstanceConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceConfig.__pulumiType;
    }

    /**
     * Base configuration name, e.g. projects//instanceConfigs/nam3, based on which this configuration is created. Only set for user managed configurations. `base_config` must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
     */
    public readonly baseConfig!: pulumi.Output<string>;
    /**
     * Whether this instance config is a Google or User Managed Configuration.
     */
    public /*out*/ readonly configType!: pulumi.Output<string>;
    /**
     * The name of this instance configuration as it appears in UIs.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a instance config from overwriting each other. It is strongly suggested that systems make use of the etag in the read-modify-write cycle to perform instance config updates in order to avoid race conditions: An etag is returned in the response which contains instance configs, and systems are expected to put that etag in the request to update instance config to ensure that their change will be applied to the same version of the instance config. If no etag is provided in the call to update instance config, then the existing instance config is overwritten blindly.
     */
    public readonly etag!: pulumi.Output<string>;
    /**
     * Describes whether free instances are available to be created in this instance config.
     */
    public /*out*/ readonly freeInstanceAvailability!: pulumi.Output<string>;
    /**
     * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. Therefore, you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Allowed values of the "default_leader" schema option for databases in instances that use this instance configuration.
     */
    public readonly leaderOptions!: pulumi.Output<string[]>;
    /**
     * A unique identifier for the instance configuration. Values are of the form `projects//instanceConfigs/a-z*`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The available optional replicas to choose from for user managed configurations. Populated for Google managed configurations.
     */
    public /*out*/ readonly optionalReplicas!: pulumi.Output<outputs.spanner.v1.ReplicaInfoResponse[]>;
    public readonly project!: pulumi.Output<string>;
    /**
     * If true, the instance config is being created or updated. If false, there are no ongoing operations for the instance config.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * The geographic placement of nodes in this instance configuration and their replication properties.
     */
    public readonly replicas!: pulumi.Output<outputs.spanner.v1.ReplicaInfoResponse[]>;
    /**
     * The current instance config state.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a InstanceConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceConfigArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.instanceConfigId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceConfigId'");
            }
            resourceInputs["baseConfig"] = args ? args.baseConfig : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["instanceConfigId"] = args ? args.instanceConfigId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["leaderOptions"] = args ? args.leaderOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["replicas"] = args ? args.replicas : undefined;
            resourceInputs["validateOnly"] = args ? args.validateOnly : undefined;
            resourceInputs["configType"] = undefined /*out*/;
            resourceInputs["freeInstanceAvailability"] = undefined /*out*/;
            resourceInputs["optionalReplicas"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        } else {
            resourceInputs["baseConfig"] = undefined /*out*/;
            resourceInputs["configType"] = undefined /*out*/;
            resourceInputs["displayName"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["freeInstanceAvailability"] = undefined /*out*/;
            resourceInputs["labels"] = undefined /*out*/;
            resourceInputs["leaderOptions"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["optionalReplicas"] = undefined /*out*/;
            resourceInputs["project"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["replicas"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const replaceOnChanges = { replaceOnChanges: ["project"] };
        opts = pulumi.mergeOptions(opts, replaceOnChanges);
        super(InstanceConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a InstanceConfig resource.
 */
export interface InstanceConfigArgs {
    /**
     * Base configuration name, e.g. projects//instanceConfigs/nam3, based on which this configuration is created. Only set for user managed configurations. `base_config` must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
     */
    baseConfig?: pulumi.Input<string>;
    /**
     * The name of this instance configuration as it appears in UIs.
     */
    displayName?: pulumi.Input<string>;
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a instance config from overwriting each other. It is strongly suggested that systems make use of the etag in the read-modify-write cycle to perform instance config updates in order to avoid race conditions: An etag is returned in the response which contains instance configs, and systems are expected to put that etag in the request to update instance config to ensure that their change will be applied to the same version of the instance config. If no etag is provided in the call to update instance config, then the existing instance config is overwritten blindly.
     */
    etag?: pulumi.Input<string>;
    /**
     * The ID of the instance config to create. Valid identifiers are of the form `custom-[-a-z0-9]*[a-z0-9]` and must be between 2 and 64 characters in length. The `custom-` prefix is required to avoid name conflicts with Google managed configurations.
     */
    instanceConfigId: pulumi.Input<string>;
    /**
     * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. Therefore, you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Allowed values of the "default_leader" schema option for databases in instances that use this instance configuration.
     */
    leaderOptions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A unique identifier for the instance configuration. Values are of the form `projects//instanceConfigs/a-z*`.
     */
    name?: pulumi.Input<string>;
    project?: pulumi.Input<string>;
    /**
     * The geographic placement of nodes in this instance configuration and their replication properties.
     */
    replicas?: pulumi.Input<pulumi.Input<inputs.spanner.v1.ReplicaInfoArgs>[]>;
    /**
     * An option to validate, but not actually execute, a request, and provide the same response.
     */
    validateOnly?: pulumi.Input<boolean>;
}
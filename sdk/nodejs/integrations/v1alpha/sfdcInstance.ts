// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

/**
 * Creates an sfdc instance record. Store the sfdc instance in Spanner. Returns the sfdc instance.
 * Auto-naming is currently not supported for this resource.
 */
export class SfdcInstance extends pulumi.CustomResource {
    /**
     * Get an existing SfdcInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): SfdcInstance {
        return new SfdcInstance(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'google-native:integrations/v1alpha:SfdcInstance';

    /**
     * Returns true if the given object is an instance of SfdcInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SfdcInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SfdcInstance.__pulumiType;
    }

    /**
     * A list of AuthConfigs that can be tried to open the channel to SFDC
     */
    public readonly authConfigId!: pulumi.Output<string[]>;
    /**
     * Time when the instance is created
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Time when the instance was deleted. Empty if not deleted.
     */
    public /*out*/ readonly deleteTime!: pulumi.Output<string>;
    /**
     * A description of the sfdc instance.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * User selected unique name/alias to easily reference an instance.
     */
    public readonly displayName!: pulumi.Output<string>;
    public readonly location!: pulumi.Output<string>;
    /**
     * Resource name of the SFDC instance projects/{project}/locations/{location}/sfdcInstances/{sfdcInstance}.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly productId!: pulumi.Output<string>;
    public readonly project!: pulumi.Output<string>;
    /**
     * URL used for API calls after authentication (the login authority is configured within the referenced AuthConfig).
     */
    public readonly serviceAuthority!: pulumi.Output<string>;
    /**
     * The SFDC Org Id. This is defined in salesforce.
     */
    public readonly sfdcOrgId!: pulumi.Output<string>;
    /**
     * Time when the instance was last updated
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a SfdcInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SfdcInstanceArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.productId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productId'");
            }
            resourceInputs["authConfigId"] = args ? args.authConfigId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["productId"] = args ? args.productId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceAuthority"] = args ? args.serviceAuthority : undefined;
            resourceInputs["sfdcOrgId"] = args ? args.sfdcOrgId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        } else {
            resourceInputs["authConfigId"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["displayName"] = undefined /*out*/;
            resourceInputs["location"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["productId"] = undefined /*out*/;
            resourceInputs["project"] = undefined /*out*/;
            resourceInputs["serviceAuthority"] = undefined /*out*/;
            resourceInputs["sfdcOrgId"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const replaceOnChanges = { replaceOnChanges: ["location", "productId", "project"] };
        opts = pulumi.mergeOptions(opts, replaceOnChanges);
        super(SfdcInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a SfdcInstance resource.
 */
export interface SfdcInstanceArgs {
    /**
     * A list of AuthConfigs that can be tried to open the channel to SFDC
     */
    authConfigId?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A description of the sfdc instance.
     */
    description?: pulumi.Input<string>;
    /**
     * User selected unique name/alias to easily reference an instance.
     */
    displayName?: pulumi.Input<string>;
    location?: pulumi.Input<string>;
    /**
     * Resource name of the SFDC instance projects/{project}/locations/{location}/sfdcInstances/{sfdcInstance}.
     */
    name?: pulumi.Input<string>;
    productId: pulumi.Input<string>;
    project?: pulumi.Input<string>;
    /**
     * URL used for API calls after authentication (the login authority is configured within the referenced AuthConfig).
     */
    serviceAuthority?: pulumi.Input<string>;
    /**
     * The SFDC Org Id. This is defined in salesforce.
     */
    sfdcOrgId?: pulumi.Input<string>;
}

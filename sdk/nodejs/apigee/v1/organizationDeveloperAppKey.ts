// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../../types";
import * as utilities from "../../utilities";

/**
 * Creates a custom consumer key and secret for a developer app. This is particularly useful if you want to migrate existing consumer keys and secrets to Apigee hybrid from another system. Consumer keys and secrets can contain letters, numbers, underscores, and hyphens. No other special characters are allowed. To avoid service disruptions, a consumer key and secret should not exceed 2 KBs each. **Note**: When creating the consumer key and secret, an association to API products will not be made. Therefore, you should not specify the associated API products in your request. Instead, use the UpdateDeveloperAppKey API to make the association after the consumer key and secret are created. If a consumer key and secret already exist, you can keep them or delete them using the DeleteDeveloperAppKey API.
 */
export class OrganizationDeveloperAppKey extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationDeveloperAppKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): OrganizationDeveloperAppKey {
        return new OrganizationDeveloperAppKey(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp-native:apigee/v1:OrganizationDeveloperAppKey';

    /**
     * Returns true if the given object is an instance of OrganizationDeveloperAppKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationDeveloperAppKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationDeveloperAppKey.__pulumiType;
    }

    /**
     * List of API products for which the credential can be used. **Note**: Do not specify the list of API products when creating a consumer key and secret for a developer app. Instead, use the UpdateDeveloperAppKey API to make the association after the consumer key and secret are created.
     */
    public readonly apiProducts!: pulumi.Output<any[]>;
    /**
     * List of attributes associated with the credential.
     */
    public readonly attributes!: pulumi.Output<outputs.apigee.v1.GoogleCloudApigeeV1AttributeResponse[]>;
    /**
     * Consumer key.
     */
    public readonly consumerKey!: pulumi.Output<string>;
    /**
     * Secret key.
     */
    public readonly consumerSecret!: pulumi.Output<string>;
    /**
     * Time the developer app expires in milliseconds since epoch.
     */
    public readonly expiresAt!: pulumi.Output<string>;
    /**
     * Input only. Expiration time, in seconds, for the consumer key. If not set or left to the default value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
     */
    public readonly expiresInSeconds!: pulumi.Output<string>;
    /**
     * Time the developer app was created in milliseconds since epoch.
     */
    public readonly issuedAt!: pulumi.Output<string>;
    /**
     * Scopes to apply to the app. The specified scope names must already be defined for the API product that you associate with the app.
     */
    public readonly scopes!: pulumi.Output<string[]>;
    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a OrganizationDeveloperAppKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationDeveloperAppKeyArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.appsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appsId'");
            }
            if ((!args || args.developersId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'developersId'");
            }
            if ((!args || args.keysId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keysId'");
            }
            if ((!args || args.organizationsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationsId'");
            }
            inputs["apiProducts"] = args ? args.apiProducts : undefined;
            inputs["appsId"] = args ? args.appsId : undefined;
            inputs["attributes"] = args ? args.attributes : undefined;
            inputs["consumerKey"] = args ? args.consumerKey : undefined;
            inputs["consumerSecret"] = args ? args.consumerSecret : undefined;
            inputs["developersId"] = args ? args.developersId : undefined;
            inputs["expiresAt"] = args ? args.expiresAt : undefined;
            inputs["expiresInSeconds"] = args ? args.expiresInSeconds : undefined;
            inputs["issuedAt"] = args ? args.issuedAt : undefined;
            inputs["keysId"] = args ? args.keysId : undefined;
            inputs["organizationsId"] = args ? args.organizationsId : undefined;
            inputs["scopes"] = args ? args.scopes : undefined;
            inputs["status"] = args ? args.status : undefined;
        } else {
            inputs["apiProducts"] = undefined /*out*/;
            inputs["attributes"] = undefined /*out*/;
            inputs["consumerKey"] = undefined /*out*/;
            inputs["consumerSecret"] = undefined /*out*/;
            inputs["expiresAt"] = undefined /*out*/;
            inputs["expiresInSeconds"] = undefined /*out*/;
            inputs["issuedAt"] = undefined /*out*/;
            inputs["scopes"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(OrganizationDeveloperAppKey.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a OrganizationDeveloperAppKey resource.
 */
export interface OrganizationDeveloperAppKeyArgs {
    /**
     * List of API products for which the credential can be used. **Note**: Do not specify the list of API products when creating a consumer key and secret for a developer app. Instead, use the UpdateDeveloperAppKey API to make the association after the consumer key and secret are created.
     */
    readonly apiProducts?: pulumi.Input<any[]>;
    readonly appsId: pulumi.Input<string>;
    /**
     * List of attributes associated with the credential.
     */
    readonly attributes?: pulumi.Input<pulumi.Input<inputs.apigee.v1.GoogleCloudApigeeV1Attribute>[]>;
    /**
     * Consumer key.
     */
    readonly consumerKey?: pulumi.Input<string>;
    /**
     * Secret key.
     */
    readonly consumerSecret?: pulumi.Input<string>;
    readonly developersId: pulumi.Input<string>;
    /**
     * Time the developer app expires in milliseconds since epoch.
     */
    readonly expiresAt?: pulumi.Input<string>;
    /**
     * Input only. Expiration time, in seconds, for the consumer key. If not set or left to the default value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
     */
    readonly expiresInSeconds?: pulumi.Input<string>;
    /**
     * Time the developer app was created in milliseconds since epoch.
     */
    readonly issuedAt?: pulumi.Input<string>;
    readonly keysId: pulumi.Input<string>;
    readonly organizationsId: pulumi.Input<string>;
    /**
     * Scopes to apply to the app. The specified scope names must already be defined for the API product that you associate with the app.
     */
    readonly scopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     */
    readonly status?: pulumi.Input<string>;
}
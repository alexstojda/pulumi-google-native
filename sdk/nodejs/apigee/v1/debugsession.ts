// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

/**
 * Creates a debug session for a deployed API Proxy revision.
 */
export class Debugsession extends pulumi.CustomResource {
    /**
     * Get an existing Debugsession resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): Debugsession {
        return new Debugsession(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'google-native:apigee/v1:Debugsession';

    /**
     * Returns true if the given object is an instance of Debugsession.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Debugsession {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Debugsession.__pulumiType;
    }

    /**
     * Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     */
    public readonly count!: pulumi.Output<number>;
    /**
     * Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     */
    public readonly filter!: pulumi.Output<string>;
    /**
     * A unique ID for this DebugSession.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     */
    public readonly timeout!: pulumi.Output<string>;
    /**
     * Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     */
    public readonly tracesize!: pulumi.Output<number>;
    /**
     * Optional. The length of time, in seconds, that this debug session is valid, starting from when it's received in the control plane. Min = 1, Max = 15, Default = 10.
     */
    public readonly validity!: pulumi.Output<number>;

    /**
     * Create a Debugsession resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DebugsessionArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.environmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentId'");
            }
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.revisionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'revisionId'");
            }
            inputs["apiId"] = args ? args.apiId : undefined;
            inputs["count"] = args ? args.count : undefined;
            inputs["environmentId"] = args ? args.environmentId : undefined;
            inputs["filter"] = args ? args.filter : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["organizationId"] = args ? args.organizationId : undefined;
            inputs["revisionId"] = args ? args.revisionId : undefined;
            inputs["timeout"] = args ? args.timeout : undefined;
            inputs["tracesize"] = args ? args.tracesize : undefined;
            inputs["validity"] = args ? args.validity : undefined;
        } else {
            inputs["count"] = undefined /*out*/;
            inputs["filter"] = undefined /*out*/;
            inputs["name"] = undefined /*out*/;
            inputs["timeout"] = undefined /*out*/;
            inputs["tracesize"] = undefined /*out*/;
            inputs["validity"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Debugsession.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Debugsession resource.
 */
export interface DebugsessionArgs {
    readonly apiId: pulumi.Input<string>;
    /**
     * Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     */
    readonly count?: pulumi.Input<number>;
    readonly environmentId: pulumi.Input<string>;
    /**
     * Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     */
    readonly filter?: pulumi.Input<string>;
    /**
     * A unique ID for this DebugSession.
     */
    readonly name?: pulumi.Input<string>;
    readonly organizationId: pulumi.Input<string>;
    readonly revisionId: pulumi.Input<string>;
    /**
     * Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     */
    readonly timeout?: pulumi.Input<string>;
    /**
     * Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     */
    readonly tracesize?: pulumi.Input<number>;
    /**
     * Optional. The length of time, in seconds, that this debug session is valid, starting from when it's received in the control plane. Min = 1, Max = 15, Default = 10.
     */
    readonly validity?: pulumi.Input<number>;
}
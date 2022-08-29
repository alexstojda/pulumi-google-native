// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../../types";
import * as utilities from "../../utilities";

/**
 * Creates a new ClientConnectorService in a given project and location.
 */
export class ClientConnectorService extends pulumi.CustomResource {
    /**
     * Get an existing ClientConnectorService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): ClientConnectorService {
        return new ClientConnectorService(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'google-native:beyondcorp/v1:ClientConnectorService';

    /**
     * Returns true if the given object is an instance of ClientConnectorService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClientConnectorService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClientConnectorService.__pulumiType;
    }

    /**
     * Optional. User-settable client connector service resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter. A random system generated name will be assigned if not specified by the user.
     */
    public readonly clientConnectorServiceId!: pulumi.Output<string | undefined>;
    /**
     * [Output only] Create time stamp.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Optional. User-provided name. The display name should follow certain format. * Must be 6 to 30 characters in length. * Can only contain lowercase letters, numbers, and hyphens. * Must start with a letter.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The details of the egress settings.
     */
    public readonly egress!: pulumi.Output<outputs.beyondcorp.v1.EgressResponse>;
    /**
     * The details of the ingress settings.
     */
    public readonly ingress!: pulumi.Output<outputs.beyondcorp.v1.IngressResponse>;
    public readonly location!: pulumi.Output<string>;
    /**
     * Name of resource. The name is ignored during creation.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly project!: pulumi.Output<string>;
    /**
     * Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     */
    public readonly requestId!: pulumi.Output<string | undefined>;
    /**
     * The operational state of the ClientConnectorService.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * [Output only] Update time stamp.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * Optional. If set, validates request by executing a dry-run which would not alter the resource in any way.
     */
    public readonly validateOnly!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ClientConnectorService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClientConnectorServiceArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.egress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'egress'");
            }
            if ((!args || args.ingress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ingress'");
            }
            resourceInputs["clientConnectorServiceId"] = args ? args.clientConnectorServiceId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["egress"] = args ? args.egress : undefined;
            resourceInputs["ingress"] = args ? args.ingress : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["requestId"] = args ? args.requestId : undefined;
            resourceInputs["validateOnly"] = args ? args.validateOnly : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        } else {
            resourceInputs["clientConnectorServiceId"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["displayName"] = undefined /*out*/;
            resourceInputs["egress"] = undefined /*out*/;
            resourceInputs["ingress"] = undefined /*out*/;
            resourceInputs["location"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["project"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
            resourceInputs["validateOnly"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const replaceOnChanges = { replaceOnChanges: ["location", "project"] };
        opts = pulumi.mergeOptions(opts, replaceOnChanges);
        super(ClientConnectorService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a ClientConnectorService resource.
 */
export interface ClientConnectorServiceArgs {
    /**
     * Optional. User-settable client connector service resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter. A random system generated name will be assigned if not specified by the user.
     */
    clientConnectorServiceId?: pulumi.Input<string>;
    /**
     * Optional. User-provided name. The display name should follow certain format. * Must be 6 to 30 characters in length. * Can only contain lowercase letters, numbers, and hyphens. * Must start with a letter.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The details of the egress settings.
     */
    egress: pulumi.Input<inputs.beyondcorp.v1.EgressArgs>;
    /**
     * The details of the ingress settings.
     */
    ingress: pulumi.Input<inputs.beyondcorp.v1.IngressArgs>;
    location?: pulumi.Input<string>;
    /**
     * Name of resource. The name is ignored during creation.
     */
    name?: pulumi.Input<string>;
    project?: pulumi.Input<string>;
    /**
     * Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     */
    requestId?: pulumi.Input<string>;
    /**
     * Optional. If set, validates request by executing a dry-run which would not alter the resource in any way.
     */
    validateOnly?: pulumi.Input<boolean>;
}
// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../../types";
import * as utilities from "../../utilities";

/**
 * Gets details of a single TcpRoute.
 */
export function getTcpRoute(args: GetTcpRouteArgs, opts?: pulumi.InvokeOptions): Promise<GetTcpRouteResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("google-native:networkservices/v1beta1:getTcpRoute", {
        "location": args.location,
        "project": args.project,
        "tcpRouteId": args.tcpRouteId,
    }, opts);
}

export interface GetTcpRouteArgs {
    location: string;
    project?: string;
    tcpRouteId: string;
}

export interface GetTcpRouteResult {
    /**
     * The timestamp when the resource was created.
     */
    readonly createTime: string;
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     */
    readonly description: string;
    /**
     * Optional. Set of label tags associated with the TcpRoute resource.
     */
    readonly labels: {[key: string]: string};
    /**
     * Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*&#47;locations/global/meshes/` The attached Mesh should be of a type SIDECAR
     */
    readonly meshes: string[];
    /**
     * Name of the TcpRoute resource. It matches pattern `projects/*&#47;locations/global/tcpRoutes/tcp_route_name>`.
     */
    readonly name: string;
    /**
     * Rules that define how traffic is routed and handled. At least one RouteRule must be supplied. If there are multiple rules then the action taken will be the first rule to match.
     */
    readonly rules: outputs.networkservices.v1beta1.TcpRouteRouteRuleResponse[];
    /**
     * Server-defined URL of this resource
     */
    readonly selfLink: string;
    /**
     * The timestamp when the resource was updated.
     */
    readonly updateTime: string;
}

export function getTcpRouteOutput(args: GetTcpRouteOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTcpRouteResult> {
    return pulumi.output(args).apply(a => getTcpRoute(a, opts))
}

export interface GetTcpRouteOutputArgs {
    location: pulumi.Input<string>;
    project?: pulumi.Input<string>;
    tcpRouteId: pulumi.Input<string>;
}
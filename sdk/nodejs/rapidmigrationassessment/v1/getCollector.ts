// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * Gets details of a single Collector.
 */
export function getCollector(args: GetCollectorArgs, opts?: pulumi.InvokeOptions): Promise<GetCollectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("google-native:rapidmigrationassessment/v1:getCollector", {
        "collectorId": args.collectorId,
        "location": args.location,
        "project": args.project,
    }, opts);
}

export interface GetCollectorArgs {
    collectorId: string;
    location: string;
    project?: string;
}

export interface GetCollectorResult {
    /**
     * Store cloud storage bucket name (which is a guid) created with this Collector.
     */
    readonly bucket: string;
    /**
     * Client version.
     */
    readonly clientVersion: string;
    /**
     * How many days to collect data.
     */
    readonly collectionDays: number;
    /**
     * Create time stamp.
     */
    readonly createTime: string;
    /**
     * User specified description of the Collector.
     */
    readonly description: string;
    /**
     * User specified name of the Collector.
     */
    readonly displayName: string;
    /**
     * Uri for EULA (End User License Agreement) from customer.
     */
    readonly eulaUri: string;
    /**
     * User specified expected asset count.
     */
    readonly expectedAssetCount: string;
    /**
     * Reference to MC Source Guest Os Scan.
     */
    readonly guestOsScan: outputs.rapidmigrationassessment.v1.GuestOsScanResponse;
    /**
     * Labels as key value pairs.
     */
    readonly labels: {[key: string]: string};
    /**
     * name of resource.
     */
    readonly name: string;
    /**
     * Service Account email used to ingest data to this Collector.
     */
    readonly serviceAccount: string;
    /**
     * State of the Collector.
     */
    readonly state: string;
    /**
     * Update time stamp.
     */
    readonly updateTime: string;
    /**
     * Reference to MC Source vsphere_scan.
     */
    readonly vsphereScan: outputs.rapidmigrationassessment.v1.VSphereScanResponse;
}
/**
 * Gets details of a single Collector.
 */
export function getCollectorOutput(args: GetCollectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCollectorResult> {
    return pulumi.output(args).apply((a: any) => getCollector(a, opts))
}

export interface GetCollectorOutputArgs {
    collectorId: pulumi.Input<string>;
    location: pulumi.Input<string>;
    project?: pulumi.Input<string>;
}

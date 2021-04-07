// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../../types";
import * as utilities from "../../utilities";

/**
 * Creates a new version for the specified site.
 */
export class SiteVersion extends pulumi.CustomResource {
    /**
     * Get an existing SiteVersion resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): SiteVersion {
        return new SiteVersion(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp-native:firebasehosting/v1beta1:SiteVersion';

    /**
     * Returns true if the given object is an instance of SiteVersion.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SiteVersion {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SiteVersion.__pulumiType;
    }


    /**
     * Create a SiteVersion resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SiteVersionArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.sitesId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sitesId'");
            }
            if ((!args || args.versionsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'versionsId'");
            }
            inputs["config"] = args ? args.config : undefined;
            inputs["createTime"] = args ? args.createTime : undefined;
            inputs["createUser"] = args ? args.createUser : undefined;
            inputs["deleteTime"] = args ? args.deleteTime : undefined;
            inputs["deleteUser"] = args ? args.deleteUser : undefined;
            inputs["fileCount"] = args ? args.fileCount : undefined;
            inputs["finalizeTime"] = args ? args.finalizeTime : undefined;
            inputs["finalizeUser"] = args ? args.finalizeUser : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["preview"] = args ? args.preview : undefined;
            inputs["sitesId"] = args ? args.sitesId : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["versionBytes"] = args ? args.versionBytes : undefined;
            inputs["versionsId"] = args ? args.versionsId : undefined;
        } else {
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SiteVersion.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a SiteVersion resource.
 */
export interface SiteVersionArgs {
    /**
     * The configuration for the behavior of the site. This configuration exists in the [`firebase.json`](https://firebase.google.com/docs/cli/#the_firebasejson_file) file.
     */
    readonly config?: pulumi.Input<inputs.firebasehosting.v1beta1.ServingConfig>;
    /**
     * The time at which the version was created.
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * Identifies the user who created the version.
     */
    readonly createUser?: pulumi.Input<inputs.firebasehosting.v1beta1.ActingUser>;
    /**
     * The time at which the version was `DELETED`.
     */
    readonly deleteTime?: pulumi.Input<string>;
    /**
     * Identifies the user who `DELETED` the version.
     */
    readonly deleteUser?: pulumi.Input<inputs.firebasehosting.v1beta1.ActingUser>;
    /**
     * The total number of files associated with the version. This value is calculated after a version is `FINALIZED`.
     */
    readonly fileCount?: pulumi.Input<string>;
    /**
     * The time at which the version was `FINALIZED`.
     */
    readonly finalizeTime?: pulumi.Input<string>;
    /**
     * Identifies the user who `FINALIZED` the version.
     */
    readonly finalizeUser?: pulumi.Input<inputs.firebasehosting.v1beta1.ActingUser>;
    /**
     * The labels used for extra metadata and/or filtering.
     */
    readonly labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The fully-qualified resource name for the version, in the format: sites/ SITE_ID/versions/VERSION_ID This name is provided in the response body when you call [`CreateVersion`](sites.versions/create).
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Deprecated in favor of [site channels](sites.channels).
     */
    readonly preview?: pulumi.Input<inputs.firebasehosting.v1beta1.PreviewConfig>;
    readonly sitesId: pulumi.Input<string>;
    /**
     * The deploy status of the version. For a successful deploy, call [`CreateVersion`](sites.versions/create) to make a new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the version, then [update](sites.versions/patch) the version to the `FINALIZED` status. Note that if you leave the version in the `CREATED` state for more than 12 hours, the system will automatically mark the version as `ABANDONED`. You can also change the status of a version to `DELETED` by calling [`DeleteVersion`](sites.versions/delete).
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The total stored bytesize of the version. This value is calculated after a version is `FINALIZED`.
     */
    readonly versionBytes?: pulumi.Input<string>;
    readonly versionsId: pulumi.Input<string>;
}
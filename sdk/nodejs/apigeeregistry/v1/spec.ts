// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

/**
 * CreateApiSpec creates a specified spec.
 */
export class Spec extends pulumi.CustomResource {
    /**
     * Get an existing Spec resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): Spec {
        return new Spec(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'google-native:apigeeregistry/v1:Spec';

    /**
     * Returns true if the given object is an instance of Spec.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Spec {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Spec.__pulumiType;
    }

    /**
     * Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.
     */
    public readonly contents!: pulumi.Output<string>;
    /**
     * Creation timestamp; when the spec resource was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A detailed description.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * A possibly-hierarchical name used to refer to the spec from other specs.
     */
    public readonly filename!: pulumi.Output<string>;
    /**
     * A SHA-256 hash of the spec's contents. If the spec is gzipped, this is the hash of the uncompressed spec.
     */
    public /*out*/ readonly hash!: pulumi.Output<string>;
    /**
     * Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with "apigeeregistry.googleapis.com/" and cannot be changed.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include "application/vnd.apigee.proto", "application/vnd.apigee.openapi", and "application/vnd.apigee.graphql", with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with "+gzip").
     */
    public readonly mimeType!: pulumi.Output<string>;
    /**
     * Resource name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Revision creation timestamp; when the represented revision was created.
     */
    public /*out*/ readonly revisionCreateTime!: pulumi.Output<string>;
    /**
     * Immutable. The revision ID of the spec. A new revision is committed whenever the spec contents are changed. The format is an 8-character hexadecimal string.
     */
    public /*out*/ readonly revisionId!: pulumi.Output<string>;
    /**
     * Last update timestamp: when the represented revision was last modified.
     */
    public /*out*/ readonly revisionUpdateTime!: pulumi.Output<string>;
    /**
     * The size of the spec file in bytes. If the spec is gzipped, this is the size of the uncompressed spec.
     */
    public /*out*/ readonly sizeBytes!: pulumi.Output<number>;
    /**
     * The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.
     */
    public readonly sourceUri!: pulumi.Output<string>;

    /**
     * Create a Spec resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpecArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.apiSpecId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiSpecId'");
            }
            if ((!args || args.versionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'versionId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["apiId"] = args ? args.apiId : undefined;
            resourceInputs["apiSpecId"] = args ? args.apiSpecId : undefined;
            resourceInputs["contents"] = args ? args.contents : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["filename"] = args ? args.filename : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["mimeType"] = args ? args.mimeType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["sourceUri"] = args ? args.sourceUri : undefined;
            resourceInputs["versionId"] = args ? args.versionId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["hash"] = undefined /*out*/;
            resourceInputs["revisionCreateTime"] = undefined /*out*/;
            resourceInputs["revisionId"] = undefined /*out*/;
            resourceInputs["revisionUpdateTime"] = undefined /*out*/;
            resourceInputs["sizeBytes"] = undefined /*out*/;
        } else {
            resourceInputs["annotations"] = undefined /*out*/;
            resourceInputs["contents"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["filename"] = undefined /*out*/;
            resourceInputs["hash"] = undefined /*out*/;
            resourceInputs["labels"] = undefined /*out*/;
            resourceInputs["mimeType"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["revisionCreateTime"] = undefined /*out*/;
            resourceInputs["revisionId"] = undefined /*out*/;
            resourceInputs["revisionUpdateTime"] = undefined /*out*/;
            resourceInputs["sizeBytes"] = undefined /*out*/;
            resourceInputs["sourceUri"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Spec.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Spec resource.
 */
export interface SpecArgs {
    /**
     * Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    apiId: pulumi.Input<string>;
    /**
     * Required. The ID to use for the spec, which will become the final component of the spec's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     */
    apiSpecId: pulumi.Input<string>;
    /**
     * Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.
     */
    contents?: pulumi.Input<string>;
    /**
     * A detailed description.
     */
    description?: pulumi.Input<string>;
    /**
     * A possibly-hierarchical name used to refer to the spec from other specs.
     */
    filename?: pulumi.Input<string>;
    /**
     * Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with "apigeeregistry.googleapis.com/" and cannot be changed.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    location?: pulumi.Input<string>;
    /**
     * A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include "application/vnd.apigee.proto", "application/vnd.apigee.openapi", and "application/vnd.apigee.graphql", with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with "+gzip").
     */
    mimeType?: pulumi.Input<string>;
    /**
     * Resource name.
     */
    name?: pulumi.Input<string>;
    project?: pulumi.Input<string>;
    /**
     * The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.
     */
    sourceUri?: pulumi.Input<string>;
    versionId: pulumi.Input<string>;
}
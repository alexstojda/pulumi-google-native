// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../../types";
import * as utilities from "../../utilities";

/**
 * List all of the ordered rules present in a single specified policy.
 */
export function getRegionSecurityPolicy(args: GetRegionSecurityPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionSecurityPolicyResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("google-native:compute/v1:getRegionSecurityPolicy", {
        "project": args.project,
        "region": args.region,
        "securityPolicy": args.securityPolicy,
    }, opts);
}

export interface GetRegionSecurityPolicyArgs {
    project?: string;
    region: string;
    securityPolicy: string;
}

export interface GetRegionSecurityPolicyResult {
    readonly adaptiveProtectionConfig: outputs.compute.v1.SecurityPolicyAdaptiveProtectionConfigResponse;
    readonly advancedOptionsConfig: outputs.compute.v1.SecurityPolicyAdvancedOptionsConfigResponse;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    readonly creationTimestamp: string;
    readonly ddosProtectionConfig: outputs.compute.v1.SecurityPolicyDdosProtectionConfigResponse;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    readonly description: string;
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     */
    readonly fingerprint: string;
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     */
    readonly kind: string;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     */
    readonly name: string;
    readonly recaptchaOptionsConfig: outputs.compute.v1.SecurityPolicyRecaptchaOptionsConfigResponse;
    /**
     * URL of the region where the regional security policy resides. This field is not applicable to global security policies.
     */
    readonly region: string;
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     */
    readonly rules: outputs.compute.v1.SecurityPolicyRuleResponse[];
    /**
     * Server-defined URL for the resource.
     */
    readonly selfLink: string;
    /**
     * The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
     */
    readonly type: string;
}

export function getRegionSecurityPolicyOutput(args: GetRegionSecurityPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionSecurityPolicyResult> {
    return pulumi.output(args).apply(a => getRegionSecurityPolicy(a, opts))
}

export interface GetRegionSecurityPolicyOutputArgs {
    project?: pulumi.Input<string>;
    region: pulumi.Input<string>;
    securityPolicy: pulumi.Input<string>;
}
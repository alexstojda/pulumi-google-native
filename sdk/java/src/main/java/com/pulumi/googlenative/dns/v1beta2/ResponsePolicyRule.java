// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dns.v1beta2.ResponsePolicyRuleArgs;
import com.pulumi.googlenative.dns.v1beta2.outputs.ResponsePolicyRuleLocalDataResponse;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Response Policy Rule.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dns/v1beta2:ResponsePolicyRule")
public class ResponsePolicyRule extends com.pulumi.resources.CustomResource {
    /**
     * Answer this query with a behavior rather than DNS data.
     * 
     */
    @Export(name="behavior", type=String.class, parameters={})
    private Output<String> behavior;

    /**
     * @return Answer this query with a behavior rather than DNS data.
     * 
     */
    public Output<String> behavior() {
        return this.behavior;
    }
    /**
     * For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
     * 
     */
    @Export(name="clientOperationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientOperationId;

    /**
     * @return For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
     * 
     */
    public Output<Optional<String>> clientOperationId() {
        return Codegen.optional(this.clientOperationId);
    }
    /**
     * The DNS name (wildcard or exact) to apply this rule to. Must be unique within the Response Policy Rule.
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name (wildcard or exact) to apply this rule to. Must be unique within the Response Policy Rule.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name; in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * 
     */
    @Export(name="localData", type=ResponsePolicyRuleLocalDataResponse.class, parameters={})
    private Output<ResponsePolicyRuleLocalDataResponse> localData;

    /**
     * @return Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name; in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * 
     */
    public Output<ResponsePolicyRuleLocalDataResponse> localData() {
        return this.localData;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="responsePolicy", type=String.class, parameters={})
    private Output<String> responsePolicy;

    public Output<String> responsePolicy() {
        return this.responsePolicy;
    }
    /**
     * An identifier for this rule. Must be unique with the ResponsePolicy.
     * 
     */
    @Export(name="ruleName", type=String.class, parameters={})
    private Output<String> ruleName;

    /**
     * @return An identifier for this rule. Must be unique with the ResponsePolicy.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponsePolicyRule(String name) {
        this(name, ResponsePolicyRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponsePolicyRule(String name, ResponsePolicyRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponsePolicyRule(String name, ResponsePolicyRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResponsePolicyRule", name, args == null ? ResponsePolicyRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResponsePolicyRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResponsePolicyRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResponsePolicyRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResponsePolicyRule(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.appengine.v1.IngressRuleArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a firewall rule for the application.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:appengine/v1:IngressRule")
public class IngressRule extends com.pulumi.resources.CustomResource {
    /**
     * The action to take on matched requests.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The action to take on matched requests.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }
    /**
     * An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character &#34;*&#34; to match all IPs equivalent to &#34;0/0&#34; and &#34;::/0&#34; together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
     */
    @Export(name="sourceRange", type=String.class, parameters={})
    private Output<String> sourceRange;

    /**
     * @return IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character &#34;*&#34; to match all IPs equivalent to &#34;0/0&#34; and &#34;::/0&#34; together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
     */
    public Output<String> sourceRange() {
        return this.sourceRange;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IngressRule(String name) {
        this(name, IngressRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IngressRule(String name, IngressRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IngressRule(String name, IngressRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:IngressRule", name, args == null ? IngressRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IngressRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:IngressRule", name, null, makeResourceOptions(options, id));
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
    public static IngressRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IngressRule(name, id, options);
    }
}
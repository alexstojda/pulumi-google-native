// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.iam.v1.ProviderArgs;
import com.pulumi.googlenative.iam.v1.outputs.AwsResponse;
import com.pulumi.googlenative.iam.v1.outputs.OidcResponse;
import com.pulumi.googlenative.iam.v1.outputs.SamlResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new WorkloadIdentityPoolProvider in a WorkloadIdentityPool. You cannot reuse the name of a deleted provider until 30 days after deletion.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:iam/v1:Provider")
public class Provider extends com.pulumi.resources.CustomResource {
    /**
     * [A Common Expression Language](https://opensource.google/projects/cel) expression, in plain text, to restrict what otherwise valid authentication credentials issued by the provider should not be accepted. The expression must output a boolean representing whether to allow the federation. The following keywords may be referenced in the expressions: * `assertion`: JSON representing the authentication credential issued by the provider. * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the attribute condition expression is 4096 characters. If unspecified, all valid authentication credential are accepted. The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`: ```&#34;&#39;admins&#39; in google.groups&#34;```
     * 
     */
    @Export(name="attributeCondition", type=String.class, parameters={})
    private Output<String> attributeCondition;

    /**
     * @return [A Common Expression Language](https://opensource.google/projects/cel) expression, in plain text, to restrict what otherwise valid authentication credentials issued by the provider should not be accepted. The expression must output a boolean representing whether to allow the federation. The following keywords may be referenced in the expressions: * `assertion`: JSON representing the authentication credential issued by the provider. * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the attribute condition expression is 4096 characters. If unspecified, all valid authentication credential are accepted. The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`: ```&#34;&#39;admins&#39; in google.groups&#34;```
     * 
     */
    public Output<String> attributeCondition() {
        return this.attributeCondition;
    }
    /**
     * Maps attributes from authentication credentials issued by an external identity provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string specifying the Google Cloud IAM attribute to map to. The following keys are supported: * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 bytes. * `google.groups`: Groups the external identity belongs to. You can grant groups access to resources using an IAM `principalSet` binding; access applies to all members of the group. You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM policies to define fine-grained access for a workload to Google Cloud resources. For example: * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps an identity provider credential to the normalized attribute specified by the corresponding map key. You can use the `assertion` keyword in the expression to access a JSON representation of the authentication credential issued by the provider. The maximum length of an attribute mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following default mapping applies: ```{ &#34;google.subject&#34;:&#34;assertion.arn&#34;, &#34;attribute.aws_role&#34;: &#34;assertion.arn.contains(&#39;assumed-role&#39;)&#34; &#34; ? assertion.arn.extract(&#39;{account_arn}assumed-role/&#39;)&#34; &#34; + &#39;assumed-role/&#39;&#34; &#34; + assertion.arn.extract(&#39;assumed-role/{role_name}/&#39;)&#34; &#34; : assertion.arn&#34;, }``` If any custom attribute mappings are defined, they must include a mapping to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which must include the `google.subject` attribute. For example, the following maps the `sub` claim of the incoming credential to the `subject` attribute on a Google token: ```{&#34;google.subject&#34;: &#34;assertion.sub&#34;}```
     * 
     */
    @Export(name="attributeMapping", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> attributeMapping;

    /**
     * @return Maps attributes from authentication credentials issued by an external identity provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string specifying the Google Cloud IAM attribute to map to. The following keys are supported: * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 bytes. * `google.groups`: Groups the external identity belongs to. You can grant groups access to resources using an IAM `principalSet` binding; access applies to all members of the group. You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM policies to define fine-grained access for a workload to Google Cloud resources. For example: * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps an identity provider credential to the normalized attribute specified by the corresponding map key. You can use the `assertion` keyword in the expression to access a JSON representation of the authentication credential issued by the provider. The maximum length of an attribute mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following default mapping applies: ```{ &#34;google.subject&#34;:&#34;assertion.arn&#34;, &#34;attribute.aws_role&#34;: &#34;assertion.arn.contains(&#39;assumed-role&#39;)&#34; &#34; ? assertion.arn.extract(&#39;{account_arn}assumed-role/&#39;)&#34; &#34; + &#39;assumed-role/&#39;&#34; &#34; + assertion.arn.extract(&#39;assumed-role/{role_name}/&#39;)&#34; &#34; : assertion.arn&#34;, }``` If any custom attribute mappings are defined, they must include a mapping to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which must include the `google.subject` attribute. For example, the following maps the `sub` claim of the incoming credential to the `subject` attribute on a Google token: ```{&#34;google.subject&#34;: &#34;assertion.sub&#34;}```
     * 
     */
    public Output<Map<String,String>> attributeMapping() {
        return this.attributeMapping;
    }
    /**
     * An Amazon Web Services identity provider.
     * 
     */
    @Export(name="aws", type=AwsResponse.class, parameters={})
    private Output<AwsResponse> aws;

    /**
     * @return An Amazon Web Services identity provider.
     * 
     */
    public Output<AwsResponse> aws() {
        return this.aws;
    }
    /**
     * A description for the provider. Cannot exceed 256 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for the provider. Cannot exceed 256 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens. However, existing tokens still grant access.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Whether the provider is disabled. You cannot use a disabled provider to exchange tokens. However, existing tokens still grant access.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An OpenId Connect 1.0 identity provider.
     * 
     */
    @Export(name="oidc", type=OidcResponse.class, parameters={})
    private Output<OidcResponse> oidc;

    /**
     * @return An OpenId Connect 1.0 identity provider.
     * 
     */
    public Output<OidcResponse> oidc() {
        return this.oidc;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * An SAML 2.0 identity provider.
     * 
     */
    @Export(name="saml", type=SamlResponse.class, parameters={})
    private Output<SamlResponse> saml;

    /**
     * @return An SAML 2.0 identity provider.
     * 
     */
    public Output<SamlResponse> saml() {
        return this.saml;
    }
    /**
     * The state of the provider.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the provider.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    @Export(name="workloadIdentityPoolId", type=String.class, parameters={})
    private Output<String> workloadIdentityPoolId;

    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }
    /**
     * Required. The ID for the provider, which becomes the final component of the resource name. This value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @Export(name="workloadIdentityPoolProviderId", type=String.class, parameters={})
    private Output<String> workloadIdentityPoolProviderId;

    /**
     * @return Required. The ID for the provider, which becomes the final component of the resource name. This value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    public Output<String> workloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:Provider", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Provider(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:Provider", name, null, makeResourceOptions(options, id));
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
    public static Provider get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Provider(name, id, options);
    }
}
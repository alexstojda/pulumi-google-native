// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networksecurity.v1.ClientTlsPolicyArgs;
import com.pulumi.googlenative.networksecurity.v1.outputs.GoogleCloudNetworksecurityV1CertificateProviderResponse;
import com.pulumi.googlenative.networksecurity.v1.outputs.ValidationCAResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ClientTlsPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networksecurity/v1:ClientTlsPolicy")
public class ClientTlsPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    @Export(name="clientCertificate", type=GoogleCloudNetworksecurityV1CertificateProviderResponse.class, parameters={})
    private Output<GoogleCloudNetworksecurityV1CertificateProviderResponse> clientCertificate;

    /**
     * @return Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    public Output<GoogleCloudNetworksecurityV1CertificateProviderResponse> clientCertificate() {
        return this.clientCertificate;
    }
    /**
     * Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. &#34;client_mtls_policy&#34;.
     * 
     */
    @Export(name="clientTlsPolicyId", type=String.class, parameters={})
    private Output<String> clientTlsPolicyId;

    /**
     * @return Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. &#34;client_mtls_policy&#34;.
     * 
     */
    public Output<String> clientTlsPolicyId() {
        return this.clientTlsPolicyId;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Free-text description of the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Optional. Set of label tags associated with the resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the resource.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    @Export(name="serverValidationCa", type=List.class, parameters={ValidationCAResponse.class})
    private Output<List<ValidationCAResponse>> serverValidationCa;

    /**
     * @return Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    public Output<List<ValidationCAResponse>> serverValidationCa() {
        return this.serverValidationCa;
    }
    /**
     * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: &#34;secure.example.com&#34;.
     * 
     */
    @Export(name="sni", type=String.class, parameters={})
    private Output<String> sni;

    /**
     * @return Optional. Server Name Indication string to present to the server during TLS handshake. E.g: &#34;secure.example.com&#34;.
     * 
     */
    public Output<String> sni() {
        return this.sni;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientTlsPolicy(String name) {
        this(name, ClientTlsPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientTlsPolicy(String name, ClientTlsPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientTlsPolicy(String name, ClientTlsPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1:ClientTlsPolicy", name, args == null ? ClientTlsPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClientTlsPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1:ClientTlsPolicy", name, null, makeResourceOptions(options, id));
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
    public static ClientTlsPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientTlsPolicy(name, id, options);
    }
}
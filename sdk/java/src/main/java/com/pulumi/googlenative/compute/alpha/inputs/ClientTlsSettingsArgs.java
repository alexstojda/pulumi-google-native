// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.enums.ClientTlsSettingsMode;
import com.pulumi.googlenative.compute.alpha.inputs.TlsContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [Deprecated] The client side authentication settings for connection originating from the backend service. the backend service.
 * 
 */
public final class ClientTlsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientTlsSettingsArgs Empty = new ClientTlsSettingsArgs();

    /**
     * Configures the mechanism to obtain client-side security certificates and identity information. This field is only applicable when mode is set to MUTUAL.
     * 
     */
    @Import(name="clientTlsContext")
    private @Nullable Output<TlsContextArgs> clientTlsContext;

    /**
     * @return Configures the mechanism to obtain client-side security certificates and identity information. This field is only applicable when mode is set to MUTUAL.
     * 
     */
    public Optional<Output<TlsContextArgs>> clientTlsContext() {
        return Optional.ofNullable(this.clientTlsContext);
    }

    /**
     * Indicates whether connections to this port should be secured using TLS. The value of this field determines how TLS is enforced. This can be set to one of the following values: DISABLE: Do not setup a TLS connection to the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL: Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<ClientTlsSettingsMode> mode;

    /**
     * @return Indicates whether connections to this port should be secured using TLS. The value of this field determines how TLS is enforced. This can be set to one of the following values: DISABLE: Do not setup a TLS connection to the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL: Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    public Optional<Output<ClientTlsSettingsMode>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * SNI string to present to the server during TLS handshake. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    @Import(name="sni")
    private @Nullable Output<String> sni;

    /**
     * @return SNI string to present to the server during TLS handshake. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    public Optional<Output<String>> sni() {
        return Optional.ofNullable(this.sni);
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    @Import(name="subjectAltNames")
    private @Nullable Output<List<String>> subjectAltNames;

    /**
     * @return A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
     * 
     */
    public Optional<Output<List<String>>> subjectAltNames() {
        return Optional.ofNullable(this.subjectAltNames);
    }

    private ClientTlsSettingsArgs() {}

    private ClientTlsSettingsArgs(ClientTlsSettingsArgs $) {
        this.clientTlsContext = $.clientTlsContext;
        this.mode = $.mode;
        this.sni = $.sni;
        this.subjectAltNames = $.subjectAltNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientTlsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientTlsSettingsArgs $;

        public Builder() {
            $ = new ClientTlsSettingsArgs();
        }

        public Builder(ClientTlsSettingsArgs defaults) {
            $ = new ClientTlsSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientTlsContext Configures the mechanism to obtain client-side security certificates and identity information. This field is only applicable when mode is set to MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder clientTlsContext(@Nullable Output<TlsContextArgs> clientTlsContext) {
            $.clientTlsContext = clientTlsContext;
            return this;
        }

        /**
         * @param clientTlsContext Configures the mechanism to obtain client-side security certificates and identity information. This field is only applicable when mode is set to MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder clientTlsContext(TlsContextArgs clientTlsContext) {
            return clientTlsContext(Output.of(clientTlsContext));
        }

        /**
         * @param mode Indicates whether connections to this port should be secured using TLS. The value of this field determines how TLS is enforced. This can be set to one of the following values: DISABLE: Do not setup a TLS connection to the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL: Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<ClientTlsSettingsMode> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Indicates whether connections to this port should be secured using TLS. The value of this field determines how TLS is enforced. This can be set to one of the following values: DISABLE: Do not setup a TLS connection to the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL: Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
         * 
         * @return builder
         * 
         */
        public Builder mode(ClientTlsSettingsMode mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param sni SNI string to present to the server during TLS handshake. This field is applicable only when mode is SIMPLE or MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder sni(@Nullable Output<String> sni) {
            $.sni = sni;
            return this;
        }

        /**
         * @param sni SNI string to present to the server during TLS handshake. This field is applicable only when mode is SIMPLE or MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder sni(String sni) {
            return sni(Output.of(sni));
        }

        /**
         * @param subjectAltNames A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltNames(@Nullable Output<List<String>> subjectAltNames) {
            $.subjectAltNames = subjectAltNames;
            return this;
        }

        /**
         * @param subjectAltNames A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltNames(List<String> subjectAltNames) {
            return subjectAltNames(Output.of(subjectAltNames));
        }

        /**
         * @param subjectAltNames A list of alternate names to verify the subject identity in the certificate.If specified, the proxy will verify that the server certificate&#39;s subject alt name matches one of the specified values. This field is applicable only when mode is SIMPLE or MUTUAL.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }

        public ClientTlsSettingsArgs build() {
            return $;
        }
    }

}
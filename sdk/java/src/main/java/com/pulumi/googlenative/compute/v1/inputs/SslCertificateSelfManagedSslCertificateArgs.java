// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration and status of a self-managed SSL certificate.
 * 
 */
public final class SslCertificateSelfManagedSslCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslCertificateSelfManagedSslCertificateArgs Empty = new SslCertificateSelfManagedSslCertificateArgs();

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * A write-only private key in PEM format. Only insert requests will include this field.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return A write-only private key in PEM format. Only insert requests will include this field.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    private SslCertificateSelfManagedSslCertificateArgs() {}

    private SslCertificateSelfManagedSslCertificateArgs(SslCertificateSelfManagedSslCertificateArgs $) {
        this.certificate = $.certificate;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslCertificateSelfManagedSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslCertificateSelfManagedSslCertificateArgs $;

        public Builder() {
            $ = new SslCertificateSelfManagedSslCertificateArgs();
        }

        public Builder(SslCertificateSelfManagedSslCertificateArgs defaults) {
            $ = new SslCertificateSelfManagedSslCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param privateKey A write-only private key in PEM format. Only insert requests will include this field.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey A write-only private key in PEM format. Only insert requests will include this field.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public SslCertificateSelfManagedSslCertificateArgs build() {
            return $;
        }
    }

}
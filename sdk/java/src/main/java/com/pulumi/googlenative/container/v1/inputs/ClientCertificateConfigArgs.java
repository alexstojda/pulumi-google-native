// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for client certificates on the cluster.
 * 
 */
public final class ClientCertificateConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientCertificateConfigArgs Empty = new ClientCertificateConfigArgs();

    /**
     * Issue a client certificate.
     * 
     */
    @Import(name="issueClientCertificate")
    private @Nullable Output<Boolean> issueClientCertificate;

    /**
     * @return Issue a client certificate.
     * 
     */
    public Optional<Output<Boolean>> issueClientCertificate() {
        return Optional.ofNullable(this.issueClientCertificate);
    }

    private ClientCertificateConfigArgs() {}

    private ClientCertificateConfigArgs(ClientCertificateConfigArgs $) {
        this.issueClientCertificate = $.issueClientCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCertificateConfigArgs $;

        public Builder() {
            $ = new ClientCertificateConfigArgs();
        }

        public Builder(ClientCertificateConfigArgs defaults) {
            $ = new ClientCertificateConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param issueClientCertificate Issue a client certificate.
         * 
         * @return builder
         * 
         */
        public Builder issueClientCertificate(@Nullable Output<Boolean> issueClientCertificate) {
            $.issueClientCertificate = issueClientCertificate;
            return this;
        }

        /**
         * @param issueClientCertificate Issue a client certificate.
         * 
         * @return builder
         * 
         */
        public Builder issueClientCertificate(Boolean issueClientCertificate) {
            return issueClientCertificate(Output.of(issueClientCertificate));
        }

        public ClientCertificateConfigArgs build() {
            return $;
        }
    }

}
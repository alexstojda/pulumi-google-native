// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information required for a TCP Uptime check request.
 * 
 */
public final class TcpCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final TcpCheckArgs Empty = new TcpCheckArgs();

    /**
     * The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private TcpCheckArgs() {}

    private TcpCheckArgs(TcpCheckArgs $) {
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TcpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TcpCheckArgs $;

        public Builder() {
            $ = new TcpCheckArgs();
        }

        public Builder(TcpCheckArgs defaults) {
            $ = new TcpCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public TcpCheckArgs build() {
            return $;
        }
    }

}
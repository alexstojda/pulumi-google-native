// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1alpha1.inputs.GcsDestinationConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of the stream destination.
 * 
 */
public final class DestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DestinationConfigArgs Empty = new DestinationConfigArgs();

    /**
     * Destination connection profile identifier.
     * 
     */
    @Import(name="destinationConnectionProfileName", required=true)
    private Output<String> destinationConnectionProfileName;

    /**
     * @return Destination connection profile identifier.
     * 
     */
    public Output<String> destinationConnectionProfileName() {
        return this.destinationConnectionProfileName;
    }

    /**
     * GCS destination configuration.
     * 
     */
    @Import(name="gcsDestinationConfig")
    private @Nullable Output<GcsDestinationConfigArgs> gcsDestinationConfig;

    /**
     * @return GCS destination configuration.
     * 
     */
    public Optional<Output<GcsDestinationConfigArgs>> gcsDestinationConfig() {
        return Optional.ofNullable(this.gcsDestinationConfig);
    }

    private DestinationConfigArgs() {}

    private DestinationConfigArgs(DestinationConfigArgs $) {
        this.destinationConnectionProfileName = $.destinationConnectionProfileName;
        this.gcsDestinationConfig = $.gcsDestinationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationConfigArgs $;

        public Builder() {
            $ = new DestinationConfigArgs();
        }

        public Builder(DestinationConfigArgs defaults) {
            $ = new DestinationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationConnectionProfileName Destination connection profile identifier.
         * 
         * @return builder
         * 
         */
        public Builder destinationConnectionProfileName(Output<String> destinationConnectionProfileName) {
            $.destinationConnectionProfileName = destinationConnectionProfileName;
            return this;
        }

        /**
         * @param destinationConnectionProfileName Destination connection profile identifier.
         * 
         * @return builder
         * 
         */
        public Builder destinationConnectionProfileName(String destinationConnectionProfileName) {
            return destinationConnectionProfileName(Output.of(destinationConnectionProfileName));
        }

        /**
         * @param gcsDestinationConfig GCS destination configuration.
         * 
         * @return builder
         * 
         */
        public Builder gcsDestinationConfig(@Nullable Output<GcsDestinationConfigArgs> gcsDestinationConfig) {
            $.gcsDestinationConfig = gcsDestinationConfig;
            return this;
        }

        /**
         * @param gcsDestinationConfig GCS destination configuration.
         * 
         * @return builder
         * 
         */
        public Builder gcsDestinationConfig(GcsDestinationConfigArgs gcsDestinationConfig) {
            return gcsDestinationConfig(Output.of(gcsDestinationConfig));
        }

        public DestinationConfigArgs build() {
            $.destinationConnectionProfileName = Objects.requireNonNull($.destinationConnectionProfileName, "expected parameter 'destinationConnectionProfileName' to be non-null");
            return $;
        }
    }

}
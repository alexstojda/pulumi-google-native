// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee.v1.enums.GoogleCloudApigeeV1TraceSamplingConfigSampler;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TraceSamplingConfig represents the detail settings of distributed tracing. Only the fields that are defined in the distributed trace configuration can be overridden using the distribute trace configuration override APIs.
 * 
 */
public final class GoogleCloudApigeeV1TraceSamplingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1TraceSamplingConfigArgs Empty = new GoogleCloudApigeeV1TraceSamplingConfigArgs();

    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
     */
    @Import(name="sampler")
    private @Nullable Output<GoogleCloudApigeeV1TraceSamplingConfigSampler> sampler;

    /**
     * @return Sampler of distributed tracing. OFF is the default value.
     * 
     */
    public Optional<Output<GoogleCloudApigeeV1TraceSamplingConfigSampler>> sampler() {
        return Optional.ofNullable(this.sampler);
    }

    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are &gt; 0 and &lt;= 0.5.
     * 
     */
    @Import(name="samplingRate")
    private @Nullable Output<Double> samplingRate;

    /**
     * @return Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are &gt; 0 and &lt;= 0.5.
     * 
     */
    public Optional<Output<Double>> samplingRate() {
        return Optional.ofNullable(this.samplingRate);
    }

    private GoogleCloudApigeeV1TraceSamplingConfigArgs() {}

    private GoogleCloudApigeeV1TraceSamplingConfigArgs(GoogleCloudApigeeV1TraceSamplingConfigArgs $) {
        this.sampler = $.sampler;
        this.samplingRate = $.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1TraceSamplingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1TraceSamplingConfigArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1TraceSamplingConfigArgs();
        }

        public Builder(GoogleCloudApigeeV1TraceSamplingConfigArgs defaults) {
            $ = new GoogleCloudApigeeV1TraceSamplingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sampler Sampler of distributed tracing. OFF is the default value.
         * 
         * @return builder
         * 
         */
        public Builder sampler(@Nullable Output<GoogleCloudApigeeV1TraceSamplingConfigSampler> sampler) {
            $.sampler = sampler;
            return this;
        }

        /**
         * @param sampler Sampler of distributed tracing. OFF is the default value.
         * 
         * @return builder
         * 
         */
        public Builder sampler(GoogleCloudApigeeV1TraceSamplingConfigSampler sampler) {
            return sampler(Output.of(sampler));
        }

        /**
         * @param samplingRate Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are &gt; 0 and &lt;= 0.5.
         * 
         * @return builder
         * 
         */
        public Builder samplingRate(@Nullable Output<Double> samplingRate) {
            $.samplingRate = samplingRate;
            return this;
        }

        /**
         * @param samplingRate Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are &gt; 0 and &lt;= 0.5.
         * 
         * @return builder
         * 
         */
        public Builder samplingRate(Double samplingRate) {
            return samplingRate(Output.of(samplingRate));
        }

        public GoogleCloudApigeeV1TraceSamplingConfigArgs build() {
            return $;
        }
    }

}
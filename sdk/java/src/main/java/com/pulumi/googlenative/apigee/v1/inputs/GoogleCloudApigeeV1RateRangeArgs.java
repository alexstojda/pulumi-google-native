// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleTypeMoneyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API call volume range and the fees charged when the total number of API calls is within the range.
 * 
 */
public final class GoogleCloudApigeeV1RateRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1RateRangeArgs Empty = new GoogleCloudApigeeV1RateRangeArgs();

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    /**
     * @return Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Fee to charge when total number of API calls falls within this range.
     * 
     */
    @Import(name="fee")
    private @Nullable Output<GoogleTypeMoneyArgs> fee;

    /**
     * @return Fee to charge when total number of API calls falls within this range.
     * 
     */
    public Optional<Output<GoogleTypeMoneyArgs>> fee() {
        return Optional.ofNullable(this.fee);
    }

    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    /**
     * @return Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private GoogleCloudApigeeV1RateRangeArgs() {}

    private GoogleCloudApigeeV1RateRangeArgs(GoogleCloudApigeeV1RateRangeArgs $) {
        this.end = $.end;
        this.fee = $.fee;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1RateRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1RateRangeArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1RateRangeArgs();
        }

        public Builder(GoogleCloudApigeeV1RateRangeArgs defaults) {
            $ = new GoogleCloudApigeeV1RateRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end Ending value of the range. Set to 0 or `null` for the last range of values.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Ending value of the range. Set to 0 or `null` for the last range of values.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            return end(Output.of(end));
        }

        /**
         * @param fee Fee to charge when total number of API calls falls within this range.
         * 
         * @return builder
         * 
         */
        public Builder fee(@Nullable Output<GoogleTypeMoneyArgs> fee) {
            $.fee = fee;
            return this;
        }

        /**
         * @param fee Fee to charge when total number of API calls falls within this range.
         * 
         * @return builder
         * 
         */
        public Builder fee(GoogleTypeMoneyArgs fee) {
            return fee(Output.of(fee));
        }

        /**
         * @param start Starting value of the range. Set to 0 or `null` for the initial range of values.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Starting value of the range. Set to 0 or `null` for the initial range of values.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        public GoogleCloudApigeeV1RateRangeArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GoogleCloudDataplexV1EnvironmentSessionSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1EnvironmentSessionSpecArgs Empty = new GoogleCloudDataplexV1EnvironmentSessionSpecArgs();

    /**
     * Optional. If True, this causes sessions to be pre-created and available for faster startup to enable interactive exploration use-cases. This defaults to False to avoid additional billed charges. These can only be set to True for the environment with name set to &#34;default&#34;, and with default configuration.
     * 
     */
    @Import(name="enableFastStartup")
    private @Nullable Output<Boolean> enableFastStartup;

    /**
     * @return Optional. If True, this causes sessions to be pre-created and available for faster startup to enable interactive exploration use-cases. This defaults to False to avoid additional billed charges. These can only be set to True for the environment with name set to &#34;default&#34;, and with default configuration.
     * 
     */
    public Optional<Output<Boolean>> enableFastStartup() {
        return Optional.ofNullable(this.enableFastStartup);
    }

    /**
     * Optional. The idle time configuration of the session. The session will be auto-terminated at the end of this period.
     * 
     */
    @Import(name="maxIdleDuration")
    private @Nullable Output<String> maxIdleDuration;

    /**
     * @return Optional. The idle time configuration of the session. The session will be auto-terminated at the end of this period.
     * 
     */
    public Optional<Output<String>> maxIdleDuration() {
        return Optional.ofNullable(this.maxIdleDuration);
    }

    private GoogleCloudDataplexV1EnvironmentSessionSpecArgs() {}

    private GoogleCloudDataplexV1EnvironmentSessionSpecArgs(GoogleCloudDataplexV1EnvironmentSessionSpecArgs $) {
        this.enableFastStartup = $.enableFastStartup;
        this.maxIdleDuration = $.maxIdleDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1EnvironmentSessionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1EnvironmentSessionSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1EnvironmentSessionSpecArgs();
        }

        public Builder(GoogleCloudDataplexV1EnvironmentSessionSpecArgs defaults) {
            $ = new GoogleCloudDataplexV1EnvironmentSessionSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableFastStartup Optional. If True, this causes sessions to be pre-created and available for faster startup to enable interactive exploration use-cases. This defaults to False to avoid additional billed charges. These can only be set to True for the environment with name set to &#34;default&#34;, and with default configuration.
         * 
         * @return builder
         * 
         */
        public Builder enableFastStartup(@Nullable Output<Boolean> enableFastStartup) {
            $.enableFastStartup = enableFastStartup;
            return this;
        }

        /**
         * @param enableFastStartup Optional. If True, this causes sessions to be pre-created and available for faster startup to enable interactive exploration use-cases. This defaults to False to avoid additional billed charges. These can only be set to True for the environment with name set to &#34;default&#34;, and with default configuration.
         * 
         * @return builder
         * 
         */
        public Builder enableFastStartup(Boolean enableFastStartup) {
            return enableFastStartup(Output.of(enableFastStartup));
        }

        /**
         * @param maxIdleDuration Optional. The idle time configuration of the session. The session will be auto-terminated at the end of this period.
         * 
         * @return builder
         * 
         */
        public Builder maxIdleDuration(@Nullable Output<String> maxIdleDuration) {
            $.maxIdleDuration = maxIdleDuration;
            return this;
        }

        /**
         * @param maxIdleDuration Optional. The idle time configuration of the session. The session will be auto-terminated at the end of this period.
         * 
         * @return builder
         * 
         */
        public Builder maxIdleDuration(String maxIdleDuration) {
            return maxIdleDuration(Output.of(maxIdleDuration));
        }

        public GoogleCloudDataplexV1EnvironmentSessionSpecArgs build() {
            return $;
        }
    }

}
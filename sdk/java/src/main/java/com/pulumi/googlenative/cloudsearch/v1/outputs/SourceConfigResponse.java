// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudsearch.v1.outputs.SourceCrowdingConfigResponse;
import com.pulumi.googlenative.cloudsearch.v1.outputs.SourceResponse;
import com.pulumi.googlenative.cloudsearch.v1.outputs.SourceScoringConfigResponse;
import java.util.Objects;

@CustomType
public final class SourceConfigResponse {
    /**
     * @return The crowding configuration for the source.
     * 
     */
    private SourceCrowdingConfigResponse crowdingConfig;
    /**
     * @return The scoring configuration for the source.
     * 
     */
    private SourceScoringConfigResponse scoringConfig;
    /**
     * @return The source for which this configuration is to be used.
     * 
     */
    private SourceResponse source;

    private SourceConfigResponse() {}
    /**
     * @return The crowding configuration for the source.
     * 
     */
    public SourceCrowdingConfigResponse crowdingConfig() {
        return this.crowdingConfig;
    }
    /**
     * @return The scoring configuration for the source.
     * 
     */
    public SourceScoringConfigResponse scoringConfig() {
        return this.scoringConfig;
    }
    /**
     * @return The source for which this configuration is to be used.
     * 
     */
    public SourceResponse source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SourceCrowdingConfigResponse crowdingConfig;
        private SourceScoringConfigResponse scoringConfig;
        private SourceResponse source;
        public Builder() {}
        public Builder(SourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crowdingConfig = defaults.crowdingConfig;
    	      this.scoringConfig = defaults.scoringConfig;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder crowdingConfig(SourceCrowdingConfigResponse crowdingConfig) {
            this.crowdingConfig = Objects.requireNonNull(crowdingConfig);
            return this;
        }
        @CustomType.Setter
        public Builder scoringConfig(SourceScoringConfigResponse scoringConfig) {
            this.scoringConfig = Objects.requireNonNull(scoringConfig);
            return this;
        }
        @CustomType.Setter
        public Builder source(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public SourceConfigResponse build() {
            final var o = new SourceConfigResponse();
            o.crowdingConfig = crowdingConfig;
            o.scoringConfig = scoringConfig;
            o.source = source;
            return o;
        }
    }
}
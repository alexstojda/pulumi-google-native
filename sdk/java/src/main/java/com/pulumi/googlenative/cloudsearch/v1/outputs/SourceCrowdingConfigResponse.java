// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SourceCrowdingConfigResponse {
    /**
     * @return Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    private Integer numResults;
    /**
     * @return Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    private Integer numSuggestions;

    private SourceCrowdingConfigResponse() {}
    /**
     * @return Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    public Integer numResults() {
        return this.numResults;
    }
    /**
     * @return Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    public Integer numSuggestions() {
        return this.numSuggestions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceCrowdingConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer numResults;
        private Integer numSuggestions;
        public Builder() {}
        public Builder(SourceCrowdingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numResults = defaults.numResults;
    	      this.numSuggestions = defaults.numSuggestions;
        }

        @CustomType.Setter
        public Builder numResults(Integer numResults) {
            this.numResults = Objects.requireNonNull(numResults);
            return this;
        }
        @CustomType.Setter
        public Builder numSuggestions(Integer numSuggestions) {
            this.numSuggestions = Objects.requireNonNull(numSuggestions);
            return this;
        }
        public SourceCrowdingConfigResponse build() {
            final var o = new SourceCrowdingConfigResponse();
            o.numResults = numResults;
            o.numSuggestions = numSuggestions;
            return o;
        }
    }
}
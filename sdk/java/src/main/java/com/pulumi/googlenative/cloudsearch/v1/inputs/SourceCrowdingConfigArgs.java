// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set search results crowding limits. Crowding is a situation in which multiple results from the same source or host &#34;crowd out&#34; other results, diminishing the quality of search for users. To foster better search quality and source diversity in search results, you can set a condition to reduce repetitive results by source.
 * 
 */
public final class SourceCrowdingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceCrowdingConfigArgs Empty = new SourceCrowdingConfigArgs();

    /**
     * Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    @Import(name="numResults")
    private @Nullable Output<Integer> numResults;

    /**
     * @return Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    public Optional<Output<Integer>> numResults() {
        return Optional.ofNullable(this.numResults);
    }

    /**
     * Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    @Import(name="numSuggestions")
    private @Nullable Output<Integer> numSuggestions;

    /**
     * @return Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    public Optional<Output<Integer>> numSuggestions() {
        return Optional.ofNullable(this.numSuggestions);
    }

    private SourceCrowdingConfigArgs() {}

    private SourceCrowdingConfigArgs(SourceCrowdingConfigArgs $) {
        this.numResults = $.numResults;
        this.numSuggestions = $.numSuggestions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceCrowdingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceCrowdingConfigArgs $;

        public Builder() {
            $ = new SourceCrowdingConfigArgs();
        }

        public Builder(SourceCrowdingConfigArgs defaults) {
            $ = new SourceCrowdingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param numResults Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
         * 
         * @return builder
         * 
         */
        public Builder numResults(@Nullable Output<Integer> numResults) {
            $.numResults = numResults;
            return this;
        }

        /**
         * @param numResults Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
         * 
         * @return builder
         * 
         */
        public Builder numResults(Integer numResults) {
            return numResults(Output.of(numResults));
        }

        /**
         * @param numSuggestions Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder numSuggestions(@Nullable Output<Integer> numSuggestions) {
            $.numSuggestions = numSuggestions;
            return this;
        }

        /**
         * @param numSuggestions Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder numSuggestions(Integer numSuggestions) {
            return numSuggestions(Output.of(numSuggestions));
        }

        public SourceCrowdingConfigArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail.v2alpha.inputs.GoogleCloudRetailV2alphaConditionQueryTermArgs;
import com.pulumi.googlenative.retail.v2alpha.inputs.GoogleCloudRetailV2alphaConditionTimeRangeArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata that is used to define a condition that triggers an action. A valid condition must specify at least one of &#39;query_terms&#39; or &#39;products_filter&#39;. If multiple fields are specified, the condition is met if all the fields are satisfied e.g. if a set of query terms and product_filter are set, then only items matching the product_filter for requests with a query matching the query terms wil get boosted.
 * 
 */
public final class GoogleCloudRetailV2alphaConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaConditionArgs Empty = new GoogleCloudRetailV2alphaConditionArgs();

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    @Import(name="activeTimeRange")
    private @Nullable Output<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> activeTimeRange;

    /**
     * @return Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    public Optional<Output<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>>> activeTimeRange() {
        return Optional.ofNullable(this.activeTimeRange);
    }

    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    @Import(name="queryTerms")
    private @Nullable Output<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> queryTerms;

    /**
     * @return A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    public Optional<Output<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>>> queryTerms() {
        return Optional.ofNullable(this.queryTerms);
    }

    private GoogleCloudRetailV2alphaConditionArgs() {}

    private GoogleCloudRetailV2alphaConditionArgs(GoogleCloudRetailV2alphaConditionArgs $) {
        this.activeTimeRange = $.activeTimeRange;
        this.queryTerms = $.queryTerms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaConditionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaConditionArgs();
        }

        public Builder(GoogleCloudRetailV2alphaConditionArgs defaults) {
            $ = new GoogleCloudRetailV2alphaConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeTimeRange Range of time(s) specifying when Condition is active. Condition true if any time range matches.
         * 
         * @return builder
         * 
         */
        public Builder activeTimeRange(@Nullable Output<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> activeTimeRange) {
            $.activeTimeRange = activeTimeRange;
            return this;
        }

        /**
         * @param activeTimeRange Range of time(s) specifying when Condition is active. Condition true if any time range matches.
         * 
         * @return builder
         * 
         */
        public Builder activeTimeRange(List<GoogleCloudRetailV2alphaConditionTimeRangeArgs> activeTimeRange) {
            return activeTimeRange(Output.of(activeTimeRange));
        }

        /**
         * @param activeTimeRange Range of time(s) specifying when Condition is active. Condition true if any time range matches.
         * 
         * @return builder
         * 
         */
        public Builder activeTimeRange(GoogleCloudRetailV2alphaConditionTimeRangeArgs... activeTimeRange) {
            return activeTimeRange(List.of(activeTimeRange));
        }

        /**
         * @param queryTerms A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
         * 
         * @return builder
         * 
         */
        public Builder queryTerms(@Nullable Output<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> queryTerms) {
            $.queryTerms = queryTerms;
            return this;
        }

        /**
         * @param queryTerms A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
         * 
         * @return builder
         * 
         */
        public Builder queryTerms(List<GoogleCloudRetailV2alphaConditionQueryTermArgs> queryTerms) {
            return queryTerms(Output.of(queryTerms));
        }

        /**
         * @param queryTerms A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
         * 
         * @return builder
         * 
         */
        public Builder queryTerms(GoogleCloudRetailV2alphaConditionQueryTermArgs... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }

        public GoogleCloudRetailV2alphaConditionArgs build() {
            return $;
        }
    }

}
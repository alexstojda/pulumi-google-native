// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Query terms that we want to match on.
 * 
 */
public final class GoogleCloudRetailV2betaConditionQueryTermArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaConditionQueryTermArgs Empty = new GoogleCloudRetailV2betaConditionQueryTermArgs();

    /**
     * Whether this is supposed to be a full or partial match.
     * 
     */
    @Import(name="fullMatch")
    private @Nullable Output<Boolean> fullMatch;

    /**
     * @return Whether this is supposed to be a full or partial match.
     * 
     */
    public Optional<Output<Boolean>> fullMatch() {
        return Optional.ofNullable(this.fullMatch);
    }

    /**
     * The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) &#34;a b c&#34; is 3 terms and allowed, &#34; a b c d&#34; is 4 terms and not allowed for partial match.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) &#34;a b c&#34; is 3 terms and allowed, &#34; a b c d&#34; is 4 terms and not allowed for partial match.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GoogleCloudRetailV2betaConditionQueryTermArgs() {}

    private GoogleCloudRetailV2betaConditionQueryTermArgs(GoogleCloudRetailV2betaConditionQueryTermArgs $) {
        this.fullMatch = $.fullMatch;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaConditionQueryTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaConditionQueryTermArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaConditionQueryTermArgs();
        }

        public Builder(GoogleCloudRetailV2betaConditionQueryTermArgs defaults) {
            $ = new GoogleCloudRetailV2betaConditionQueryTermArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullMatch Whether this is supposed to be a full or partial match.
         * 
         * @return builder
         * 
         */
        public Builder fullMatch(@Nullable Output<Boolean> fullMatch) {
            $.fullMatch = fullMatch;
            return this;
        }

        /**
         * @param fullMatch Whether this is supposed to be a full or partial match.
         * 
         * @return builder
         * 
         */
        public Builder fullMatch(Boolean fullMatch) {
            return fullMatch(Output.of(fullMatch));
        }

        /**
         * @param value The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) &#34;a b c&#34; is 3 terms and allowed, &#34; a b c d&#34; is 4 terms and not allowed for partial match.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) &#34;a b c&#34; is 3 terms and allowed, &#34; a b c d&#34; is 4 terms and not allowed for partial match.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GoogleCloudRetailV2betaConditionQueryTermArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.enums.GooglePrivacyDlpV2ExclusionRuleMatchingType;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2DictionaryArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2ExcludeInfoTypesArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2RegexArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The rule that specifies conditions when findings of infoTypes specified in `InspectionRuleSet` are removed from results.
 * 
 */
public final class GooglePrivacyDlpV2ExclusionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ExclusionRuleArgs Empty = new GooglePrivacyDlpV2ExclusionRuleArgs();

    /**
     * Dictionary which defines the rule.
     * 
     */
    @Import(name="dictionary")
    private @Nullable Output<GooglePrivacyDlpV2DictionaryArgs> dictionary;

    /**
     * @return Dictionary which defines the rule.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2DictionaryArgs>> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * 
     */
    @Import(name="excludeInfoTypes")
    private @Nullable Output<GooglePrivacyDlpV2ExcludeInfoTypesArgs> excludeInfoTypes;

    /**
     * @return Set of infoTypes for which findings would affect this rule.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2ExcludeInfoTypesArgs>> excludeInfoTypes() {
        return Optional.ofNullable(this.excludeInfoTypes);
    }

    /**
     * How the rule is applied, see MatchingType documentation for details.
     * 
     */
    @Import(name="matchingType")
    private @Nullable Output<GooglePrivacyDlpV2ExclusionRuleMatchingType> matchingType;

    /**
     * @return How the rule is applied, see MatchingType documentation for details.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2ExclusionRuleMatchingType>> matchingType() {
        return Optional.ofNullable(this.matchingType);
    }

    /**
     * Regular expression which defines the rule.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<GooglePrivacyDlpV2RegexArgs> regex;

    /**
     * @return Regular expression which defines the rule.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2RegexArgs>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private GooglePrivacyDlpV2ExclusionRuleArgs() {}

    private GooglePrivacyDlpV2ExclusionRuleArgs(GooglePrivacyDlpV2ExclusionRuleArgs $) {
        this.dictionary = $.dictionary;
        this.excludeInfoTypes = $.excludeInfoTypes;
        this.matchingType = $.matchingType;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2ExclusionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ExclusionRuleArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2ExclusionRuleArgs();
        }

        public Builder(GooglePrivacyDlpV2ExclusionRuleArgs defaults) {
            $ = new GooglePrivacyDlpV2ExclusionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dictionary Dictionary which defines the rule.
         * 
         * @return builder
         * 
         */
        public Builder dictionary(@Nullable Output<GooglePrivacyDlpV2DictionaryArgs> dictionary) {
            $.dictionary = dictionary;
            return this;
        }

        /**
         * @param dictionary Dictionary which defines the rule.
         * 
         * @return builder
         * 
         */
        public Builder dictionary(GooglePrivacyDlpV2DictionaryArgs dictionary) {
            return dictionary(Output.of(dictionary));
        }

        /**
         * @param excludeInfoTypes Set of infoTypes for which findings would affect this rule.
         * 
         * @return builder
         * 
         */
        public Builder excludeInfoTypes(@Nullable Output<GooglePrivacyDlpV2ExcludeInfoTypesArgs> excludeInfoTypes) {
            $.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        /**
         * @param excludeInfoTypes Set of infoTypes for which findings would affect this rule.
         * 
         * @return builder
         * 
         */
        public Builder excludeInfoTypes(GooglePrivacyDlpV2ExcludeInfoTypesArgs excludeInfoTypes) {
            return excludeInfoTypes(Output.of(excludeInfoTypes));
        }

        /**
         * @param matchingType How the rule is applied, see MatchingType documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder matchingType(@Nullable Output<GooglePrivacyDlpV2ExclusionRuleMatchingType> matchingType) {
            $.matchingType = matchingType;
            return this;
        }

        /**
         * @param matchingType How the rule is applied, see MatchingType documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder matchingType(GooglePrivacyDlpV2ExclusionRuleMatchingType matchingType) {
            return matchingType(Output.of(matchingType));
        }

        /**
         * @param regex Regular expression which defines the rule.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<GooglePrivacyDlpV2RegexArgs> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Regular expression which defines the rule.
         * 
         * @return builder
         * 
         */
        public Builder regex(GooglePrivacyDlpV2RegexArgs regex) {
            return regex(Output.of(regex));
        }

        public GooglePrivacyDlpV2ExclusionRuleArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2ExclusionRuleArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2HotwordRuleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single inspection rule to be applied to infoTypes, specified in `InspectionRuleSet`.
 * 
 */
public final class GooglePrivacyDlpV2InspectionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InspectionRuleArgs Empty = new GooglePrivacyDlpV2InspectionRuleArgs();

    /**
     * Exclusion rule.
     * 
     */
    @Import(name="exclusionRule")
    private @Nullable Output<GooglePrivacyDlpV2ExclusionRuleArgs> exclusionRule;

    /**
     * @return Exclusion rule.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2ExclusionRuleArgs>> exclusionRule() {
        return Optional.ofNullable(this.exclusionRule);
    }

    /**
     * Hotword-based detection rule.
     * 
     */
    @Import(name="hotwordRule")
    private @Nullable Output<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule;

    /**
     * @return Hotword-based detection rule.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2HotwordRuleArgs>> hotwordRule() {
        return Optional.ofNullable(this.hotwordRule);
    }

    private GooglePrivacyDlpV2InspectionRuleArgs() {}

    private GooglePrivacyDlpV2InspectionRuleArgs(GooglePrivacyDlpV2InspectionRuleArgs $) {
        this.exclusionRule = $.exclusionRule;
        this.hotwordRule = $.hotwordRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InspectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InspectionRuleArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InspectionRuleArgs();
        }

        public Builder(GooglePrivacyDlpV2InspectionRuleArgs defaults) {
            $ = new GooglePrivacyDlpV2InspectionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusionRule Exclusion rule.
         * 
         * @return builder
         * 
         */
        public Builder exclusionRule(@Nullable Output<GooglePrivacyDlpV2ExclusionRuleArgs> exclusionRule) {
            $.exclusionRule = exclusionRule;
            return this;
        }

        /**
         * @param exclusionRule Exclusion rule.
         * 
         * @return builder
         * 
         */
        public Builder exclusionRule(GooglePrivacyDlpV2ExclusionRuleArgs exclusionRule) {
            return exclusionRule(Output.of(exclusionRule));
        }

        /**
         * @param hotwordRule Hotword-based detection rule.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRule(@Nullable Output<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule) {
            $.hotwordRule = hotwordRule;
            return this;
        }

        /**
         * @param hotwordRule Hotword-based detection rule.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRule(GooglePrivacyDlpV2HotwordRuleArgs hotwordRule) {
            return hotwordRule(Output.of(hotwordRule));
        }

        public GooglePrivacyDlpV2InspectionRuleArgs build() {
            return $;
        }
    }

}
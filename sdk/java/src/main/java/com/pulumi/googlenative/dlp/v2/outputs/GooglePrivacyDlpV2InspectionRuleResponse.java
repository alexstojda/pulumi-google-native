// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2ExclusionRuleResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2HotwordRuleResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2InspectionRuleResponse {
    /**
     * @return Exclusion rule.
     * 
     */
    private GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule;
    /**
     * @return Hotword-based detection rule.
     * 
     */
    private GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

    private GooglePrivacyDlpV2InspectionRuleResponse() {}
    /**
     * @return Exclusion rule.
     * 
     */
    public GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule() {
        return this.exclusionRule;
    }
    /**
     * @return Hotword-based detection rule.
     * 
     */
    public GooglePrivacyDlpV2HotwordRuleResponse hotwordRule() {
        return this.hotwordRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectionRuleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule;
        private GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2InspectionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusionRule = defaults.exclusionRule;
    	      this.hotwordRule = defaults.hotwordRule;
        }

        @CustomType.Setter
        public Builder exclusionRule(GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule) {
            this.exclusionRule = Objects.requireNonNull(exclusionRule);
            return this;
        }
        @CustomType.Setter
        public Builder hotwordRule(GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
            this.hotwordRule = Objects.requireNonNull(hotwordRule);
            return this;
        }
        public GooglePrivacyDlpV2InspectionRuleResponse build() {
            final var o = new GooglePrivacyDlpV2InspectionRuleResponse();
            o.exclusionRule = exclusionRule;
            o.hotwordRule = hotwordRule;
            return o;
        }
    }
}
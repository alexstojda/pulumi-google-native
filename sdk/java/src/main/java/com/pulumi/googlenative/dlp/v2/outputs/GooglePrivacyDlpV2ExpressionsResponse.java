// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2ConditionsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ExpressionsResponse {
    /**
     * @return Conditions to apply to the expression.
     * 
     */
    private GooglePrivacyDlpV2ConditionsResponse conditions;
    /**
     * @return The operator to apply to the result of conditions. Default and currently only supported value is `AND`.
     * 
     */
    private String logicalOperator;

    private GooglePrivacyDlpV2ExpressionsResponse() {}
    /**
     * @return Conditions to apply to the expression.
     * 
     */
    public GooglePrivacyDlpV2ConditionsResponse conditions() {
        return this.conditions;
    }
    /**
     * @return The operator to apply to the result of conditions. Default and currently only supported value is `AND`.
     * 
     */
    public String logicalOperator() {
        return this.logicalOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExpressionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GooglePrivacyDlpV2ConditionsResponse conditions;
        private String logicalOperator;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2ExpressionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.logicalOperator = defaults.logicalOperator;
        }

        @CustomType.Setter
        public Builder conditions(GooglePrivacyDlpV2ConditionsResponse conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        @CustomType.Setter
        public Builder logicalOperator(String logicalOperator) {
            this.logicalOperator = Objects.requireNonNull(logicalOperator);
            return this;
        }
        public GooglePrivacyDlpV2ExpressionsResponse build() {
            final var o = new GooglePrivacyDlpV2ExpressionsResponse();
            o.conditions = conditions;
            o.logicalOperator = logicalOperator;
            return o;
        }
    }
}
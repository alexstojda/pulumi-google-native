// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca.v1beta1.outputs.ReusableConfigValuesResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReusableConfigWrapperResponse {
    /**
     * @return A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    private String reusableConfig;
    /**
     * @return A user-specified inline ReusableConfigValues.
     * 
     */
    private ReusableConfigValuesResponse reusableConfigValues;

    private ReusableConfigWrapperResponse() {}
    /**
     * @return A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    public String reusableConfig() {
        return this.reusableConfig;
    }
    /**
     * @return A user-specified inline ReusableConfigValues.
     * 
     */
    public ReusableConfigValuesResponse reusableConfigValues() {
        return this.reusableConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigWrapperResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String reusableConfig;
        private ReusableConfigValuesResponse reusableConfigValues;
        public Builder() {}
        public Builder(ReusableConfigWrapperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.reusableConfigValues = defaults.reusableConfigValues;
        }

        @CustomType.Setter
        public Builder reusableConfig(String reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }
        @CustomType.Setter
        public Builder reusableConfigValues(ReusableConfigValuesResponse reusableConfigValues) {
            this.reusableConfigValues = Objects.requireNonNull(reusableConfigValues);
            return this;
        }
        public ReusableConfigWrapperResponse build() {
            final var o = new ReusableConfigWrapperResponse();
            o.reusableConfig = reusableConfig;
            o.reusableConfigValues = reusableConfigValues;
            return o;
        }
    }
}
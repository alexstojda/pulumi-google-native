// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardFilterResponse {
    /**
     * @return The specified filter type
     * 
     */
    private String filterType;
    /**
     * @return The key for the label
     * 
     */
    private String labelKey;
    /**
     * @return A variable-length string value.
     * 
     */
    private String stringValue;
    /**
     * @return The placeholder text that can be referenced in a filter string or MQL query. If omitted, the dashboard filter will be applied to all relevant widgets in the dashboard.
     * 
     */
    private String templateVariable;

    private DashboardFilterResponse() {}
    /**
     * @return The specified filter type
     * 
     */
    public String filterType() {
        return this.filterType;
    }
    /**
     * @return The key for the label
     * 
     */
    public String labelKey() {
        return this.labelKey;
    }
    /**
     * @return A variable-length string value.
     * 
     */
    public String stringValue() {
        return this.stringValue;
    }
    /**
     * @return The placeholder text that can be referenced in a filter string or MQL query. If omitted, the dashboard filter will be applied to all relevant widgets in the dashboard.
     * 
     */
    public String templateVariable() {
        return this.templateVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardFilterResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filterType;
        private String labelKey;
        private String stringValue;
        private String templateVariable;
        public Builder() {}
        public Builder(DashboardFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.labelKey = defaults.labelKey;
    	      this.stringValue = defaults.stringValue;
    	      this.templateVariable = defaults.templateVariable;
        }

        @CustomType.Setter
        public Builder filterType(String filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }
        @CustomType.Setter
        public Builder labelKey(String labelKey) {
            this.labelKey = Objects.requireNonNull(labelKey);
            return this;
        }
        @CustomType.Setter
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        @CustomType.Setter
        public Builder templateVariable(String templateVariable) {
            this.templateVariable = Objects.requireNonNull(templateVariable);
            return this;
        }
        public DashboardFilterResponse build() {
            final var o = new DashboardFilterResponse();
            o.filterType = filterType;
            o.labelKey = labelKey;
            o.stringValue = stringValue;
            o.templateVariable = templateVariable;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SortOptionsResponse {
    /**
     * @return The name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    private String operatorName;
    /**
     * @return Ascending is the default sort order
     * 
     */
    private String sortOrder;

    private SortOptionsResponse() {}
    /**
     * @return The name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    public String operatorName() {
        return this.operatorName;
    }
    /**
     * @return Ascending is the default sort order
     * 
     */
    public String sortOrder() {
        return this.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SortOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operatorName;
        private String sortOrder;
        public Builder() {}
        public Builder(SortOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorName = defaults.operatorName;
    	      this.sortOrder = defaults.sortOrder;
        }

        @CustomType.Setter
        public Builder operatorName(String operatorName) {
            this.operatorName = Objects.requireNonNull(operatorName);
            return this;
        }
        @CustomType.Setter
        public Builder sortOrder(String sortOrder) {
            this.sortOrder = Objects.requireNonNull(sortOrder);
            return this;
        }
        public SortOptionsResponse build() {
            final var o = new SortOptionsResponse();
            o.operatorName = operatorName;
            o.sortOrder = sortOrder;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery.v2.outputs.TableReferenceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloneDefinitionResponse {
    /**
     * @return [Required] Reference describing the ID of the table that was cloned.
     * 
     */
    private TableReferenceResponse baseTableReference;
    /**
     * @return [Required] The time at which the base table was cloned. This value is reported in the JSON response using RFC3339 format.
     * 
     */
    private String cloneTime;

    private CloneDefinitionResponse() {}
    /**
     * @return [Required] Reference describing the ID of the table that was cloned.
     * 
     */
    public TableReferenceResponse baseTableReference() {
        return this.baseTableReference;
    }
    /**
     * @return [Required] The time at which the base table was cloned. This value is reported in the JSON response using RFC3339 format.
     * 
     */
    public String cloneTime() {
        return this.cloneTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneDefinitionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private TableReferenceResponse baseTableReference;
        private String cloneTime;
        public Builder() {}
        public Builder(CloneDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseTableReference = defaults.baseTableReference;
    	      this.cloneTime = defaults.cloneTime;
        }

        @CustomType.Setter
        public Builder baseTableReference(TableReferenceResponse baseTableReference) {
            this.baseTableReference = Objects.requireNonNull(baseTableReference);
            return this;
        }
        @CustomType.Setter
        public Builder cloneTime(String cloneTime) {
            this.cloneTime = Objects.requireNonNull(cloneTime);
            return this;
        }
        public CloneDefinitionResponse build() {
            final var o = new CloneDefinitionResponse();
            o.baseTableReference = baseTableReference;
            o.cloneTime = cloneTime;
            return o;
        }
    }
}
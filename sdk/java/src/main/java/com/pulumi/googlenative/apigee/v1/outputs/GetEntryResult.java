// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEntryResult {
    /**
     * @return Resource URI that can be used to identify the scope of the key value map entries.
     * 
     */
    private String name;
    /**
     * @return Data or payload that is being retrieved and associated with the unique key.
     * 
     */
    private String value;

    private GetEntryResult() {}
    /**
     * @return Resource URI that can be used to identify the scope of the key value map entries.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Data or payload that is being retrieved and associated with the unique key.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetEntryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetEntryResult build() {
            final var o = new GetEntryResult();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KeyValueResponse {
    /**
     * @return The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    private String key;
    /**
     * @return The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    private String value;

    private KeyValueResponse() {}
    /**
     * @return The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValueResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(KeyValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public KeyValueResponse build() {
            final var o = new KeyValueResponse();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
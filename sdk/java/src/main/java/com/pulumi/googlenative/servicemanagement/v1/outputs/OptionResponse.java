// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class OptionResponse {
    /**
     * @return The option&#39;s name. For protobuf built-in options (options defined in descriptor.proto), this is the short name. For example, `&#34;map_entry&#34;`. For custom options, it should be the fully-qualified name. For example, `&#34;google.api.http&#34;`.
     * 
     */
    private String name;
    /**
     * @return The option&#39;s value packed in an Any message. If the value is a primitive, the corresponding wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum, it should be stored as an int32 value using the google.protobuf.Int32Value type.
     * 
     */
    private Map<String,String> value;

    private OptionResponse() {}
    /**
     * @return The option&#39;s name. For protobuf built-in options (options defined in descriptor.proto), this is the short name. For example, `&#34;map_entry&#34;`. For custom options, it should be the fully-qualified name. For example, `&#34;google.api.http&#34;`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The option&#39;s value packed in an Any message. If the value is a primitive, the corresponding wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum, it should be stored as an int32 value using the google.protobuf.Int32Value type.
     * 
     */
    public Map<String,String> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Map<String,String> value;
        public Builder() {}
        public Builder(OptionResponse defaults) {
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
        public Builder value(Map<String,String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public OptionResponse build() {
            final var o = new OptionResponse();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaResponse {
    /**
     * @return Thrift IDL source of the schema.
     * 
     */
    private String text;

    private GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaResponse() {}
    /**
     * @return Thrift IDL source of the schema.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String text;
        public Builder() {}
        public Builder(GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaResponse build() {
            final var o = new GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaResponse();
            o.text = text;
            return o;
        }
    }
}
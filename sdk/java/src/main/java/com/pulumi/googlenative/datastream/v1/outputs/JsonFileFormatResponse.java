// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JsonFileFormatResponse {
    /**
     * @return Compression of the loaded JSON file.
     * 
     */
    private String compression;
    /**
     * @return The schema file format along JSON data files.
     * 
     */
    private String schemaFileFormat;

    private JsonFileFormatResponse() {}
    /**
     * @return Compression of the loaded JSON file.
     * 
     */
    public String compression() {
        return this.compression;
    }
    /**
     * @return The schema file format along JSON data files.
     * 
     */
    public String schemaFileFormat() {
        return this.schemaFileFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFileFormatResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String compression;
        private String schemaFileFormat;
        public Builder() {}
        public Builder(JsonFileFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.schemaFileFormat = defaults.schemaFileFormat;
        }

        @CustomType.Setter
        public Builder compression(String compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }
        @CustomType.Setter
        public Builder schemaFileFormat(String schemaFileFormat) {
            this.schemaFileFormat = Objects.requireNonNull(schemaFileFormat);
            return this;
        }
        public JsonFileFormatResponse build() {
            final var o = new JsonFileFormatResponse();
            o.compression = compression;
            o.schemaFileFormat = schemaFileFormat;
            return o;
        }
    }
}
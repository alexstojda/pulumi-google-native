// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse {
    /**
     * @return Paths of the imported libraries.
     * 
     */
    private List<String> importedLibraries;

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse() {}
    /**
     * @return Paths of the imported libraries.
     * 
     */
    public List<String> importedLibraries() {
        return this.importedLibraries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> importedLibraries;
        public Builder() {}
        public Builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importedLibraries = defaults.importedLibraries;
        }

        @CustomType.Setter
        public Builder importedLibraries(List<String> importedLibraries) {
            this.importedLibraries = Objects.requireNonNull(importedLibraries);
            return this;
        }
        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }
        public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse build() {
            final var o = new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse();
            o.importedLibraries = importedLibraries;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetadataExportResponse {
    /**
     * @return The type of the database dump.
     * 
     */
    private String databaseDumpType;
    /**
     * @return A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
     */
    private String destinationGcsUri;
    /**
     * @return The time when the export ended.
     * 
     */
    private String endTime;
    /**
     * @return The time when the export started.
     * 
     */
    private String startTime;
    /**
     * @return The current state of the export.
     * 
     */
    private String state;

    private MetadataExportResponse() {}
    /**
     * @return The type of the database dump.
     * 
     */
    public String databaseDumpType() {
        return this.databaseDumpType;
    }
    /**
     * @return A Cloud Storage URI of a folder that metadata are exported to, in the form of gs:////, where is automatically generated.
     * 
     */
    public String destinationGcsUri() {
        return this.destinationGcsUri;
    }
    /**
     * @return The time when the export ended.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The time when the export started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The current state of the export.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataExportResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseDumpType;
        private String destinationGcsUri;
        private String endTime;
        private String startTime;
        private String state;
        public Builder() {}
        public Builder(MetadataExportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseDumpType = defaults.databaseDumpType;
    	      this.destinationGcsUri = defaults.destinationGcsUri;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder databaseDumpType(String databaseDumpType) {
            this.databaseDumpType = Objects.requireNonNull(databaseDumpType);
            return this;
        }
        @CustomType.Setter
        public Builder destinationGcsUri(String destinationGcsUri) {
            this.destinationGcsUri = Objects.requireNonNull(destinationGcsUri);
            return this;
        }
        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public MetadataExportResponse build() {
            final var o = new MetadataExportResponse();
            o.databaseDumpType = databaseDumpType;
            o.destinationGcsUri = destinationGcsUri;
            o.endTime = endTime;
            o.startTime = startTime;
            o.state = state;
            return o;
        }
    }
}
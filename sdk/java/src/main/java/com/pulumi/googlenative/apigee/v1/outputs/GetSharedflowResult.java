// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1EntityMetadataResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSharedflowResult {
    /**
     * @return The id of the most recently created revision for this shared flow.
     * 
     */
    private String latestRevisionId;
    /**
     * @return Metadata describing the shared flow.
     * 
     */
    private GoogleCloudApigeeV1EntityMetadataResponse metaData;
    /**
     * @return The ID of the shared flow.
     * 
     */
    private String name;
    /**
     * @return A list of revisions of this shared flow.
     * 
     */
    private List<String> revision;

    private GetSharedflowResult() {}
    /**
     * @return The id of the most recently created revision for this shared flow.
     * 
     */
    public String latestRevisionId() {
        return this.latestRevisionId;
    }
    /**
     * @return Metadata describing the shared flow.
     * 
     */
    public GoogleCloudApigeeV1EntityMetadataResponse metaData() {
        return this.metaData;
    }
    /**
     * @return The ID of the shared flow.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of revisions of this shared flow.
     * 
     */
    public List<String> revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedflowResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String latestRevisionId;
        private GoogleCloudApigeeV1EntityMetadataResponse metaData;
        private String name;
        private List<String> revision;
        public Builder() {}
        public Builder(GetSharedflowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevisionId = defaults.latestRevisionId;
    	      this.metaData = defaults.metaData;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        @CustomType.Setter
        public Builder latestRevisionId(String latestRevisionId) {
            this.latestRevisionId = Objects.requireNonNull(latestRevisionId);
            return this;
        }
        @CustomType.Setter
        public Builder metaData(GoogleCloudApigeeV1EntityMetadataResponse metaData) {
            this.metaData = Objects.requireNonNull(metaData);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder revision(List<String> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder revision(String... revision) {
            return revision(List.of(revision));
        }
        public GetSharedflowResult build() {
            final var o = new GetSharedflowResult();
            o.latestRevisionId = latestRevisionId;
            o.metaData = metaData;
            o.name = name;
            o.revision = revision;
            return o;
        }
    }
}
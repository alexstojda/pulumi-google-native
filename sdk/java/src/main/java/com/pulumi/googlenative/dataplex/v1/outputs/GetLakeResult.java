// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1AssetStatusResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1LakeMetastoreResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1LakeMetastoreStatusResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLakeResult {
    /**
     * @return Aggregated status of the underlying assets of the lake.
     * 
     */
    private GoogleCloudDataplexV1AssetStatusResponse assetStatus;
    /**
     * @return The time when the lake was created.
     * 
     */
    private String createTime;
    /**
     * @return Optional. Description of the lake.
     * 
     */
    private String description;
    /**
     * @return Optional. User friendly display name.
     * 
     */
    private String displayName;
    /**
     * @return Optional. User-defined labels for the lake.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Optional. Settings to manage lake and Dataproc Metastore service instance association.
     * 
     */
    private GoogleCloudDataplexV1LakeMetastoreResponse metastore;
    /**
     * @return Metastore status of the lake.
     * 
     */
    private GoogleCloudDataplexV1LakeMetastoreStatusResponse metastoreStatus;
    /**
     * @return The relative resource name of the lake, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}.
     * 
     */
    private String name;
    /**
     * @return Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
     * 
     */
    private String serviceAccount;
    /**
     * @return Current state of the lake.
     * 
     */
    private String state;
    /**
     * @return System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
     * 
     */
    private String uid;
    /**
     * @return The time when the lake was last updated.
     * 
     */
    private String updateTime;

    private GetLakeResult() {}
    /**
     * @return Aggregated status of the underlying assets of the lake.
     * 
     */
    public GoogleCloudDataplexV1AssetStatusResponse assetStatus() {
        return this.assetStatus;
    }
    /**
     * @return The time when the lake was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Description of the lake.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. User friendly display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. User-defined labels for the lake.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Optional. Settings to manage lake and Dataproc Metastore service instance association.
     * 
     */
    public GoogleCloudDataplexV1LakeMetastoreResponse metastore() {
        return this.metastore;
    }
    /**
     * @return Metastore status of the lake.
     * 
     */
    public GoogleCloudDataplexV1LakeMetastoreStatusResponse metastoreStatus() {
        return this.metastoreStatus;
    }
    /**
     * @return The relative resource name of the lake, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Current state of the lake.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The time when the lake was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLakeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudDataplexV1AssetStatusResponse assetStatus;
        private String createTime;
        private String description;
        private String displayName;
        private Map<String,String> labels;
        private GoogleCloudDataplexV1LakeMetastoreResponse metastore;
        private GoogleCloudDataplexV1LakeMetastoreStatusResponse metastoreStatus;
        private String name;
        private String serviceAccount;
        private String state;
        private String uid;
        private String updateTime;
        public Builder() {}
        public Builder(GetLakeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetStatus = defaults.assetStatus;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.metastore = defaults.metastore;
    	      this.metastoreStatus = defaults.metastoreStatus;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder assetStatus(GoogleCloudDataplexV1AssetStatusResponse assetStatus) {
            this.assetStatus = Objects.requireNonNull(assetStatus);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder metastore(GoogleCloudDataplexV1LakeMetastoreResponse metastore) {
            this.metastore = Objects.requireNonNull(metastore);
            return this;
        }
        @CustomType.Setter
        public Builder metastoreStatus(GoogleCloudDataplexV1LakeMetastoreStatusResponse metastoreStatus) {
            this.metastoreStatus = Objects.requireNonNull(metastoreStatus);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetLakeResult build() {
            final var o = new GetLakeResult();
            o.assetStatus = assetStatus;
            o.createTime = createTime;
            o.description = description;
            o.displayName = displayName;
            o.labels = labels;
            o.metastore = metastore;
            o.metastoreStatus = metastoreStatus;
            o.name = name;
            o.serviceAccount = serviceAccount;
            o.state = state;
            o.uid = uid;
            o.updateTime = updateTime;
            return o;
        }
    }
}
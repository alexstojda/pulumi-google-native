// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFederationResult {
    /**
     * @return A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * 
     */
    private Map<String,String> backendMetastores;
    /**
     * @return The time when the metastore federation was created.
     * 
     */
    private String createTime;
    /**
     * @return The federation endpoint.
     * 
     */
    private String endpointUri;
    /**
     * @return User-defined labels for the metastore federation.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Immutable. The relative resource name of the federation, of the form: projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
     * 
     */
    private String name;
    /**
     * @return The current state of the federation.
     * 
     */
    private String state;
    /**
     * @return Additional information about the current state of the metastore federation, if available.
     * 
     */
    private String stateMessage;
    /**
     * @return The globally unique resource identifier of the metastore federation.
     * 
     */
    private String uid;
    /**
     * @return The time when the metastore federation was last updated.
     * 
     */
    private String updateTime;
    /**
     * @return Immutable. The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
     * 
     */
    private String version;

    private GetFederationResult() {}
    /**
     * @return A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
     * 
     */
    public Map<String,String> backendMetastores() {
        return this.backendMetastores;
    }
    /**
     * @return The time when the metastore federation was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The federation endpoint.
     * 
     */
    public String endpointUri() {
        return this.endpointUri;
    }
    /**
     * @return User-defined labels for the metastore federation.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Immutable. The relative resource name of the federation, of the form: projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of the federation.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Additional information about the current state of the metastore federation, if available.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * @return The globally unique resource identifier of the metastore federation.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The time when the metastore federation was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Immutable. The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> backendMetastores;
        private String createTime;
        private String endpointUri;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String stateMessage;
        private String uid;
        private String updateTime;
        private String version;
        public Builder() {}
        public Builder(GetFederationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendMetastores = defaults.backendMetastores;
    	      this.createTime = defaults.createTime;
    	      this.endpointUri = defaults.endpointUri;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder backendMetastores(Map<String,String> backendMetastores) {
            this.backendMetastores = Objects.requireNonNull(backendMetastores);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder endpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
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
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetFederationResult build() {
            final var o = new GetFederationResult();
            o.backendMetastores = backendMetastores;
            o.createTime = createTime;
            o.endpointUri = endpointUri;
            o.labels = labels;
            o.name = name;
            o.state = state;
            o.stateMessage = stateMessage;
            o.uid = uid;
            o.updateTime = updateTime;
            o.version = version;
            return o;
        }
    }
}
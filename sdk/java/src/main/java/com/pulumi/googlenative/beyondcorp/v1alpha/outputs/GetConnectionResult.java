// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.ApplicationEndpointResponse;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.GatewayResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConnectionResult {
    /**
     * @return Address of the remote application endpoint for the BeyondCorp Connection.
     * 
     */
    private ApplicationEndpointResponse applicationEndpoint;
    /**
     * @return Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be associated with this Connection.
     * 
     */
    private List<String> connectors;
    /**
     * @return Timestamp when the resource was created.
     * 
     */
    private String createTime;
    /**
     * @return Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
     * 
     */
    private String displayName;
    /**
     * @return Optional. Gateway used by the connection.
     * 
     */
    private GatewayResponse gateway;
    /**
     * @return Optional. Resource labels to represent user provided metadata.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Unique resource name of the connection. The name is ignored when creating a connection.
     * 
     */
    private String name;
    /**
     * @return The current state of the connection.
     * 
     */
    private String state;
    /**
     * @return The type of network connectivity used by the connection.
     * 
     */
    private String type;
    /**
     * @return A unique identifier for the instance generated by the system.
     * 
     */
    private String uid;
    /**
     * @return Timestamp when the resource was last modified.
     * 
     */
    private String updateTime;

    private GetConnectionResult() {}
    /**
     * @return Address of the remote application endpoint for the BeyondCorp Connection.
     * 
     */
    public ApplicationEndpointResponse applicationEndpoint() {
        return this.applicationEndpoint;
    }
    /**
     * @return Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be associated with this Connection.
     * 
     */
    public List<String> connectors() {
        return this.connectors;
    }
    /**
     * @return Timestamp when the resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. Gateway used by the connection.
     * 
     */
    public GatewayResponse gateway() {
        return this.gateway;
    }
    /**
     * @return Optional. Resource labels to represent user provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Unique resource name of the connection. The name is ignored when creating a connection.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of the connection.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The type of network connectivity used by the connection.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A unique identifier for the instance generated by the system.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return Timestamp when the resource was last modified.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ApplicationEndpointResponse applicationEndpoint;
        private List<String> connectors;
        private String createTime;
        private String displayName;
        private GatewayResponse gateway;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String type;
        private String uid;
        private String updateTime;
        public Builder() {}
        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationEndpoint = defaults.applicationEndpoint;
    	      this.connectors = defaults.connectors;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.gateway = defaults.gateway;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder applicationEndpoint(ApplicationEndpointResponse applicationEndpoint) {
            this.applicationEndpoint = Objects.requireNonNull(applicationEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder connectors(List<String> connectors) {
            this.connectors = Objects.requireNonNull(connectors);
            return this;
        }
        public Builder connectors(String... connectors) {
            return connectors(List.of(connectors));
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder gateway(GatewayResponse gateway) {
            this.gateway = Objects.requireNonNull(gateway);
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
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
        public GetConnectionResult build() {
            final var o = new GetConnectionResult();
            o.applicationEndpoint = applicationEndpoint;
            o.connectors = connectors;
            o.createTime = createTime;
            o.displayName = displayName;
            o.gateway = gateway;
            o.labels = labels;
            o.name = name;
            o.state = state;
            o.type = type;
            o.uid = uid;
            o.updateTime = updateTime;
            return o;
        }
    }
}
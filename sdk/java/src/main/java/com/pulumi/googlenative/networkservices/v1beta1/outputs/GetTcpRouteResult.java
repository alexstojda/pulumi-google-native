// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.TcpRouteRouteRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTcpRouteResult {
    /**
     * @return The timestamp when the resource was created.
     * 
     */
    private String createTime;
    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    private String description;
    /**
     * @return Optional. Gateways defines a list of gateways this TcpRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    private List<String> gateways;
    /**
     * @return Optional. Set of label tags associated with the TcpRoute resource.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/` The attached Mesh should be of a type SIDECAR
     * 
     */
    private List<String> meshes;
    /**
     * @return Name of the TcpRoute resource. It matches pattern `projects/*{@literal /}locations/global/tcpRoutes/tcp_route_name&gt;`.
     * 
     */
    private String name;
    /**
     * @return Rules that define how traffic is routed and handled. At least one RouteRule must be supplied. If there are multiple rules then the action taken will be the first rule to match.
     * 
     */
    private List<TcpRouteRouteRuleResponse> rules;
    /**
     * @return Server-defined URL of this resource
     * 
     */
    private String selfLink;
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    private String updateTime;

    private GetTcpRouteResult() {}
    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Gateways defines a list of gateways this TcpRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    public List<String> gateways() {
        return this.gateways;
    }
    /**
     * @return Optional. Set of label tags associated with the TcpRoute resource.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/` The attached Mesh should be of a type SIDECAR
     * 
     */
    public List<String> meshes() {
        return this.meshes;
    }
    /**
     * @return Name of the TcpRoute resource. It matches pattern `projects/*{@literal /}locations/global/tcpRoutes/tcp_route_name&gt;`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Rules that define how traffic is routed and handled. At least one RouteRule must be supplied. If there are multiple rules then the action taken will be the first rule to match.
     * 
     */
    public List<TcpRouteRouteRuleResponse> rules() {
        return this.rules;
    }
    /**
     * @return Server-defined URL of this resource
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTcpRouteResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private List<String> gateways;
        private Map<String,String> labels;
        private List<String> meshes;
        private String name;
        private List<TcpRouteRouteRuleResponse> rules;
        private String selfLink;
        private String updateTime;
        public Builder() {}
        public Builder(GetTcpRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.gateways = defaults.gateways;
    	      this.labels = defaults.labels;
    	      this.meshes = defaults.meshes;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.updateTime = defaults.updateTime;
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
        public Builder gateways(List<String> gateways) {
            this.gateways = Objects.requireNonNull(gateways);
            return this;
        }
        public Builder gateways(String... gateways) {
            return gateways(List.of(gateways));
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder meshes(List<String> meshes) {
            this.meshes = Objects.requireNonNull(meshes);
            return this;
        }
        public Builder meshes(String... meshes) {
            return meshes(List.of(meshes));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<TcpRouteRouteRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(TcpRouteRouteRuleResponse... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetTcpRouteResult build() {
            final var o = new GetTcpRouteResult();
            o.createTime = createTime;
            o.description = description;
            o.gateways = gateways;
            o.labels = labels;
            o.meshes = meshes;
            o.name = name;
            o.rules = rules;
            o.selfLink = selfLink;
            o.updateTime = updateTime;
            return o;
        }
    }
}
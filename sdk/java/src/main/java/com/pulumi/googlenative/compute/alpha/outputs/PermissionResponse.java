// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.PermissionConstraintResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PermissionResponse {
    /**
     * @return Extra custom constraints. The constraints are ANDed together.
     * 
     */
    private List<PermissionConstraintResponse> constraints;
    /**
     * @return Used in Ingress or Egress Gateway cases to specify hosts that the policy applies to. Exact match, prefix match, and suffix match are supported.
     * 
     */
    private List<String> hosts;
    /**
     * @return HTTP method.
     * 
     */
    private List<String> methods;
    /**
     * @return Negate of hosts. Specifies exclusions.
     * 
     */
    private List<String> notHosts;
    /**
     * @return Negate of methods. Specifies exclusions.
     * 
     */
    private List<String> notMethods;
    /**
     * @return Negate of paths. Specifies exclusions.
     * 
     */
    private List<String> notPaths;
    /**
     * @return Negate of ports. Specifies exclusions.
     * 
     */
    private List<String> notPorts;
    /**
     * @return HTTP request paths or gRPC methods. Exact match, prefix match, and suffix match are supported.
     * 
     */
    private List<String> paths;
    /**
     * @return Port names or numbers.
     * 
     */
    private List<String> ports;

    private PermissionResponse() {}
    /**
     * @return Extra custom constraints. The constraints are ANDed together.
     * 
     */
    public List<PermissionConstraintResponse> constraints() {
        return this.constraints;
    }
    /**
     * @return Used in Ingress or Egress Gateway cases to specify hosts that the policy applies to. Exact match, prefix match, and suffix match are supported.
     * 
     */
    public List<String> hosts() {
        return this.hosts;
    }
    /**
     * @return HTTP method.
     * 
     */
    public List<String> methods() {
        return this.methods;
    }
    /**
     * @return Negate of hosts. Specifies exclusions.
     * 
     */
    public List<String> notHosts() {
        return this.notHosts;
    }
    /**
     * @return Negate of methods. Specifies exclusions.
     * 
     */
    public List<String> notMethods() {
        return this.notMethods;
    }
    /**
     * @return Negate of paths. Specifies exclusions.
     * 
     */
    public List<String> notPaths() {
        return this.notPaths;
    }
    /**
     * @return Negate of ports. Specifies exclusions.
     * 
     */
    public List<String> notPorts() {
        return this.notPorts;
    }
    /**
     * @return HTTP request paths or gRPC methods. Exact match, prefix match, and suffix match are supported.
     * 
     */
    public List<String> paths() {
        return this.paths;
    }
    /**
     * @return Port names or numbers.
     * 
     */
    public List<String> ports() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PermissionConstraintResponse> constraints;
        private List<String> hosts;
        private List<String> methods;
        private List<String> notHosts;
        private List<String> notMethods;
        private List<String> notPaths;
        private List<String> notPorts;
        private List<String> paths;
        private List<String> ports;
        public Builder() {}
        public Builder(PermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
    	      this.hosts = defaults.hosts;
    	      this.methods = defaults.methods;
    	      this.notHosts = defaults.notHosts;
    	      this.notMethods = defaults.notMethods;
    	      this.notPaths = defaults.notPaths;
    	      this.notPorts = defaults.notPorts;
    	      this.paths = defaults.paths;
    	      this.ports = defaults.ports;
        }

        @CustomType.Setter
        public Builder constraints(List<PermissionConstraintResponse> constraints) {
            this.constraints = Objects.requireNonNull(constraints);
            return this;
        }
        public Builder constraints(PermissionConstraintResponse... constraints) {
            return constraints(List.of(constraints));
        }
        @CustomType.Setter
        public Builder hosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        @CustomType.Setter
        public Builder methods(List<String> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        @CustomType.Setter
        public Builder notHosts(List<String> notHosts) {
            this.notHosts = Objects.requireNonNull(notHosts);
            return this;
        }
        public Builder notHosts(String... notHosts) {
            return notHosts(List.of(notHosts));
        }
        @CustomType.Setter
        public Builder notMethods(List<String> notMethods) {
            this.notMethods = Objects.requireNonNull(notMethods);
            return this;
        }
        public Builder notMethods(String... notMethods) {
            return notMethods(List.of(notMethods));
        }
        @CustomType.Setter
        public Builder notPaths(List<String> notPaths) {
            this.notPaths = Objects.requireNonNull(notPaths);
            return this;
        }
        public Builder notPaths(String... notPaths) {
            return notPaths(List.of(notPaths));
        }
        @CustomType.Setter
        public Builder notPorts(List<String> notPorts) {
            this.notPorts = Objects.requireNonNull(notPorts);
            return this;
        }
        public Builder notPorts(String... notPorts) {
            return notPorts(List.of(notPorts));
        }
        @CustomType.Setter
        public Builder paths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder ports(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }
        public PermissionResponse build() {
            final var o = new PermissionResponse();
            o.constraints = constraints;
            o.hosts = hosts;
            o.methods = methods;
            o.notHosts = notHosts;
            o.notMethods = notMethods;
            o.notPaths = notPaths;
            o.notPorts = notPorts;
            o.paths = paths;
            o.ports = ports;
            return o;
        }
    }
}
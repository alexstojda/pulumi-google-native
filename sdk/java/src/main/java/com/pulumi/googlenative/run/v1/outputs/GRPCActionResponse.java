// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GRPCActionResponse {
    /**
     * @return Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    private Integer port;
    /**
     * @return Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    private String service;

    private GRPCActionResponse() {}
    /**
     * @return Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GRPCActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String service;
        public Builder() {}
        public Builder(GRPCActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GRPCActionResponse build() {
            final var o = new GRPCActionResponse();
            o.port = port;
            o.service = service;
            return o;
        }
    }
}
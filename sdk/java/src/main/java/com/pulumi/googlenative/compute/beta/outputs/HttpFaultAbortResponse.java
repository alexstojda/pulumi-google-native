// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HttpFaultAbortResponse {
    /**
     * @return The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    private Integer httpStatus;
    /**
     * @return The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    private Double percentage;

    private HttpFaultAbortResponse() {}
    /**
     * @return The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    public Integer httpStatus() {
        return this.httpStatus;
    }
    /**
     * @return The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    public Double percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultAbortResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer httpStatus;
        private Double percentage;
        public Builder() {}
        public Builder(HttpFaultAbortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder httpStatus(Integer httpStatus) {
            this.httpStatus = Objects.requireNonNull(httpStatus);
            return this;
        }
        @CustomType.Setter
        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public HttpFaultAbortResponse build() {
            final var o = new HttpFaultAbortResponse();
            o.httpStatus = httpStatus;
            o.percentage = percentage;
            return o;
        }
    }
}
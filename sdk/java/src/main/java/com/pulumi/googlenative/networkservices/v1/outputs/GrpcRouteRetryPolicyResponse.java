// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GrpcRouteRetryPolicyResponse {
    /**
     * @return Specifies the allowed number of retries. This number must be &gt; 0. If not specpfied, default to 1.
     * 
     */
    private Integer numRetries;
    /**
     * @return - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    private List<String> retryConditions;

    private GrpcRouteRetryPolicyResponse() {}
    /**
     * @return Specifies the allowed number of retries. This number must be &gt; 0. If not specpfied, default to 1.
     * 
     */
    public Integer numRetries() {
        return this.numRetries;
    }
    /**
     * @return - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    public List<String> retryConditions() {
        return this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteRetryPolicyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer numRetries;
        private List<String> retryConditions;
        public Builder() {}
        public Builder(GrpcRouteRetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.retryConditions = defaults.retryConditions;
        }

        @CustomType.Setter
        public Builder numRetries(Integer numRetries) {
            this.numRetries = Objects.requireNonNull(numRetries);
            return this;
        }
        @CustomType.Setter
        public Builder retryConditions(List<String> retryConditions) {
            this.retryConditions = Objects.requireNonNull(retryConditions);
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }
        public GrpcRouteRetryPolicyResponse build() {
            final var o = new GrpcRouteRetryPolicyResponse();
            o.numRetries = numRetries;
            o.retryConditions = retryConditions;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.accesscontextmanager.v1.outputs.MethodSelectorResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApiOperationResponse {
    /**
     * @return API methods or permissions to allow. Method or permission must belong to the service specified by `service_name` field. A single MethodSelector entry with `*` specified for the `method` field will allow all methods AND permissions for the service specified in `service_name`.
     * 
     */
    private List<MethodSelectorResponse> methodSelectors;
    /**
     * @return The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    private String serviceName;

    private ApiOperationResponse() {}
    /**
     * @return API methods or permissions to allow. Method or permission must belong to the service specified by `service_name` field. A single MethodSelector entry with `*` specified for the `method` field will allow all methods AND permissions for the service specified in `service_name`.
     * 
     */
    public List<MethodSelectorResponse> methodSelectors() {
        return this.methodSelectors;
    }
    /**
     * @return The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<MethodSelectorResponse> methodSelectors;
        private String serviceName;
        public Builder() {}
        public Builder(ApiOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder methodSelectors(List<MethodSelectorResponse> methodSelectors) {
            this.methodSelectors = Objects.requireNonNull(methodSelectors);
            return this;
        }
        public Builder methodSelectors(MethodSelectorResponse... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public ApiOperationResponse build() {
            final var o = new ApiOperationResponse();
            o.methodSelectors = methodSelectors;
            o.serviceName = serviceName;
            return o;
        }
    }
}
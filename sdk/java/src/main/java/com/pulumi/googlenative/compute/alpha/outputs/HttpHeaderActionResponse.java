// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.HttpHeaderOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpHeaderActionResponse {
    /**
     * @return Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    private List<HttpHeaderOptionResponse> requestHeadersToAdd;
    /**
     * @return A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    private List<String> requestHeadersToRemove;
    /**
     * @return Headers to add the response before sending the response back to the client.
     * 
     */
    private List<HttpHeaderOptionResponse> responseHeadersToAdd;
    /**
     * @return A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    private List<String> responseHeadersToRemove;

    private HttpHeaderActionResponse() {}
    /**
     * @return Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    public List<HttpHeaderOptionResponse> requestHeadersToAdd() {
        return this.requestHeadersToAdd;
    }
    /**
     * @return A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    public List<String> requestHeadersToRemove() {
        return this.requestHeadersToRemove;
    }
    /**
     * @return Headers to add the response before sending the response back to the client.
     * 
     */
    public List<HttpHeaderOptionResponse> responseHeadersToAdd() {
        return this.responseHeadersToAdd;
    }
    /**
     * @return A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    public List<String> responseHeadersToRemove() {
        return this.responseHeadersToRemove;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<HttpHeaderOptionResponse> requestHeadersToAdd;
        private List<String> requestHeadersToRemove;
        private List<HttpHeaderOptionResponse> responseHeadersToAdd;
        private List<String> responseHeadersToRemove;
        public Builder() {}
        public Builder(HttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdd = defaults.requestHeadersToAdd;
    	      this.requestHeadersToRemove = defaults.requestHeadersToRemove;
    	      this.responseHeadersToAdd = defaults.responseHeadersToAdd;
    	      this.responseHeadersToRemove = defaults.responseHeadersToRemove;
        }

        @CustomType.Setter
        public Builder requestHeadersToAdd(List<HttpHeaderOptionResponse> requestHeadersToAdd) {
            this.requestHeadersToAdd = Objects.requireNonNull(requestHeadersToAdd);
            return this;
        }
        public Builder requestHeadersToAdd(HttpHeaderOptionResponse... requestHeadersToAdd) {
            return requestHeadersToAdd(List.of(requestHeadersToAdd));
        }
        @CustomType.Setter
        public Builder requestHeadersToRemove(List<String> requestHeadersToRemove) {
            this.requestHeadersToRemove = Objects.requireNonNull(requestHeadersToRemove);
            return this;
        }
        public Builder requestHeadersToRemove(String... requestHeadersToRemove) {
            return requestHeadersToRemove(List.of(requestHeadersToRemove));
        }
        @CustomType.Setter
        public Builder responseHeadersToAdd(List<HttpHeaderOptionResponse> responseHeadersToAdd) {
            this.responseHeadersToAdd = Objects.requireNonNull(responseHeadersToAdd);
            return this;
        }
        public Builder responseHeadersToAdd(HttpHeaderOptionResponse... responseHeadersToAdd) {
            return responseHeadersToAdd(List.of(responseHeadersToAdd));
        }
        @CustomType.Setter
        public Builder responseHeadersToRemove(List<String> responseHeadersToRemove) {
            this.responseHeadersToRemove = Objects.requireNonNull(responseHeadersToRemove);
            return this;
        }
        public Builder responseHeadersToRemove(String... responseHeadersToRemove) {
            return responseHeadersToRemove(List.of(responseHeadersToRemove));
        }
        public HttpHeaderActionResponse build() {
            final var o = new HttpHeaderActionResponse();
            o.requestHeadersToAdd = requestHeadersToAdd;
            o.requestHeadersToRemove = requestHeadersToRemove;
            o.responseHeadersToAdd = responseHeadersToAdd;
            o.responseHeadersToRemove = responseHeadersToRemove;
            return o;
        }
    }
}
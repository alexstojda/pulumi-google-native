// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketCorsItemResponse {
    /**
     * @return The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses.
     * 
     */
    private Integer maxAgeSeconds;
    /**
     * @return The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
     * 
     */
    private List<String> method;
    /**
     * @return The list of Origins eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
     * 
     */
    private List<String> origin;
    /**
     * @return The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains.
     * 
     */
    private List<String> responseHeader;

    private BucketCorsItemResponse() {}
    /**
     * @return The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses.
     * 
     */
    public Integer maxAgeSeconds() {
        return this.maxAgeSeconds;
    }
    /**
     * @return The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
     * 
     */
    public List<String> method() {
        return this.method;
    }
    /**
     * @return The list of Origins eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
     * 
     */
    public List<String> origin() {
        return this.origin;
    }
    /**
     * @return The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains.
     * 
     */
    public List<String> responseHeader() {
        return this.responseHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsItemResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxAgeSeconds;
        private List<String> method;
        private List<String> origin;
        private List<String> responseHeader;
        public Builder() {}
        public Builder(BucketCorsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.method = defaults.method;
    	      this.origin = defaults.origin;
    	      this.responseHeader = defaults.responseHeader;
        }

        @CustomType.Setter
        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            this.maxAgeSeconds = Objects.requireNonNull(maxAgeSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder method(List<String> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder method(String... method) {
            return method(List.of(method));
        }
        @CustomType.Setter
        public Builder origin(List<String> origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        public Builder origin(String... origin) {
            return origin(List.of(origin));
        }
        @CustomType.Setter
        public Builder responseHeader(List<String> responseHeader) {
            this.responseHeader = Objects.requireNonNull(responseHeader);
            return this;
        }
        public Builder responseHeader(String... responseHeader) {
            return responseHeader(List.of(responseHeader));
        }
        public BucketCorsItemResponse build() {
            final var o = new BucketCorsItemResponse();
            o.maxAgeSeconds = maxAgeSeconds;
            o.method = method;
            o.origin = origin;
            o.responseHeader = responseHeader;
            return o;
        }
    }
}
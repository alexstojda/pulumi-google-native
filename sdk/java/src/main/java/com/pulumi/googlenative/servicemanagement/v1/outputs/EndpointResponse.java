// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EndpointResponse {
    /**
     * @return Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
     * 
     */
    private Boolean allowCors;
    /**
     * @return The canonical name of this endpoint.
     * 
     */
    private String name;
    /**
     * @return The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid IPv4 address or a fully-qualified domain name. For example, &#34;8.8.8.8&#34; or &#34;myservice.appspot.com&#34;.
     * 
     */
    private String target;

    private EndpointResponse() {}
    /**
     * @return Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
     * 
     */
    public Boolean allowCors() {
        return this.allowCors;
    }
    /**
     * @return The canonical name of this endpoint.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid IPv4 address or a fully-qualified domain name. For example, &#34;8.8.8.8&#34; or &#34;myservice.appspot.com&#34;.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowCors;
        private String name;
        private String target;
        public Builder() {}
        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCors = defaults.allowCors;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder allowCors(Boolean allowCors) {
            this.allowCors = Objects.requireNonNull(allowCors);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public EndpointResponse build() {
            final var o = new EndpointResponse();
            o.allowCors = allowCors;
            o.name = name;
            o.target = target;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebhookConfigResponse {
    /**
     * @return Resource name for the secret required as a URL parameter.
     * 
     */
    private String secret;
    /**
     * @return Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests.
     * 
     */
    private String state;

    private WebhookConfigResponse() {}
    /**
     * @return Resource name for the secret required as a URL parameter.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secret;
        private String state;
        public Builder() {}
        public Builder(WebhookConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public WebhookConfigResponse build() {
            final var o = new WebhookConfigResponse();
            o.secret = secret;
            o.state = state;
            return o;
        }
    }
}
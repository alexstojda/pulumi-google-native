// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.pubsub.v1.outputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class PushConfigResponse {
    /**
     * @return Endpoint configuration attributes that can be used to control different aspects of the message delivery. The only currently supported attribute is `x-goog-version`, which you can use to change the format of the pushed message. This attribute indicates the version of the data expected by the endpoint. This controls the shape of the pushed message (i.e., its fields and metadata). If not present during the `CreateSubscription` call, it will default to the version of the Pub/Sub API used to make such call. If not present in a `ModifyPushConfig` call, its value will not be changed. `GetSubscription` calls will always return a valid version, even if the subscription was created without this attribute. The only supported values for the `x-goog-version` attribute are: * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API. * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API. For example: attributes { &#34;x-goog-version&#34;: &#34;v1&#34; }
     * 
     */
    private Map<String,String> attributes;
    /**
     * @return If specified, Pub/Sub will generate and attach an OIDC JWT token as an `Authorization` header in the HTTP request for every pushed message.
     * 
     */
    private OidcTokenResponse oidcToken;
    /**
     * @return A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use `https://example.com/push`.
     * 
     */
    private String pushEndpoint;

    private PushConfigResponse() {}
    /**
     * @return Endpoint configuration attributes that can be used to control different aspects of the message delivery. The only currently supported attribute is `x-goog-version`, which you can use to change the format of the pushed message. This attribute indicates the version of the data expected by the endpoint. This controls the shape of the pushed message (i.e., its fields and metadata). If not present during the `CreateSubscription` call, it will default to the version of the Pub/Sub API used to make such call. If not present in a `ModifyPushConfig` call, its value will not be changed. `GetSubscription` calls will always return a valid version, even if the subscription was created without this attribute. The only supported values for the `x-goog-version` attribute are: * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API. * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API. For example: attributes { &#34;x-goog-version&#34;: &#34;v1&#34; }
     * 
     */
    public Map<String,String> attributes() {
        return this.attributes;
    }
    /**
     * @return If specified, Pub/Sub will generate and attach an OIDC JWT token as an `Authorization` header in the HTTP request for every pushed message.
     * 
     */
    public OidcTokenResponse oidcToken() {
        return this.oidcToken;
    }
    /**
     * @return A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use `https://example.com/push`.
     * 
     */
    public String pushEndpoint() {
        return this.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> attributes;
        private OidcTokenResponse oidcToken;
        private String pushEndpoint;
        public Builder() {}
        public Builder(PushConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        @CustomType.Setter
        public Builder attributes(Map<String,String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        @CustomType.Setter
        public Builder oidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }
        @CustomType.Setter
        public Builder pushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }
        public PushConfigResponse build() {
            final var o = new PushConfigResponse();
            o.attributes = attributes;
            o.oidcToken = oidcToken;
            o.pushEndpoint = pushEndpoint;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns.v1.outputs.ResponsePolicyNetworkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponsePolicyResult {
    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    private String description;
    private String kind;
    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    private List<ResponsePolicyNetworkResponse> networks;
    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    private String responsePolicyName;

    private GetResponsePolicyResult() {}
    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    public String description() {
        return this.description;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public List<ResponsePolicyNetworkResponse> networks() {
        return this.networks;
    }
    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    public String responsePolicyName() {
        return this.responsePolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponsePolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String kind;
        private List<ResponsePolicyNetworkResponse> networks;
        private String responsePolicyName;
        public Builder() {}
        public Builder(GetResponsePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
    	      this.responsePolicyName = defaults.responsePolicyName;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<ResponsePolicyNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(ResponsePolicyNetworkResponse... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder responsePolicyName(String responsePolicyName) {
            this.responsePolicyName = Objects.requireNonNull(responsePolicyName);
            return this;
        }
        public GetResponsePolicyResult build() {
            final var o = new GetResponsePolicyResult();
            o.description = description;
            o.kind = kind;
            o.networks = networks;
            o.responsePolicyName = responsePolicyName;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExecutionConfigResponse {
    /**
     * @return Optional. The Cloud KMS key to use for encryption.
     * 
     */
    private String kmsKey;
    /**
     * @return Optional. Tags used for network traffic control.
     * 
     */
    private List<String> networkTags;
    /**
     * @return Optional. Network URI to connect workload to.
     * 
     */
    private String networkUri;
    /**
     * @return Optional. Service account that used to execute workload.
     * 
     */
    private String serviceAccount;
    /**
     * @return Optional. Subnetwork URI to connect workload to.
     * 
     */
    private String subnetworkUri;

    private ExecutionConfigResponse() {}
    /**
     * @return Optional. The Cloud KMS key to use for encryption.
     * 
     */
    public String kmsKey() {
        return this.kmsKey;
    }
    /**
     * @return Optional. Tags used for network traffic control.
     * 
     */
    public List<String> networkTags() {
        return this.networkTags;
    }
    /**
     * @return Optional. Network URI to connect workload to.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Optional. Service account that used to execute workload.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Optional. Subnetwork URI to connect workload to.
     * 
     */
    public String subnetworkUri() {
        return this.subnetworkUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKey;
        private List<String> networkTags;
        private String networkUri;
        private String serviceAccount;
        private String subnetworkUri;
        public Builder() {}
        public Builder(ExecutionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetworkUri = defaults.subnetworkUri;
        }

        @CustomType.Setter
        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        @CustomType.Setter
        public Builder networkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        @CustomType.Setter
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        @CustomType.Setter
        public Builder subnetworkUri(String subnetworkUri) {
            this.subnetworkUri = Objects.requireNonNull(subnetworkUri);
            return this;
        }
        public ExecutionConfigResponse build() {
            final var o = new ExecutionConfigResponse();
            o.kmsKey = kmsKey;
            o.networkTags = networkTags;
            o.networkUri = networkUri;
            o.serviceAccount = serviceAccount;
            o.subnetworkUri = subnetworkUri;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class S3CompatibleMetadataResponse {
    /**
     * @return Specifies the authentication and authorization method used by the storage service. When not specified, Transfer Service will attempt to determine right auth method to use.
     * 
     */
    private String authMethod;
    /**
     * @return The Listing API to use for discovering objects. When not specified, Transfer Service will attempt to determine the right API to use.
     * 
     */
    private String listApi;
    /**
     * @return Specifies the network protocol of the agent. When not specified, the default value of NetworkProtocol NETWORK_PROTOCOL_HTTPS is used.
     * 
     */
    private String protocol;
    /**
     * @return Specifies the API request model used to call the storage service. When not specified, the default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used.
     * 
     */
    private String requestModel;

    private S3CompatibleMetadataResponse() {}
    /**
     * @return Specifies the authentication and authorization method used by the storage service. When not specified, Transfer Service will attempt to determine right auth method to use.
     * 
     */
    public String authMethod() {
        return this.authMethod;
    }
    /**
     * @return The Listing API to use for discovering objects. When not specified, Transfer Service will attempt to determine the right API to use.
     * 
     */
    public String listApi() {
        return this.listApi;
    }
    /**
     * @return Specifies the network protocol of the agent. When not specified, the default value of NetworkProtocol NETWORK_PROTOCOL_HTTPS is used.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Specifies the API request model used to call the storage service. When not specified, the default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used.
     * 
     */
    public String requestModel() {
        return this.requestModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(S3CompatibleMetadataResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authMethod;
        private String listApi;
        private String protocol;
        private String requestModel;
        public Builder() {}
        public Builder(S3CompatibleMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMethod = defaults.authMethod;
    	      this.listApi = defaults.listApi;
    	      this.protocol = defaults.protocol;
    	      this.requestModel = defaults.requestModel;
        }

        @CustomType.Setter
        public Builder authMethod(String authMethod) {
            this.authMethod = Objects.requireNonNull(authMethod);
            return this;
        }
        @CustomType.Setter
        public Builder listApi(String listApi) {
            this.listApi = Objects.requireNonNull(listApi);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder requestModel(String requestModel) {
            this.requestModel = Objects.requireNonNull(requestModel);
            return this;
        }
        public S3CompatibleMetadataResponse build() {
            final var o = new S3CompatibleMetadataResponse();
            o.authMethod = authMethod;
            o.listApi = listApi;
            o.protocol = protocol;
            o.requestModel = requestModel;
            return o;
        }
    }
}
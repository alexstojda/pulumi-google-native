// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networksecurity.v1beta1.outputs.CertificateProviderInstanceResponse;
import com.pulumi.googlenative.networksecurity.v1beta1.outputs.GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudNetworksecurityV1beta1CertificateProviderResponse {
    /**
     * @return The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    private CertificateProviderInstanceResponse certificateProviderInstance;
    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    private GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint;

    private GoogleCloudNetworksecurityV1beta1CertificateProviderResponse() {}
    /**
     * @return The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    public CertificateProviderInstanceResponse certificateProviderInstance() {
        return this.certificateProviderInstance;
    }
    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    public GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint() {
        return this.grpcEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1beta1CertificateProviderResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private CertificateProviderInstanceResponse certificateProviderInstance;
        private GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint;
        public Builder() {}
        public Builder(GoogleCloudNetworksecurityV1beta1CertificateProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        @CustomType.Setter
        public Builder certificateProviderInstance(CertificateProviderInstanceResponse certificateProviderInstance) {
            this.certificateProviderInstance = Objects.requireNonNull(certificateProviderInstance);
            return this;
        }
        @CustomType.Setter
        public Builder grpcEndpoint(GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint) {
            this.grpcEndpoint = Objects.requireNonNull(grpcEndpoint);
            return this;
        }
        public GoogleCloudNetworksecurityV1beta1CertificateProviderResponse build() {
            final var o = new GoogleCloudNetworksecurityV1beta1CertificateProviderResponse();
            o.certificateProviderInstance = certificateProviderInstance;
            o.grpcEndpoint = grpcEndpoint;
            return o;
        }
    }
}
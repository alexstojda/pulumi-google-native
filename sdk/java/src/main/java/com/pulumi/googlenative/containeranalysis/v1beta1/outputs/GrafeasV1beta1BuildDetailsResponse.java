// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1beta1.outputs.BuildProvenanceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrafeasV1beta1BuildDetailsResponse {
    /**
     * @return The actual provenance for the build.
     * 
     */
    private BuildProvenanceResponse provenance;
    /**
     * @return Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    private String provenanceBytes;

    private GrafeasV1beta1BuildDetailsResponse() {}
    /**
     * @return The actual provenance for the build.
     * 
     */
    public BuildProvenanceResponse provenance() {
        return this.provenance;
    }
    /**
     * @return Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    public String provenanceBytes() {
        return this.provenanceBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1BuildDetailsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BuildProvenanceResponse provenance;
        private String provenanceBytes;
        public Builder() {}
        public Builder(GrafeasV1beta1BuildDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provenance = defaults.provenance;
    	      this.provenanceBytes = defaults.provenanceBytes;
        }

        @CustomType.Setter
        public Builder provenance(BuildProvenanceResponse provenance) {
            this.provenance = Objects.requireNonNull(provenance);
            return this;
        }
        @CustomType.Setter
        public Builder provenanceBytes(String provenanceBytes) {
            this.provenanceBytes = Objects.requireNonNull(provenanceBytes);
            return this;
        }
        public GrafeasV1beta1BuildDetailsResponse build() {
            final var o = new GrafeasV1beta1BuildDetailsResponse();
            o.provenance = provenance;
            o.provenanceBytes = provenanceBytes;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.DSSEHintResponse;
import java.util.Objects;

@CustomType
public final class DSSEAttestationNoteResponse {
    /**
     * @return DSSEHint hints at the purpose of the attestation authority.
     * 
     */
    private DSSEHintResponse hint;

    private DSSEAttestationNoteResponse() {}
    /**
     * @return DSSEHint hints at the purpose of the attestation authority.
     * 
     */
    public DSSEHintResponse hint() {
        return this.hint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationNoteResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DSSEHintResponse hint;
        public Builder() {}
        public Builder(DSSEAttestationNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        @CustomType.Setter
        public Builder hint(DSSEHintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }
        public DSSEAttestationNoteResponse build() {
            final var o = new DSSEAttestationNoteResponse();
            o.hint = hint;
            return o;
        }
    }
}
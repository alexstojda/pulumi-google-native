// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1.outputs.EnvelopeResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.InTotoStatementResponse;
import java.util.Objects;

@CustomType
public final class DSSEAttestationOccurrenceResponse {
    /**
     * @return If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    private EnvelopeResponse envelope;
    private InTotoStatementResponse statement;

    private DSSEAttestationOccurrenceResponse() {}
    /**
     * @return If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    public EnvelopeResponse envelope() {
        return this.envelope;
    }
    public InTotoStatementResponse statement() {
        return this.statement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationOccurrenceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private EnvelopeResponse envelope;
        private InTotoStatementResponse statement;
        public Builder() {}
        public Builder(DSSEAttestationOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envelope = defaults.envelope;
    	      this.statement = defaults.statement;
        }

        @CustomType.Setter
        public Builder envelope(EnvelopeResponse envelope) {
            this.envelope = Objects.requireNonNull(envelope);
            return this;
        }
        @CustomType.Setter
        public Builder statement(InTotoStatementResponse statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public DSSEAttestationOccurrenceResponse build() {
            final var o = new DSSEAttestationOccurrenceResponse();
            o.envelope = envelope;
            o.statement = statement;
            return o;
        }
    }
}
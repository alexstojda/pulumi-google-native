// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntakeVlanAttachmentResponse {
    /**
     * @return Attachment pairing key.
     * 
     */
    private String pairingKey;

    private IntakeVlanAttachmentResponse() {}
    /**
     * @return Attachment pairing key.
     * 
     */
    public String pairingKey() {
        return this.pairingKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntakeVlanAttachmentResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pairingKey;
        public Builder() {}
        public Builder(IntakeVlanAttachmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pairingKey = defaults.pairingKey;
        }

        @CustomType.Setter
        public Builder pairingKey(String pairingKey) {
            this.pairingKey = Objects.requireNonNull(pairingKey);
            return this;
        }
        public IntakeVlanAttachmentResponse build() {
            final var o = new IntakeVlanAttachmentResponse();
            o.pairingKey = pairingKey;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrafeasV1beta1IntotoSignatureResponse {
    private String keyid;
    private String sig;

    private GrafeasV1beta1IntotoSignatureResponse() {}
    public String keyid() {
        return this.keyid;
    }
    public String sig() {
        return this.sig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1IntotoSignatureResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyid;
        private String sig;
        public Builder() {}
        public Builder(GrafeasV1beta1IntotoSignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyid = defaults.keyid;
    	      this.sig = defaults.sig;
        }

        @CustomType.Setter
        public Builder keyid(String keyid) {
            this.keyid = Objects.requireNonNull(keyid);
            return this;
        }
        @CustomType.Setter
        public Builder sig(String sig) {
            this.sig = Objects.requireNonNull(sig);
            return this;
        }
        public GrafeasV1beta1IntotoSignatureResponse build() {
            final var o = new GrafeasV1beta1IntotoSignatureResponse();
            o.keyid = keyid;
            o.sig = sig;
            return o;
        }
    }
}
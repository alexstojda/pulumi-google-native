// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PgpSignedAttestationResponse {
    /**
     * @return Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    private String contentType;
    /**
     * @return The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexadecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge &#34;LONG&#34;, &#34;SHORT&#34;, or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the `fpr` field returned when calling --list-keys with --with-colons. For example: ```gpg --with-colons --with-fingerprint --force-v4-certs \ --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:``` Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
     * 
     */
    private String pgpKeyId;
    /**
     * @return The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent. Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg payload.json` will create the signature content expected in this field in `signature.gpg` for the `payload.json` attestation payload.
     * 
     */
    private String signature;

    private PgpSignedAttestationResponse() {}
    /**
     * @return Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexadecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge &#34;LONG&#34;, &#34;SHORT&#34;, or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the `fpr` field returned when calling --list-keys with --with-colons. For example: ```gpg --with-colons --with-fingerprint --force-v4-certs \ --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:``` Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
     * 
     */
    public String pgpKeyId() {
        return this.pgpKeyId;
    }
    /**
     * @return The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent. Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg payload.json` will create the signature content expected in this field in `signature.gpg` for the `payload.json` attestation payload.
     * 
     */
    public String signature() {
        return this.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgpSignedAttestationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contentType;
        private String pgpKeyId;
        private String signature;
        public Builder() {}
        public Builder(PgpSignedAttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.pgpKeyId = defaults.pgpKeyId;
    	      this.signature = defaults.signature;
        }

        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder pgpKeyId(String pgpKeyId) {
            this.pgpKeyId = Objects.requireNonNull(pgpKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder signature(String signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }
        public PgpSignedAttestationResponse build() {
            final var o = new PgpSignedAttestationResponse();
            o.contentType = contentType;
            o.pgpKeyId = pgpKeyId;
            o.signature = signature;
            return o;
        }
    }
}
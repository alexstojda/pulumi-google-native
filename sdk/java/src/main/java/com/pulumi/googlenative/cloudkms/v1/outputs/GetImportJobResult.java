// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudkms.v1.outputs.KeyOperationAttestationResponse;
import com.pulumi.googlenative.cloudkms.v1.outputs.WrappingPublicKeyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImportJobResult {
    /**
     * @return Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
     * 
     */
    private KeyOperationAttestationResponse attestation;
    /**
     * @return The time at which this ImportJob was created.
     * 
     */
    private String createTime;
    /**
     * @return The time this ImportJob expired. Only present if state is EXPIRED.
     * 
     */
    private String expireEventTime;
    /**
     * @return The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material.
     * 
     */
    private String expireTime;
    /**
     * @return The time this ImportJob&#39;s key material was generated.
     * 
     */
    private String generateTime;
    /**
     * @return Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    private String importMethod;
    /**
     * @return The resource name for this ImportJob in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*`.
     * 
     */
    private String name;
    /**
     * @return Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    private String protectionLevel;
    /**
     * @return The public key with which to wrap key material prior to import. Only returned if state is ACTIVE.
     * 
     */
    private WrappingPublicKeyResponse publicKey;
    /**
     * @return The current state of the ImportJob, indicating if it can be used.
     * 
     */
    private String state;

    private GetImportJobResult() {}
    /**
     * @return Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
     * 
     */
    public KeyOperationAttestationResponse attestation() {
        return this.attestation;
    }
    /**
     * @return The time at which this ImportJob was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The time this ImportJob expired. Only present if state is EXPIRED.
     * 
     */
    public String expireEventTime() {
        return this.expireEventTime;
    }
    /**
     * @return The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The time this ImportJob&#39;s key material was generated.
     * 
     */
    public String generateTime() {
        return this.generateTime;
    }
    /**
     * @return Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    public String importMethod() {
        return this.importMethod;
    }
    /**
     * @return The resource name for this ImportJob in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    public String protectionLevel() {
        return this.protectionLevel;
    }
    /**
     * @return The public key with which to wrap key material prior to import. Only returned if state is ACTIVE.
     * 
     */
    public WrappingPublicKeyResponse publicKey() {
        return this.publicKey;
    }
    /**
     * @return The current state of the ImportJob, indicating if it can be used.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImportJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private KeyOperationAttestationResponse attestation;
        private String createTime;
        private String expireEventTime;
        private String expireTime;
        private String generateTime;
        private String importMethod;
        private String name;
        private String protectionLevel;
        private WrappingPublicKeyResponse publicKey;
        private String state;
        public Builder() {}
        public Builder(GetImportJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.createTime = defaults.createTime;
    	      this.expireEventTime = defaults.expireEventTime;
    	      this.expireTime = defaults.expireTime;
    	      this.generateTime = defaults.generateTime;
    	      this.importMethod = defaults.importMethod;
    	      this.name = defaults.name;
    	      this.protectionLevel = defaults.protectionLevel;
    	      this.publicKey = defaults.publicKey;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder attestation(KeyOperationAttestationResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder expireEventTime(String expireEventTime) {
            this.expireEventTime = Objects.requireNonNull(expireEventTime);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder generateTime(String generateTime) {
            this.generateTime = Objects.requireNonNull(generateTime);
            return this;
        }
        @CustomType.Setter
        public Builder importMethod(String importMethod) {
            this.importMethod = Objects.requireNonNull(importMethod);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder protectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(WrappingPublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetImportJobResult build() {
            final var o = new GetImportJobResult();
            o.attestation = attestation;
            o.createTime = createTime;
            o.expireEventTime = expireEventTime;
            o.expireTime = expireTime;
            o.generateTime = generateTime;
            o.importMethod = importMethod;
            o.name = name;
            o.protectionLevel = protectionLevel;
            o.publicKey = publicKey;
            o.state = state;
            return o;
        }
    }
}
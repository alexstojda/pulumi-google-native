// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains.v1.enums.DsRecordAlgorithm;
import com.pulumi.googlenative.domains.v1.enums.DsRecordDigestType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a Delegation Signer (DS) record, which is needed to enable DNSSEC for a domain. It contains a digest (hash) of a DNSKEY record that must be present in the domain&#39;s DNS zone.
 * 
 */
public final class DsRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final DsRecordArgs Empty = new DsRecordArgs();

    /**
     * The algorithm used to generate the referenced DNSKEY.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<DsRecordAlgorithm> algorithm;

    /**
     * @return The algorithm used to generate the referenced DNSKEY.
     * 
     */
    public Optional<Output<DsRecordAlgorithm>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * The digest generated from the referenced DNSKEY.
     * 
     */
    @Import(name="digest")
    private @Nullable Output<String> digest;

    /**
     * @return The digest generated from the referenced DNSKEY.
     * 
     */
    public Optional<Output<String>> digest() {
        return Optional.ofNullable(this.digest);
    }

    /**
     * The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    @Import(name="digestType")
    private @Nullable Output<DsRecordDigestType> digestType;

    /**
     * @return The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    public Optional<Output<DsRecordDigestType>> digestType() {
        return Optional.ofNullable(this.digestType);
    }

    /**
     * The key tag of the record. Must be set in range 0 -- 65535.
     * 
     */
    @Import(name="keyTag")
    private @Nullable Output<Integer> keyTag;

    /**
     * @return The key tag of the record. Must be set in range 0 -- 65535.
     * 
     */
    public Optional<Output<Integer>> keyTag() {
        return Optional.ofNullable(this.keyTag);
    }

    private DsRecordArgs() {}

    private DsRecordArgs(DsRecordArgs $) {
        this.algorithm = $.algorithm;
        this.digest = $.digest;
        this.digestType = $.digestType;
        this.keyTag = $.keyTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DsRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DsRecordArgs $;

        public Builder() {
            $ = new DsRecordArgs();
        }

        public Builder(DsRecordArgs defaults) {
            $ = new DsRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The algorithm used to generate the referenced DNSKEY.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<DsRecordAlgorithm> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The algorithm used to generate the referenced DNSKEY.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(DsRecordAlgorithm algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param digest The digest generated from the referenced DNSKEY.
         * 
         * @return builder
         * 
         */
        public Builder digest(@Nullable Output<String> digest) {
            $.digest = digest;
            return this;
        }

        /**
         * @param digest The digest generated from the referenced DNSKEY.
         * 
         * @return builder
         * 
         */
        public Builder digest(String digest) {
            return digest(Output.of(digest));
        }

        /**
         * @param digestType The hash function used to generate the digest of the referenced DNSKEY.
         * 
         * @return builder
         * 
         */
        public Builder digestType(@Nullable Output<DsRecordDigestType> digestType) {
            $.digestType = digestType;
            return this;
        }

        /**
         * @param digestType The hash function used to generate the digest of the referenced DNSKEY.
         * 
         * @return builder
         * 
         */
        public Builder digestType(DsRecordDigestType digestType) {
            return digestType(Output.of(digestType));
        }

        /**
         * @param keyTag The key tag of the record. Must be set in range 0 -- 65535.
         * 
         * @return builder
         * 
         */
        public Builder keyTag(@Nullable Output<Integer> keyTag) {
            $.keyTag = keyTag;
            return this;
        }

        /**
         * @param keyTag The key tag of the record. Must be set in range 0 -- 65535.
         * 
         * @return builder
         * 
         */
        public Builder keyTag(Integer keyTag) {
            return keyTag(Output.of(keyTag));
        }

        public DsRecordArgs build() {
            return $;
        }
    }

}
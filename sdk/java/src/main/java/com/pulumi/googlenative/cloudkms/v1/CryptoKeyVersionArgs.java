// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudkms.v1.enums.CryptoKeyVersionState;
import com.pulumi.googlenative.cloudkms.v1.inputs.ExternalProtectionLevelOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoKeyVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionArgs Empty = new CryptoKeyVersionArgs();

    @Import(name="cryptoKeyId")
    private @Nullable Output<String> cryptoKeyId;

    public Optional<Output<String>> cryptoKeyId() {
        return Optional.ofNullable(this.cryptoKeyId);
    }

    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    @Import(name="externalProtectionLevelOptions")
    private @Nullable Output<ExternalProtectionLevelOptionsArgs> externalProtectionLevelOptions;

    /**
     * @return ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    public Optional<Output<ExternalProtectionLevelOptionsArgs>> externalProtectionLevelOptions() {
        return Optional.ofNullable(this.externalProtectionLevelOptions);
    }

    @Import(name="keyRingId", required=true)
    private Output<String> keyRingId;

    public Output<String> keyRingId() {
        return this.keyRingId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The current state of the CryptoKeyVersion.
     * 
     */
    @Import(name="state")
    private @Nullable Output<CryptoKeyVersionState> state;

    /**
     * @return The current state of the CryptoKeyVersion.
     * 
     */
    public Optional<Output<CryptoKeyVersionState>> state() {
        return Optional.ofNullable(this.state);
    }

    private CryptoKeyVersionArgs() {}

    private CryptoKeyVersionArgs(CryptoKeyVersionArgs $) {
        this.cryptoKeyId = $.cryptoKeyId;
        this.externalProtectionLevelOptions = $.externalProtectionLevelOptions;
        this.keyRingId = $.keyRingId;
        this.location = $.location;
        this.project = $.project;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyVersionArgs $;

        public Builder() {
            $ = new CryptoKeyVersionArgs();
        }

        public Builder(CryptoKeyVersionArgs defaults) {
            $ = new CryptoKeyVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder cryptoKeyId(@Nullable Output<String> cryptoKeyId) {
            $.cryptoKeyId = cryptoKeyId;
            return this;
        }

        public Builder cryptoKeyId(String cryptoKeyId) {
            return cryptoKeyId(Output.of(cryptoKeyId));
        }

        /**
         * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
         * 
         * @return builder
         * 
         */
        public Builder externalProtectionLevelOptions(@Nullable Output<ExternalProtectionLevelOptionsArgs> externalProtectionLevelOptions) {
            $.externalProtectionLevelOptions = externalProtectionLevelOptions;
            return this;
        }

        /**
         * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
         * 
         * @return builder
         * 
         */
        public Builder externalProtectionLevelOptions(ExternalProtectionLevelOptionsArgs externalProtectionLevelOptions) {
            return externalProtectionLevelOptions(Output.of(externalProtectionLevelOptions));
        }

        public Builder keyRingId(Output<String> keyRingId) {
            $.keyRingId = keyRingId;
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            return keyRingId(Output.of(keyRingId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state The current state of the CryptoKeyVersion.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<CryptoKeyVersionState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the CryptoKeyVersion.
         * 
         * @return builder
         * 
         */
        public Builder state(CryptoKeyVersionState state) {
            return state(Output.of(state));
        }

        public CryptoKeyVersionArgs build() {
            $.keyRingId = Objects.requireNonNull($.keyRingId, "expected parameter 'keyRingId' to be non-null");
            return $;
        }
    }

}
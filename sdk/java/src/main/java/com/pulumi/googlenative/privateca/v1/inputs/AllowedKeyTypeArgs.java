// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca.v1.inputs.EcKeyTypeArgs;
import com.pulumi.googlenative.privateca.v1.inputs.RsaKeyTypeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a &#34;type&#34; of key that may be used in a Certificate issued from a CaPool. Note that a single AllowedKeyType may refer to either a fully-qualified key algorithm, such as RSA 4096, or a family of key algorithms, such as any RSA key.
 * 
 */
public final class AllowedKeyTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllowedKeyTypeArgs Empty = new AllowedKeyTypeArgs();

    /**
     * Represents an allowed Elliptic Curve key type.
     * 
     */
    @Import(name="ellipticCurve")
    private @Nullable Output<EcKeyTypeArgs> ellipticCurve;

    /**
     * @return Represents an allowed Elliptic Curve key type.
     * 
     */
    public Optional<Output<EcKeyTypeArgs>> ellipticCurve() {
        return Optional.ofNullable(this.ellipticCurve);
    }

    /**
     * Represents an allowed RSA key type.
     * 
     */
    @Import(name="rsa")
    private @Nullable Output<RsaKeyTypeArgs> rsa;

    /**
     * @return Represents an allowed RSA key type.
     * 
     */
    public Optional<Output<RsaKeyTypeArgs>> rsa() {
        return Optional.ofNullable(this.rsa);
    }

    private AllowedKeyTypeArgs() {}

    private AllowedKeyTypeArgs(AllowedKeyTypeArgs $) {
        this.ellipticCurve = $.ellipticCurve;
        this.rsa = $.rsa;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowedKeyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowedKeyTypeArgs $;

        public Builder() {
            $ = new AllowedKeyTypeArgs();
        }

        public Builder(AllowedKeyTypeArgs defaults) {
            $ = new AllowedKeyTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ellipticCurve Represents an allowed Elliptic Curve key type.
         * 
         * @return builder
         * 
         */
        public Builder ellipticCurve(@Nullable Output<EcKeyTypeArgs> ellipticCurve) {
            $.ellipticCurve = ellipticCurve;
            return this;
        }

        /**
         * @param ellipticCurve Represents an allowed Elliptic Curve key type.
         * 
         * @return builder
         * 
         */
        public Builder ellipticCurve(EcKeyTypeArgs ellipticCurve) {
            return ellipticCurve(Output.of(ellipticCurve));
        }

        /**
         * @param rsa Represents an allowed RSA key type.
         * 
         * @return builder
         * 
         */
        public Builder rsa(@Nullable Output<RsaKeyTypeArgs> rsa) {
            $.rsa = rsa;
            return this;
        }

        /**
         * @param rsa Represents an allowed RSA key type.
         * 
         * @return builder
         * 
         */
        public Builder rsa(RsaKeyTypeArgs rsa) {
            return rsa(Output.of(rsa));
        }

        public AllowedKeyTypeArgs build() {
            return $;
        }
    }

}
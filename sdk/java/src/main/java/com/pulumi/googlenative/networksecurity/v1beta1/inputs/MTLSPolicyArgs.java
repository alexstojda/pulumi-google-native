// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity.v1beta1.inputs.ValidationCAArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification of the MTLSPolicy.
 * 
 */
public final class MTLSPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MTLSPolicyArgs Empty = new MTLSPolicyArgs();

    /**
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    @Import(name="clientValidationCa")
    private @Nullable Output<List<ValidationCAArgs>> clientValidationCa;

    /**
     * @return  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    public Optional<Output<List<ValidationCAArgs>>> clientValidationCa() {
        return Optional.ofNullable(this.clientValidationCa);
    }

    private MTLSPolicyArgs() {}

    private MTLSPolicyArgs(MTLSPolicyArgs $) {
        this.clientValidationCa = $.clientValidationCa;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MTLSPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MTLSPolicyArgs $;

        public Builder() {
            $ = new MTLSPolicyArgs();
        }

        public Builder(MTLSPolicyArgs defaults) {
            $ = new MTLSPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientValidationCa  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientValidationCa(@Nullable Output<List<ValidationCAArgs>> clientValidationCa) {
            $.clientValidationCa = clientValidationCa;
            return this;
        }

        /**
         * @param clientValidationCa  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientValidationCa(List<ValidationCAArgs> clientValidationCa) {
            return clientValidationCa(Output.of(clientValidationCa));
        }

        /**
         * @param clientValidationCa  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientValidationCa(ValidationCAArgs... clientValidationCa) {
            return clientValidationCa(List.of(clientValidationCa));
        }

        public MTLSPolicyArgs build() {
            return $;
        }
    }

}
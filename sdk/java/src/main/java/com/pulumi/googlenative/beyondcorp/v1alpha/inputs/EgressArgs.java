// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.beyondcorp.v1alpha.inputs.PeeredVpcArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of the egress info. One of the following options should be set.
 * 
 */
public final class EgressArgs extends com.pulumi.resources.ResourceArgs {

    public static final EgressArgs Empty = new EgressArgs();

    /**
     * A VPC from the consumer project.
     * 
     */
    @Import(name="peeredVpc")
    private @Nullable Output<PeeredVpcArgs> peeredVpc;

    /**
     * @return A VPC from the consumer project.
     * 
     */
    public Optional<Output<PeeredVpcArgs>> peeredVpc() {
        return Optional.ofNullable(this.peeredVpc);
    }

    private EgressArgs() {}

    private EgressArgs(EgressArgs $) {
        this.peeredVpc = $.peeredVpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EgressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EgressArgs $;

        public Builder() {
            $ = new EgressArgs();
        }

        public Builder(EgressArgs defaults) {
            $ = new EgressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeredVpc A VPC from the consumer project.
         * 
         * @return builder
         * 
         */
        public Builder peeredVpc(@Nullable Output<PeeredVpcArgs> peeredVpc) {
            $.peeredVpc = peeredVpc;
            return this;
        }

        /**
         * @param peeredVpc A VPC from the consumer project.
         * 
         * @return builder
         * 
         */
        public Builder peeredVpc(PeeredVpcArgs peeredVpc) {
            return peeredVpc(Output.of(peeredVpc));
        }

        public EgressArgs build() {
            return $;
        }
    }

}
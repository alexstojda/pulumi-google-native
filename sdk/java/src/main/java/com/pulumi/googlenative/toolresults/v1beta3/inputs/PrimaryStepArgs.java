// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.enums.PrimaryStepRollUp;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.IndividualOutcomeArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Stores rollup test status of multiple steps that were run as a group and outcome of each individual step.
 * 
 */
public final class PrimaryStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrimaryStepArgs Empty = new PrimaryStepArgs();

    /**
     * Step Id and outcome of each individual step.
     * 
     */
    @Import(name="individualOutcome")
    private @Nullable Output<List<IndividualOutcomeArgs>> individualOutcome;

    /**
     * @return Step Id and outcome of each individual step.
     * 
     */
    public Optional<Output<List<IndividualOutcomeArgs>>> individualOutcome() {
        return Optional.ofNullable(this.individualOutcome);
    }

    /**
     * Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    @Import(name="rollUp")
    private @Nullable Output<PrimaryStepRollUp> rollUp;

    /**
     * @return Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    public Optional<Output<PrimaryStepRollUp>> rollUp() {
        return Optional.ofNullable(this.rollUp);
    }

    private PrimaryStepArgs() {}

    private PrimaryStepArgs(PrimaryStepArgs $) {
        this.individualOutcome = $.individualOutcome;
        this.rollUp = $.rollUp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrimaryStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrimaryStepArgs $;

        public Builder() {
            $ = new PrimaryStepArgs();
        }

        public Builder(PrimaryStepArgs defaults) {
            $ = new PrimaryStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param individualOutcome Step Id and outcome of each individual step.
         * 
         * @return builder
         * 
         */
        public Builder individualOutcome(@Nullable Output<List<IndividualOutcomeArgs>> individualOutcome) {
            $.individualOutcome = individualOutcome;
            return this;
        }

        /**
         * @param individualOutcome Step Id and outcome of each individual step.
         * 
         * @return builder
         * 
         */
        public Builder individualOutcome(List<IndividualOutcomeArgs> individualOutcome) {
            return individualOutcome(Output.of(individualOutcome));
        }

        /**
         * @param individualOutcome Step Id and outcome of each individual step.
         * 
         * @return builder
         * 
         */
        public Builder individualOutcome(IndividualOutcomeArgs... individualOutcome) {
            return individualOutcome(List.of(individualOutcome));
        }

        /**
         * @param rollUp Rollup test status of multiple steps that were run with the same configuration as a group.
         * 
         * @return builder
         * 
         */
        public Builder rollUp(@Nullable Output<PrimaryStepRollUp> rollUp) {
            $.rollUp = rollUp;
            return this;
        }

        /**
         * @param rollUp Rollup test status of multiple steps that were run with the same configuration as a group.
         * 
         * @return builder
         * 
         */
        public Builder rollUp(PrimaryStepRollUp rollUp) {
            return rollUp(Output.of(rollUp));
        }

        public PrimaryStepArgs build() {
            return $;
        }
    }

}
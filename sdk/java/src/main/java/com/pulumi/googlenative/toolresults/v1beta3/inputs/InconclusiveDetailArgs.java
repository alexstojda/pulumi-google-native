// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details for an outcome with an INCONCLUSIVE outcome summary.
 * 
 */
public final class InconclusiveDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final InconclusiveDetailArgs Empty = new InconclusiveDetailArgs();

    /**
     * If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was running.
     * 
     */
    @Import(name="abortedByUser")
    private @Nullable Output<Boolean> abortedByUser;

    /**
     * @return If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was running.
     * 
     */
    public Optional<Output<Boolean>> abortedByUser() {
        return Optional.ofNullable(this.abortedByUser);
    }

    /**
     * If results are being provided to the user in certain cases of infrastructure failures
     * 
     */
    @Import(name="hasErrorLogs")
    private @Nullable Output<Boolean> hasErrorLogs;

    /**
     * @return If results are being provided to the user in certain cases of infrastructure failures
     * 
     */
    public Optional<Output<Boolean>> hasErrorLogs() {
        return Optional.ofNullable(this.hasErrorLogs);
    }

    /**
     * If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed. For example, a mobile test requires provisioning a device where the test executes, and that provisioning can fail.
     * 
     */
    @Import(name="infrastructureFailure")
    private @Nullable Output<Boolean> infrastructureFailure;

    /**
     * @return If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed. For example, a mobile test requires provisioning a device where the test executes, and that provisioning can fail.
     * 
     */
    public Optional<Output<Boolean>> infrastructureFailure() {
        return Optional.ofNullable(this.infrastructureFailure);
    }

    private InconclusiveDetailArgs() {}

    private InconclusiveDetailArgs(InconclusiveDetailArgs $) {
        this.abortedByUser = $.abortedByUser;
        this.hasErrorLogs = $.hasErrorLogs;
        this.infrastructureFailure = $.infrastructureFailure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InconclusiveDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InconclusiveDetailArgs $;

        public Builder() {
            $ = new InconclusiveDetailArgs();
        }

        public Builder(InconclusiveDetailArgs defaults) {
            $ = new InconclusiveDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abortedByUser If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was running.
         * 
         * @return builder
         * 
         */
        public Builder abortedByUser(@Nullable Output<Boolean> abortedByUser) {
            $.abortedByUser = abortedByUser;
            return this;
        }

        /**
         * @param abortedByUser If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was running.
         * 
         * @return builder
         * 
         */
        public Builder abortedByUser(Boolean abortedByUser) {
            return abortedByUser(Output.of(abortedByUser));
        }

        /**
         * @param hasErrorLogs If results are being provided to the user in certain cases of infrastructure failures
         * 
         * @return builder
         * 
         */
        public Builder hasErrorLogs(@Nullable Output<Boolean> hasErrorLogs) {
            $.hasErrorLogs = hasErrorLogs;
            return this;
        }

        /**
         * @param hasErrorLogs If results are being provided to the user in certain cases of infrastructure failures
         * 
         * @return builder
         * 
         */
        public Builder hasErrorLogs(Boolean hasErrorLogs) {
            return hasErrorLogs(Output.of(hasErrorLogs));
        }

        /**
         * @param infrastructureFailure If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed. For example, a mobile test requires provisioning a device where the test executes, and that provisioning can fail.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureFailure(@Nullable Output<Boolean> infrastructureFailure) {
            $.infrastructureFailure = infrastructureFailure;
            return this;
        }

        /**
         * @param infrastructureFailure If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed. For example, a mobile test requires provisioning a device where the test executes, and that provisioning can fail.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureFailure(Boolean infrastructureFailure) {
            return infrastructureFailure(Output.of(infrastructureFailure));
        }

        public InconclusiveDetailArgs build() {
            return $;
        }
    }

}
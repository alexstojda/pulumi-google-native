// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring.v3.enums.InternalCheckerState;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An internal checker allows Uptime checks to run on private/internal GCP resources.
 * 
 */
public final class InternalCheckerArgs extends com.pulumi.resources.ResourceArgs {

    public static final InternalCheckerArgs Empty = new InternalCheckerArgs();

    /**
     * The checker&#39;s human-readable name. The display name should be unique within a Cloud Monitoring Metrics Scope in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The checker&#39;s human-readable name. The display name should be unique within a Cloud Monitoring Metrics Scope in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
     * 
     */
    @Import(name="gcpZone")
    private @Nullable Output<String> gcpZone;

    /**
     * @return The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
     * 
     */
    public Optional<Output<String>> gcpZone() {
        return Optional.ofNullable(this.gcpZone);
    }

    /**
     * A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Cloud Monitoring Metrics Scope project for the Uptime check config associated with the internal checker.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Cloud Monitoring Metrics Scope project for the Uptime check config associated with the internal checker.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: &#34;default&#34;).
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: &#34;default&#34;).
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The GCP project ID where the internal checker lives. Not necessary the same as the Metrics Scope project.
     * 
     */
    @Import(name="peerProjectId")
    private @Nullable Output<String> peerProjectId;

    /**
     * @return The GCP project ID where the internal checker lives. Not necessary the same as the Metrics Scope project.
     * 
     */
    public Optional<Output<String>> peerProjectId() {
        return Optional.ofNullable(this.peerProjectId);
    }

    /**
     * The current operational state of the internal checker.
     * 
     */
    @Import(name="state")
    private @Nullable Output<InternalCheckerState> state;

    /**
     * @return The current operational state of the internal checker.
     * 
     */
    public Optional<Output<InternalCheckerState>> state() {
        return Optional.ofNullable(this.state);
    }

    private InternalCheckerArgs() {}

    private InternalCheckerArgs(InternalCheckerArgs $) {
        this.displayName = $.displayName;
        this.gcpZone = $.gcpZone;
        this.name = $.name;
        this.network = $.network;
        this.peerProjectId = $.peerProjectId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InternalCheckerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InternalCheckerArgs $;

        public Builder() {
            $ = new InternalCheckerArgs();
        }

        public Builder(InternalCheckerArgs defaults) {
            $ = new InternalCheckerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The checker&#39;s human-readable name. The display name should be unique within a Cloud Monitoring Metrics Scope in order to make it easier to identify; however, uniqueness is not enforced.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The checker&#39;s human-readable name. The display name should be unique within a Cloud Monitoring Metrics Scope in order to make it easier to identify; however, uniqueness is not enforced.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param gcpZone The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
         * 
         * @return builder
         * 
         */
        public Builder gcpZone(@Nullable Output<String> gcpZone) {
            $.gcpZone = gcpZone;
            return this;
        }

        /**
         * @param gcpZone The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
         * 
         * @return builder
         * 
         */
        public Builder gcpZone(String gcpZone) {
            return gcpZone(Output.of(gcpZone));
        }

        /**
         * @param name A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Cloud Monitoring Metrics Scope project for the Uptime check config associated with the internal checker.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Cloud Monitoring Metrics Scope project for the Uptime check config associated with the internal checker.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: &#34;default&#34;).
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: &#34;default&#34;).
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param peerProjectId The GCP project ID where the internal checker lives. Not necessary the same as the Metrics Scope project.
         * 
         * @return builder
         * 
         */
        public Builder peerProjectId(@Nullable Output<String> peerProjectId) {
            $.peerProjectId = peerProjectId;
            return this;
        }

        /**
         * @param peerProjectId The GCP project ID where the internal checker lives. Not necessary the same as the Metrics Scope project.
         * 
         * @return builder
         * 
         */
        public Builder peerProjectId(String peerProjectId) {
            return peerProjectId(Output.of(peerProjectId));
        }

        /**
         * @param state The current operational state of the internal checker.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<InternalCheckerState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current operational state of the internal checker.
         * 
         * @return builder
         * 
         */
        public Builder state(InternalCheckerState state) {
            return state(Output.of(state));
        }

        public InternalCheckerArgs build() {
            return $;
        }
    }

}
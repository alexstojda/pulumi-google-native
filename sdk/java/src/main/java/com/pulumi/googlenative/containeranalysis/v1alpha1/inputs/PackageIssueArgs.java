// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.VulnerabilityLocationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 * 
 */
public final class PackageIssueArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageIssueArgs Empty = new PackageIssueArgs();

    /**
     * The location of the vulnerability.
     * 
     */
    @Import(name="affectedLocation")
    private @Nullable Output<VulnerabilityLocationArgs> affectedLocation;

    /**
     * @return The location of the vulnerability.
     * 
     */
    public Optional<Output<VulnerabilityLocationArgs>> affectedLocation() {
        return Optional.ofNullable(this.affectedLocation);
    }

    /**
     * The location of the available fix for vulnerability.
     * 
     */
    @Import(name="fixedLocation")
    private @Nullable Output<VulnerabilityLocationArgs> fixedLocation;

    /**
     * @return The location of the available fix for vulnerability.
     * 
     */
    public Optional<Output<VulnerabilityLocationArgs>> fixedLocation() {
        return Optional.ofNullable(this.fixedLocation);
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @Import(name="packageType")
    private @Nullable Output<String> packageType;

    /**
     * @return The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    public Optional<Output<String>> packageType() {
        return Optional.ofNullable(this.packageType);
    }

    @Import(name="severityName")
    private @Nullable Output<String> severityName;

    public Optional<Output<String>> severityName() {
        return Optional.ofNullable(this.severityName);
    }

    private PackageIssueArgs() {}

    private PackageIssueArgs(PackageIssueArgs $) {
        this.affectedLocation = $.affectedLocation;
        this.fixedLocation = $.fixedLocation;
        this.packageType = $.packageType;
        this.severityName = $.severityName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageIssueArgs $;

        public Builder() {
            $ = new PackageIssueArgs();
        }

        public Builder(PackageIssueArgs defaults) {
            $ = new PackageIssueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param affectedLocation The location of the vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder affectedLocation(@Nullable Output<VulnerabilityLocationArgs> affectedLocation) {
            $.affectedLocation = affectedLocation;
            return this;
        }

        /**
         * @param affectedLocation The location of the vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder affectedLocation(VulnerabilityLocationArgs affectedLocation) {
            return affectedLocation(Output.of(affectedLocation));
        }

        /**
         * @param fixedLocation The location of the available fix for vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder fixedLocation(@Nullable Output<VulnerabilityLocationArgs> fixedLocation) {
            $.fixedLocation = fixedLocation;
            return this;
        }

        /**
         * @param fixedLocation The location of the available fix for vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder fixedLocation(VulnerabilityLocationArgs fixedLocation) {
            return fixedLocation(Output.of(fixedLocation));
        }

        /**
         * @param packageType The type of package (e.g. OS, MAVEN, GO).
         * 
         * @return builder
         * 
         */
        public Builder packageType(@Nullable Output<String> packageType) {
            $.packageType = packageType;
            return this;
        }

        /**
         * @param packageType The type of package (e.g. OS, MAVEN, GO).
         * 
         * @return builder
         * 
         */
        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
        }

        public Builder severityName(@Nullable Output<String> severityName) {
            $.severityName = severityName;
            return this;
        }

        public Builder severityName(String severityName) {
            return severityName(Output.of(severityName));
        }

        public PackageIssueArgs build() {
            return $;
        }
    }

}
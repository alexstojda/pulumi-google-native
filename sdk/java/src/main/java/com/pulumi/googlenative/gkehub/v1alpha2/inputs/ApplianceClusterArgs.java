// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ApplianceCluster contains information specific to GDC Edge Appliance Clusters.
 * 
 */
public final class ApplianceClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceClusterArgs Empty = new ApplianceClusterArgs();

    /**
     * Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * 
     */
    @Import(name="resourceLink")
    private @Nullable Output<String> resourceLink;

    /**
     * @return Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * 
     */
    public Optional<Output<String>> resourceLink() {
        return Optional.ofNullable(this.resourceLink);
    }

    private ApplianceClusterArgs() {}

    private ApplianceClusterArgs(ApplianceClusterArgs $) {
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceClusterArgs $;

        public Builder() {
            $ = new ApplianceClusterArgs();
        }

        public Builder(ApplianceClusterArgs defaults) {
            $ = new ApplianceClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(String resourceLink) {
            return resourceLink(Output.of(resourceLink));
        }

        public ApplianceClusterArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Installs an MSI file.
 * 
 */
public final class SoftwareRecipeStepInstallMsiArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepInstallMsiArgs Empty = new SoftwareRecipeStepInstallMsiArgs();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @Import(name="allowedExitCodes")
    private @Nullable Output<List<Integer>> allowedExitCodes;

    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public Optional<Output<List<Integer>>> allowedExitCodes() {
        return Optional.ofNullable(this.allowedExitCodes);
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
    private Output<String> artifactId;

    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public Output<String> artifactId() {
        return this.artifactId;
    }

    /**
     * The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
     * 
     */
    @Import(name="flags")
    private @Nullable Output<List<String>> flags;

    /**
     * @return The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
     * 
     */
    public Optional<Output<List<String>>> flags() {
        return Optional.ofNullable(this.flags);
    }

    private SoftwareRecipeStepInstallMsiArgs() {}

    private SoftwareRecipeStepInstallMsiArgs(SoftwareRecipeStepInstallMsiArgs $) {
        this.allowedExitCodes = $.allowedExitCodes;
        this.artifactId = $.artifactId;
        this.flags = $.flags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeStepInstallMsiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeStepInstallMsiArgs $;

        public Builder() {
            $ = new SoftwareRecipeStepInstallMsiArgs();
        }

        public Builder(SoftwareRecipeStepInstallMsiArgs defaults) {
            $ = new SoftwareRecipeStepInstallMsiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(@Nullable Output<List<Integer>> allowedExitCodes) {
            $.allowedExitCodes = allowedExitCodes;
            return this;
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            return allowedExitCodes(Output.of(allowedExitCodes));
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(Output<String> artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(String artifactId) {
            return artifactId(Output.of(artifactId));
        }

        /**
         * @param flags The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
         * 
         * @return builder
         * 
         */
        public Builder flags(@Nullable Output<List<String>> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
         * 
         * @return builder
         * 
         */
        public Builder flags(List<String> flags) {
            return flags(Output.of(flags));
        }

        /**
         * @param flags The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
         * 
         * @return builder
         * 
         */
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }

        public SoftwareRecipeStepInstallMsiArgs build() {
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            return $;
        }
    }

}
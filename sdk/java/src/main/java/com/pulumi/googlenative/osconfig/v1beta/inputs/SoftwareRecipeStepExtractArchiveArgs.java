// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1beta.enums.SoftwareRecipeStepExtractArchiveType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Extracts an archive of the type specified in the specified directory.
 * 
 */
public final class SoftwareRecipeStepExtractArchiveArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepExtractArchiveArgs Empty = new SoftwareRecipeStepExtractArchiveArgs();

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
     * Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The type of the archive to extract.
     * 
     */
    @Import(name="type", required=true)
    private Output<SoftwareRecipeStepExtractArchiveType> type;

    /**
     * @return The type of the archive to extract.
     * 
     */
    public Output<SoftwareRecipeStepExtractArchiveType> type() {
        return this.type;
    }

    private SoftwareRecipeStepExtractArchiveArgs() {}

    private SoftwareRecipeStepExtractArchiveArgs(SoftwareRecipeStepExtractArchiveArgs $) {
        this.artifactId = $.artifactId;
        this.destination = $.destination;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeStepExtractArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeStepExtractArchiveArgs $;

        public Builder() {
            $ = new SoftwareRecipeStepExtractArchiveArgs();
        }

        public Builder(SoftwareRecipeStepExtractArchiveArgs defaults) {
            $ = new SoftwareRecipeStepExtractArchiveArgs(Objects.requireNonNull(defaults));
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
         * @param destination Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param type The type of the archive to extract.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<SoftwareRecipeStepExtractArchiveType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the archive to extract.
         * 
         * @return builder
         * 
         */
        public Builder type(SoftwareRecipeStepExtractArchiveType type) {
            return type(Output.of(type));
        }

        public SoftwareRecipeStepExtractArchiveArgs build() {
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
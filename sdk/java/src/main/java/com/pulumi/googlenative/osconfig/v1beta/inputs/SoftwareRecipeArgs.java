// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1beta.enums.SoftwareRecipeDesiredState;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeArtifactArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A software recipe is a set of instructions for installing and configuring a piece of software. It consists of a set of artifacts that are downloaded, and a set of steps that install, configure, and/or update the software. Recipes support installing and updating software from artifacts in the following formats: Zip archive, Tar archive, Windows MSI, Debian package, and RPM package. Additionally, recipes support executing a script (either defined in a file or directly in this api) in bash, sh, cmd, and powershell. Updating a software recipe If a recipe is assigned to an instance and there is a recipe with the same name but a lower version already installed and the assigned state of the recipe is `UPDATED`, then the recipe is updated to the new version. Script Working Directories Each script or execution step is run in its own temporary directory which is deleted after completing the step.
 * 
 */
public final class SoftwareRecipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeArgs Empty = new SoftwareRecipeArgs();

    /**
     * Resources available to be used in the steps in the recipe.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<List<SoftwareRecipeArtifactArgs>> artifacts;

    /**
     * @return Resources available to be used in the steps in the recipe.
     * 
     */
    public Optional<Output<List<SoftwareRecipeArtifactArgs>>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * 
     */
    @Import(name="desiredState")
    private @Nullable Output<SoftwareRecipeDesiredState> desiredState;

    /**
     * @return Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * 
     */
    public Optional<Output<SoftwareRecipeDesiredState>> desiredState() {
        return Optional.ofNullable(this.desiredState);
    }

    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    @Import(name="installSteps")
    private @Nullable Output<List<SoftwareRecipeStepArgs>> installSteps;

    /**
     * @return Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    public Optional<Output<List<SoftwareRecipeStepArgs>>> installSteps() {
        return Optional.ofNullable(this.installSteps);
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    @Import(name="updateSteps")
    private @Nullable Output<List<SoftwareRecipeStepArgs>> updateSteps;

    /**
     * @return Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    public Optional<Output<List<SoftwareRecipeStepArgs>>> updateSteps() {
        return Optional.ofNullable(this.updateSteps);
    }

    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private SoftwareRecipeArgs() {}

    private SoftwareRecipeArgs(SoftwareRecipeArgs $) {
        this.artifacts = $.artifacts;
        this.desiredState = $.desiredState;
        this.installSteps = $.installSteps;
        this.name = $.name;
        this.updateSteps = $.updateSteps;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeArgs $;

        public Builder() {
            $ = new SoftwareRecipeArgs();
        }

        public Builder(SoftwareRecipeArgs defaults) {
            $ = new SoftwareRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifacts Resources available to be used in the steps in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(@Nullable Output<List<SoftwareRecipeArtifactArgs>> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        /**
         * @param artifacts Resources available to be used in the steps in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(List<SoftwareRecipeArtifactArgs> artifacts) {
            return artifacts(Output.of(artifacts));
        }

        /**
         * @param artifacts Resources available to be used in the steps in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(SoftwareRecipeArtifactArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }

        /**
         * @param desiredState Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(@Nullable Output<SoftwareRecipeDesiredState> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        /**
         * @param desiredState Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(SoftwareRecipeDesiredState desiredState) {
            return desiredState(Output.of(desiredState));
        }

        /**
         * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
         * 
         * @return builder
         * 
         */
        public Builder installSteps(@Nullable Output<List<SoftwareRecipeStepArgs>> installSteps) {
            $.installSteps = installSteps;
            return this;
        }

        /**
         * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
         * 
         * @return builder
         * 
         */
        public Builder installSteps(List<SoftwareRecipeStepArgs> installSteps) {
            return installSteps(Output.of(installSteps));
        }

        /**
         * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
         * 
         * @return builder
         * 
         */
        public Builder installSteps(SoftwareRecipeStepArgs... installSteps) {
            return installSteps(List.of(installSteps));
        }

        /**
         * @param name Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
         * 
         * @return builder
         * 
         */
        public Builder updateSteps(@Nullable Output<List<SoftwareRecipeStepArgs>> updateSteps) {
            $.updateSteps = updateSteps;
            return this;
        }

        /**
         * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
         * 
         * @return builder
         * 
         */
        public Builder updateSteps(List<SoftwareRecipeStepArgs> updateSteps) {
            return updateSteps(Output.of(updateSteps));
        }

        /**
         * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
         * 
         * @return builder
         * 
         */
        public Builder updateSteps(SoftwareRecipeStepArgs... updateSteps) {
            return updateSteps(List.of(updateSteps));
        }

        /**
         * @param version The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public SoftwareRecipeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepCopyFileArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepExecFileArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepExtractArchiveArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepInstallDpkgArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepInstallMsiArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepInstallRpmArgs;
import com.pulumi.googlenative.osconfig.v1beta.inputs.SoftwareRecipeStepRunScriptArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An action that can be taken as part of installing or updating a recipe.
 * 
 */
public final class SoftwareRecipeStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepArgs Empty = new SoftwareRecipeStepArgs();

    /**
     * Extracts an archive into the specified directory.
     * 
     */
    @Import(name="archiveExtraction")
    private @Nullable Output<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction;

    /**
     * @return Extracts an archive into the specified directory.
     * 
     */
    public Optional<Output<SoftwareRecipeStepExtractArchiveArgs>> archiveExtraction() {
        return Optional.ofNullable(this.archiveExtraction);
    }

    /**
     * Installs a deb file via dpkg.
     * 
     */
    @Import(name="dpkgInstallation")
    private @Nullable Output<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation;

    /**
     * @return Installs a deb file via dpkg.
     * 
     */
    public Optional<Output<SoftwareRecipeStepInstallDpkgArgs>> dpkgInstallation() {
        return Optional.ofNullable(this.dpkgInstallation);
    }

    /**
     * Copies a file onto the instance.
     * 
     */
    @Import(name="fileCopy")
    private @Nullable Output<SoftwareRecipeStepCopyFileArgs> fileCopy;

    /**
     * @return Copies a file onto the instance.
     * 
     */
    public Optional<Output<SoftwareRecipeStepCopyFileArgs>> fileCopy() {
        return Optional.ofNullable(this.fileCopy);
    }

    /**
     * Executes an artifact or local file.
     * 
     */
    @Import(name="fileExec")
    private @Nullable Output<SoftwareRecipeStepExecFileArgs> fileExec;

    /**
     * @return Executes an artifact or local file.
     * 
     */
    public Optional<Output<SoftwareRecipeStepExecFileArgs>> fileExec() {
        return Optional.ofNullable(this.fileExec);
    }

    /**
     * Installs an MSI file.
     * 
     */
    @Import(name="msiInstallation")
    private @Nullable Output<SoftwareRecipeStepInstallMsiArgs> msiInstallation;

    /**
     * @return Installs an MSI file.
     * 
     */
    public Optional<Output<SoftwareRecipeStepInstallMsiArgs>> msiInstallation() {
        return Optional.ofNullable(this.msiInstallation);
    }

    /**
     * Installs an rpm file via the rpm utility.
     * 
     */
    @Import(name="rpmInstallation")
    private @Nullable Output<SoftwareRecipeStepInstallRpmArgs> rpmInstallation;

    /**
     * @return Installs an rpm file via the rpm utility.
     * 
     */
    public Optional<Output<SoftwareRecipeStepInstallRpmArgs>> rpmInstallation() {
        return Optional.ofNullable(this.rpmInstallation);
    }

    /**
     * Runs commands in a shell.
     * 
     */
    @Import(name="scriptRun")
    private @Nullable Output<SoftwareRecipeStepRunScriptArgs> scriptRun;

    /**
     * @return Runs commands in a shell.
     * 
     */
    public Optional<Output<SoftwareRecipeStepRunScriptArgs>> scriptRun() {
        return Optional.ofNullable(this.scriptRun);
    }

    private SoftwareRecipeStepArgs() {}

    private SoftwareRecipeStepArgs(SoftwareRecipeStepArgs $) {
        this.archiveExtraction = $.archiveExtraction;
        this.dpkgInstallation = $.dpkgInstallation;
        this.fileCopy = $.fileCopy;
        this.fileExec = $.fileExec;
        this.msiInstallation = $.msiInstallation;
        this.rpmInstallation = $.rpmInstallation;
        this.scriptRun = $.scriptRun;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeStepArgs $;

        public Builder() {
            $ = new SoftwareRecipeStepArgs();
        }

        public Builder(SoftwareRecipeStepArgs defaults) {
            $ = new SoftwareRecipeStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveExtraction Extracts an archive into the specified directory.
         * 
         * @return builder
         * 
         */
        public Builder archiveExtraction(@Nullable Output<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction) {
            $.archiveExtraction = archiveExtraction;
            return this;
        }

        /**
         * @param archiveExtraction Extracts an archive into the specified directory.
         * 
         * @return builder
         * 
         */
        public Builder archiveExtraction(SoftwareRecipeStepExtractArchiveArgs archiveExtraction) {
            return archiveExtraction(Output.of(archiveExtraction));
        }

        /**
         * @param dpkgInstallation Installs a deb file via dpkg.
         * 
         * @return builder
         * 
         */
        public Builder dpkgInstallation(@Nullable Output<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation) {
            $.dpkgInstallation = dpkgInstallation;
            return this;
        }

        /**
         * @param dpkgInstallation Installs a deb file via dpkg.
         * 
         * @return builder
         * 
         */
        public Builder dpkgInstallation(SoftwareRecipeStepInstallDpkgArgs dpkgInstallation) {
            return dpkgInstallation(Output.of(dpkgInstallation));
        }

        /**
         * @param fileCopy Copies a file onto the instance.
         * 
         * @return builder
         * 
         */
        public Builder fileCopy(@Nullable Output<SoftwareRecipeStepCopyFileArgs> fileCopy) {
            $.fileCopy = fileCopy;
            return this;
        }

        /**
         * @param fileCopy Copies a file onto the instance.
         * 
         * @return builder
         * 
         */
        public Builder fileCopy(SoftwareRecipeStepCopyFileArgs fileCopy) {
            return fileCopy(Output.of(fileCopy));
        }

        /**
         * @param fileExec Executes an artifact or local file.
         * 
         * @return builder
         * 
         */
        public Builder fileExec(@Nullable Output<SoftwareRecipeStepExecFileArgs> fileExec) {
            $.fileExec = fileExec;
            return this;
        }

        /**
         * @param fileExec Executes an artifact or local file.
         * 
         * @return builder
         * 
         */
        public Builder fileExec(SoftwareRecipeStepExecFileArgs fileExec) {
            return fileExec(Output.of(fileExec));
        }

        /**
         * @param msiInstallation Installs an MSI file.
         * 
         * @return builder
         * 
         */
        public Builder msiInstallation(@Nullable Output<SoftwareRecipeStepInstallMsiArgs> msiInstallation) {
            $.msiInstallation = msiInstallation;
            return this;
        }

        /**
         * @param msiInstallation Installs an MSI file.
         * 
         * @return builder
         * 
         */
        public Builder msiInstallation(SoftwareRecipeStepInstallMsiArgs msiInstallation) {
            return msiInstallation(Output.of(msiInstallation));
        }

        /**
         * @param rpmInstallation Installs an rpm file via the rpm utility.
         * 
         * @return builder
         * 
         */
        public Builder rpmInstallation(@Nullable Output<SoftwareRecipeStepInstallRpmArgs> rpmInstallation) {
            $.rpmInstallation = rpmInstallation;
            return this;
        }

        /**
         * @param rpmInstallation Installs an rpm file via the rpm utility.
         * 
         * @return builder
         * 
         */
        public Builder rpmInstallation(SoftwareRecipeStepInstallRpmArgs rpmInstallation) {
            return rpmInstallation(Output.of(rpmInstallation));
        }

        /**
         * @param scriptRun Runs commands in a shell.
         * 
         * @return builder
         * 
         */
        public Builder scriptRun(@Nullable Output<SoftwareRecipeStepRunScriptArgs> scriptRun) {
            $.scriptRun = scriptRun;
            return this;
        }

        /**
         * @param scriptRun Runs commands in a shell.
         * 
         * @return builder
         * 
         */
        public Builder scriptRun(SoftwareRecipeStepRunScriptArgs scriptRun) {
            return scriptRun(Output.of(scriptRun));
        }

        public SoftwareRecipeStepArgs build() {
            return $;
        }
    }

}
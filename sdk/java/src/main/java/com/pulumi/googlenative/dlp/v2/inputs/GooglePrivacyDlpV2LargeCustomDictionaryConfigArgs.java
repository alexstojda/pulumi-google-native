// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2BigQueryFieldArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2CloudStorageFileSetArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2CloudStoragePathArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for a custom dictionary created from a data source of any size up to the maximum size defined in the [limits](https://cloud.google.com/dlp/limits) page. The artifacts of dictionary creation are stored in the specified Google Cloud Storage location. Consider using `CustomInfoType.Dictionary` for smaller dictionaries that satisfy the size requirements.
 * 
 */
public final class GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs Empty = new GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs();

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * 
     */
    @Import(name="bigQueryField")
    private @Nullable Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField;

    /**
     * @return Field in a BigQuery table where each cell represents a dictionary phrase.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2BigQueryFieldArgs>> bigQueryField() {
        return Optional.ofNullable(this.bigQueryField);
    }

    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     * 
     */
    @Import(name="cloudStorageFileSet")
    private @Nullable Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet;

    /**
     * @return Set of files containing newline-delimited lists of dictionary phrases.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2CloudStorageFileSetArgs>> cloudStorageFileSet() {
        return Optional.ofNullable(this.cloudStorageFileSet);
    }

    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * 
     */
    @Import(name="outputPath")
    private @Nullable Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath;

    /**
     * @return Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2CloudStoragePathArgs>> outputPath() {
        return Optional.ofNullable(this.outputPath);
    }

    private GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs() {}

    private GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs(GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs $) {
        this.bigQueryField = $.bigQueryField;
        this.cloudStorageFileSet = $.cloudStorageFileSet;
        this.outputPath = $.outputPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigQueryField Field in a BigQuery table where each cell represents a dictionary phrase.
         * 
         * @return builder
         * 
         */
        public Builder bigQueryField(@Nullable Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField) {
            $.bigQueryField = bigQueryField;
            return this;
        }

        /**
         * @param bigQueryField Field in a BigQuery table where each cell represents a dictionary phrase.
         * 
         * @return builder
         * 
         */
        public Builder bigQueryField(GooglePrivacyDlpV2BigQueryFieldArgs bigQueryField) {
            return bigQueryField(Output.of(bigQueryField));
        }

        /**
         * @param cloudStorageFileSet Set of files containing newline-delimited lists of dictionary phrases.
         * 
         * @return builder
         * 
         */
        public Builder cloudStorageFileSet(@Nullable Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet) {
            $.cloudStorageFileSet = cloudStorageFileSet;
            return this;
        }

        /**
         * @param cloudStorageFileSet Set of files containing newline-delimited lists of dictionary phrases.
         * 
         * @return builder
         * 
         */
        public Builder cloudStorageFileSet(GooglePrivacyDlpV2CloudStorageFileSetArgs cloudStorageFileSet) {
            return cloudStorageFileSet(Output.of(cloudStorageFileSet));
        }

        /**
         * @param outputPath Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
         * 
         * @return builder
         * 
         */
        public Builder outputPath(@Nullable Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath) {
            $.outputPath = outputPath;
            return this;
        }

        /**
         * @param outputPath Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
         * 
         * @return builder
         * 
         */
        public Builder outputPath(GooglePrivacyDlpV2CloudStoragePathArgs outputPath) {
            return outputPath(Output.of(outputPath));
        }

        public GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.enums.GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem;
import com.pulumi.googlenative.dlp.v2.enums.GooglePrivacyDlpV2CloudStorageOptionsSampleMethod;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2FileSetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options defining a file or a set of files within a Google Cloud Storage bucket.
 * 
 */
public final class GooglePrivacyDlpV2CloudStorageOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CloudStorageOptionsArgs Empty = new GooglePrivacyDlpV2CloudStorageOptionsArgs();

    /**
     * Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    @Import(name="bytesLimitPerFile")
    private @Nullable Output<String> bytesLimitPerFile;

    /**
     * @return Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    public Optional<Output<String>> bytesLimitPerFile() {
        return Optional.ofNullable(this.bytesLimitPerFile);
    }

    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    @Import(name="bytesLimitPerFilePercent")
    private @Nullable Output<Integer> bytesLimitPerFilePercent;

    /**
     * @return Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    public Optional<Output<Integer>> bytesLimitPerFilePercent() {
        return Optional.ofNullable(this.bytesLimitPerFilePercent);
    }

    /**
     * The set of one or more files to scan.
     * 
     */
    @Import(name="fileSet")
    private @Nullable Output<GooglePrivacyDlpV2FileSetArgs> fileSet;

    /**
     * @return The set of one or more files to scan.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2FileSetArgs>> fileSet() {
        return Optional.ofNullable(this.fileSet);
    }

    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
     * 
     */
    @Import(name="fileTypes")
    private @Nullable Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes;

    /**
     * @return List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>>> fileTypes() {
        return Optional.ofNullable(this.fileTypes);
    }

    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    @Import(name="filesLimitPercent")
    private @Nullable Output<Integer> filesLimitPercent;

    /**
     * @return Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    public Optional<Output<Integer>> filesLimitPercent() {
        return Optional.ofNullable(this.filesLimitPercent);
    }

    @Import(name="sampleMethod")
    private @Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod;

    public Optional<Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod>> sampleMethod() {
        return Optional.ofNullable(this.sampleMethod);
    }

    private GooglePrivacyDlpV2CloudStorageOptionsArgs() {}

    private GooglePrivacyDlpV2CloudStorageOptionsArgs(GooglePrivacyDlpV2CloudStorageOptionsArgs $) {
        this.bytesLimitPerFile = $.bytesLimitPerFile;
        this.bytesLimitPerFilePercent = $.bytesLimitPerFilePercent;
        this.fileSet = $.fileSet;
        this.fileTypes = $.fileTypes;
        this.filesLimitPercent = $.filesLimitPercent;
        this.sampleMethod = $.sampleMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2CloudStorageOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CloudStorageOptionsArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2CloudStorageOptionsArgs();
        }

        public Builder(GooglePrivacyDlpV2CloudStorageOptionsArgs defaults) {
            $ = new GooglePrivacyDlpV2CloudStorageOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bytesLimitPerFile Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFile(@Nullable Output<String> bytesLimitPerFile) {
            $.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }

        /**
         * @param bytesLimitPerFile Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFile(String bytesLimitPerFile) {
            return bytesLimitPerFile(Output.of(bytesLimitPerFile));
        }

        /**
         * @param bytesLimitPerFilePercent Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFilePercent(@Nullable Output<Integer> bytesLimitPerFilePercent) {
            $.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }

        /**
         * @param bytesLimitPerFilePercent Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFilePercent(Integer bytesLimitPerFilePercent) {
            return bytesLimitPerFilePercent(Output.of(bytesLimitPerFilePercent));
        }

        /**
         * @param fileSet The set of one or more files to scan.
         * 
         * @return builder
         * 
         */
        public Builder fileSet(@Nullable Output<GooglePrivacyDlpV2FileSetArgs> fileSet) {
            $.fileSet = fileSet;
            return this;
        }

        /**
         * @param fileSet The set of one or more files to scan.
         * 
         * @return builder
         * 
         */
        public Builder fileSet(GooglePrivacyDlpV2FileSetArgs fileSet) {
            return fileSet(Output.of(fileSet));
        }

        /**
         * @param fileTypes List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(@Nullable Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes) {
            $.fileTypes = fileTypes;
            return this;
        }

        /**
         * @param fileTypes List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem> fileTypes) {
            return fileTypes(Output.of(fileTypes));
        }

        /**
         * @param fileTypes List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }

        /**
         * @param filesLimitPercent Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder filesLimitPercent(@Nullable Output<Integer> filesLimitPercent) {
            $.filesLimitPercent = filesLimitPercent;
            return this;
        }

        /**
         * @param filesLimitPercent Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder filesLimitPercent(Integer filesLimitPercent) {
            return filesLimitPercent(Output.of(filesLimitPercent));
        }

        public Builder sampleMethod(@Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod) {
            $.sampleMethod = sampleMethod;
            return this;
        }

        public Builder sampleMethod(GooglePrivacyDlpV2CloudStorageOptionsSampleMethod sampleMethod) {
            return sampleMethod(Output.of(sampleMethod));
        }

        public GooglePrivacyDlpV2CloudStorageOptionsArgs build() {
            return $;
        }
    }

}
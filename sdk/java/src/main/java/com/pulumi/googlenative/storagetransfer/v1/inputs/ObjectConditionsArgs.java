// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Conditions that determine which objects are transferred. Applies only to Cloud Data Sources such as S3, Azure, and Cloud Storage. The &#34;last modification time&#34; refers to the time of the last change to the object&#39;s content or metadata — specifically, this is the `updated` property of Cloud Storage objects, the `LastModified` field of S3 objects, and the `Last-Modified` header of Azure blobs. Transfers with a PosixFilesystem source or destination don&#39;t support `ObjectConditions`.
 * 
 */
public final class ObjectConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectConditionsArgs Empty = new ObjectConditionsArgs();

    /**
     * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    @Import(name="excludePrefixes")
    private @Nullable Output<List<String>> excludePrefixes;

    /**
     * @return If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    public Optional<Output<List<String>>> excludePrefixes() {
        return Optional.ofNullable(this.excludePrefixes);
    }

    /**
     * If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    @Import(name="includePrefixes")
    private @Nullable Output<List<String>> includePrefixes;

    /**
     * @return If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    public Optional<Output<List<String>>> includePrefixes() {
        return Optional.ofNullable(this.includePrefixes);
    }

    /**
     * If specified, only objects with a &#34;last modification time&#34; before this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred.
     * 
     */
    @Import(name="lastModifiedBefore")
    private @Nullable Output<String> lastModifiedBefore;

    /**
     * @return If specified, only objects with a &#34;last modification time&#34; before this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred.
     * 
     */
    public Optional<Output<String>> lastModifiedBefore() {
        return Optional.ofNullable(this.lastModifiedBefore);
    }

    /**
     * If specified, only objects with a &#34;last modification time&#34; on or after this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day&#39;s worth of data at a time. For that you&#39;d set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
     * 
     */
    @Import(name="lastModifiedSince")
    private @Nullable Output<String> lastModifiedSince;

    /**
     * @return If specified, only objects with a &#34;last modification time&#34; on or after this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day&#39;s worth of data at a time. For that you&#39;d set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
     * 
     */
    public Optional<Output<String>> lastModifiedSince() {
        return Optional.ofNullable(this.lastModifiedSince);
    }

    /**
     * Ensures that objects are not transferred if a specific maximum time has elapsed since the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation`and the &#34;last modification time&#34; of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
     * 
     */
    @Import(name="maxTimeElapsedSinceLastModification")
    private @Nullable Output<String> maxTimeElapsedSinceLastModification;

    /**
     * @return Ensures that objects are not transferred if a specific maximum time has elapsed since the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation`and the &#34;last modification time&#34; of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
     * 
     */
    public Optional<Output<String>> maxTimeElapsedSinceLastModification() {
        return Optional.ofNullable(this.maxTimeElapsedSinceLastModification);
    }

    /**
     * Ensures that objects are not transferred until a specific minimum time has elapsed after the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation` and the &#34;last modification time&#34; of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
     * 
     */
    @Import(name="minTimeElapsedSinceLastModification")
    private @Nullable Output<String> minTimeElapsedSinceLastModification;

    /**
     * @return Ensures that objects are not transferred until a specific minimum time has elapsed after the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation` and the &#34;last modification time&#34; of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
     * 
     */
    public Optional<Output<String>> minTimeElapsedSinceLastModification() {
        return Optional.ofNullable(this.minTimeElapsedSinceLastModification);
    }

    private ObjectConditionsArgs() {}

    private ObjectConditionsArgs(ObjectConditionsArgs $) {
        this.excludePrefixes = $.excludePrefixes;
        this.includePrefixes = $.includePrefixes;
        this.lastModifiedBefore = $.lastModifiedBefore;
        this.lastModifiedSince = $.lastModifiedSince;
        this.maxTimeElapsedSinceLastModification = $.maxTimeElapsedSinceLastModification;
        this.minTimeElapsedSinceLastModification = $.minTimeElapsedSinceLastModification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectConditionsArgs $;

        public Builder() {
            $ = new ObjectConditionsArgs();
        }

        public Builder(ObjectConditionsArgs defaults) {
            $ = new ObjectConditionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludePrefixes If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
         * 
         * @return builder
         * 
         */
        public Builder excludePrefixes(@Nullable Output<List<String>> excludePrefixes) {
            $.excludePrefixes = excludePrefixes;
            return this;
        }

        /**
         * @param excludePrefixes If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
         * 
         * @return builder
         * 
         */
        public Builder excludePrefixes(List<String> excludePrefixes) {
            return excludePrefixes(Output.of(excludePrefixes));
        }

        /**
         * @param excludePrefixes If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
         * 
         * @return builder
         * 
         */
        public Builder excludePrefixes(String... excludePrefixes) {
            return excludePrefixes(List.of(excludePrefixes));
        }

        /**
         * @param includePrefixes If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
         * 
         * @return builder
         * 
         */
        public Builder includePrefixes(@Nullable Output<List<String>> includePrefixes) {
            $.includePrefixes = includePrefixes;
            return this;
        }

        /**
         * @param includePrefixes If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
         * 
         * @return builder
         * 
         */
        public Builder includePrefixes(List<String> includePrefixes) {
            return includePrefixes(Output.of(includePrefixes));
        }

        /**
         * @param includePrefixes If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
         * 
         * @return builder
         * 
         */
        public Builder includePrefixes(String... includePrefixes) {
            return includePrefixes(List.of(includePrefixes));
        }

        /**
         * @param lastModifiedBefore If specified, only objects with a &#34;last modification time&#34; before this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBefore(@Nullable Output<String> lastModifiedBefore) {
            $.lastModifiedBefore = lastModifiedBefore;
            return this;
        }

        /**
         * @param lastModifiedBefore If specified, only objects with a &#34;last modification time&#34; before this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBefore(String lastModifiedBefore) {
            return lastModifiedBefore(Output.of(lastModifiedBefore));
        }

        /**
         * @param lastModifiedSince If specified, only objects with a &#34;last modification time&#34; on or after this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day&#39;s worth of data at a time. For that you&#39;d set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedSince(@Nullable Output<String> lastModifiedSince) {
            $.lastModifiedSince = lastModifiedSince;
            return this;
        }

        /**
         * @param lastModifiedSince If specified, only objects with a &#34;last modification time&#34; on or after this timestamp and objects that don&#39;t have a &#34;last modification time&#34; are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day&#39;s worth of data at a time. For that you&#39;d set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedSince(String lastModifiedSince) {
            return lastModifiedSince(Output.of(lastModifiedSince));
        }

        /**
         * @param maxTimeElapsedSinceLastModification Ensures that objects are not transferred if a specific maximum time has elapsed since the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation`and the &#34;last modification time&#34; of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
         * 
         * @return builder
         * 
         */
        public Builder maxTimeElapsedSinceLastModification(@Nullable Output<String> maxTimeElapsedSinceLastModification) {
            $.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
            return this;
        }

        /**
         * @param maxTimeElapsedSinceLastModification Ensures that objects are not transferred if a specific maximum time has elapsed since the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation`and the &#34;last modification time&#34; of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
         * 
         * @return builder
         * 
         */
        public Builder maxTimeElapsedSinceLastModification(String maxTimeElapsedSinceLastModification) {
            return maxTimeElapsedSinceLastModification(Output.of(maxTimeElapsedSinceLastModification));
        }

        /**
         * @param minTimeElapsedSinceLastModification Ensures that objects are not transferred until a specific minimum time has elapsed after the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation` and the &#34;last modification time&#34; of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
         * 
         * @return builder
         * 
         */
        public Builder minTimeElapsedSinceLastModification(@Nullable Output<String> minTimeElapsedSinceLastModification) {
            $.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
            return this;
        }

        /**
         * @param minTimeElapsedSinceLastModification Ensures that objects are not transferred until a specific minimum time has elapsed after the &#34;last modification time&#34;. When a TransferOperation begins, objects with a &#34;last modification time&#34; are transferred only if the elapsed time between the start_time of the `TransferOperation` and the &#34;last modification time&#34; of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a &#34;last modification time&#34; are also transferred.
         * 
         * @return builder
         * 
         */
        public Builder minTimeElapsedSinceLastModification(String minTimeElapsedSinceLastModification) {
            return minTimeElapsedSinceLastModification(Output.of(minTimeElapsedSinceLastModification));
        }

        public ObjectConditionsArgs build() {
            return $;
        }
    }

}
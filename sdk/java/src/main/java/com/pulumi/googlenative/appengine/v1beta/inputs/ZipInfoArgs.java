// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The zip file information for a zip deployment.
 * 
 */
public final class ZipInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZipInfoArgs Empty = new ZipInfoArgs();

    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    @Import(name="filesCount")
    private @Nullable Output<Integer> filesCount;

    /**
     * @return An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    public Optional<Output<Integer>> filesCount() {
        return Optional.ofNullable(this.filesCount);
    }

    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
     * 
     */
    @Import(name="sourceUrl")
    private @Nullable Output<String> sourceUrl;

    /**
     * @return URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
     * 
     */
    public Optional<Output<String>> sourceUrl() {
        return Optional.ofNullable(this.sourceUrl);
    }

    private ZipInfoArgs() {}

    private ZipInfoArgs(ZipInfoArgs $) {
        this.filesCount = $.filesCount;
        this.sourceUrl = $.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZipInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZipInfoArgs $;

        public Builder() {
            $ = new ZipInfoArgs();
        }

        public Builder(ZipInfoArgs defaults) {
            $ = new ZipInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filesCount An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
         * 
         * @return builder
         * 
         */
        public Builder filesCount(@Nullable Output<Integer> filesCount) {
            $.filesCount = filesCount;
            return this;
        }

        /**
         * @param filesCount An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
         * 
         * @return builder
         * 
         */
        public Builder filesCount(Integer filesCount) {
            return filesCount(Output.of(filesCount));
        }

        /**
         * @param sourceUrl URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
         * 
         * @return builder
         * 
         */
        public Builder sourceUrl(@Nullable Output<String> sourceUrl) {
            $.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * @param sourceUrl URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
         * 
         * @return builder
         * 
         */
        public Builder sourceUrl(String sourceUrl) {
            return sourceUrl(Output.of(sourceUrl));
        }

        public ZipInfoArgs build() {
            return $;
        }
    }

}
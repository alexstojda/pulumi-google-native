// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A content string and a MIME type that describes the content string&#39;s format.
 * 
 */
public final class DocumentationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentationArgs Empty = new DocumentationArgs();

    /**
     * The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller. This text can be templatized by using variables (https://cloud.google.com/monitoring/alerts/doc-variables).
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller. This text can be templatized by using variables (https://cloud.google.com/monitoring/alerts/doc-variables).
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The format of the content field. Presently, only the value &#34;text/markdown&#34; is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    /**
     * @return The format of the content field. Presently, only the value &#34;text/markdown&#34; is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
     * 
     */
    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    private DocumentationArgs() {}

    private DocumentationArgs(DocumentationArgs $) {
        this.content = $.content;
        this.mimeType = $.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationArgs $;

        public Builder() {
            $ = new DocumentationArgs();
        }

        public Builder(DocumentationArgs defaults) {
            $ = new DocumentationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller. This text can be templatized by using variables (https://cloud.google.com/monitoring/alerts/doc-variables).
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller. This text can be templatized by using variables (https://cloud.google.com/monitoring/alerts/doc-variables).
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param mimeType The format of the content field. Presently, only the value &#34;text/markdown&#34; is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType The format of the content field. Presently, only the value &#34;text/markdown&#34; is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        public DocumentationArgs build() {
            return $;
        }
    }

}
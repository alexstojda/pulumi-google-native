// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpecArgs Empty = new SpecArgs();

    /**
     * Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Required. The ID to use for the spec, which will become the final component of the spec&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     * 
     */
    @Import(name="apiSpecId", required=true)
    private Output<String> apiSpecId;

    /**
     * @return Required. The ID to use for the spec, which will become the final component of the spec&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     * 
     */
    public Output<String> apiSpecId() {
        return this.apiSpecId;
    }

    /**
     * Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.
     * 
     */
    @Import(name="contents")
    private @Nullable Output<String> contents;

    /**
     * @return Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.
     * 
     */
    public Optional<Output<String>> contents() {
        return Optional.ofNullable(this.contents);
    }

    /**
     * A detailed description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A detailed description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A possibly-hierarchical name used to refer to the spec from other specs.
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return A possibly-hierarchical name used to refer to the spec from other specs.
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    /**
     * Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include &#34;application/vnd.apigee.proto&#34;, &#34;application/vnd.apigee.openapi&#34;, and &#34;application/vnd.apigee.graphql&#34;, with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with &#34;+gzip&#34;).
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    /**
     * @return A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include &#34;application/vnd.apigee.proto&#34;, &#34;application/vnd.apigee.openapi&#34;, and &#34;application/vnd.apigee.graphql&#34;, with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with &#34;+gzip&#34;).
     * 
     */
    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.
     * 
     */
    @Import(name="sourceUri")
    private @Nullable Output<String> sourceUri;

    /**
     * @return The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.
     * 
     */
    public Optional<Output<String>> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }

    @Import(name="versionId", required=true)
    private Output<String> versionId;

    public Output<String> versionId() {
        return this.versionId;
    }

    private SpecArgs() {}

    private SpecArgs(SpecArgs $) {
        this.annotations = $.annotations;
        this.apiId = $.apiId;
        this.apiSpecId = $.apiSpecId;
        this.contents = $.contents;
        this.description = $.description;
        this.filename = $.filename;
        this.labels = $.labels;
        this.location = $.location;
        this.mimeType = $.mimeType;
        this.name = $.name;
        this.project = $.project;
        this.sourceUri = $.sourceUri;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpecArgs $;

        public Builder() {
            $ = new SpecArgs();
        }

        public Builder(SpecArgs defaults) {
            $ = new SpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param apiSpecId Required. The ID to use for the spec, which will become the final component of the spec&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
         * 
         * @return builder
         * 
         */
        public Builder apiSpecId(Output<String> apiSpecId) {
            $.apiSpecId = apiSpecId;
            return this;
        }

        /**
         * @param apiSpecId Required. The ID to use for the spec, which will become the final component of the spec&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
         * 
         * @return builder
         * 
         */
        public Builder apiSpecId(String apiSpecId) {
            return apiSpecId(Output.of(apiSpecId));
        }

        /**
         * @param contents Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.
         * 
         * @return builder
         * 
         */
        public Builder contents(@Nullable Output<String> contents) {
            $.contents = contents;
            return this;
        }

        /**
         * @param contents Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.
         * 
         * @return builder
         * 
         */
        public Builder contents(String contents) {
            return contents(Output.of(contents));
        }

        /**
         * @param description A detailed description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A detailed description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filename A possibly-hierarchical name used to refer to the spec from other specs.
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename A possibly-hierarchical name used to refer to the spec from other specs.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        /**
         * @param labels Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mimeType A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include &#34;application/vnd.apigee.proto&#34;, &#34;application/vnd.apigee.openapi&#34;, and &#34;application/vnd.apigee.graphql&#34;, with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with &#34;+gzip&#34;).
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include &#34;application/vnd.apigee.proto&#34;, &#34;application/vnd.apigee.openapi&#34;, and &#34;application/vnd.apigee.graphql&#34;, with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with &#34;+gzip&#34;).
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param sourceUri The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            $.sourceUri = sourceUri;
            return this;
        }

        /**
         * @param sourceUri The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(String sourceUri) {
            return sourceUri(Output.of(sourceUri));
        }

        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public SpecArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.apiSpecId = Objects.requireNonNull($.apiSpecId, "expected parameter 'apiSpecId' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
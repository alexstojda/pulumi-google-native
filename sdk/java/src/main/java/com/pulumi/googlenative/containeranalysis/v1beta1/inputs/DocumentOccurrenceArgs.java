// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DocumentOccurrence represents an SPDX Document Creation Information section: https://spdx.github.io/spdx-spec/2-document-creation-information/
 * 
 */
public final class DocumentOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentOccurrenceArgs Empty = new DocumentOccurrenceArgs();

    /**
     * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    @Import(name="creatorComment")
    private @Nullable Output<String> creatorComment;

    /**
     * @return A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    public Optional<Output<String>> creatorComment() {
        return Optional.ofNullable(this.creatorComment);
    }

    /**
     * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
     */
    @Import(name="creators")
    private @Nullable Output<List<String>> creators;

    /**
     * @return Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
     */
    public Optional<Output<List<String>>> creators() {
        return Optional.ofNullable(this.creators);
    }

    /**
     * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    @Import(name="documentComment")
    private @Nullable Output<String> documentComment;

    /**
     * @return A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    public Optional<Output<String>> documentComment() {
        return Optional.ofNullable(this.documentComment);
    }

    /**
     * Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    @Import(name="externalDocumentRefs")
    private @Nullable Output<List<String>> externalDocumentRefs;

    /**
     * @return Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    public Optional<Output<List<String>>> externalDocumentRefs() {
        return Optional.ofNullable(this.externalDocumentRefs);
    }

    /**
     * Identify the current SPDX document which may be referenced in relationships by other files, packages internally and documents externally
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identify the current SPDX document which may be referenced in relationships by other files, packages internally and documents externally
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    @Import(name="licenseListVersion")
    private @Nullable Output<String> licenseListVersion;

    /**
     * @return A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    public Optional<Output<String>> licenseListVersion() {
        return Optional.ofNullable(this.licenseListVersion);
    }

    /**
     * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Identify name of this document as designated by creator
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Identify name of this document as designated by creator
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private DocumentOccurrenceArgs() {}

    private DocumentOccurrenceArgs(DocumentOccurrenceArgs $) {
        this.createTime = $.createTime;
        this.creatorComment = $.creatorComment;
        this.creators = $.creators;
        this.documentComment = $.documentComment;
        this.externalDocumentRefs = $.externalDocumentRefs;
        this.id = $.id;
        this.licenseListVersion = $.licenseListVersion;
        this.namespace = $.namespace;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentOccurrenceArgs $;

        public Builder() {
            $ = new DocumentOccurrenceArgs();
        }

        public Builder(DocumentOccurrenceArgs defaults) {
            $ = new DocumentOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param creatorComment A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
         * 
         * @return builder
         * 
         */
        public Builder creatorComment(@Nullable Output<String> creatorComment) {
            $.creatorComment = creatorComment;
            return this;
        }

        /**
         * @param creatorComment A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
         * 
         * @return builder
         * 
         */
        public Builder creatorComment(String creatorComment) {
            return creatorComment(Output.of(creatorComment));
        }

        /**
         * @param creators Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
         * 
         * @return builder
         * 
         */
        public Builder creators(@Nullable Output<List<String>> creators) {
            $.creators = creators;
            return this;
        }

        /**
         * @param creators Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
         * 
         * @return builder
         * 
         */
        public Builder creators(List<String> creators) {
            return creators(Output.of(creators));
        }

        /**
         * @param creators Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
         * 
         * @return builder
         * 
         */
        public Builder creators(String... creators) {
            return creators(List.of(creators));
        }

        /**
         * @param documentComment A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
         * 
         * @return builder
         * 
         */
        public Builder documentComment(@Nullable Output<String> documentComment) {
            $.documentComment = documentComment;
            return this;
        }

        /**
         * @param documentComment A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
         * 
         * @return builder
         * 
         */
        public Builder documentComment(String documentComment) {
            return documentComment(Output.of(documentComment));
        }

        /**
         * @param externalDocumentRefs Identify any external SPDX documents referenced within this SPDX document
         * 
         * @return builder
         * 
         */
        public Builder externalDocumentRefs(@Nullable Output<List<String>> externalDocumentRefs) {
            $.externalDocumentRefs = externalDocumentRefs;
            return this;
        }

        /**
         * @param externalDocumentRefs Identify any external SPDX documents referenced within this SPDX document
         * 
         * @return builder
         * 
         */
        public Builder externalDocumentRefs(List<String> externalDocumentRefs) {
            return externalDocumentRefs(Output.of(externalDocumentRefs));
        }

        /**
         * @param externalDocumentRefs Identify any external SPDX documents referenced within this SPDX document
         * 
         * @return builder
         * 
         */
        public Builder externalDocumentRefs(String... externalDocumentRefs) {
            return externalDocumentRefs(List.of(externalDocumentRefs));
        }

        /**
         * @param id Identify the current SPDX document which may be referenced in relationships by other files, packages internally and documents externally
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identify the current SPDX document which may be referenced in relationships by other files, packages internally and documents externally
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param licenseListVersion A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
         * 
         * @return builder
         * 
         */
        public Builder licenseListVersion(@Nullable Output<String> licenseListVersion) {
            $.licenseListVersion = licenseListVersion;
            return this;
        }

        /**
         * @param licenseListVersion A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
         * 
         * @return builder
         * 
         */
        public Builder licenseListVersion(String licenseListVersion) {
            return licenseListVersion(Output.of(licenseListVersion));
        }

        /**
         * @param namespace Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param title Identify name of this document as designated by creator
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Identify name of this document as designated by creator
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public DocumentOccurrenceArgs build() {
            return $;
        }
    }

}
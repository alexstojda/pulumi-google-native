// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DocumentOccurrenceResponse {
    /**
     * @return Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    private String createTime;
    /**
     * @return A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    private String creatorComment;
    /**
     * @return Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
     */
    private List<String> creators;
    /**
     * @return A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    private String documentComment;
    /**
     * @return Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    private List<String> externalDocumentRefs;
    /**
     * @return A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    private String licenseListVersion;
    /**
     * @return Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    private String namespace;
    /**
     * @return Identify name of this document as designated by creator
     * 
     */
    private String title;

    private DocumentOccurrenceResponse() {}
    /**
     * @return Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    public String creatorComment() {
        return this.creatorComment;
    }
    /**
     * @return Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
     */
    public List<String> creators() {
        return this.creators;
    }
    /**
     * @return A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    public String documentComment() {
        return this.documentComment;
    }
    /**
     * @return Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    public List<String> externalDocumentRefs() {
        return this.externalDocumentRefs;
    }
    /**
     * @return A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    public String licenseListVersion() {
        return this.licenseListVersion;
    }
    /**
     * @return Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Identify name of this document as designated by creator
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentOccurrenceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String creatorComment;
        private List<String> creators;
        private String documentComment;
        private List<String> externalDocumentRefs;
        private String licenseListVersion;
        private String namespace;
        private String title;
        public Builder() {}
        public Builder(DocumentOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creatorComment = defaults.creatorComment;
    	      this.creators = defaults.creators;
    	      this.documentComment = defaults.documentComment;
    	      this.externalDocumentRefs = defaults.externalDocumentRefs;
    	      this.licenseListVersion = defaults.licenseListVersion;
    	      this.namespace = defaults.namespace;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder creatorComment(String creatorComment) {
            this.creatorComment = Objects.requireNonNull(creatorComment);
            return this;
        }
        @CustomType.Setter
        public Builder creators(List<String> creators) {
            this.creators = Objects.requireNonNull(creators);
            return this;
        }
        public Builder creators(String... creators) {
            return creators(List.of(creators));
        }
        @CustomType.Setter
        public Builder documentComment(String documentComment) {
            this.documentComment = Objects.requireNonNull(documentComment);
            return this;
        }
        @CustomType.Setter
        public Builder externalDocumentRefs(List<String> externalDocumentRefs) {
            this.externalDocumentRefs = Objects.requireNonNull(externalDocumentRefs);
            return this;
        }
        public Builder externalDocumentRefs(String... externalDocumentRefs) {
            return externalDocumentRefs(List.of(externalDocumentRefs));
        }
        @CustomType.Setter
        public Builder licenseListVersion(String licenseListVersion) {
            this.licenseListVersion = Objects.requireNonNull(licenseListVersion);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public DocumentOccurrenceResponse build() {
            final var o = new DocumentOccurrenceResponse();
            o.createTime = createTime;
            o.creatorComment = creatorComment;
            o.creators = creators;
            o.documentComment = documentComment;
            o.externalDocumentRefs = externalDocumentRefs;
            o.licenseListVersion = licenseListVersion;
            o.namespace = namespace;
            o.title = title;
            return o;
        }
    }
}
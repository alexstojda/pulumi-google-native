// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1beta1.outputs.LicenseResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FileOccurrenceResponse {
    /**
     * @return This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    private List<String> attributions;
    /**
     * @return This field provides a place for the SPDX file creator to record any general comments about the file
     * 
     */
    private String comment;
    /**
     * @return This field provides a place for the SPDX file creator to record file contributors
     * 
     */
    private List<String> contributors;
    /**
     * @return Identify the copyright holder of the file, as well as any dates present
     * 
     */
    private String copyright;
    /**
     * @return This field contains the license information actually found in the file, if any
     * 
     */
    private List<String> filesLicenseInfo;
    /**
     * @return This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
     */
    private LicenseResponse licenseConcluded;
    /**
     * @return This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
     */
    private String notice;

    private FileOccurrenceResponse() {}
    /**
     * @return This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    public List<String> attributions() {
        return this.attributions;
    }
    /**
     * @return This field provides a place for the SPDX file creator to record any general comments about the file
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return This field provides a place for the SPDX file creator to record file contributors
     * 
     */
    public List<String> contributors() {
        return this.contributors;
    }
    /**
     * @return Identify the copyright holder of the file, as well as any dates present
     * 
     */
    public String copyright() {
        return this.copyright;
    }
    /**
     * @return This field contains the license information actually found in the file, if any
     * 
     */
    public List<String> filesLicenseInfo() {
        return this.filesLicenseInfo;
    }
    /**
     * @return This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
     */
    public LicenseResponse licenseConcluded() {
        return this.licenseConcluded;
    }
    /**
     * @return This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
     */
    public String notice() {
        return this.notice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileOccurrenceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> attributions;
        private String comment;
        private List<String> contributors;
        private String copyright;
        private List<String> filesLicenseInfo;
        private LicenseResponse licenseConcluded;
        private String notice;
        public Builder() {}
        public Builder(FileOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributions = defaults.attributions;
    	      this.comment = defaults.comment;
    	      this.contributors = defaults.contributors;
    	      this.copyright = defaults.copyright;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.notice = defaults.notice;
        }

        @CustomType.Setter
        public Builder attributions(List<String> attributions) {
            this.attributions = Objects.requireNonNull(attributions);
            return this;
        }
        public Builder attributions(String... attributions) {
            return attributions(List.of(attributions));
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder contributors(List<String> contributors) {
            this.contributors = Objects.requireNonNull(contributors);
            return this;
        }
        public Builder contributors(String... contributors) {
            return contributors(List.of(contributors));
        }
        @CustomType.Setter
        public Builder copyright(String copyright) {
            this.copyright = Objects.requireNonNull(copyright);
            return this;
        }
        @CustomType.Setter
        public Builder filesLicenseInfo(List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo);
            return this;
        }
        public Builder filesLicenseInfo(String... filesLicenseInfo) {
            return filesLicenseInfo(List.of(filesLicenseInfo));
        }
        @CustomType.Setter
        public Builder licenseConcluded(LicenseResponse licenseConcluded) {
            this.licenseConcluded = Objects.requireNonNull(licenseConcluded);
            return this;
        }
        @CustomType.Setter
        public Builder notice(String notice) {
            this.notice = Objects.requireNonNull(notice);
            return this;
        }
        public FileOccurrenceResponse build() {
            final var o = new FileOccurrenceResponse();
            o.attributions = attributions;
            o.comment = comment;
            o.contributors = contributors;
            o.copyright = copyright;
            o.filesLicenseInfo = filesLicenseInfo;
            o.licenseConcluded = licenseConcluded;
            o.notice = notice;
            return o;
        }
    }
}
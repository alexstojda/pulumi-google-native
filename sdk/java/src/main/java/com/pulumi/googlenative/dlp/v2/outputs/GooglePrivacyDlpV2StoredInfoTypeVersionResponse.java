// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2ErrorResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2StoredInfoTypeConfigResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2StoredInfoTypeStatsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2StoredInfoTypeVersionResponse {
    /**
     * @return StoredInfoType configuration.
     * 
     */
    private GooglePrivacyDlpV2StoredInfoTypeConfigResponse config;
    /**
     * @return Create timestamp of the version. Read-only, determined by the system when the version is created.
     * 
     */
    private String createTime;
    /**
     * @return Errors that occurred when creating this storedInfoType version, or anomalies detected in the storedInfoType data that render it unusable. Only the five most recent errors will be displayed, with the most recent error appearing first. For example, some of the data for stored custom dictionaries is put in the user&#39;s Google Cloud Storage bucket, and if this data is modified or deleted by the user or another system, the dictionary becomes invalid. If any errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType API method to create another version of the storedInfoType to continue using it, reusing the same `config` if it was not the source of the error.
     * 
     */
    private List<GooglePrivacyDlpV2ErrorResponse> errors;
    /**
     * @return Stored info type version state. Read-only, updated by the system during dictionary creation.
     * 
     */
    private String state;
    /**
     * @return Statistics about this storedInfoType version.
     * 
     */
    private GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats;

    private GooglePrivacyDlpV2StoredInfoTypeVersionResponse() {}
    /**
     * @return StoredInfoType configuration.
     * 
     */
    public GooglePrivacyDlpV2StoredInfoTypeConfigResponse config() {
        return this.config;
    }
    /**
     * @return Create timestamp of the version. Read-only, determined by the system when the version is created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Errors that occurred when creating this storedInfoType version, or anomalies detected in the storedInfoType data that render it unusable. Only the five most recent errors will be displayed, with the most recent error appearing first. For example, some of the data for stored custom dictionaries is put in the user&#39;s Google Cloud Storage bucket, and if this data is modified or deleted by the user or another system, the dictionary becomes invalid. If any errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType API method to create another version of the storedInfoType to continue using it, reusing the same `config` if it was not the source of the error.
     * 
     */
    public List<GooglePrivacyDlpV2ErrorResponse> errors() {
        return this.errors;
    }
    /**
     * @return Stored info type version state. Read-only, updated by the system during dictionary creation.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Statistics about this storedInfoType version.
     * 
     */
    public GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats() {
        return this.stats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StoredInfoTypeVersionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GooglePrivacyDlpV2StoredInfoTypeConfigResponse config;
        private String createTime;
        private List<GooglePrivacyDlpV2ErrorResponse> errors;
        private String state;
        private GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2StoredInfoTypeVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.errors = defaults.errors;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
        }

        @CustomType.Setter
        public Builder config(GooglePrivacyDlpV2StoredInfoTypeConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder errors(List<GooglePrivacyDlpV2ErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(GooglePrivacyDlpV2ErrorResponse... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stats(GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats) {
            this.stats = Objects.requireNonNull(stats);
            return this;
        }
        public GooglePrivacyDlpV2StoredInfoTypeVersionResponse build() {
            final var o = new GooglePrivacyDlpV2StoredInfoTypeVersionResponse();
            o.config = config;
            o.createTime = createTime;
            o.errors = errors;
            o.state = state;
            o.stats = stats;
            return o;
        }
    }
}
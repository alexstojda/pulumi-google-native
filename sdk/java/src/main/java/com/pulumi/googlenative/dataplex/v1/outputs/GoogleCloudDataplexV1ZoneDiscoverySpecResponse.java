// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1ZoneDiscoverySpecJsonOptionsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1ZoneDiscoverySpecResponse {
    /**
     * @return Optional. Configuration for CSV data.
     * 
     */
    private GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse csvOptions;
    /**
     * @return Whether discovery is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Optional. The list of patterns to apply for selecting data to exclude during discovery. For Cloud Storage bucket assets, these are interpreted as glob patterns used to match object names. For BigQuery dataset assets, these are interpreted as patterns to match table names.
     * 
     */
    private List<String> excludePatterns;
    /**
     * @return Optional. The list of patterns to apply for selecting data to include during discovery if only a subset of the data should considered. For Cloud Storage bucket assets, these are interpreted as glob patterns used to match object names. For BigQuery dataset assets, these are interpreted as patterns to match table names.
     * 
     */
    private List<String> includePatterns;
    /**
     * @return Optional. Configuration for Json data.
     * 
     */
    private GoogleCloudDataplexV1ZoneDiscoverySpecJsonOptionsResponse jsonOptions;
    /**
     * @return Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running discovery periodically. Successive discovery runs must be scheduled at least 60 minutes apart. The default value is to run discovery every 60 minutes. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;.
     * 
     */
    private String schedule;

    private GoogleCloudDataplexV1ZoneDiscoverySpecResponse() {}
    /**
     * @return Optional. Configuration for CSV data.
     * 
     */
    public GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse csvOptions() {
        return this.csvOptions;
    }
    /**
     * @return Whether discovery is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Optional. The list of patterns to apply for selecting data to exclude during discovery. For Cloud Storage bucket assets, these are interpreted as glob patterns used to match object names. For BigQuery dataset assets, these are interpreted as patterns to match table names.
     * 
     */
    public List<String> excludePatterns() {
        return this.excludePatterns;
    }
    /**
     * @return Optional. The list of patterns to apply for selecting data to include during discovery if only a subset of the data should considered. For Cloud Storage bucket assets, these are interpreted as glob patterns used to match object names. For BigQuery dataset assets, these are interpreted as patterns to match table names.
     * 
     */
    public List<String> includePatterns() {
        return this.includePatterns;
    }
    /**
     * @return Optional. Configuration for Json data.
     * 
     */
    public GoogleCloudDataplexV1ZoneDiscoverySpecJsonOptionsResponse jsonOptions() {
        return this.jsonOptions;
    }
    /**
     * @return Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running discovery periodically. Successive discovery runs must be scheduled at least 60 minutes apart. The default value is to run discovery every 60 minutes. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;.
     * 
     */
    public String schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1ZoneDiscoverySpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse csvOptions;
        private Boolean enabled;
        private List<String> excludePatterns;
        private List<String> includePatterns;
        private GoogleCloudDataplexV1ZoneDiscoverySpecJsonOptionsResponse jsonOptions;
        private String schedule;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1ZoneDiscoverySpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvOptions = defaults.csvOptions;
    	      this.enabled = defaults.enabled;
    	      this.excludePatterns = defaults.excludePatterns;
    	      this.includePatterns = defaults.includePatterns;
    	      this.jsonOptions = defaults.jsonOptions;
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder csvOptions(GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse csvOptions) {
            this.csvOptions = Objects.requireNonNull(csvOptions);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder excludePatterns(List<String> excludePatterns) {
            this.excludePatterns = Objects.requireNonNull(excludePatterns);
            return this;
        }
        public Builder excludePatterns(String... excludePatterns) {
            return excludePatterns(List.of(excludePatterns));
        }
        @CustomType.Setter
        public Builder includePatterns(List<String> includePatterns) {
            this.includePatterns = Objects.requireNonNull(includePatterns);
            return this;
        }
        public Builder includePatterns(String... includePatterns) {
            return includePatterns(List.of(includePatterns));
        }
        @CustomType.Setter
        public Builder jsonOptions(GoogleCloudDataplexV1ZoneDiscoverySpecJsonOptionsResponse jsonOptions) {
            this.jsonOptions = Objects.requireNonNull(jsonOptions);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public GoogleCloudDataplexV1ZoneDiscoverySpecResponse build() {
            final var o = new GoogleCloudDataplexV1ZoneDiscoverySpecResponse();
            o.csvOptions = csvOptions;
            o.enabled = enabled;
            o.excludePatterns = excludePatterns;
            o.includePatterns = includePatterns;
            o.jsonOptions = jsonOptions;
            o.schedule = schedule;
            return o;
        }
    }
}
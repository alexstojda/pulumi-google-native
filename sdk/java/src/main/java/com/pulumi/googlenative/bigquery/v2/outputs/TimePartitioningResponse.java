// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimePartitioningResponse {
    /**
     * @return [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
     * 
     */
    private String expirationMs;
    /**
     * @return [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either &#39;_PARTITIONTIME&#39; as TIMESTAMP type, or &#39;_PARTITIONDATE&#39; as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * 
     */
    private String field;
    private Boolean requirePartitionFilter;
    /**
     * @return [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
     * 
     */
    private String type;

    private TimePartitioningResponse() {}
    /**
     * @return [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
     * 
     */
    public String expirationMs() {
        return this.expirationMs;
    }
    /**
     * @return [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either &#39;_PARTITIONTIME&#39; as TIMESTAMP type, or &#39;_PARTITIONDATE&#39; as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * 
     */
    public String field() {
        return this.field;
    }
    public Boolean requirePartitionFilter() {
        return this.requirePartitionFilter;
    }
    /**
     * @return [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimePartitioningResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expirationMs;
        private String field;
        private Boolean requirePartitionFilter;
        private String type;
        public Builder() {}
        public Builder(TimePartitioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder expirationMs(String expirationMs) {
            this.expirationMs = Objects.requireNonNull(expirationMs);
            return this;
        }
        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder requirePartitionFilter(Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TimePartitioningResponse build() {
            final var o = new TimePartitioningResponse();
            o.expirationMs = expirationMs;
            o.field = field;
            o.requirePartitionFilter = requirePartitionFilter;
            o.type = type;
            return o;
        }
    }
}
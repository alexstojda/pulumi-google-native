// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery.v2.outputs.AvroOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.BigtableOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.CsvOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.GoogleSheetsOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.HivePartitioningOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.ParquetOptionsResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.TableSchemaResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExternalDataConfigurationResponse {
    /**
     * @return Try to detect schema and format options automatically. Any option specified explicitly will be honored.
     * 
     */
    private Boolean autodetect;
    /**
     * @return Additional properties to set if sourceFormat is set to Avro.
     * 
     */
    private AvroOptionsResponse avroOptions;
    /**
     * @return [Optional] Additional options if sourceFormat is set to BIGTABLE.
     * 
     */
    private BigtableOptionsResponse bigtableOptions;
    /**
     * @return [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
     * 
     */
    private String compression;
    /**
     * @return [Optional, Trusted Tester] Connection for external data source.
     * 
     */
    private String connectionId;
    /**
     * @return Additional properties to set if sourceFormat is set to CSV.
     * 
     */
    private CsvOptionsResponse csvOptions;
    /**
     * @return [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is [&#34;NUMERIC&#34;, &#34;BIGNUMERIC&#34;]. If (precision,scale) is: (38,9) -&gt; NUMERIC; (39,9) -&gt; BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -&gt; BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -&gt; BIGNUMERIC; (77,38) -&gt; BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, [&#34;BIGNUMERIC&#34;, &#34;NUMERIC&#34;] is the same as [&#34;NUMERIC&#34;, &#34;BIGNUMERIC&#34;] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to [&#34;NUMERIC&#34;, &#34;STRING&#34;] for ORC and [&#34;NUMERIC&#34;] for the other file formats.
     * 
     */
    private List<String> decimalTargetTypes;
    /**
     * @return [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS.
     * 
     */
    private GoogleSheetsOptionsResponse googleSheetsOptions;
    /**
     * @return [Optional] Options to configure hive partitioning support.
     * 
     */
    private HivePartitioningOptionsResponse hivePartitioningOptions;
    /**
     * @return [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don&#39;t match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This setting is ignored.
     * 
     */
    private Boolean ignoreUnknownValues;
    /**
     * @return [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV, JSON, and Google Sheets. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
     * 
     */
    private Integer maxBadRecords;
    /**
     * @return Additional properties to set if sourceFormat is set to Parquet.
     * 
     */
    private ParquetOptionsResponse parquetOptions;
    /**
     * @return [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore backups, and Avro formats.
     * 
     */
    private TableSchemaResponse schema;
    /**
     * @return [Required] The data format. For CSV files, specify &#34;CSV&#34;. For Google sheets, specify &#34;GOOGLE_SHEETS&#34;. For newline-delimited JSON, specify &#34;NEWLINE_DELIMITED_JSON&#34;. For Avro files, specify &#34;AVRO&#34;. For Google Cloud Datastore backups, specify &#34;DATASTORE_BACKUP&#34;. [Beta] For Google Cloud Bigtable, specify &#34;BIGTABLE&#34;.
     * 
     */
    private String sourceFormat;
    /**
     * @return [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one &#39;*&#39; wildcard character and it must come after the &#39;bucket&#39; name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the &#39;*&#39; wildcard character is not allowed.
     * 
     */
    private List<String> sourceUris;

    private ExternalDataConfigurationResponse() {}
    /**
     * @return Try to detect schema and format options automatically. Any option specified explicitly will be honored.
     * 
     */
    public Boolean autodetect() {
        return this.autodetect;
    }
    /**
     * @return Additional properties to set if sourceFormat is set to Avro.
     * 
     */
    public AvroOptionsResponse avroOptions() {
        return this.avroOptions;
    }
    /**
     * @return [Optional] Additional options if sourceFormat is set to BIGTABLE.
     * 
     */
    public BigtableOptionsResponse bigtableOptions() {
        return this.bigtableOptions;
    }
    /**
     * @return [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
     * 
     */
    public String compression() {
        return this.compression;
    }
    /**
     * @return [Optional, Trusted Tester] Connection for external data source.
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }
    /**
     * @return Additional properties to set if sourceFormat is set to CSV.
     * 
     */
    public CsvOptionsResponse csvOptions() {
        return this.csvOptions;
    }
    /**
     * @return [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is [&#34;NUMERIC&#34;, &#34;BIGNUMERIC&#34;]. If (precision,scale) is: (38,9) -&gt; NUMERIC; (39,9) -&gt; BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -&gt; BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -&gt; BIGNUMERIC; (77,38) -&gt; BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, [&#34;BIGNUMERIC&#34;, &#34;NUMERIC&#34;] is the same as [&#34;NUMERIC&#34;, &#34;BIGNUMERIC&#34;] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to [&#34;NUMERIC&#34;, &#34;STRING&#34;] for ORC and [&#34;NUMERIC&#34;] for the other file formats.
     * 
     */
    public List<String> decimalTargetTypes() {
        return this.decimalTargetTypes;
    }
    /**
     * @return [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS.
     * 
     */
    public GoogleSheetsOptionsResponse googleSheetsOptions() {
        return this.googleSheetsOptions;
    }
    /**
     * @return [Optional] Options to configure hive partitioning support.
     * 
     */
    public HivePartitioningOptionsResponse hivePartitioningOptions() {
        return this.hivePartitioningOptions;
    }
    /**
     * @return [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don&#39;t match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This setting is ignored.
     * 
     */
    public Boolean ignoreUnknownValues() {
        return this.ignoreUnknownValues;
    }
    /**
     * @return [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV, JSON, and Google Sheets. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
     * 
     */
    public Integer maxBadRecords() {
        return this.maxBadRecords;
    }
    /**
     * @return Additional properties to set if sourceFormat is set to Parquet.
     * 
     */
    public ParquetOptionsResponse parquetOptions() {
        return this.parquetOptions;
    }
    /**
     * @return [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore backups, and Avro formats.
     * 
     */
    public TableSchemaResponse schema() {
        return this.schema;
    }
    /**
     * @return [Required] The data format. For CSV files, specify &#34;CSV&#34;. For Google sheets, specify &#34;GOOGLE_SHEETS&#34;. For newline-delimited JSON, specify &#34;NEWLINE_DELIMITED_JSON&#34;. For Avro files, specify &#34;AVRO&#34;. For Google Cloud Datastore backups, specify &#34;DATASTORE_BACKUP&#34;. [Beta] For Google Cloud Bigtable, specify &#34;BIGTABLE&#34;.
     * 
     */
    public String sourceFormat() {
        return this.sourceFormat;
    }
    /**
     * @return [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one &#39;*&#39; wildcard character and it must come after the &#39;bucket&#39; name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the &#39;*&#39; wildcard character is not allowed.
     * 
     */
    public List<String> sourceUris() {
        return this.sourceUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDataConfigurationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autodetect;
        private AvroOptionsResponse avroOptions;
        private BigtableOptionsResponse bigtableOptions;
        private String compression;
        private String connectionId;
        private CsvOptionsResponse csvOptions;
        private List<String> decimalTargetTypes;
        private GoogleSheetsOptionsResponse googleSheetsOptions;
        private HivePartitioningOptionsResponse hivePartitioningOptions;
        private Boolean ignoreUnknownValues;
        private Integer maxBadRecords;
        private ParquetOptionsResponse parquetOptions;
        private TableSchemaResponse schema;
        private String sourceFormat;
        private List<String> sourceUris;
        public Builder() {}
        public Builder(ExternalDataConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autodetect = defaults.autodetect;
    	      this.avroOptions = defaults.avroOptions;
    	      this.bigtableOptions = defaults.bigtableOptions;
    	      this.compression = defaults.compression;
    	      this.connectionId = defaults.connectionId;
    	      this.csvOptions = defaults.csvOptions;
    	      this.decimalTargetTypes = defaults.decimalTargetTypes;
    	      this.googleSheetsOptions = defaults.googleSheetsOptions;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.parquetOptions = defaults.parquetOptions;
    	      this.schema = defaults.schema;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
        }

        @CustomType.Setter
        public Builder autodetect(Boolean autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }
        @CustomType.Setter
        public Builder avroOptions(AvroOptionsResponse avroOptions) {
            this.avroOptions = Objects.requireNonNull(avroOptions);
            return this;
        }
        @CustomType.Setter
        public Builder bigtableOptions(BigtableOptionsResponse bigtableOptions) {
            this.bigtableOptions = Objects.requireNonNull(bigtableOptions);
            return this;
        }
        @CustomType.Setter
        public Builder compression(String compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        @CustomType.Setter
        public Builder csvOptions(CsvOptionsResponse csvOptions) {
            this.csvOptions = Objects.requireNonNull(csvOptions);
            return this;
        }
        @CustomType.Setter
        public Builder decimalTargetTypes(List<String> decimalTargetTypes) {
            this.decimalTargetTypes = Objects.requireNonNull(decimalTargetTypes);
            return this;
        }
        public Builder decimalTargetTypes(String... decimalTargetTypes) {
            return decimalTargetTypes(List.of(decimalTargetTypes));
        }
        @CustomType.Setter
        public Builder googleSheetsOptions(GoogleSheetsOptionsResponse googleSheetsOptions) {
            this.googleSheetsOptions = Objects.requireNonNull(googleSheetsOptions);
            return this;
        }
        @CustomType.Setter
        public Builder hivePartitioningOptions(HivePartitioningOptionsResponse hivePartitioningOptions) {
            this.hivePartitioningOptions = Objects.requireNonNull(hivePartitioningOptions);
            return this;
        }
        @CustomType.Setter
        public Builder ignoreUnknownValues(Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = Objects.requireNonNull(ignoreUnknownValues);
            return this;
        }
        @CustomType.Setter
        public Builder maxBadRecords(Integer maxBadRecords) {
            this.maxBadRecords = Objects.requireNonNull(maxBadRecords);
            return this;
        }
        @CustomType.Setter
        public Builder parquetOptions(ParquetOptionsResponse parquetOptions) {
            this.parquetOptions = Objects.requireNonNull(parquetOptions);
            return this;
        }
        @CustomType.Setter
        public Builder schema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder sourceFormat(String sourceFormat) {
            this.sourceFormat = Objects.requireNonNull(sourceFormat);
            return this;
        }
        @CustomType.Setter
        public Builder sourceUris(List<String> sourceUris) {
            this.sourceUris = Objects.requireNonNull(sourceUris);
            return this;
        }
        public Builder sourceUris(String... sourceUris) {
            return sourceUris(List.of(sourceUris));
        }
        public ExternalDataConfigurationResponse build() {
            final var o = new ExternalDataConfigurationResponse();
            o.autodetect = autodetect;
            o.avroOptions = avroOptions;
            o.bigtableOptions = bigtableOptions;
            o.compression = compression;
            o.connectionId = connectionId;
            o.csvOptions = csvOptions;
            o.decimalTargetTypes = decimalTargetTypes;
            o.googleSheetsOptions = googleSheetsOptions;
            o.hivePartitioningOptions = hivePartitioningOptions;
            o.ignoreUnknownValues = ignoreUnknownValues;
            o.maxBadRecords = maxBadRecords;
            o.parquetOptions = parquetOptions;
            o.schema = schema;
            o.sourceFormat = sourceFormat;
            o.sourceUris = sourceUris;
            return o;
        }
    }
}
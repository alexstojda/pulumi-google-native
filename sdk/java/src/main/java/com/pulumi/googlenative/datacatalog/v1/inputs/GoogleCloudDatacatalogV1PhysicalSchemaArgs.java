// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1PhysicalSchemaCsvSchemaArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1PhysicalSchemaParquetSchemaArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchemaArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Native schema used by a resource represented as an entry. Used by query engines for deserializing and parsing source data.
 * 
 */
public final class GoogleCloudDatacatalogV1PhysicalSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1PhysicalSchemaArgs Empty = new GoogleCloudDatacatalogV1PhysicalSchemaArgs();

    /**
     * Schema in Avro JSON format.
     * 
     */
    @Import(name="avro")
    private @Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaArgs> avro;

    /**
     * @return Schema in Avro JSON format.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaArgs>> avro() {
        return Optional.ofNullable(this.avro);
    }

    /**
     * Marks a CSV-encoded data source.
     * 
     */
    @Import(name="csv")
    private @Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaCsvSchemaArgs> csv;

    /**
     * @return Marks a CSV-encoded data source.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1PhysicalSchemaCsvSchemaArgs>> csv() {
        return Optional.ofNullable(this.csv);
    }

    /**
     * Marks an ORC-encoded data source.
     * 
     */
    @Import(name="orc")
    private @Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaArgs> orc;

    /**
     * @return Marks an ORC-encoded data source.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaArgs>> orc() {
        return Optional.ofNullable(this.orc);
    }

    /**
     * Marks a Parquet-encoded data source.
     * 
     */
    @Import(name="parquet")
    private @Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaParquetSchemaArgs> parquet;

    /**
     * @return Marks a Parquet-encoded data source.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1PhysicalSchemaParquetSchemaArgs>> parquet() {
        return Optional.ofNullable(this.parquet);
    }

    /**
     * Schema in protocol buffer format.
     * 
     */
    @Import(name="protobuf")
    private @Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchemaArgs> protobuf;

    /**
     * @return Schema in protocol buffer format.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchemaArgs>> protobuf() {
        return Optional.ofNullable(this.protobuf);
    }

    /**
     * Schema in Thrift format.
     * 
     */
    @Import(name="thrift")
    private @Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs> thrift;

    /**
     * @return Schema in Thrift format.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs>> thrift() {
        return Optional.ofNullable(this.thrift);
    }

    private GoogleCloudDatacatalogV1PhysicalSchemaArgs() {}

    private GoogleCloudDatacatalogV1PhysicalSchemaArgs(GoogleCloudDatacatalogV1PhysicalSchemaArgs $) {
        this.avro = $.avro;
        this.csv = $.csv;
        this.orc = $.orc;
        this.parquet = $.parquet;
        this.protobuf = $.protobuf;
        this.thrift = $.thrift;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1PhysicalSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1PhysicalSchemaArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1PhysicalSchemaArgs();
        }

        public Builder(GoogleCloudDatacatalogV1PhysicalSchemaArgs defaults) {
            $ = new GoogleCloudDatacatalogV1PhysicalSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param avro Schema in Avro JSON format.
         * 
         * @return builder
         * 
         */
        public Builder avro(@Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaArgs> avro) {
            $.avro = avro;
            return this;
        }

        /**
         * @param avro Schema in Avro JSON format.
         * 
         * @return builder
         * 
         */
        public Builder avro(GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaArgs avro) {
            return avro(Output.of(avro));
        }

        /**
         * @param csv Marks a CSV-encoded data source.
         * 
         * @return builder
         * 
         */
        public Builder csv(@Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaCsvSchemaArgs> csv) {
            $.csv = csv;
            return this;
        }

        /**
         * @param csv Marks a CSV-encoded data source.
         * 
         * @return builder
         * 
         */
        public Builder csv(GoogleCloudDatacatalogV1PhysicalSchemaCsvSchemaArgs csv) {
            return csv(Output.of(csv));
        }

        /**
         * @param orc Marks an ORC-encoded data source.
         * 
         * @return builder
         * 
         */
        public Builder orc(@Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaArgs> orc) {
            $.orc = orc;
            return this;
        }

        /**
         * @param orc Marks an ORC-encoded data source.
         * 
         * @return builder
         * 
         */
        public Builder orc(GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaArgs orc) {
            return orc(Output.of(orc));
        }

        /**
         * @param parquet Marks a Parquet-encoded data source.
         * 
         * @return builder
         * 
         */
        public Builder parquet(@Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaParquetSchemaArgs> parquet) {
            $.parquet = parquet;
            return this;
        }

        /**
         * @param parquet Marks a Parquet-encoded data source.
         * 
         * @return builder
         * 
         */
        public Builder parquet(GoogleCloudDatacatalogV1PhysicalSchemaParquetSchemaArgs parquet) {
            return parquet(Output.of(parquet));
        }

        /**
         * @param protobuf Schema in protocol buffer format.
         * 
         * @return builder
         * 
         */
        public Builder protobuf(@Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchemaArgs> protobuf) {
            $.protobuf = protobuf;
            return this;
        }

        /**
         * @param protobuf Schema in protocol buffer format.
         * 
         * @return builder
         * 
         */
        public Builder protobuf(GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchemaArgs protobuf) {
            return protobuf(Output.of(protobuf));
        }

        /**
         * @param thrift Schema in Thrift format.
         * 
         * @return builder
         * 
         */
        public Builder thrift(@Nullable Output<GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs> thrift) {
            $.thrift = thrift;
            return this;
        }

        /**
         * @param thrift Schema in Thrift format.
         * 
         * @return builder
         * 
         */
        public Builder thrift(GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs thrift) {
            return thrift(Output.of(thrift));
        }

        public GoogleCloudDatacatalogV1PhysicalSchemaArgs build() {
            return $;
        }
    }

}
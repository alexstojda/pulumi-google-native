// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1alpha1.inputs.OracleColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Oracle table.
 * 
 */
public final class OracleTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleTableArgs Empty = new OracleTableArgs();

    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
     */
    @Import(name="oracleColumns")
    private @Nullable Output<List<OracleColumnArgs>> oracleColumns;

    /**
     * @return Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
     */
    public Optional<Output<List<OracleColumnArgs>>> oracleColumns() {
        return Optional.ofNullable(this.oracleColumns);
    }

    /**
     * Table name.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    /**
     * @return Table name.
     * 
     */
    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    private OracleTableArgs() {}

    private OracleTableArgs(OracleTableArgs $) {
        this.oracleColumns = $.oracleColumns;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleTableArgs $;

        public Builder() {
            $ = new OracleTableArgs();
        }

        public Builder(OracleTableArgs defaults) {
            $ = new OracleTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oracleColumns Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder oracleColumns(@Nullable Output<List<OracleColumnArgs>> oracleColumns) {
            $.oracleColumns = oracleColumns;
            return this;
        }

        /**
         * @param oracleColumns Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder oracleColumns(List<OracleColumnArgs> oracleColumns) {
            return oracleColumns(Output.of(oracleColumns));
        }

        /**
         * @param oracleColumns Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder oracleColumns(OracleColumnArgs... oracleColumns) {
            return oracleColumns(List.of(oracleColumns));
        }

        /**
         * @param tableName Table name.
         * 
         * @return builder
         * 
         */
        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName Table name.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public OracleTableArgs build() {
            return $;
        }
    }

}
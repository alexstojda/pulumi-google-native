// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2BigQueryTableArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message defining a field of a BigQuery table.
 * 
 */
public final class GooglePrivacyDlpV2BigQueryFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2BigQueryFieldArgs Empty = new GooglePrivacyDlpV2BigQueryFieldArgs();

    /**
     * Designated field in the BigQuery table.
     * 
     */
    @Import(name="field")
    private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field;

    /**
     * @return Designated field in the BigQuery table.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2FieldIdArgs>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * Source table of the field.
     * 
     */
    @Import(name="table")
    private @Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> table;

    /**
     * @return Source table of the field.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2BigQueryTableArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    private GooglePrivacyDlpV2BigQueryFieldArgs() {}

    private GooglePrivacyDlpV2BigQueryFieldArgs(GooglePrivacyDlpV2BigQueryFieldArgs $) {
        this.field = $.field;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2BigQueryFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BigQueryFieldArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2BigQueryFieldArgs();
        }

        public Builder(GooglePrivacyDlpV2BigQueryFieldArgs defaults) {
            $ = new GooglePrivacyDlpV2BigQueryFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field Designated field in the BigQuery table.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Designated field in the BigQuery table.
         * 
         * @return builder
         * 
         */
        public Builder field(GooglePrivacyDlpV2FieldIdArgs field) {
            return field(Output.of(field));
        }

        /**
         * @param table Source table of the field.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Source table of the field.
         * 
         * @return builder
         * 
         */
        public Builder table(GooglePrivacyDlpV2BigQueryTableArgs table) {
            return table(Output.of(table));
        }

        public GooglePrivacyDlpV2BigQueryFieldArgs build() {
            return $;
        }
    }

}
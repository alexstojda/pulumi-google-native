// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2FieldTransformationArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2RecordSuppressionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A type of transformation that is applied over structured data such as a table.
 * 
 */
public final class GooglePrivacyDlpV2RecordTransformationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RecordTransformationsArgs Empty = new GooglePrivacyDlpV2RecordTransformationsArgs();

    /**
     * Transform the record by applying various field transformations.
     * 
     */
    @Import(name="fieldTransformations")
    private @Nullable Output<List<GooglePrivacyDlpV2FieldTransformationArgs>> fieldTransformations;

    /**
     * @return Transform the record by applying various field transformations.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2FieldTransformationArgs>>> fieldTransformations() {
        return Optional.ofNullable(this.fieldTransformations);
    }

    /**
     * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
     */
    @Import(name="recordSuppressions")
    private @Nullable Output<List<GooglePrivacyDlpV2RecordSuppressionArgs>> recordSuppressions;

    /**
     * @return Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2RecordSuppressionArgs>>> recordSuppressions() {
        return Optional.ofNullable(this.recordSuppressions);
    }

    private GooglePrivacyDlpV2RecordTransformationsArgs() {}

    private GooglePrivacyDlpV2RecordTransformationsArgs(GooglePrivacyDlpV2RecordTransformationsArgs $) {
        this.fieldTransformations = $.fieldTransformations;
        this.recordSuppressions = $.recordSuppressions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2RecordTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordTransformationsArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2RecordTransformationsArgs();
        }

        public Builder(GooglePrivacyDlpV2RecordTransformationsArgs defaults) {
            $ = new GooglePrivacyDlpV2RecordTransformationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldTransformations Transform the record by applying various field transformations.
         * 
         * @return builder
         * 
         */
        public Builder fieldTransformations(@Nullable Output<List<GooglePrivacyDlpV2FieldTransformationArgs>> fieldTransformations) {
            $.fieldTransformations = fieldTransformations;
            return this;
        }

        /**
         * @param fieldTransformations Transform the record by applying various field transformations.
         * 
         * @return builder
         * 
         */
        public Builder fieldTransformations(List<GooglePrivacyDlpV2FieldTransformationArgs> fieldTransformations) {
            return fieldTransformations(Output.of(fieldTransformations));
        }

        /**
         * @param fieldTransformations Transform the record by applying various field transformations.
         * 
         * @return builder
         * 
         */
        public Builder fieldTransformations(GooglePrivacyDlpV2FieldTransformationArgs... fieldTransformations) {
            return fieldTransformations(List.of(fieldTransformations));
        }

        /**
         * @param recordSuppressions Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
         * 
         * @return builder
         * 
         */
        public Builder recordSuppressions(@Nullable Output<List<GooglePrivacyDlpV2RecordSuppressionArgs>> recordSuppressions) {
            $.recordSuppressions = recordSuppressions;
            return this;
        }

        /**
         * @param recordSuppressions Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
         * 
         * @return builder
         * 
         */
        public Builder recordSuppressions(List<GooglePrivacyDlpV2RecordSuppressionArgs> recordSuppressions) {
            return recordSuppressions(Output.of(recordSuppressions));
        }

        /**
         * @param recordSuppressions Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
         * 
         * @return builder
         * 
         */
        public Builder recordSuppressions(GooglePrivacyDlpV2RecordSuppressionArgs... recordSuppressions) {
            return recordSuppressions(List.of(recordSuppressions));
        }

        public GooglePrivacyDlpV2RecordTransformationsArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datalabeling.v1beta1.enums.GoogleCloudDatalabelingV1beta1InputConfigAnnotationType;
import com.pulumi.googlenative.datalabeling.v1beta1.enums.GoogleCloudDatalabelingV1beta1InputConfigDataType;
import com.pulumi.googlenative.datalabeling.v1beta1.inputs.GoogleCloudDatalabelingV1beta1BigQuerySourceArgs;
import com.pulumi.googlenative.datalabeling.v1beta1.inputs.GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs;
import com.pulumi.googlenative.datalabeling.v1beta1.inputs.GoogleCloudDatalabelingV1beta1GcsSourceArgs;
import com.pulumi.googlenative.datalabeling.v1beta1.inputs.GoogleCloudDatalabelingV1beta1TextMetadataArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of input data, including data type, location, etc.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1InputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1InputConfigArgs Empty = new GoogleCloudDatalabelingV1beta1InputConfigArgs();

    /**
     * Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @Import(name="annotationType")
    private @Nullable Output<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> annotationType;

    /**
     * @return Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    public Optional<Output<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType>> annotationType() {
        return Optional.ofNullable(this.annotationType);
    }

    /**
     * Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @Import(name="bigquerySource")
    private @Nullable Output<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> bigquerySource;

    /**
     * @return Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    public Optional<Output<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs>> bigquerySource() {
        return Optional.ofNullable(this.bigquerySource);
    }

    /**
     * Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
     * 
     */
    @Import(name="classificationMetadata")
    private @Nullable Output<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> classificationMetadata;

    /**
     * @return Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
     * 
     */
    public Optional<Output<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs>> classificationMetadata() {
        return Optional.ofNullable(this.classificationMetadata);
    }

    /**
     * Data type must be specifed when user tries to import data.
     * 
     */
    @Import(name="dataType", required=true)
    private Output<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType;

    /**
     * @return Data type must be specifed when user tries to import data.
     * 
     */
    public Output<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType() {
        return this.dataType;
    }

    /**
     * Source located in Cloud Storage.
     * 
     */
    @Import(name="gcsSource")
    private @Nullable Output<GoogleCloudDatalabelingV1beta1GcsSourceArgs> gcsSource;

    /**
     * @return Source located in Cloud Storage.
     * 
     */
    public Optional<Output<GoogleCloudDatalabelingV1beta1GcsSourceArgs>> gcsSource() {
        return Optional.ofNullable(this.gcsSource);
    }

    /**
     * Required for text import, as language code must be specified.
     * 
     */
    @Import(name="textMetadata")
    private @Nullable Output<GoogleCloudDatalabelingV1beta1TextMetadataArgs> textMetadata;

    /**
     * @return Required for text import, as language code must be specified.
     * 
     */
    public Optional<Output<GoogleCloudDatalabelingV1beta1TextMetadataArgs>> textMetadata() {
        return Optional.ofNullable(this.textMetadata);
    }

    private GoogleCloudDatalabelingV1beta1InputConfigArgs() {}

    private GoogleCloudDatalabelingV1beta1InputConfigArgs(GoogleCloudDatalabelingV1beta1InputConfigArgs $) {
        this.annotationType = $.annotationType;
        this.bigquerySource = $.bigquerySource;
        this.classificationMetadata = $.classificationMetadata;
        this.dataType = $.dataType;
        this.gcsSource = $.gcsSource;
        this.textMetadata = $.textMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1InputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1InputConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1InputConfigArgs();
        }

        public Builder(GoogleCloudDatalabelingV1beta1InputConfigArgs defaults) {
            $ = new GoogleCloudDatalabelingV1beta1InputConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotationType Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(@Nullable Output<GoogleCloudDatalabelingV1beta1InputConfigAnnotationType> annotationType) {
            $.annotationType = annotationType;
            return this;
        }

        /**
         * @param annotationType Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(GoogleCloudDatalabelingV1beta1InputConfigAnnotationType annotationType) {
            return annotationType(Output.of(annotationType));
        }

        /**
         * @param bigquerySource Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
         * 
         * @return builder
         * 
         */
        public Builder bigquerySource(@Nullable Output<GoogleCloudDatalabelingV1beta1BigQuerySourceArgs> bigquerySource) {
            $.bigquerySource = bigquerySource;
            return this;
        }

        /**
         * @param bigquerySource Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
         * 
         * @return builder
         * 
         */
        public Builder bigquerySource(GoogleCloudDatalabelingV1beta1BigQuerySourceArgs bigquerySource) {
            return bigquerySource(Output.of(bigquerySource));
        }

        /**
         * @param classificationMetadata Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
         * 
         * @return builder
         * 
         */
        public Builder classificationMetadata(@Nullable Output<GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs> classificationMetadata) {
            $.classificationMetadata = classificationMetadata;
            return this;
        }

        /**
         * @param classificationMetadata Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
         * 
         * @return builder
         * 
         */
        public Builder classificationMetadata(GoogleCloudDatalabelingV1beta1ClassificationMetadataArgs classificationMetadata) {
            return classificationMetadata(Output.of(classificationMetadata));
        }

        /**
         * @param dataType Data type must be specifed when user tries to import data.
         * 
         * @return builder
         * 
         */
        public Builder dataType(Output<GoogleCloudDatalabelingV1beta1InputConfigDataType> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType Data type must be specifed when user tries to import data.
         * 
         * @return builder
         * 
         */
        public Builder dataType(GoogleCloudDatalabelingV1beta1InputConfigDataType dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param gcsSource Source located in Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder gcsSource(@Nullable Output<GoogleCloudDatalabelingV1beta1GcsSourceArgs> gcsSource) {
            $.gcsSource = gcsSource;
            return this;
        }

        /**
         * @param gcsSource Source located in Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder gcsSource(GoogleCloudDatalabelingV1beta1GcsSourceArgs gcsSource) {
            return gcsSource(Output.of(gcsSource));
        }

        /**
         * @param textMetadata Required for text import, as language code must be specified.
         * 
         * @return builder
         * 
         */
        public Builder textMetadata(@Nullable Output<GoogleCloudDatalabelingV1beta1TextMetadataArgs> textMetadata) {
            $.textMetadata = textMetadata;
            return this;
        }

        /**
         * @param textMetadata Required for text import, as language code must be specified.
         * 
         * @return builder
         * 
         */
        public Builder textMetadata(GoogleCloudDatalabelingV1beta1TextMetadataArgs textMetadata) {
            return textMetadata(Output.of(textMetadata));
        }

        public GoogleCloudDatalabelingV1beta1InputConfigArgs build() {
            $.dataType = Objects.requireNonNull($.dataType, "expected parameter 'dataType' to be non-null");
            return $;
        }
    }

}
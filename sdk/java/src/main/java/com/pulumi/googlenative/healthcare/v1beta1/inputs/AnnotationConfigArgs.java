// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how to store annotations during de-identification operation.
 * 
 */
public final class AnnotationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnnotationConfigArgs Empty = new AnnotationConfigArgs();

    /**
     * The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`). * The destination annotation store must be in the same project as the source data. De-identifying data across multiple projects is not supported. * The destination annotation store must exist when using DeidentifyDicomStore or DeidentifyFhirStore. DeidentifyDataset automatically creates the destination annotation store.
     * 
     */
    @Import(name="annotationStoreName")
    private @Nullable Output<String> annotationStoreName;

    /**
     * @return The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`). * The destination annotation store must be in the same project as the source data. De-identifying data across multiple projects is not supported. * The destination annotation store must exist when using DeidentifyDicomStore or DeidentifyFhirStore. DeidentifyDataset automatically creates the destination annotation store.
     * 
     */
    public Optional<Output<String>> annotationStoreName() {
        return Optional.ofNullable(this.annotationStoreName);
    }

    /**
     * If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
     * 
     */
    @Import(name="storeQuote")
    private @Nullable Output<Boolean> storeQuote;

    /**
     * @return If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
     * 
     */
    public Optional<Output<Boolean>> storeQuote() {
        return Optional.ofNullable(this.storeQuote);
    }

    private AnnotationConfigArgs() {}

    private AnnotationConfigArgs(AnnotationConfigArgs $) {
        this.annotationStoreName = $.annotationStoreName;
        this.storeQuote = $.storeQuote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnnotationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnnotationConfigArgs $;

        public Builder() {
            $ = new AnnotationConfigArgs();
        }

        public Builder(AnnotationConfigArgs defaults) {
            $ = new AnnotationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotationStoreName The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`). * The destination annotation store must be in the same project as the source data. De-identifying data across multiple projects is not supported. * The destination annotation store must exist when using DeidentifyDicomStore or DeidentifyFhirStore. DeidentifyDataset automatically creates the destination annotation store.
         * 
         * @return builder
         * 
         */
        public Builder annotationStoreName(@Nullable Output<String> annotationStoreName) {
            $.annotationStoreName = annotationStoreName;
            return this;
        }

        /**
         * @param annotationStoreName The name of the annotation store, in the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`). * The destination annotation store must be in the same project as the source data. De-identifying data across multiple projects is not supported. * The destination annotation store must exist when using DeidentifyDicomStore or DeidentifyFhirStore. DeidentifyDataset automatically creates the destination annotation store.
         * 
         * @return builder
         * 
         */
        public Builder annotationStoreName(String annotationStoreName) {
            return annotationStoreName(Output.of(annotationStoreName));
        }

        /**
         * @param storeQuote If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
         * 
         * @return builder
         * 
         */
        public Builder storeQuote(@Nullable Output<Boolean> storeQuote) {
            $.storeQuote = storeQuote;
            return this;
        }

        /**
         * @param storeQuote If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
         * 
         * @return builder
         * 
         */
        public Builder storeQuote(Boolean storeQuote) {
            return storeQuote(Output.of(storeQuote));
        }

        public AnnotationConfigArgs build() {
            return $;
        }
    }

}
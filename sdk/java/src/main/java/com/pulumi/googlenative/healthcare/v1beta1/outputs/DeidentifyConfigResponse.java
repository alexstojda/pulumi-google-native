// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.AnnotationConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.DeidentifyOperationMetadataResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.DicomConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.FhirConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.ImageConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.TextConfigResponse;
import java.util.Objects;

@CustomType
public final class DeidentifyConfigResponse {
    /**
     * @return Configures how annotations, meaning that the location and infoType of sensitive information findings, are created during de-identification. If unspecified, no annotations are created.
     * 
     */
    private AnnotationConfigResponse annotation;
    /**
     * @return Configures de-id of application/DICOM content.
     * 
     */
    private DicomConfigResponse dicom;
    /**
     * @return Configures de-id of application/FHIR content.
     * 
     */
    private FhirConfigResponse fhir;
    /**
     * @return Configures de-identification of image pixels wherever they are found in the source_dataset.
     * 
     */
    private ImageConfigResponse image;
    /**
     * @return Details about the work the de-identify operation performed.
     * 
     */
    private DeidentifyOperationMetadataResponse operationMetadata;
    /**
     * @return Configures de-identification of text wherever it is found in the source_dataset.
     * 
     */
    private TextConfigResponse text;

    private DeidentifyConfigResponse() {}
    /**
     * @return Configures how annotations, meaning that the location and infoType of sensitive information findings, are created during de-identification. If unspecified, no annotations are created.
     * 
     */
    public AnnotationConfigResponse annotation() {
        return this.annotation;
    }
    /**
     * @return Configures de-id of application/DICOM content.
     * 
     */
    public DicomConfigResponse dicom() {
        return this.dicom;
    }
    /**
     * @return Configures de-id of application/FHIR content.
     * 
     */
    public FhirConfigResponse fhir() {
        return this.fhir;
    }
    /**
     * @return Configures de-identification of image pixels wherever they are found in the source_dataset.
     * 
     */
    public ImageConfigResponse image() {
        return this.image;
    }
    /**
     * @return Details about the work the de-identify operation performed.
     * 
     */
    public DeidentifyOperationMetadataResponse operationMetadata() {
        return this.operationMetadata;
    }
    /**
     * @return Configures de-identification of text wherever it is found in the source_dataset.
     * 
     */
    public TextConfigResponse text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeidentifyConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AnnotationConfigResponse annotation;
        private DicomConfigResponse dicom;
        private FhirConfigResponse fhir;
        private ImageConfigResponse image;
        private DeidentifyOperationMetadataResponse operationMetadata;
        private TextConfigResponse text;
        public Builder() {}
        public Builder(DeidentifyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotation = defaults.annotation;
    	      this.dicom = defaults.dicom;
    	      this.fhir = defaults.fhir;
    	      this.image = defaults.image;
    	      this.operationMetadata = defaults.operationMetadata;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder annotation(AnnotationConfigResponse annotation) {
            this.annotation = Objects.requireNonNull(annotation);
            return this;
        }
        @CustomType.Setter
        public Builder dicom(DicomConfigResponse dicom) {
            this.dicom = Objects.requireNonNull(dicom);
            return this;
        }
        @CustomType.Setter
        public Builder fhir(FhirConfigResponse fhir) {
            this.fhir = Objects.requireNonNull(fhir);
            return this;
        }
        @CustomType.Setter
        public Builder image(ImageConfigResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder operationMetadata(DeidentifyOperationMetadataResponse operationMetadata) {
            this.operationMetadata = Objects.requireNonNull(operationMetadata);
            return this;
        }
        @CustomType.Setter
        public Builder text(TextConfigResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public DeidentifyConfigResponse build() {
            final var o = new DeidentifyConfigResponse();
            o.annotation = annotation;
            o.dicom = dicom;
            o.fhir = fhir;
            o.image = image;
            o.operationMetadata = operationMetadata;
            o.text = text;
            return o;
        }
    }
}
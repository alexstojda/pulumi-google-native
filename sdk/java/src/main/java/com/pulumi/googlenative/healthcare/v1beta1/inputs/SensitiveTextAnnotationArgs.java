// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A TextAnnotation specifies a text range that includes sensitive information.
 * 
 */
public final class SensitiveTextAnnotationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensitiveTextAnnotationArgs Empty = new SensitiveTextAnnotationArgs();

    /**
     * Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --&gt; {findings_1, findings_2, findings_3}
     * 
     */
    @Import(name="details")
    private @Nullable Output<Map<String,String>> details;

    /**
     * @return Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --&gt; {findings_1, findings_2, findings_3}
     * 
     */
    public Optional<Output<Map<String,String>>> details() {
        return Optional.ofNullable(this.details);
    }

    private SensitiveTextAnnotationArgs() {}

    private SensitiveTextAnnotationArgs(SensitiveTextAnnotationArgs $) {
        this.details = $.details;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensitiveTextAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensitiveTextAnnotationArgs $;

        public Builder() {
            $ = new SensitiveTextAnnotationArgs();
        }

        public Builder(SensitiveTextAnnotationArgs defaults) {
            $ = new SensitiveTextAnnotationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param details Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --&gt; {findings_1, findings_2, findings_3}
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<Map<String,String>> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --&gt; {findings_1, findings_2, findings_3}
         * 
         * @return builder
         * 
         */
        public Builder details(Map<String,String> details) {
            return details(Output.of(details));
        }

        public SensitiveTextAnnotationArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.CisBenchmarkResponse;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.ComplianceVersionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ComplianceNoteResponse {
    /**
     * @return Right now we only have one compliance type, but we may add additional types in the future.
     * 
     */
    private CisBenchmarkResponse cisBenchmark;
    /**
     * @return A description about this compliance check.
     * 
     */
    private String description;
    /**
     * @return A rationale for the existence of this compliance check.
     * 
     */
    private String rationale;
    /**
     * @return A description of remediation steps if the compliance check fails.
     * 
     */
    private String remediation;
    /**
     * @return Serialized scan instructions with a predefined format.
     * 
     */
    private String scanInstructions;
    /**
     * @return The title that identifies this compliance check.
     * 
     */
    private String title;
    /**
     * @return The OS and config versions the benchmark applies to.
     * 
     */
    private List<ComplianceVersionResponse> version;

    private ComplianceNoteResponse() {}
    /**
     * @return Right now we only have one compliance type, but we may add additional types in the future.
     * 
     */
    public CisBenchmarkResponse cisBenchmark() {
        return this.cisBenchmark;
    }
    /**
     * @return A description about this compliance check.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A rationale for the existence of this compliance check.
     * 
     */
    public String rationale() {
        return this.rationale;
    }
    /**
     * @return A description of remediation steps if the compliance check fails.
     * 
     */
    public String remediation() {
        return this.remediation;
    }
    /**
     * @return Serialized scan instructions with a predefined format.
     * 
     */
    public String scanInstructions() {
        return this.scanInstructions;
    }
    /**
     * @return The title that identifies this compliance check.
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return The OS and config versions the benchmark applies to.
     * 
     */
    public List<ComplianceVersionResponse> version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceNoteResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private CisBenchmarkResponse cisBenchmark;
        private String description;
        private String rationale;
        private String remediation;
        private String scanInstructions;
        private String title;
        private List<ComplianceVersionResponse> version;
        public Builder() {}
        public Builder(ComplianceNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisBenchmark = defaults.cisBenchmark;
    	      this.description = defaults.description;
    	      this.rationale = defaults.rationale;
    	      this.remediation = defaults.remediation;
    	      this.scanInstructions = defaults.scanInstructions;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder cisBenchmark(CisBenchmarkResponse cisBenchmark) {
            this.cisBenchmark = Objects.requireNonNull(cisBenchmark);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder rationale(String rationale) {
            this.rationale = Objects.requireNonNull(rationale);
            return this;
        }
        @CustomType.Setter
        public Builder remediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }
        @CustomType.Setter
        public Builder scanInstructions(String scanInstructions) {
            this.scanInstructions = Objects.requireNonNull(scanInstructions);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        @CustomType.Setter
        public Builder version(List<ComplianceVersionResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(ComplianceVersionResponse... version) {
            return version(List.of(version));
        }
        public ComplianceNoteResponse build() {
            final var o = new ComplianceNoteResponse();
            o.cisBenchmark = cisBenchmark;
            o.description = description;
            o.rationale = rationale;
            o.remediation = remediation;
            o.scanInstructions = scanInstructions;
            o.title = title;
            o.version = version;
            return o;
        }
    }
}
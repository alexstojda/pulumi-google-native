// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.InTotoProvenanceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.SlsaProvenanceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.SlsaProvenanceZeroTwoArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement The serialized InTotoStatement will be stored as Envelope.payload. Envelope.payloadType is always &#34;application/vnd.in-toto+json&#34;.
 * 
 */
public final class InTotoStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final InTotoStatementArgs Empty = new InTotoStatementArgs();

    /**
     * &#34;https://slsa.dev/provenance/v0.1&#34; for SlsaProvenance.
     * 
     */
    @Import(name="predicateType")
    private @Nullable Output<String> predicateType;

    /**
     * @return &#34;https://slsa.dev/provenance/v0.1&#34; for SlsaProvenance.
     * 
     */
    public Optional<Output<String>> predicateType() {
        return Optional.ofNullable(this.predicateType);
    }

    /**
     * Generic Grafeas provenance.
     * 
     */
    @Import(name="provenance")
    private @Nullable Output<InTotoProvenanceArgs> provenance;

    /**
     * @return Generic Grafeas provenance.
     * 
     */
    public Optional<Output<InTotoProvenanceArgs>> provenance() {
        return Optional.ofNullable(this.provenance);
    }

    /**
     * SLSA 0.1 provenance.
     * 
     */
    @Import(name="slsaProvenance")
    private @Nullable Output<SlsaProvenanceArgs> slsaProvenance;

    /**
     * @return SLSA 0.1 provenance.
     * 
     */
    public Optional<Output<SlsaProvenanceArgs>> slsaProvenance() {
        return Optional.ofNullable(this.slsaProvenance);
    }

    /**
     * SLSA 0.2 provenance.
     * 
     */
    @Import(name="slsaProvenanceZeroTwo")
    private @Nullable Output<SlsaProvenanceZeroTwoArgs> slsaProvenanceZeroTwo;

    /**
     * @return SLSA 0.2 provenance.
     * 
     */
    public Optional<Output<SlsaProvenanceZeroTwoArgs>> slsaProvenanceZeroTwo() {
        return Optional.ofNullable(this.slsaProvenanceZeroTwo);
    }

    /**
     * subject is the subjects of the intoto statement
     * 
     */
    @Import(name="subject")
    private @Nullable Output<List<SubjectArgs>> subject;

    /**
     * @return subject is the subjects of the intoto statement
     * 
     */
    public Optional<Output<List<SubjectArgs>>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * Always &#34;https://in-toto.io/Statement/v0.1&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Always &#34;https://in-toto.io/Statement/v0.1&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private InTotoStatementArgs() {}

    private InTotoStatementArgs(InTotoStatementArgs $) {
        this.predicateType = $.predicateType;
        this.provenance = $.provenance;
        this.slsaProvenance = $.slsaProvenance;
        this.slsaProvenanceZeroTwo = $.slsaProvenanceZeroTwo;
        this.subject = $.subject;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InTotoStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InTotoStatementArgs $;

        public Builder() {
            $ = new InTotoStatementArgs();
        }

        public Builder(InTotoStatementArgs defaults) {
            $ = new InTotoStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param predicateType &#34;https://slsa.dev/provenance/v0.1&#34; for SlsaProvenance.
         * 
         * @return builder
         * 
         */
        public Builder predicateType(@Nullable Output<String> predicateType) {
            $.predicateType = predicateType;
            return this;
        }

        /**
         * @param predicateType &#34;https://slsa.dev/provenance/v0.1&#34; for SlsaProvenance.
         * 
         * @return builder
         * 
         */
        public Builder predicateType(String predicateType) {
            return predicateType(Output.of(predicateType));
        }

        /**
         * @param provenance Generic Grafeas provenance.
         * 
         * @return builder
         * 
         */
        public Builder provenance(@Nullable Output<InTotoProvenanceArgs> provenance) {
            $.provenance = provenance;
            return this;
        }

        /**
         * @param provenance Generic Grafeas provenance.
         * 
         * @return builder
         * 
         */
        public Builder provenance(InTotoProvenanceArgs provenance) {
            return provenance(Output.of(provenance));
        }

        /**
         * @param slsaProvenance SLSA 0.1 provenance.
         * 
         * @return builder
         * 
         */
        public Builder slsaProvenance(@Nullable Output<SlsaProvenanceArgs> slsaProvenance) {
            $.slsaProvenance = slsaProvenance;
            return this;
        }

        /**
         * @param slsaProvenance SLSA 0.1 provenance.
         * 
         * @return builder
         * 
         */
        public Builder slsaProvenance(SlsaProvenanceArgs slsaProvenance) {
            return slsaProvenance(Output.of(slsaProvenance));
        }

        /**
         * @param slsaProvenanceZeroTwo SLSA 0.2 provenance.
         * 
         * @return builder
         * 
         */
        public Builder slsaProvenanceZeroTwo(@Nullable Output<SlsaProvenanceZeroTwoArgs> slsaProvenanceZeroTwo) {
            $.slsaProvenanceZeroTwo = slsaProvenanceZeroTwo;
            return this;
        }

        /**
         * @param slsaProvenanceZeroTwo SLSA 0.2 provenance.
         * 
         * @return builder
         * 
         */
        public Builder slsaProvenanceZeroTwo(SlsaProvenanceZeroTwoArgs slsaProvenanceZeroTwo) {
            return slsaProvenanceZeroTwo(Output.of(slsaProvenanceZeroTwo));
        }

        /**
         * @param subject subject is the subjects of the intoto statement
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<List<SubjectArgs>> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject subject is the subjects of the intoto statement
         * 
         * @return builder
         * 
         */
        public Builder subject(List<SubjectArgs> subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param subject subject is the subjects of the intoto statement
         * 
         * @return builder
         * 
         */
        public Builder subject(SubjectArgs... subject) {
            return subject(List.of(subject));
        }

        /**
         * @param type Always &#34;https://in-toto.io/Statement/v0.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Always &#34;https://in-toto.io/Statement/v0.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InTotoStatementArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Used with unidirectional glossaries.
 * 
 */
public final class LanguageCodePairArgs extends com.pulumi.resources.ResourceArgs {

    public static final LanguageCodePairArgs Empty = new LanguageCodePairArgs();

    /**
     * The BCP-47 language code of the input text, for example, &#34;en-US&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    @Import(name="sourceLanguageCode", required=true)
    private Output<String> sourceLanguageCode;

    /**
     * @return The BCP-47 language code of the input text, for example, &#34;en-US&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    public Output<String> sourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * The BCP-47 language code for translation output, for example, &#34;zh-CN&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    @Import(name="targetLanguageCode", required=true)
    private Output<String> targetLanguageCode;

    /**
     * @return The BCP-47 language code for translation output, for example, &#34;zh-CN&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    public Output<String> targetLanguageCode() {
        return this.targetLanguageCode;
    }

    private LanguageCodePairArgs() {}

    private LanguageCodePairArgs(LanguageCodePairArgs $) {
        this.sourceLanguageCode = $.sourceLanguageCode;
        this.targetLanguageCode = $.targetLanguageCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LanguageCodePairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LanguageCodePairArgs $;

        public Builder() {
            $ = new LanguageCodePairArgs();
        }

        public Builder(LanguageCodePairArgs defaults) {
            $ = new LanguageCodePairArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceLanguageCode The BCP-47 language code of the input text, for example, &#34;en-US&#34;. Expected to be an exact match for GlossaryTerm.language_code.
         * 
         * @return builder
         * 
         */
        public Builder sourceLanguageCode(Output<String> sourceLanguageCode) {
            $.sourceLanguageCode = sourceLanguageCode;
            return this;
        }

        /**
         * @param sourceLanguageCode The BCP-47 language code of the input text, for example, &#34;en-US&#34;. Expected to be an exact match for GlossaryTerm.language_code.
         * 
         * @return builder
         * 
         */
        public Builder sourceLanguageCode(String sourceLanguageCode) {
            return sourceLanguageCode(Output.of(sourceLanguageCode));
        }

        /**
         * @param targetLanguageCode The BCP-47 language code for translation output, for example, &#34;zh-CN&#34;. Expected to be an exact match for GlossaryTerm.language_code.
         * 
         * @return builder
         * 
         */
        public Builder targetLanguageCode(Output<String> targetLanguageCode) {
            $.targetLanguageCode = targetLanguageCode;
            return this;
        }

        /**
         * @param targetLanguageCode The BCP-47 language code for translation output, for example, &#34;zh-CN&#34;. Expected to be an exact match for GlossaryTerm.language_code.
         * 
         * @return builder
         * 
         */
        public Builder targetLanguageCode(String targetLanguageCode) {
            return targetLanguageCode(Output.of(targetLanguageCode));
        }

        public LanguageCodePairArgs build() {
            $.sourceLanguageCode = Objects.requireNonNull($.sourceLanguageCode, "expected parameter 'sourceLanguageCode' to be non-null");
            $.targetLanguageCode = Objects.requireNonNull($.targetLanguageCode, "expected parameter 'targetLanguageCode' to be non-null");
            return $;
        }
    }

}
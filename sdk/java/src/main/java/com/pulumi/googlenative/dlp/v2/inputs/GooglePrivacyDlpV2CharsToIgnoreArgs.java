// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.enums.GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Characters to skip when doing deidentification of a value. These will be left alone and skipped.
 * 
 */
public final class GooglePrivacyDlpV2CharsToIgnoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CharsToIgnoreArgs Empty = new GooglePrivacyDlpV2CharsToIgnoreArgs();

    /**
     * Characters to not transform when masking.
     * 
     */
    @Import(name="charactersToSkip")
    private @Nullable Output<String> charactersToSkip;

    /**
     * @return Characters to not transform when masking.
     * 
     */
    public Optional<Output<String>> charactersToSkip() {
        return Optional.ofNullable(this.charactersToSkip);
    }

    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * 
     */
    @Import(name="commonCharactersToIgnore")
    private @Nullable Output<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> commonCharactersToIgnore;

    /**
     * @return Common characters to not transform when masking. Useful to avoid removing punctuation.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore>> commonCharactersToIgnore() {
        return Optional.ofNullable(this.commonCharactersToIgnore);
    }

    private GooglePrivacyDlpV2CharsToIgnoreArgs() {}

    private GooglePrivacyDlpV2CharsToIgnoreArgs(GooglePrivacyDlpV2CharsToIgnoreArgs $) {
        this.charactersToSkip = $.charactersToSkip;
        this.commonCharactersToIgnore = $.commonCharactersToIgnore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2CharsToIgnoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CharsToIgnoreArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2CharsToIgnoreArgs();
        }

        public Builder(GooglePrivacyDlpV2CharsToIgnoreArgs defaults) {
            $ = new GooglePrivacyDlpV2CharsToIgnoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param charactersToSkip Characters to not transform when masking.
         * 
         * @return builder
         * 
         */
        public Builder charactersToSkip(@Nullable Output<String> charactersToSkip) {
            $.charactersToSkip = charactersToSkip;
            return this;
        }

        /**
         * @param charactersToSkip Characters to not transform when masking.
         * 
         * @return builder
         * 
         */
        public Builder charactersToSkip(String charactersToSkip) {
            return charactersToSkip(Output.of(charactersToSkip));
        }

        /**
         * @param commonCharactersToIgnore Common characters to not transform when masking. Useful to avoid removing punctuation.
         * 
         * @return builder
         * 
         */
        public Builder commonCharactersToIgnore(@Nullable Output<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> commonCharactersToIgnore) {
            $.commonCharactersToIgnore = commonCharactersToIgnore;
            return this;
        }

        /**
         * @param commonCharactersToIgnore Common characters to not transform when masking. Useful to avoid removing punctuation.
         * 
         * @return builder
         * 
         */
        public Builder commonCharactersToIgnore(GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore commonCharactersToIgnore) {
            return commonCharactersToIgnore(Output.of(commonCharactersToIgnore));
        }

        public GooglePrivacyDlpV2CharsToIgnoreArgs build() {
            return $;
        }
    }

}
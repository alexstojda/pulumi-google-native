// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2ExpressionsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition for determining whether a transformation should be applied to a field.
 * 
 */
public final class GooglePrivacyDlpV2RecordConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RecordConditionArgs Empty = new GooglePrivacyDlpV2RecordConditionArgs();

    /**
     * An expression.
     * 
     */
    @Import(name="expressions")
    private @Nullable Output<GooglePrivacyDlpV2ExpressionsArgs> expressions;

    /**
     * @return An expression.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2ExpressionsArgs>> expressions() {
        return Optional.ofNullable(this.expressions);
    }

    private GooglePrivacyDlpV2RecordConditionArgs() {}

    private GooglePrivacyDlpV2RecordConditionArgs(GooglePrivacyDlpV2RecordConditionArgs $) {
        this.expressions = $.expressions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2RecordConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordConditionArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2RecordConditionArgs();
        }

        public Builder(GooglePrivacyDlpV2RecordConditionArgs defaults) {
            $ = new GooglePrivacyDlpV2RecordConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressions An expression.
         * 
         * @return builder
         * 
         */
        public Builder expressions(@Nullable Output<GooglePrivacyDlpV2ExpressionsArgs> expressions) {
            $.expressions = expressions;
            return this;
        }

        /**
         * @param expressions An expression.
         * 
         * @return builder
         * 
         */
        public Builder expressions(GooglePrivacyDlpV2ExpressionsArgs expressions) {
            return expressions(Output.of(expressions));
        }

        public GooglePrivacyDlpV2RecordConditionArgs build() {
            return $;
        }
    }

}
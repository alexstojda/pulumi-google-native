// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.CharacterMaskConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.CryptoHashConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.DateShiftConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.RedactConfigResponse;
import com.pulumi.googlenative.healthcare.v1beta1.outputs.ReplaceWithInfoTypeConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InfoTypeTransformationResponse {
    /**
     * @return Config for character mask.
     * 
     */
    private CharacterMaskConfigResponse characterMaskConfig;
    /**
     * @return Config for crypto hash.
     * 
     */
    private CryptoHashConfigResponse cryptoHashConfig;
    /**
     * @return Config for date shift.
     * 
     */
    private DateShiftConfigResponse dateShiftConfig;
    /**
     * @return InfoTypes to apply this transformation to. If this is not specified, this transformation becomes the default transformation, and is used for any info_type that is not specified in another transformation.
     * 
     */
    private List<String> infoTypes;
    /**
     * @return Config for text redaction.
     * 
     */
    private RedactConfigResponse redactConfig;
    /**
     * @return Config for replace with InfoType.
     * 
     */
    private ReplaceWithInfoTypeConfigResponse replaceWithInfoTypeConfig;

    private InfoTypeTransformationResponse() {}
    /**
     * @return Config for character mask.
     * 
     */
    public CharacterMaskConfigResponse characterMaskConfig() {
        return this.characterMaskConfig;
    }
    /**
     * @return Config for crypto hash.
     * 
     */
    public CryptoHashConfigResponse cryptoHashConfig() {
        return this.cryptoHashConfig;
    }
    /**
     * @return Config for date shift.
     * 
     */
    public DateShiftConfigResponse dateShiftConfig() {
        return this.dateShiftConfig;
    }
    /**
     * @return InfoTypes to apply this transformation to. If this is not specified, this transformation becomes the default transformation, and is used for any info_type that is not specified in another transformation.
     * 
     */
    public List<String> infoTypes() {
        return this.infoTypes;
    }
    /**
     * @return Config for text redaction.
     * 
     */
    public RedactConfigResponse redactConfig() {
        return this.redactConfig;
    }
    /**
     * @return Config for replace with InfoType.
     * 
     */
    public ReplaceWithInfoTypeConfigResponse replaceWithInfoTypeConfig() {
        return this.replaceWithInfoTypeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfoTypeTransformationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private CharacterMaskConfigResponse characterMaskConfig;
        private CryptoHashConfigResponse cryptoHashConfig;
        private DateShiftConfigResponse dateShiftConfig;
        private List<String> infoTypes;
        private RedactConfigResponse redactConfig;
        private ReplaceWithInfoTypeConfigResponse replaceWithInfoTypeConfig;
        public Builder() {}
        public Builder(InfoTypeTransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterMaskConfig = defaults.characterMaskConfig;
    	      this.cryptoHashConfig = defaults.cryptoHashConfig;
    	      this.dateShiftConfig = defaults.dateShiftConfig;
    	      this.infoTypes = defaults.infoTypes;
    	      this.redactConfig = defaults.redactConfig;
    	      this.replaceWithInfoTypeConfig = defaults.replaceWithInfoTypeConfig;
        }

        @CustomType.Setter
        public Builder characterMaskConfig(CharacterMaskConfigResponse characterMaskConfig) {
            this.characterMaskConfig = Objects.requireNonNull(characterMaskConfig);
            return this;
        }
        @CustomType.Setter
        public Builder cryptoHashConfig(CryptoHashConfigResponse cryptoHashConfig) {
            this.cryptoHashConfig = Objects.requireNonNull(cryptoHashConfig);
            return this;
        }
        @CustomType.Setter
        public Builder dateShiftConfig(DateShiftConfigResponse dateShiftConfig) {
            this.dateShiftConfig = Objects.requireNonNull(dateShiftConfig);
            return this;
        }
        @CustomType.Setter
        public Builder infoTypes(List<String> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(String... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        @CustomType.Setter
        public Builder redactConfig(RedactConfigResponse redactConfig) {
            this.redactConfig = Objects.requireNonNull(redactConfig);
            return this;
        }
        @CustomType.Setter
        public Builder replaceWithInfoTypeConfig(ReplaceWithInfoTypeConfigResponse replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = Objects.requireNonNull(replaceWithInfoTypeConfig);
            return this;
        }
        public InfoTypeTransformationResponse build() {
            final var o = new InfoTypeTransformationResponse();
            o.characterMaskConfig = characterMaskConfig;
            o.cryptoHashConfig = cryptoHashConfig;
            o.dateShiftConfig = dateShiftConfig;
            o.infoTypes = infoTypes;
            o.redactConfig = redactConfig;
            o.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
            return o;
        }
    }
}
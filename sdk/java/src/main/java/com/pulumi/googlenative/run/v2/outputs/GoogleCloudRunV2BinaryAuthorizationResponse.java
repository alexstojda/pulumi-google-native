// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunV2BinaryAuthorizationResponse {
    /**
     * @return If present, indicates to use Breakglass using this justification. If use_default is False, then it must be empty. For more information on breakglass, see https://cloud.google.com/binary-authorization/docs/using-breakglass
     * 
     */
    private String breakglassJustification;
    /**
     * @return If True, indicates to use the default project&#39;s binary authorization policy. If False, binary authorization will be disabled.
     * 
     */
    private Boolean useDefault;

    private GoogleCloudRunV2BinaryAuthorizationResponse() {}
    /**
     * @return If present, indicates to use Breakglass using this justification. If use_default is False, then it must be empty. For more information on breakglass, see https://cloud.google.com/binary-authorization/docs/using-breakglass
     * 
     */
    public String breakglassJustification() {
        return this.breakglassJustification;
    }
    /**
     * @return If True, indicates to use the default project&#39;s binary authorization policy. If False, binary authorization will be disabled.
     * 
     */
    public Boolean useDefault() {
        return this.useDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunV2BinaryAuthorizationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String breakglassJustification;
        private Boolean useDefault;
        public Builder() {}
        public Builder(GoogleCloudRunV2BinaryAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.breakglassJustification = defaults.breakglassJustification;
    	      this.useDefault = defaults.useDefault;
        }

        @CustomType.Setter
        public Builder breakglassJustification(String breakglassJustification) {
            this.breakglassJustification = Objects.requireNonNull(breakglassJustification);
            return this;
        }
        @CustomType.Setter
        public Builder useDefault(Boolean useDefault) {
            this.useDefault = Objects.requireNonNull(useDefault);
            return this;
        }
        public GoogleCloudRunV2BinaryAuthorizationResponse build() {
            final var o = new GoogleCloudRunV2BinaryAuthorizationResponse();
            o.breakglassJustification = breakglassJustification;
            o.useDefault = useDefault;
            return o;
        }
    }
}
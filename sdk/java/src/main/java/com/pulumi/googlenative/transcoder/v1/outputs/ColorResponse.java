// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class ColorResponse {
    /**
     * @return Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    private Double brightness;
    /**
     * @return Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    private Double contrast;
    /**
     * @return Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    private Double saturation;

    private ColorResponse() {}
    /**
     * @return Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    public Double brightness() {
        return this.brightness;
    }
    /**
     * @return Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    public Double contrast() {
        return this.contrast;
    }
    /**
     * @return Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    public Double saturation() {
        return this.saturation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColorResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double brightness;
        private Double contrast;
        private Double saturation;
        public Builder() {}
        public Builder(ColorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.contrast = defaults.contrast;
    	      this.saturation = defaults.saturation;
        }

        @CustomType.Setter
        public Builder brightness(Double brightness) {
            this.brightness = Objects.requireNonNull(brightness);
            return this;
        }
        @CustomType.Setter
        public Builder contrast(Double contrast) {
            this.contrast = Objects.requireNonNull(contrast);
            return this;
        }
        @CustomType.Setter
        public Builder saturation(Double saturation) {
            this.saturation = Objects.requireNonNull(saturation);
            return this;
        }
        public ColorResponse build() {
            final var o = new ColorResponse();
            o.brightness = brightness;
            o.contrast = contrast;
            o.saturation = saturation;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class Vp9CodecSettingsResponse {
    /**
     * @return The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 480,000,000.
     * 
     */
    private Integer bitrateBps;
    /**
     * @return Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. **Note:** This field is not supported.
     * 
     */
    private Integer crfLevel;
    /**
     * @return The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    private Double frameRate;
    /**
     * @return Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    private String gopDuration;
    /**
     * @return Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    private Integer gopFrameCount;
    /**
     * @return The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    private Integer heightPixels;
    /**
     * @return Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    private String pixelFormat;
    /**
     * @return Enforces the specified codec profile. The following profiles are supported: * `profile0` (default) * `profile1` * `profile2` * `profile3` The available options are [WebM-compatible](https://www.webmproject.org/vp9/profiles/). Note that certain values for this field may cause the transcoder to override other fields you set in the `Vp9CodecSettings` message.
     * 
     */
    private String profile;
    /**
     * @return Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate
     * 
     */
    private String rateControlMode;
    /**
     * @return The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    private Integer widthPixels;

    private Vp9CodecSettingsResponse() {}
    /**
     * @return The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 480,000,000.
     * 
     */
    public Integer bitrateBps() {
        return this.bitrateBps;
    }
    /**
     * @return Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. **Note:** This field is not supported.
     * 
     */
    public Integer crfLevel() {
        return this.crfLevel;
    }
    /**
     * @return The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    public Double frameRate() {
        return this.frameRate;
    }
    /**
     * @return Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    public String gopDuration() {
        return this.gopDuration;
    }
    /**
     * @return Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    public Integer gopFrameCount() {
        return this.gopFrameCount;
    }
    /**
     * @return The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    public Integer heightPixels() {
        return this.heightPixels;
    }
    /**
     * @return Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    public String pixelFormat() {
        return this.pixelFormat;
    }
    /**
     * @return Enforces the specified codec profile. The following profiles are supported: * `profile0` (default) * `profile1` * `profile2` * `profile3` The available options are [WebM-compatible](https://www.webmproject.org/vp9/profiles/). Note that certain values for this field may cause the transcoder to override other fields you set in the `Vp9CodecSettings` message.
     * 
     */
    public String profile() {
        return this.profile;
    }
    /**
     * @return Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate
     * 
     */
    public String rateControlMode() {
        return this.rateControlMode;
    }
    /**
     * @return The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    public Integer widthPixels() {
        return this.widthPixels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Vp9CodecSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bitrateBps;
        private Integer crfLevel;
        private Double frameRate;
        private String gopDuration;
        private Integer gopFrameCount;
        private Integer heightPixels;
        private String pixelFormat;
        private String profile;
        private String rateControlMode;
        private Integer widthPixels;
        public Builder() {}
        public Builder(Vp9CodecSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.widthPixels = defaults.widthPixels;
        }

        @CustomType.Setter
        public Builder bitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }
        @CustomType.Setter
        public Builder crfLevel(Integer crfLevel) {
            this.crfLevel = Objects.requireNonNull(crfLevel);
            return this;
        }
        @CustomType.Setter
        public Builder frameRate(Double frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }
        @CustomType.Setter
        public Builder gopDuration(String gopDuration) {
            this.gopDuration = Objects.requireNonNull(gopDuration);
            return this;
        }
        @CustomType.Setter
        public Builder gopFrameCount(Integer gopFrameCount) {
            this.gopFrameCount = Objects.requireNonNull(gopFrameCount);
            return this;
        }
        @CustomType.Setter
        public Builder heightPixels(Integer heightPixels) {
            this.heightPixels = Objects.requireNonNull(heightPixels);
            return this;
        }
        @CustomType.Setter
        public Builder pixelFormat(String pixelFormat) {
            this.pixelFormat = Objects.requireNonNull(pixelFormat);
            return this;
        }
        @CustomType.Setter
        public Builder profile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }
        @CustomType.Setter
        public Builder rateControlMode(String rateControlMode) {
            this.rateControlMode = Objects.requireNonNull(rateControlMode);
            return this;
        }
        @CustomType.Setter
        public Builder widthPixels(Integer widthPixels) {
            this.widthPixels = Objects.requireNonNull(widthPixels);
            return this;
        }
        public Vp9CodecSettingsResponse build() {
            final var o = new Vp9CodecSettingsResponse();
            o.bitrateBps = bitrateBps;
            o.crfLevel = crfLevel;
            o.frameRate = frameRate;
            o.gopDuration = gopDuration;
            o.gopFrameCount = gopFrameCount;
            o.heightPixels = heightPixels;
            o.pixelFormat = pixelFormat;
            o.profile = profile;
            o.rateControlMode = rateControlMode;
            o.widthPixels = widthPixels;
            return o;
        }
    }
}
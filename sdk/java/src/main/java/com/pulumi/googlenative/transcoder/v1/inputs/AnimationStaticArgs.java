// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder.v1.inputs.NormalizedCoordinateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Display static overlay object.
 * 
 */
public final class AnimationStaticArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnimationStaticArgs Empty = new AnimationStaticArgs();

    /**
     * The time to start displaying the overlay object, in seconds. Default: 0
     * 
     */
    @Import(name="startTimeOffset")
    private @Nullable Output<String> startTimeOffset;

    /**
     * @return The time to start displaying the overlay object, in seconds. Default: 0
     * 
     */
    public Optional<Output<String>> startTimeOffset() {
        return Optional.ofNullable(this.startTimeOffset);
    }

    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    @Import(name="xy")
    private @Nullable Output<NormalizedCoordinateArgs> xy;

    /**
     * @return Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    public Optional<Output<NormalizedCoordinateArgs>> xy() {
        return Optional.ofNullable(this.xy);
    }

    private AnimationStaticArgs() {}

    private AnimationStaticArgs(AnimationStaticArgs $) {
        this.startTimeOffset = $.startTimeOffset;
        this.xy = $.xy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnimationStaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationStaticArgs $;

        public Builder() {
            $ = new AnimationStaticArgs();
        }

        public Builder(AnimationStaticArgs defaults) {
            $ = new AnimationStaticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param startTimeOffset The time to start displaying the overlay object, in seconds. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        /**
         * @param startTimeOffset The time to start displaying the overlay object, in seconds. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(String startTimeOffset) {
            return startTimeOffset(Output.of(startTimeOffset));
        }

        /**
         * @param xy Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
         * 
         * @return builder
         * 
         */
        public Builder xy(@Nullable Output<NormalizedCoordinateArgs> xy) {
            $.xy = xy;
            return this;
        }

        /**
         * @param xy Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
         * 
         * @return builder
         * 
         */
        public Builder xy(NormalizedCoordinateArgs xy) {
            return xy(Output.of(xy));
        }

        public AnimationStaticArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder.v1.inputs.AudioStreamArgs;
import com.pulumi.googlenative.transcoder.v1.inputs.TextStreamArgs;
import com.pulumi.googlenative.transcoder.v1.inputs.VideoStreamArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encoding of an input file such as an audio, video, or text track. Elementary streams must be packaged before mapping and sharing between different output formats.
 * 
 */
public final class ElementaryStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElementaryStreamArgs Empty = new ElementaryStreamArgs();

    /**
     * Encoding of an audio stream.
     * 
     */
    @Import(name="audioStream")
    private @Nullable Output<AudioStreamArgs> audioStream;

    /**
     * @return Encoding of an audio stream.
     * 
     */
    public Optional<Output<AudioStreamArgs>> audioStream() {
        return Optional.ofNullable(this.audioStream);
    }

    /**
     * A unique key for this elementary stream.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return A unique key for this elementary stream.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Encoding of a text stream. For example, closed captions or subtitles.
     * 
     */
    @Import(name="textStream")
    private @Nullable Output<TextStreamArgs> textStream;

    /**
     * @return Encoding of a text stream. For example, closed captions or subtitles.
     * 
     */
    public Optional<Output<TextStreamArgs>> textStream() {
        return Optional.ofNullable(this.textStream);
    }

    /**
     * Encoding of a video stream.
     * 
     */
    @Import(name="videoStream")
    private @Nullable Output<VideoStreamArgs> videoStream;

    /**
     * @return Encoding of a video stream.
     * 
     */
    public Optional<Output<VideoStreamArgs>> videoStream() {
        return Optional.ofNullable(this.videoStream);
    }

    private ElementaryStreamArgs() {}

    private ElementaryStreamArgs(ElementaryStreamArgs $) {
        this.audioStream = $.audioStream;
        this.key = $.key;
        this.textStream = $.textStream;
        this.videoStream = $.videoStream;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElementaryStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElementaryStreamArgs $;

        public Builder() {
            $ = new ElementaryStreamArgs();
        }

        public Builder(ElementaryStreamArgs defaults) {
            $ = new ElementaryStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioStream Encoding of an audio stream.
         * 
         * @return builder
         * 
         */
        public Builder audioStream(@Nullable Output<AudioStreamArgs> audioStream) {
            $.audioStream = audioStream;
            return this;
        }

        /**
         * @param audioStream Encoding of an audio stream.
         * 
         * @return builder
         * 
         */
        public Builder audioStream(AudioStreamArgs audioStream) {
            return audioStream(Output.of(audioStream));
        }

        /**
         * @param key A unique key for this elementary stream.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A unique key for this elementary stream.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param textStream Encoding of a text stream. For example, closed captions or subtitles.
         * 
         * @return builder
         * 
         */
        public Builder textStream(@Nullable Output<TextStreamArgs> textStream) {
            $.textStream = textStream;
            return this;
        }

        /**
         * @param textStream Encoding of a text stream. For example, closed captions or subtitles.
         * 
         * @return builder
         * 
         */
        public Builder textStream(TextStreamArgs textStream) {
            return textStream(Output.of(textStream));
        }

        /**
         * @param videoStream Encoding of a video stream.
         * 
         * @return builder
         * 
         */
        public Builder videoStream(@Nullable Output<VideoStreamArgs> videoStream) {
            $.videoStream = videoStream;
            return this;
        }

        /**
         * @param videoStream Encoding of a video stream.
         * 
         * @return builder
         * 
         */
        public Builder videoStream(VideoStreamArgs videoStream) {
            return videoStream(Output.of(videoStream));
        }

        public ElementaryStreamArgs build() {
            return $;
        }
    }

}